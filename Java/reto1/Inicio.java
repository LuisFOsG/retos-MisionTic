package reto1;

import javax.swing.JOptionPane;

/**
 *
 * @author ColdHeart
 */
public class Inicio {
    public static void main(String args[]){
        boolean codigoListo = false;
        int[] codigo = new int[6];

        while(codigoListo==false){
            codigo = pedirDatos();
            if(codigo[0] == 1 || codigo[0] == 2){
                if(codigo[1]!=0){
                    codigoListo = true;
                }
            }
            if(codigoListo!=true){
                JOptionPane.showMessageDialog(null, "Error");
            }
        }

        for(int i = 0; i<codigo.length;i++){
            System.out.println(codigo[i]);
        }
    }

    public static int[] pedirDatos(){
        int[] codigo = new int[6];
        int i = 6, resto;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Codigo del Usuario: "));

        while(numero>0){
            i--;
            resto = numero % 10;
            numero = numero/10;
            codigo[i] = resto;
        }
        return codigo;
    }
}
