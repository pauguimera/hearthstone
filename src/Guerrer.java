public class Guerrer extends Personatge {
    private int defensa;
    private int malExtra;

    public Guerrer(String nom, int vida, int mal, int nivell, int defensa,int malExtra) {
        super(nom, vida, mal, nivell);
        this.defensa = defensa;
        this.malExtra=malExtra;
    }

    public void atacar(Personatge enemic) {
        int dany = getMal() + malExtra;
        System.out.println(getNom() + " ataca i fa " + dany + " de mal");
        enemic.baixarVida(dany);
    }
    @Override
    public String toString() {
        return super.toString()+" Defensa "+ defensa + " malExtra " +malExtra;
    }
}