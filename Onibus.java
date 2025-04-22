public class Onibus extends TransporteUrbano {
    public Onibus(String nome, int capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println("Ônibus está trafegando pelas ruas.");
    }

    @Override
    public double calcularCustoViagem() {
        return 4.50;
    }
}
