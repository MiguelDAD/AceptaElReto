import java.util.Scanner;

public class Problema336 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        

        while (sc.hasNext()){
            int usuario = sc.nextInt();

            int[] pesos = new int[usuario];

            int miembrosIzq = 0;
            int pesoIzq = 0;
            int pesoDer = 0;
            int pesoTotalD=0;
            int pesoTotalI=0;
            boolean seJuega = true;

            int noSeJuega = Integer.MAX_VALUE;

            for(int i = 0; i<usuario;i++){
                pesos[i]=sc.nextInt();
                pesoDer+=pesos[i];
                
            }
    
            for(int i = 0; i<usuario&&seJuega;i++){
                pesoDer -= pesos[i];
                pesoIzq += pesos[i];
                
                //ABSOLUTE PARA QUITAR NEGATIVO

                if(Math.abs(pesoIzq-pesoDer)==noSeJuega){
                    seJuega = false;
                }else if(Math.abs(pesoIzq-pesoDer)<noSeJuega){
                    noSeJuega = Math.abs(pesoIzq-pesoDer);
                    pesoTotalD=pesoDer;
                    pesoTotalI=pesoIzq;
                    miembrosIzq=i+1;
                } 
            
            }

            if(!seJuega){
                System.out.println("NO JUEGAN");
            }
            else {
                System.out.println(miembrosIzq  +" "+pesoTotalI +" "+  pesoTotalD);
    
            }
        }
    }
}