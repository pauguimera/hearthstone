public class Monstre extends Personatge {
    private int ferocitat;

    public Monstre(String nom, int vida, int mal, int nivell, int ferocitat) {
        super(nom, vida, mal, nivell);
        this.ferocitat = ferocitat;
    }

    @Override
    public void atacar(Personatge enemic) {
        int dany = getMal() + (int)(Math.random() * ferocitat);
        System.out.println(getNom() + " ataca amb ferocitat i fa " + dany + " de mal");
        enemic.baixarVida(dany);
    }

    @Override
    public String toString() {
        return super.toString() + " Ferocitat " + ferocitat;
    }
}
