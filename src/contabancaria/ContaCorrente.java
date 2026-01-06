package contabancaria;

public class ContaCorrente extends ContaBancaria{
    float limitechequeEspecial;

    public ContaCorrente(String nome){
        super(nome);
    }

    @Override
    public void sacar(float valor){
        if (valor > 0 && valor < saldo + limitechequeEspecial){
            saldo -= valor;
        } else if (valor <=0){
            System.out.println("Transação inválida");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void aplicarlimite(float limite){
        limitechequeEspecial += limite;
        System.out.println("Seu limite de cheque especial é de: " + limitechequeEspecial);
    }
}
