import java.util.Scanner;
public class reto2 {
    public static void main(String []args) {
        int aux=0,p=0;
        int nom=0;
        String nombre;  
        Scanner sc = new Scanner(System.in); 

        System.out.println("Cuantas personas participaran en la competecia de 100m");
        p=sc.nextInt();
        int []t=new int [p]; //almacenar tiempo
        String []nomb=new String [p]; //almacenar nombre

        for(int i=0;i<p;i++){ 
            System.out.println("Ingrese su nombre");
            nomb[i]=sc.next();  //[i] almacenar 
            System.out.println("Ingrese el tiempo que recorrio en los 100m por segundo");
            t[i]=sc.nextInt();
        }
        System.out.println ("La tabla de pocisiones es ");
        for(int i=0; i<(p-1); i++){
            for(int b=(i+1); b<p; b++){

            if 
            (t[i]>t[b] ){  //clasificar en orden ascendente de tiempo
            aux=t[i];
            t[i]=t[b];
            t[b]=aux;

            nombre=nomb[i];
            nomb[i]=nomb[b];
            nomb[b]=nombre;
            }
        }
        }
        for (int i=0;i<p;i++){
            System.out.print(nomb[i]+ " " + t[i]+ "\t" );
        }
        sc.close();
    } 

}

