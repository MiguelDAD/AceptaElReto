import java.util.Scanner;

public class Problema576{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int leer = sc.nextInt();

        int hora ;
        int min;
        int seg = 0;
        int palabras;

        while(leer != 0){
            
            palabras = sc.nextInt();
            seg += palabras * leer;

            if(palabras==0){
                min = seg/60;
                seg = seg%60;
            
                hora = min/60;
                min = min%60;
    
                System.out.printf("%02d:%02d:%02d",hora,min,seg);
                System.out.println();
                seg = 0;
                leer = sc.nextInt();
            }
        }
    }
}