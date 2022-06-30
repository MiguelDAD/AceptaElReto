import java.util.Scanner;

public class Problema102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String encriptado = sc.nextLine();
        

            int desplazamientos1  ='p' - encriptado.charAt(0);
            int desplazamientos2  =encriptado.charAt(0)-'p';
            int desplazamientos = 0;
            if(Math.abs(desplazamientos1)>Math.abs(desplazamientos2))
                desplazamientos = desplazamientos2;
            else
                desplazamientos = desplazamientos1;

            encriptado = encriptado.substring(1);

            String fraseDesencriptada  = "";
            int noAcentuadas = 0;

            for(int i=0; i<encriptado.length(); i++){

                char letra = Character.toLowerCase(encriptado.charAt(i));

                if (Character.isLetter(letra)) {

                    letra = (char) ((int)letra + desplazamientos);
                    if (letra < 97) {
                        letra = (char)(123 - (97 - (int)letra));
                    }
                    else if (letra > 122) {
                        letra = (char)(96 + ((int)letra - 122));
                    }
    
                    if (Character.isUpperCase(encriptado.charAt(i))) {
                        letra = Character.toUpperCase(letra);
                    }
    
                }



                
                fraseDesencriptada += "" + letra;

                if(letra =='a'||letra =='e'||letra =='i'||letra =='o'||letra =='u'||
                    letra =='A'||letra =='E'||letra =='I'||letra =='O'||letra =='U')
                    noAcentuadas++;
            }

            if(fraseDesencriptada.equals("FIN"))
                break;
            //System.out.println(desplazamientos);
            //System.out.println(fraseDesencriptada);
            System.out.println(noAcentuadas);


        }
    }
}
