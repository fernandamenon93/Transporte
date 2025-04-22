public class PatineteEletrico extends TransporteUrbano implements MeioEcologico {
    public PatineteEletrico(String nome, int capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println("Patinete elétrico está deslizando pela ciclovia.");
    }

    @Override
    public boolean ehEcologico() {
        return true;
    }

    @Override
    public double calcularCustoViagem() {
        return 1.50;
    }
}