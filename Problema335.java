import java.util.Scanner;
//LA SOLUCIÓN DEL EJERCICIO FUE GUARDAR N COMO LONG, Y GUARDAR EL RESULTADO COMO LONG
public class Problema335{
	public static void main(String[] args){
		
		Scanner sc = new Scanner (System.in);
		
		int casos=sc.nextInt();
		
		long n;
		
		for(int i = 0; i<casos; i++){
			n = sc.nextLong();
            
            long x = (n*(n + 1)*(n + 2))/6;
			System.out.println(x);
		}
	}
}