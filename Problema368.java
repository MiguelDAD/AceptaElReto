import java.util.Scanner;

public class Problema368{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad, capacidad;
        
        while(true){
            
            cantidad = sc.nextInt();
            capacidad = sc.nextInt();

            if(cantidad==0 && capacidad ==0) break;
            
            int tiempoTotal = cantidad%capacidad==0 ? ((cantidad/capacidad)*10) : ((cantidad/capacidad)*10) + 10;

            System.out.println(tiempoTotal);

        }
    }
}