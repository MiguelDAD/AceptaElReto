import java.util.Scanner;
import java.util.TreeMap;

public class Problema331{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeMap<Integer,String> resultado = new TreeMap<>();

        while(true){
            int usuario = sc.nextInt();
            sc.nextLine();
            if(usuario==0)
                break;
            
            boolean esCorrecto = true;
                
            resultado.clear();

            for(int i=1; i<=usuario; i++){
                int posicion = sc.nextInt()+i;
                String piloto = sc.nextLine();

                
                if (resultado.containsKey(posicion))     
                    esCorrecto = false;

                if (posicion < 1 || posicion > 26) 
                    esCorrecto = false;

                resultado.put(posicion, piloto);

            }

            if(!esCorrecto){
                System.out.println("IMPOSIBLE");
            } else {
                for (Integer a : resultado.keySet()) {
                    System.out.println(a + resultado.get(a));
                }
            }
            System.out.println("-----");
        }
    }
}