import java.util.Scanner;

public class Problema474 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for(int i=0;i<casos;i++){
            int posActual = sc.nextInt();
            int posBomba1= sc.nextInt();
            int posBomba2 = sc.nextInt();

            if(Math.abs(posActual-posBomba1)<Math.abs(posActual-posBomba2))
                System.out.println(Math.abs(posActual-posBomba1)+Math.abs(posBomba1-posBomba2));
            else
                System.out.println(Math.abs(posActual-posBomba2)+Math.abs(posBomba2-posBomba1));

            
        }
    }
}
