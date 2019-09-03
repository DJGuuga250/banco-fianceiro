
package banco.financeiro;

public class ContaCorrenteSimplificada {
    
    private String agencia;
    private String nroConta;
    private double saldo;
    private Pessoa pessoa;

    
    
    public void exibirDados (){
        System.out.println("AGENCIA" + this.agencia);
        System.out.println("CONTA-CORRENTE" + this.nroConta);
        if (this.pessoa instanceof PessoaFisica) {
            
            System.out.println("NOME:" + ((PessoaFisica)this.pessoa).getNomeCompleto());
            System.out.println("RG" + ((PessoaFisica) this.pessoa).getRg());
            System.out.println("CPF" + ((PessoaFisica) this.pessoa).getCpf());  
        }
       
        System.out.println("SALDO" + this.saldo);
    }
    
    public double depositar(double valor){
        this.saldo = this.saldo + valor;
        return this.saldo;
    }
     public double sacar(double valor){
        if(this.saldo < valor){
             
           System.out.println("Saldo insuficiente");
       } else {
             this.saldo = this.saldo - valor;
        }
        return this.saldo;
    }
    
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public String getAgencia(){
        return this.agencia;
    }
    public void setNmrConta(String NmrConta){
        this.nroConta = NmrConta;
    }
    public String getNmrConta(){
        return this.nroConta;
    }
     public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    public Pessoa getPessoa(){
        return this.pessoa;
    }
   
    
    
    
}
