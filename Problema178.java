import java.util.Arrays;
import java.util.Scanner;

//CASO DE PRUEBA
	//TEOooo dijo"SIII".
	//te       oDiO.

public class Problema178 {
	public static void main(String[] args){
	
		Scanner sc = new Scanner (System.in);
		
		int contador = sc.nextInt();
		sc.nextLine();
		
		for (int j = 0; j<contador; j++) {
			
			
			String frase = sc.nextLine().toUpperCase();

			String busca = sc.nextLine().toUpperCase();
			busca = busca.replaceAll(" ", "");


			int buscarLetra = 0;
			int repetir = frase.length();

			for(int i=0;i<repetir&&buscarLetra<busca.length();i++){
                if(frase.charAt(i)==busca.charAt(buscarLetra)){
					buscarLetra++;
				}
            }

			
            
			System.out.println(buscarLetra==busca.length()?"SI":"NO");

		}
	}
}