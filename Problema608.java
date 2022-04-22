import java.util.Scanner;

public class Problema608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int casos = sc.nextInt();
            boolean masDe6 = false;
            boolean seHaDadoAviso = false;
            int suena = 0;
            
            if (casos == 0)
                break;
                
            for (int i = 0; i<casos;i++){
                int usuario = sc.nextInt();
                if(usuario>6){
                    masDe6 = true;
                    seHaDadoAviso = true;
                }
                if ((usuario <= 4 && masDe6) || (usuario <= 4 && !seHaDadoAviso)){
                    suena++;
                    masDe6 = false;
                    seHaDadoAviso=true;
                }
            }

            System.out.println(suena);
        }
    }
}
