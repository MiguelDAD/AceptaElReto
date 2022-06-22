import java.util.Scanner;

public class Problema523 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int veces = sc.nextInt();

        int mayores = 0;
        int menores = 0;

        for(int i=0; i<veces; i++){
            String mimatricula = sc.next();

            int misnumeros = Integer.parseInt(mimatricula.substring(0, 4));
            mimatricula = mimatricula.substring(4,7);

            String matricula = sc.next();
            
            while (!matricula.equals("0")){

                int susnumeros = Integer.parseInt(matricula.substring(0, 4));
                matricula = matricula.substring(4,7);

                if(mimatricula.compareTo(matricula)<0){
                    menores++;
                }else if(mimatricula.compareTo(matricula)>0){
                    mayores++;
                }else {
                    if(misnumeros<susnumeros)
                        menores++;
                    else if(misnumeros>susnumeros)
                        mayores++;

                }

                matricula = sc.next();
            }

            System.out.println(mayores +" "+menores);
            mayores = 0;
            menores = 0;
        }
    }
}
