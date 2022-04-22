import java.util.Scanner;

public class Problema605{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char usuario = 'x';
        
        while(usuario!='.'){
            int verano = 0;
            int invierno = 0;
            
            usuario = sc.next().charAt(0);
            if(usuario=='.')
                break;

            while (usuario!='.'){
                if(usuario=='V')
                    verano++;
                else if(usuario=='I')
                    invierno++;
                usuario = sc.next().charAt(0);
            }
            
            usuario = 'x';
            if (verano>invierno)
                System.out.println("VERANO");
            else if(verano<invierno)
                System.out.println("INVIERNO");
            else if (verano == invierno)
                System.out.println("EMPATE");
        }
    }
}