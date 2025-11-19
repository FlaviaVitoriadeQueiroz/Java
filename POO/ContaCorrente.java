public class ContaCorrente {
    
    // Atributos (package private)
    float juros = 0.01f;
    float saldo;
    float limiteChequeEspecial = -200f;
    String primeiroNome;
    String sobrenome;
    long numeroConta;

    // Método para depósito
    public void deposito(float valor) {
        saldo += valor;
    }

    // Método para saque
    public void saque(float valor) {
        if (saldo - valor >= limiteChequeEspecial) {
            saldo -= valor;
        } else {
            System.out.println("Limite insuficiente!");
        }
    }

    // Método para rendimento
    public void rendimento() {
        if (saldo > 0) {
            saldo += saldo * juros;
        }
    }

    // Método para exibir saldo
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    // Método para obter nome completo
    public String getNome() {
        return primeiroNome + " " + sobrenome;
    }

    // Método para obter número da conta
    public long getNumero() {
        return numeroConta;
    }

    // Método main para teste
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.primeiroNome = "João";
        conta.sobrenome = "Silva";
        conta.numeroConta = 123456789L;

        conta.deposito(100f);
        conta.saque(125f);
        conta.rendimento();
        conta.exibirSaldo();
    }
}
