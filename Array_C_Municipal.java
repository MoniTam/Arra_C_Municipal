/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_c_municipal;

/**
 *
 * @author ESTEFANIA TAMAY
 */
public class Array_C_Municipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][]M;
        M= new String[13][2];
        M[0][0]=" CODIGO ";
        M[0][1]="CABECERA MUNICIPAL  ";        
        M[1][0]="  001  ";
        M[1][1]="  Calkini  ";       
        M[2][0]="  002  ";
        M[2][1]="  San Francisco de Campeche ";                
        M[3][0]="  003  ";
        M[3][1]="  Ciudad del Carmen  ";             
        M[4][0]="  004  ";
        M[4][1]="  Champoton  ";               
        M[5][0]="  005  ";
        M[5][1]="  Hecelchakan  ";              
        M[6][0]="  006  ";
        M[6][1]="  Hopelchen  ";                
        M[7][0]="  007  ";
        M[7][1]="  Palizada  ";               
        M[8][0]="  008  ";
        M[8][1]="  Tenabo  ";                
        M[9][0]="  009  ";
        M[9][1]="  Escarcega  ";               
        M[10][0]="  010  ";
        M[10][1]="  Xpujil  ";                
        M[11][0]="  011  ";
        M[11][1]="  Candelaria  ";                
        M[12][0]="  012  ";
        M[12][1]="  Seybaplaya  ";
        
        String[]H;
        H= new String[13];
      
        H[0]="       Habitantes";
        H[1]="                  52890";
        H[2]="259005";        
        H[3]="        21094";        
        H[4]="                83021";        
        H[5]="              28306";        
        H[6]="                37777";        
        H[7]="                  8352";        
        H[8]="                   10665";        
        H[9]="                54184";        
        H[10]="                   26882";        
        H[11]="               41194";                
        H[12]="               15420";
                
        //Imprimir todos los datos
       
        for (int i=0;i<13;i++) {
             for (int j=0;j<2;j++) {
            System.out.print(M[i][j]);
            }
             System.out.println("");
        }
         System.out.println("-------------------------------------");
         for (int i=0;i<13;i++) {
             for (int j=0;j<1;j++) {
            System.out.print(M[i][1] + H[i]);
            }
             System.out.println("");
    }
   } 
}
