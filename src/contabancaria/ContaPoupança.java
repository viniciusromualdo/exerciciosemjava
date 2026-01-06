package contabancaria;

public class ContaPoupança extends ContaBancaria{
    float taxaDeRendimento = 1.45F;

    public ContaPoupança(String nome){
        super(nome);
    }
    @Override
    public void depositar(float valor){
        saldo = (float) (valor * taxaDeRendimento);
        System.out.println("Você depositou " + valor + " reais");
        System.out.println("Seu saldo após o depósito é de: " + saldo);
    }


}
