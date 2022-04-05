import java.util.Scanner;

public class Problema462 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //CASOS DE PRUEBA
        int casos = sc.nextInt();
        sc.nextLine(); //LIMPIAR PROMT

        String usuario;
        int vecesLimpiada;
        String[] tiempos;
        for(int i=0;i<casos;i++){
            usuario = sc.nextLine();
            vecesLimpiada = Integer.parseInt(usuario.substring(0,usuario.indexOf(" ")));
            tiempos = usuario.substring(usuario.indexOf(" ")+1).split(":");

            //CALCULO TIEMPOS
            int segundos = Integer.parseInt(tiempos[2]) * vecesLimpiada; //MULTIPLICO SEGUNDOS POR LAS VECES LIMPIADAS
            int minutos = Integer.parseInt(tiempos[1]) * vecesLimpiada; //MULTIPLICO MINUTOS POR LAS VECES LIMPIADAS
            int horas = Integer.parseInt(tiempos[0]) * vecesLimpiada; //MULTIPLICO HORAS POR LAS VECES LIMPIADAS
            int dias = 0;

            //CALCULO EL TIEMPO TOTAL
            if(segundos>=60){
                minutos += segundos/60;
                segundos %= 60;
            }

            if(minutos>=60){
                horas += minutos/60;
                minutos %=60;
            }

            if(horas>=24){
                dias += horas/24;
                horas %= 24;  
            }

            System.out.printf("%d %02d:%02d:%02d",dias,horas,minutos,segundos);
            System.out.println();
        }
    }
}
