import java.util.ArrayList;

public abstract class Personatge{
    public abstract void atacar(Personatge personatge);
    private String nom;
    private int vida;
    private int mal;
    private int nivell;
    ArrayList<String> cartes = new ArrayList<>();

    public Personatge(String nom, int vida, int mal, int nivell) {
        this.nom = nom;
        this.vida = vida;
        this.mal = mal;
        this.nivell = nivell;
        varallaCartes();
    }

    public String getNom() {
        return nom;
    }

    public int getVida() {
        return vida;
    }

    public int getMal() {
        return mal;
    }

    public void setMal(int mal) {
        this.mal = mal;
    }

    protected void baixarVida(int mal){
        vida -= mal;
        if (vida < 0) {
            vida = 0;
        }
    }

public void varallaCartes(){
    cartes.add("MalExtra+");
    cartes.add("Curar+");
    cartes.add("MalExtra++");
    cartes.add("Curar++");
    cartes.add("executar");
}
    public void curar(int quantitat) {
        vida = vida + quantitat;
        System.out.println(nom + " recupera " + quantitat + " de vida");
    }

    public void augmentarMal(int quantitat) {
        mal = mal+quantitat;
        System.out.println(nom + " augmenta el seu mal en " + quantitat);
    }

    public void usarCarta(Personatge enemic) {
        int indexCartaUsada=(int)(Math.random() * cartes.size());
        String carta = cartes.get(indexCartaUsada);

        switch (carta) {
            case "Curar+":
                curar(20);
                break;

            case "Curar++":
                curar(40);
                break;

            case "MalExtra+":
                augmentarMal(10);
                break;

            case "MalExtra++":
                augmentarMal(20);
                break;

            case "executar":
                if (enemic.getVida() <= 1000) {
                    enemic.baixarVida(enemic.getVida());
                }
                break;
        }
        cartes.remove(indexCartaUsada);
    }


    @Override
    public String toString() {
        return " Nombre: "+ nom + " Vida: "+vida+" Mal "+mal+" Nivell "+nivell;
    }
}