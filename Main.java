import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<TransporteUrbano> transportes = new ArrayList<>();

        transportes.add(new Onibus("Ônibus Municipal", 40));
        transportes.add(new Metro("Metrô Linha Azul", 200));
        transportes.add(new Bicicleta("Bicicleta Pública", 1));
        transportes.add(new PatineteEletrico("Patinete X", 1));

        for (TransporteUrbano t : transportes) {
            t.exibirInfo();
            t.mover();
            System.out.println("Custo da viagem: R$" + t.calcularCustoViagem());

            if (t instanceof MeioEcologico) {
                MeioEcologico ecologico = (MeioEcologico) t;
                System.out.println("É ecológico? " + (ecologico.ehEcologico() ? "Sim" : "Não"));
            }
        }
    }
}