import java.util.Scanner;

public class Problema150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int tamanio = sc.nextInt();
            char caracter = sc.next().charAt(0);

            if(tamanio==0 && caracter == '0')
                break;

            int espacios=tamanio-1;
            int caracteres = tamanio;
            boolean resta = false;
            for(int i=0;i<(tamanio*2)-1;i++){
                for(int j=0;j<espacios;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<caracteres;j++){
                    System.out.print(""+caracter);
                }
                if(espacios==0)
                    resta=true;
                
                if(resta)
                    espacios++;
                else
                    espacios--;


               
                if(resta)
                    caracteres -=2;
                else
                    caracteres +=2;
                

                System.out.println();
            }

        }

    }
}
