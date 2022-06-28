import java.util.Scanner;

public class Problema435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;

        while(sc.hasNext()){
            String numeros = sc.nextLine();
            for(int x=0; x<numeros.length();x++){
                switch(numeros.charAt(x)){
                    case '0':
                        a++;
                        break;
                    case '1':
                        b++;
                        break;
                    case '2':
                        c++;
                        break;
                    case '3':
                        d++;
                        break;
                    case '4':
                        e++;
                        break;
                    case '5':
                        f++;
                        break;
                    case '6':
                        g++;
                        break;
                    case '7':
                        h++;
                        break;
                    case '8':
                        i++;
                        break;
                    case '9':
                        j++;
                        break;
                }
            }
            if(a==b&&a==c&&a==d&&a==e&&a==f&&a==g&&a==h&&a==i&&a==j)
                System.out.println("subnormal");
            else 
                System.out.println("no subnormal");

            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = 0;
            f = 0;
            g = 0;
            h = 0;
            i = 0;
            j = 0;
        }
    }
}
