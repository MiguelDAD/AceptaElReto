import java.util.Scanner;

public class Problema475{
    public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int contador = sc.nextInt();
		sc.nextLine();
		
		for (int j = 0; j<contador; j++) {
			
			
			String frase = sc.nextLine().toLowerCase();
			frase.trim();
			frase = frase.replaceAll("á", "a");
			frase = frase.replaceAll("é", "e");
			frase = frase.replaceAll("í", "i");
			frase = frase.replaceAll("ó", "o");
			frase = frase.replaceAll("ú", "u");

			String busca = "stanlee";

			


			int vecesqueaparece = 0;
			int buscarLetra = 0;
			int repetir = frase.length();

			for(int i=0;i<repetir;i++){
                if(frase.charAt(i)==busca.charAt(buscarLetra)){
					buscarLetra++;
				}
				if(buscarLetra==busca.length()){
					vecesqueaparece++;
					buscarLetra=0;
				}
            }
			
            
			System.out.println(vecesqueaparece);

		}
	}
}