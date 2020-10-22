from basedatos import baseDatos as db

numFactura = len(db)
crearFactura = False
saldoDia = 0
variableSaldo = 0

usuarios = {
    "Luis": [
        "admin", #Contraseña
        "administrativo",
    ],
    "Fernando": [
        "usuario", #Contraseña
        "facturacion",
    ]
}

class Usuario:
    def __init__(self, nombre, contra):
        self.nombre = nombre
        self.contra = contra

    def imprimirFactura(self, res):
        global variableSaldo
        for factura in db:
            if factura == res:
                lista = list(db[factura].items())
                print("\n\n=============================SUPERMERCADO SUPER BARATON=================================")
                print("\nCliente:", lista[0][1], "\t\tNumero de Factura:", factura)
                print("Cedula:", lista[0][0])
                print('{:^10}{:^30}{:^10}{:^10}{:^15}{:^15}'.format("Codigo","Descripcion","Cantidad","Iva","Valor Unitario", "Valor Total"))
                subtotal = 0
                total = 0
                iva = []
                for num in lista:
                    if num != lista[0]:
                        if num[1][3] != 0:
                            valorBase = int((num[1][2]*num[1][1])/float("1."+str(num[1][3])))
                            valorBase = (num[1][2]*num[1][1])-valorBase
                            listaBorrador = [num[1][3], valorBase]
                            subtotal-= valorBase
                            iva.append(listaBorrador)
                        subtotal += num[1][2]*num[1][1]
                        print('{:^10}{:^30}{:^10}{:^10}{:^15}{:^15}'.format(num[0],num[1][0],num[1][2],num[1][3],num[1][1], num[1][2]*num[1][1]))
                print("\t\t\t\t\t\t\t\t\tSubtotal:",subtotal)
                for i in iva:
                    print("\t\t\t\t\t\t\t\t\tIva "+str(i[0])+"%:", i[1])
                    total += i[1]
                total += subtotal
                variableSaldo = total
                print("\t\t\t\t\t\t\t\t\tTotal:",total)

    def verFactura(self):
        self.listaFacturas()
        print("\nIngrese el codigo de la Factura")
        res = input("=> ")
        self.imprimirFactura(res)

    def verCuenta(self):
        print('Nombre: {} \t\tTipo Usuario: {}'.format(self.nombre, usuarios[self.nombre][1]))

    def listaFacturas(self):
        print("Lista de Facturas: ")
        for factura in db:
            print("-",factura)

# ==========================================================Clase Facturacion=======================================================
class Facturacion(Usuario):
    def crearFactura(self):
        global numFactura, crearFactura, saldoDia, variableSaldo
        numFactura += 1
        if numFactura<10:
            num = "00"+str(numFactura)
        elif numFactura<100:
            num = "0"+str(numFactura)
        else:
            num = numFactura
        print("Factura Numero:",num)
        cliente = input("Ingrese el Nombre del Cliente: ")
        documento = input("Ingrese el Numero de documento del Cliente: ")

        db[num] = {
            documento: cliente,
        }
        crearFactura = True
        while True:
            self.imprimirFactura(num)
            print("Recuerde que una vez Finalizada la inserción de los datos, solo el Administrador podra adicionar productos")
            print("Desea Agregar un producto?")
            res = input("s/n: ")
            print("\n\n\n")
            if res == "s":
                self.agregarProducto(num)
            else:
                self.imprimirFactura(num)
                saldoDia += variableSaldo
                print("**Factura Creada**")
                break

    def agregarProducto(self, num):
        print("*Agregar Un Producto*")
        codigo = input("Codigo del Producto: ")
        descripcion = input("Descripcion del Producto: ")
        precio = int(input("Costo de cada unidad: "))
        unidades = int(input("Cantidad de unidades: "))
        iv = int(input("Iva del producto: "))
        db[num][codigo] = [descripcion,precio,unidades,iv]
        print("\n\n\n*Dato Agregado*")

    def cerrarSeccion(self):
        global numFactura, crearFactura, saldoDia
        print("\n\n\n\n\n**Cerrando Seccion**\n\n")
        if crearFactura:
            if numFactura<10:
                num = "00"+str(numFactura)
            elif numFactura<100:
                num = "0"+str(numFactura)
            else:
                num = numFactura
            print("Ultima Factura Creada:")
            self.imprimirFactura(num)
        else:
            print("No creo ninguna Factura")
        print("Venta Total:",saldoDia)

# ==========================================================Clase Administracion====================================================
""" Derechos del Administrador:
    adicionar, modificar
"""

class Administracion(Usuario):
    def eliminarFactura(self):
        self.listaFacturas()
        print("Ingrese el codigo de la Factura a Eliminar")
        res = input("=> ")
        for factura in db:
            if factura == res:
                del db[factura]
                print("Factura Eliminada")
                break
