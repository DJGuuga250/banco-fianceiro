
package banco.financeiro;

public class PessoaFisica extends Pessoa {
    private String nomeCompleto;
    private String rg;
    private String cpf;
    
    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }
    public String getNomeCompleto(){
        return this.nomeCompleto;
    }
    //------------------------------------------------------
     public void setRg(String rg){
        this.rg = rg;
    }
    public String getRg(){
        return this.rg;
    }
    //-------------------------------------------------------
     public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    
}
