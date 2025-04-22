public class Metro extends TransporteUrbano {
    public Metro(String nome, int capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println("Metrô está se movendo pelos trilhos subterrâneos.");
    }

    @Override
    public double calcularCustoViagem() {
        return 3.80;
    }
}