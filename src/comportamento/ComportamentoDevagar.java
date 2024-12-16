package comportamento;

public class ComportamentoDevagar implements Comportamento{
    @Override
    public void andar() {
        System.out.println("A pessoa está andando bem devagar");
    }

    @Override
    public void comer() {
        System.out.println("A pessoa está comendo bem devagar");
    }

    @Override
    public void falar() {
        System.out.println("A pessoa está falando bem devagar");
    }
}
