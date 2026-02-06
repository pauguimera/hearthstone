import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        menuInicio();
        Personatge jugador= seleccioDePersonatge();
        System.out.println("Ara escolliras al teu rival");
        Personatge rival= seleccioDePersonatge();
        System.out.println(jugador);
        System.out.println(rival);
        batalla(jugador,rival);
    }
    public static void menuInicio (){
        System.out.println("Benvingut al Hearthsone");
        System.out.println("El joc consta de dos personatges a escollir sobre tres (mag, guerrer, monstre) dels quals els dos escollits combatràn entre ells");
        System.out.println("Primer el que faras serà donar nom als tres personatges per a que després els puguis escollir per a combatir");
    }
    public static Personatge seleccioDePersonatge(){
        Scanner scseleccio=new Scanner(System.in);
        String personatgejugador= null;
        Personatge personatge= null;
        boolean personatgeValid = false;
        while (!personatgeValid) {
            System.out.println("Escull entre les tres possibilitats (mag, guerrer, monstre)");
            personatgejugador = scseleccio.nextLine();
            switch (personatgejugador) {
                case "mag":
                    System.out.println("Has escollit el mag");
                    personatgeValid = true;
                    System.out.println("Posa el nom del Mag");
                    String nomMag=scseleccio.nextLine();
                    personatge = new Mag(nomMag, 100, 20, 1, 80, 30);
                    break;
                case "guerrer":
                    System.out.println("Has escollit el guerrer");
                    personatgeValid = true;
                    System.out.println("Posa el nom del Guerrer");
                    String nomGuerrer=scseleccio.nextLine();
                    personatge = new Guerrer(nomGuerrer, 150, 30, 1, 25, 15);
                    break;
                case "monstre":
                    System.out.println("Has escollit el monstre");
                    personatgeValid = true;
                    System.out.println("Posa el nom del Monstre");
                    String nomMonstre=scseleccio.nextLine();
                    personatge = new Monstre(nomMonstre, 120, 25, 1, 70);
                    break;
                default:
                    System.out.println("Personatge no vàlid,torna-ho a provar.");
                    break;
            }
        }
        return personatge ;
    }
    public static void batalla(Personatge jugador, Personatge rival) {

        while (jugador.getVida() > 0 && rival.getVida() > 0) {
            //torn jugador
            jugador.atacar(rival);
            jugador.usarCarta(rival);

            if (rival.getVida() <= 0) break;
            //torn rival
            rival.atacar(jugador);
            rival.usarCarta(jugador);

            System.out.println(jugador.getNom() + " vida: " + jugador.getVida());
            System.out.println(rival.getNom() + " vida: " + rival.getVida());
        }

        if (jugador.getVida() > 0) {
            System.out.println("Has guanyat");
        } else {
            System.out.println("Has perdut");
        }
    }
}