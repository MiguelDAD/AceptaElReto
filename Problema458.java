import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problema458{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int usuario;

        while(true){
            usuario = sc.nextInt();
            if(usuario==0)
                break;
            sc.nextLine();
           
            Long[] numeros = new Long[usuario];
            for(int i = 0;i<usuario;i++){
                numeros[i]=sc.nextLong();
            }

            List<Long> ordenar= Arrays.asList(numeros);
            Collections.sort(ordenar);
            long pos = ordenar.get(0) * ordenar.get(1);
            long neg = ordenar.get(ordenar.size()-1) * ordenar.get(ordenar.size()-2);
            long extremos = ordenar.get(0) * ordenar.get(ordenar.size()-1);
            // System.out.println(pos);
            // System.out.println(neg);
            // System.out.println(extremos);
            
            ordenar= new ArrayList<>();
            ordenar.clear();
            ordenar.add(pos);
            ordenar.add(neg);
            ordenar.add(extremos);
            Collections.sort(ordenar);

            
            if(pos<0&&neg<0&&extremos<0)
                System.out.println(ordenar.get(0));
            else
                System.out.println(ordenar.get(ordenar.size()-1));

            ordenar.clear();
        }
    }
}