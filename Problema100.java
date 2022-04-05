import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problema100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario = sc.nextLine();

        for(int i=Integer.parseInt(usuario);i>0;i--){
            
            usuario = sc.nextLine();

            boolean constante = false;

            if(usuario.equals("6174")){
                System.out.println("0");
                constante = true;
            }

            int veces = 0;

            List<Integer> numeros = new ArrayList<>();

            while(!constante){

                veces++;

                if(usuario.length()!=4){
                    for(int j=usuario.length();j<4;j++){
                        usuario = "0"+usuario;
                    }
                }

                for(int j=0; j<4;j++){
                    numeros.add(Integer.parseInt(""+usuario.charAt(j)));
                }
                

                Collections.sort(numeros);

                int n1 = Integer.parseInt(""+numeros.get(0)+numeros.get(1)+numeros.get(2)+numeros.get(3));
                int n2 = Integer.parseInt(""+numeros.get(3)+numeros.get(2)+numeros.get(1)+numeros.get(0));

                int r = Math.abs(n1-n2);

                usuario = ""+r;
                if(r==6174){
                    System.out.println(veces);
                    constante = true;
                }
                else if(numeros.get(0)==numeros.get(1)&&numeros.get(1)==numeros.get(2)&&numeros.get(2)==numeros.get(3)) {
                    System.out.println("8"); 
                    constante = true;  
                }

                numeros.clear();
            }
            


            
        }
    }
}
