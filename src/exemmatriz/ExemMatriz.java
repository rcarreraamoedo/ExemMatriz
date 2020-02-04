package exemmatriz;

import javax.swing.JOptionPane;


public class ExemMatriz {

    public static void main(String[] args) {
        int [][]matriz = new int [3][4];
        int opcion;
        MetodosMatriz obx = new MetodosMatriz();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("****MENU****\n 1 --> Crear Matriz\n 2--> Amosar\n 3 Sair"));
            switch(opcion){
            case 1:matriz = obx.crearMatriz(matriz);
                break;
            case 2: obx.amosar(matriz);
                break;
            case 3: obx.sair();
            }
            
        }while(opcion<3);
    }
    
}
