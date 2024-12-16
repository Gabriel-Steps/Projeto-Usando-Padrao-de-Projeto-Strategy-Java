package comportamento;

public class ComportamentoRapido implements Comportamento{
    @Override
    public void andar() {
        System.out.println("A pessoa está andando muito rápido");
    }

    @Override
    public void comer() {
        System.out.println("A pessoa está comendo muito rápido");
    }

    @Override
    public void falar() {
        System.out.println("A pessoa está falando muito rápido");
    }
}
