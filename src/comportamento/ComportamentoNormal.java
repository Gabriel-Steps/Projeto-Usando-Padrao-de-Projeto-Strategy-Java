package comportamento;

public class ComportamentoNormal implements Comportamento{

    @Override
    public void andar() {
        System.out.println("A pessoa está andando normalmente");
    }

    @Override
    public void comer() {
        System.out.println("A pessoa está comendo normalmente");
    }

    @Override
    public void falar() {
        System.out.println("A pessoa está falando normalmente");
    }

}
