import java.util.Scanner;

public class Problema106{

	private static long codigoBarra (String usuario){
		long verificar = 0;

		boolean impar = true;

		for (int i= usuario.length()-2;i>=0;i--){
			if(impar){
				verificar+=Long.parseLong(""+usuario.charAt(i))*3;
				impar = false;
			} else{
				verificar+=Long.parseLong(""+usuario.charAt(i));
				impar=true;
			}
		}
		verificar += Long.parseLong(""+usuario.charAt(usuario.length()-1));
		return verificar;
	}

	private static String decirPais (String usuario){
		if (usuario.length()<13)
			return "EEUU";

		usuario = usuario.substring(0, 3);
		
		if(usuario.equals("380")) 
			return "Bulgaria";
        else if(usuario.equals("539"))
			return "Irlanda";
        else if(usuario.equals("560"))
			return "Portugal";
        else if(usuario.equals("759"))
			return "Venezuela";
        else if(usuario.equals("850")) 
			return "Cuba";
        else if(usuario.equals("890")) 
			return "India";
        else {
            usuario = usuario.substring(0, 2);
            if(usuario.equals("70"))
				return "Noruega";
            else if(usuario.equals("50"))
				return "Inglaterra";
            else if(usuario.charAt(0) == '0')
				return "EEUU";
        }
        return "Desconocido";
	}

	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			
			String usuario = sc.nextLine();
			
			if (usuario.equals("0"))
				break;
			
			
			if(usuario.length()<=13){
				if(usuario.length()<=8){
					System.out.println(Problema106.codigoBarra(usuario)%10==0?"SI":"NO");
				}else{
					if(Problema106.codigoBarra(usuario)%10==0){
						System.out.println("SI " + Problema106.decirPais(usuario));
					}else
						System.out.println("NO");
				}
			}
			else
				System.out.println("NO");
		

		}
	}
}

