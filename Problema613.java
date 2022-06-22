import java.util.Scanner;

public class Problema613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            long multiplo = sc.nextInt();
            long resto = 1;
            long veces = 0;

            while (true){
                resto = resto%multiplo;
                veces ++;
                //System.out.println(veces);
                if(resto == 0)
                    break;
                resto = (resto*10)+1;
            }

            System.out.println(veces);
        }
    }
}
