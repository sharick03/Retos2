import java.util.Scanner;
public class reto4 {
        public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        String [][] producto= new String [4][4];
        int [][] precio= new int [4][4];

        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){

                System.out.println("Digite el nombre del producto " +i+j);
                producto[i][j]=sc.next();
                System.out.println("Digite el precio del producto " +i+j);
                precio[i][j]=sc.nextInt();
            }
        }
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                System.out.print(producto[i][j]+"\t");
                System.out.print(precio[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();




        
    }
}
