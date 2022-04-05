import java.util.Scanner;

public class Problema158{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        for(int i=0; i<casos; i++){
            int saltos = sc.nextInt();
            int alturaActual = sc.nextInt();
            int alturaSiguiente;
            int saltosArriba=0, saltosAbajo = 0;
            for(int j=1; j<saltos;j++){
                alturaSiguiente = sc.nextInt();
                if(alturaActual<alturaSiguiente)
                    saltosArriba++;
                else if(alturaActual>alturaSiguiente)
                    saltosAbajo++;
                alturaActual = alturaSiguiente;
            }
            System.out.println(saltosArriba + " " + saltosAbajo);
        }
    }
}