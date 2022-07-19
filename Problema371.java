import java.util.Scanner;

public class Problema371{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int cuadrados = sc.nextInt();
            
            if (cuadrados==0)
                break;

            int cerillas = 0;

            for(int i=1; i<=cuadrados; i++){
                cerillas += i*3;
            }

            System.out.println(cerillas);
        }
    }
}