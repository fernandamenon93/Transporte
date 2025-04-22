public abstract class TransporteUrbano {
    protected String nome;
    protected int capacidade;

    public TransporteUrbano(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Capacidade: " + capacidade + " pessoas");
    }

    public abstract void mover();

    public double calcularCustoViagem() {
        return 0.0;
    }
}
