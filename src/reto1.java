import java.util.Scanner;
public class reto1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int numeros, multiplode2=0;
        boolean res;

        System.out.println("Cuantos numeros desea registrar");
        numeros=sc.nextInt();
        int []n=new int [numeros];

        for(int i=0;i<numeros;i++){
            System.out.println("Ingrese un numero");
            n[i]=sc.nextInt();
            multiplode2=n[i]%2;
        }
        res=( multiplode2 == 0);
        System.out.print (res?" Es multiplo de 2" :"No es un multiplo" );
        sc.close();
    }
}

