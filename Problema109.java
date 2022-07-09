import java.util.*;

class compararEquipos implements Comparator<Equipo>{
    @Override
    public int compare(Equipo o1, Equipo o2) {
        return o2.getPuntos()-o1.getPuntos();
    }
    
}

class Equipo {
    String nombre;
    int puntos;
    int locales;
    int visitantes;

    public Equipo(String nombres){
        nombre = nombres;
        puntos = 0;
        locales = 0;
        visitantes = 0;
    }

    public void sumarPuntos(int punto){
        puntos += punto;
    }

    public void local(){
        locales++;
    }

    public void visitante(){
        visitantes ++;
    }

    public int getPuntos(){
        return puntos;
    }

    public int partidosJugados(){
        return locales+visitantes;
    }

    @Override
    public String toString() {
        return nombre + " ";
    }
}

public class Problema109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String categoria = sc.nextLine();
            
            if(categoria.equals("FIN"))
                break;

            Map<String,Equipo> clasificacion = new HashMap<>();
           
            int partidosJugados = 0;
            while(true){
                
                String partidos = sc.nextLine();
                
                if(partidos.equals("FIN"))
                break;

                String nombreEquipo1 = partidos.substring(0,partidos.indexOf(" "));
                String nombreEquipo2 = partidos.substring(partidos.indexOf(" ")+3,partidos.lastIndexOf(" "));
                Equipo equipo1;
                Equipo equipo2;
                
                if (clasificacion.containsKey(nombreEquipo1)){
                    equipo1 = clasificacion.get(nombreEquipo1);
                }else{
                    equipo1 = new Equipo(nombreEquipo1);
                    clasificacion.put(nombreEquipo1, equipo1);
                }

                if (clasificacion.containsKey(nombreEquipo2)){
                    equipo2 = clasificacion.get(nombreEquipo2);
                }else{
                    equipo2 = new Equipo(nombreEquipo2);
                    clasificacion.put(nombreEquipo2, equipo2);
                }

                int puntosEquipo1 = Integer.parseInt(""+partidos.charAt(partidos.indexOf(" ")+1));
                int puntosEquipo2 = Integer.parseInt(""+partidos.charAt(partidos.lastIndexOf(" ")+1));
                
                
                if(puntosEquipo1>puntosEquipo2){
                    equipo1.sumarPuntos(2);
                    equipo2.sumarPuntos(1);
                    equipo1.local();
                    equipo2.visitante(); 
                }else {
                    equipo1.sumarPuntos(1);
                    equipo2.sumarPuntos(2);
                    equipo2.local();
                    equipo1.visitante(); 
                }
                
                partidosJugados++;
            }

            


            List<Equipo> equipos = new ArrayList<>();

            int equipo = 0;
            for (String key : clasificacion.keySet()) {
                Equipo e = clasificacion.get(key);
                equipos.add(e);
                equipo ++;
            }

            Collections.sort(equipos,new compararEquipos());
            Equipo ganador = equipos.get(0);

            if(equipos.get(0).getPuntos() == equipos.get(1).getPuntos()){
                System.out.println("EMPATE " + Math.abs((partidosJugados - (equipo*(equipo-1)))));
            }
            else{
                
                System.out.println(ganador.nombre+" " + Math.abs((partidosJugados - (equipo*(equipo-1)))));
            }

        }
    }
}
