/*
 * "Evaluación 1 Practica 10 "Arreglo cubo"
 *  26/08/2022"
 */
package eva1_10_arreglo_cubo;

/**
 * @author Quintana Juarez Bryan Alexis
 */
public class EVA1_10_ARREGLO_CUBO {

    public static void main(String[] args) {
        int[][][] cuboDatos = new int[3][4][5];
        
        for (int i = 0; i < cuboDatos.length; i++) {
            for (int j = 0; j < cuboDatos[i].length; j++) {
                for (int k = 0; k < cuboDatos[i][j].length; k++) {
                    cuboDatos[i][j][k] = 50;
                }               
            }  
        }
        
        for (int i = 0; i < cuboDatos.length; i++) {
            for (int j = 0; j < cuboDatos[i].length; j++) {
                for (int k = 0; k < cuboDatos[i][j].length; k++) {
                    System.out.print("[" + cuboDatos[i][j][k]+ "]");
                }
                System.out.println("");
            }  
            System.out.println("");
        }
        
    }
    
}