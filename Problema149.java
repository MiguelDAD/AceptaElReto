import java.util.*;

public class Problema149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;

        while(sc.hasNext()){
            int toros = sc.nextInt();
            for(int i=0;i<toros;i++){
                max=Math.max(max,sc.nextInt());
            }
            System.out.println(max);
            max=0;
        }
    }
}
