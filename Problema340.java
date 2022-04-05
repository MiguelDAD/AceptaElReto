import java.util.Scanner;

public class Problema340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int usuario = sc.nextInt();

        for(int i=0; i<usuario; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x==y)
                System.out.println(x*(2*(y+1)));
            else{
                int cX = x*y+y;
                int cY = y*x+x;
                System.out.println(cX+cY);
            }
                
        }
        
    }
}