import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problema610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int i = 0; i<casos;i++){
            int poblacion = sc.nextInt();
            int ironMan = sc.nextInt();
            int spiderMan = sc.nextInt();
            int saltos = sc.nextInt();

            boolean ironManVivo = true;
            boolean spiderManVivo = true;

            int veces = 0;
            if(poblacion%2!=0){
                veces = poblacion/2 +1 ;
            }else
            veces = poblacion/2;
            
            int posEliminar = 0;

            List <Integer> vivos = new ArrayList<>();

            for (int j=1; j<=poblacion;j++)
                vivos.add(j);


            for(int j=0; j<veces; j++){
                posEliminar = (posEliminar + saltos) % vivos.size();
                vivos.remove(posEliminar);
            }

            if ((vivos.contains(spiderMan) && vivos.contains(ironMan)) ||
                ((!vivos.contains(spiderMan) && !vivos.contains(ironMan)))) {
                System.out.println("No hay abrazo");
            }
            else if (vivos.contains(spiderMan)) {
                System.out.println("No quiero irme, Peter!");
            }
            else {
                System.out.println("No quiero irme, Sr. Stark!");
            }
        }
    }
}
