import java.util.Scanner;

public class Problema666 {

    public static String limpiarCadena(String cadena) {
        String cadenaLimpia = cadena;
        cadenaLimpia = cadenaLimpia.replaceAll("[^a-zA-Z]", "");
        cadenaLimpia = cadenaLimpia.toLowerCase();
        return cadenaLimpia;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bucle = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < bucle; i++) {
            String frase1 = sc.nextLine();
            frase1 = limpiarCadena(frase1);
            String frase2 = sc.nextLine();
            frase2 = limpiarCadena(frase2);
            if(frase1.equalsIgnoreCase(frase2)){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }

        }
    }
}
