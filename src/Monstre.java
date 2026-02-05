public class Monstre extends Personatge {
    private int agresivitat;

    public Monstre(String nom, int vida, int mal, int nivell, int agressivitat) {
        super(nom, vida, mal, nivell);
        this.agresivitat = agressivitat;
    }

    public void atacar(Personatge enemic) {
        int dany = getMal() + (int)(Math.random() * agresivitat);
        System.out.println(getNom() + " ataca de forma salvatge i fa " + dany + " de dany.");
        enemic.baixarVida(dany);
    }



    @Override
    public String toString() {
        return super.toString()+" Agrestivitat "+ agresivitat;
    }
}
