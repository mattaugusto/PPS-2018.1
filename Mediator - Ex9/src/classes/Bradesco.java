package classes;

import abstract_classes.Colleague;
import interfaces.Mediator;

public class Bradesco extends Colleague {

    private Double saldo;

    public Bradesco(Mediator m){
        super(m);
    }

    @Override
    public void receberTransferencia(Double valor, String mensagem){
        System.out.println("Bradesco recebeu R$" +valor+"." + mensagem);
        System.out.println("Saldo antes da transferência: " + this.saldo);
        this.saldo += valor;
        System.out.println("Saldo após transferência: " + this.saldo);
    }
}