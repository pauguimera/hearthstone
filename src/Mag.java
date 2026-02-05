
public class Mag extends Personatge {
    private int mana;
    private int encanteri;

    public Mag(String nom, int vida, int mal, int nivell, int mana, int encanteri) {
        super(nom, vida, mal, nivell);
        this.mana = mana;
        this.encanteri = encanteri;
    }

    public void atacar(Personatge enemic) {
        int dany = getMal() + (int)(Math.random() * encanteri);
        System.out.println(getNom() + " ataca de forma salvatge i fa " + dany + " de dany.");
        enemic.baixarVida(dany);
    }

    @Override
    public String toString() {
        return super.toString()+" Mana "+ mana + " Encanteri " + encanteri;
    }

}
