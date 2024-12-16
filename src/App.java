import comportamento.Comportamento;
import comportamento.ComportamentoDevagar;
import comportamento.ComportamentoNormal;
import comportamento.ComportamentoRapido;
import model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Comportamento normal = new ComportamentoNormal();
        Comportamento rapido = new ComportamentoRapido();
        Comportamento devagar = new ComportamentoDevagar();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setComportamento(devagar);
        pessoa1.andar();
    }
}
