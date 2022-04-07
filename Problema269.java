import java.util.Scanner;
public class Problema269{
	public static void main (String[] args){
	
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		
		while (n>0){
            
            int actual = 0;

            int siguiente = sc.nextInt();
            int sumatorio = 0;

			while(siguiente!=0){
				sumatorio += siguiente;
                actual += sumatorio*2;
				siguiente= sc.nextInt();
			}
		System.out.println(actual);
		
		n--;
		}

	}
}
