import java.util.Scanner;

public class Problema101{

    private void nImpar(int[][] cuadrado){
        int cm2 = constanteMagica2(cuadrado);
        int mitad = (cuadrado.length/2);
        int ladosC = cuadrado[0][mitad]+cuadrado[mitad][0]+
                cuadrado[mitad][cuadrado.length-1]+
                cuadrado[cuadrado.length-1][mitad];
        int centro = 4*cuadrado[mitad][mitad];
        if (centro==cm2 && ladosC==cm2)
            System.out.println("ESOTERICO");
        else
            System.out.println("DIABOLICOS");

    }
    

    private void nPar(int cuadrado[][]){
        int cm2 = constanteMagica2(cuadrado);
        int mitad1 = (cuadrado.length/2)-1;
        int mitad2 = (cuadrado.length/2);
        int ladosC = cuadrado[0][mitad1]+cuadrado[0][mitad2]+
                cuadrado[mitad1][0]+cuadrado[mitad2][0]+
                cuadrado[mitad1][cuadrado.length-1]+cuadrado[mitad2][cuadrado.length-1]+
                cuadrado[cuadrado.length-1][mitad1]+cuadrado[cuadrado.length-1][mitad2];
        int centro = cuadrado[mitad1][mitad1]+cuadrado[mitad2][mitad2]+
                cuadrado[mitad1][mitad2]+cuadrado[mitad2][mitad1];
        if (centro==cm2 && ladosC/2==cm2)
            System.out.println("ESOTERICO");
        else
            System.out.println("DIABOLICOS");
    }




    private int constanteMagica(int cuadrado[][]){

        int []constanteMagica=calcularConstante(cuadrado);

        //COMPRUEBO que TODOS los numeros sean IGUALES
        boolean esMagica = true;
        for (int f=0; f<constanteMagica.length-1; f++){
            if (constanteMagica[f]!=constanteMagica[f+1])
                esMagica=false;
        }
        if (esMagica)
            return constanteMagica[0];
        else
            return -1;
    }

    /* La combinacion de filas y columnas y dos diagonales es igual a n*2 + 2
     * por ejemplo un cuadrado de 7, tendras que obtener el resultado de sus 7 filas,
     * sus 7 columnas y sus 2 diagonales = 16
     */
    private int[] calcularConstante(int cuadrado[][]){
        int [] constanteMagica = new int [cuadrado.length*2+2];
        int posArray = 0;
        //CALCULO la suma de las FILAS y COLUMNAS
        for(int f=0;f< cuadrado.length; f++){
            for(int c=0;c< cuadrado[f].length; c++){
                constanteMagica[posArray] += cuadrado[f][c];
            }
            posArray ++;
            for(int c=0;c< cuadrado[f].length; c++){
                constanteMagica[posArray] += cuadrado[c][f];
            }
            posArray ++;
        }
        //CALCULO la suma de la DIAGONAL PRINCIPAL
        for(int d=0;d< cuadrado.length; d++){
            constanteMagica[posArray] += cuadrado[d][d];
        }
        posArray ++;
        //CALCULO la suma de la DIAGONAL SECUNDARIA
        for(int d=0;d< cuadrado.length; d++){
            constanteMagica[posArray] += cuadrado[d][cuadrado.length-d-1];
        }

        return constanteMagica;
    }

    private boolean serienNaturales(int cuadrado[][]){
        boolean enSerie = false;
        for(int x= cuadrado.length * cuadrado.length; x>0; x--){
            for (int f=0;f< cuadrado.length; f++){
                for(int c=0; c< cuadrado[f].length;c++){
                    if(cuadrado[f][c]==x)
                        enSerie = true;
                }
            }
            if(enSerie && x!=1)
                enSerie = false;
            else
                x = 0;
        }
        return enSerie;
    }

    private int constanteMagica2(int cuadrado[][]){
        int cm2 = 4*constanteMagica(cuadrado)/ cuadrado.length;
        return cm2;
    }

    private boolean sumaEsquinas(int cuadrado[][]){
        boolean esquinas = false;
        int cm2 = constanteMagica2(cuadrado);
        int lados = cuadrado[0][0]+cuadrado[0][cuadrado.length-1]+
                cuadrado[cuadrado.length-1][0]+cuadrado[cuadrado.length-1][cuadrado.length-1];
        if (lados==cm2)
            esquinas = true;
        return esquinas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problema101 aux = new Problema101();

        while(true){
            int lados = sc.nextInt();

            if(lados == 0)
                break;

            int[][] cuadrado = new int[lados][lados];

            for (int f = 0; f< cuadrado.length; f++){
                for (int c = 0; c< cuadrado[f].length; c++)
                    cuadrado[f][c] = sc.nextInt();
            }

            int constanteMagica = aux.constanteMagica(cuadrado);

            if(constanteMagica==-1)
                System.out.println("NO");
            else{
                boolean sigueNaturales = aux.serienNaturales(cuadrado);
                boolean sumaEsquinas = aux.sumaEsquinas(cuadrado);
                if(sigueNaturales && sumaEsquinas){
                    if(lados%2==0){
                        aux.nPar(cuadrado);
                    }
                    else{
                        aux.nImpar(cuadrado);
                    }
                }
                else{
                    System.out.println("DIABOLICO");
                }
                
            }
        }
    }
}