package banco;

public class ContaBancaria {
    // atributos -----------------------------------------------------
    private int numero;
    private int agencia;
    private double saldo;
    private String nomeCliente;
    private double limiteDepositoDiario;
    
    // contrutores --------------------------------------------------
    public ContaBancaria(int numero, int agencia, double saldo, String nomeCliente, double limiteDepositoDiario){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
        this.limiteDepositoDiario = limiteDepositoDiario;
    }
    
    // metodos acessores (getters & setters) ----------------
    public int getNumero() { // permite que o mundo exterior tenha uma cópia desta variável privada
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setSaldo(double saldo){
        
        if(saldo >= 0){
            
            this.saldo = saldo;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getLimiteDepositoDiario() {
        return limiteDepositoDiario;
    }
  
}
