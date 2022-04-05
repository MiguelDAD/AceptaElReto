import java.util.Scanner;

public class Problema333 {

    public static boolean esCapicua(String numero, int izq, int der){

        if (numero.charAt(izq) == '0' && izq != der) 
            return false;

        
        while(izq<=der){
            if(numero.charAt(izq)!=numero.charAt(der))
                return false;
            izq ++;
            der --;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario;

        while(true){
            usuario = sc.nextLine();

            boolean bicapicua = false;

            if(usuario.equals("0"))
                break;

            for(int i=0;i<usuario.length()-1&&!bicapicua;i++){ 
                bicapicua = esCapicua(usuario, 0, i) && esCapicua(usuario, i+1, usuario.length()-1);
            }

            if(bicapicua)
                System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
}
