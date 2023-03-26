import java.util.Scanner;
public class reto3 {
    public static void main (String []args){
        Scanner sc= new Scanner(System.in);
        String [][] palabra=new String [3][3];       
            
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Digite la palabra en la pocisión " + i + j);
                palabra[i][j]=sc.next();
            }
        }
        for (int i=0; i<3; i++){
            for ( int j=0; j<3; j++){
                System.out.print(palabra[i][j]+"\t");
            }
            System.out.println();     
            }  
        for (int i=0; i<3; i++){
            for ( int j=0; j<3; j++){
                if(palabra[j][i]==palabra[j][i]){
                System.out.println("la palabra que se repites es "+palabra[i][j]);
                }
            }
        }
        sc.close();
    }
}









