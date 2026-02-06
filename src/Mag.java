
public class Mag extends Personatge {
    private int mana;
    private int encanteri;

    public Mag(String nom, int vida, int mal, int nivell, int mana, int encanteri) {
        super(nom, vida, mal, nivell);
        this.mana = mana;
        this.encanteri = encanteri;
    }

    @Override
    public void atacar(Personatge enemic) {
        if (mana < 10) {
            System.out.println(getNom() + " no té mana per atacar");
            return;
        }

        int dany = getMal() + (int)(Math.random() * encanteri);
        System.out.println(getNom() + " ataca i fa " + dany + " de mal");
        enemic.baixarVida(dany);
        mana -= 10;
    }

    @Override
    public String toString() {
        return super.toString()+" Mana "+ mana + " Encanteri " + encanteri;
    }

}
