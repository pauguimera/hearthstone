public abstract class Personatge{
    public abstract void atacar(Personatge personatge);
    private String nom;
    private int vida;
    private int mal;
    private int nivell;

    public Personatge(String nom, int vida, int mal, int nivell) {
        this.nom = nom;
        this.vida = vida;
        this.mal = mal;
        this.nivell = nivell;
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

    @Override
    public String toString() {
        return " Nombre: "+ nom + " Vida: "+vida+" Mal "+mal+" Nivell "+nivell;
    }
}
