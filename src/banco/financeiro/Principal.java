
package banco.financeiro;

public class Principal {
    public static void main(String[] args) {
        ContaCorrenteSimplificada conta1;
        conta1 = new ContaCorrenteSimplificada();
        
        PessoaFisica p1 = new PessoaFisica();
        
        
        conta1.setAgencia(": 014");
        conta1.setNmrConta(": 1234-9");
        conta1.setPessoaFisica(p1);
        
        p1.setCpf(": 209.354.876.35");
        p1.setRg(": 56483-8");
        p1.setNomeCompleto(": LULA LIVRE ");
        
        double resultado = conta1.depositar(200.50);
        double saldoFinal = conta1.sacar(1000);
        System.out.println(saldoFinal);
        System.out.println("====================");
        conta1.exibirDados();
        
        System.out.println("=====================");
        ContaCorrenteSimplificada conta2;
        
        conta2 = conta1;
        PessoaFisica p2 = new PessoaFisica();
        
        p2.setNomeCompleto("MARIA PAREIRA DA LULA LIVRE");
        p2.setCpf("333.324.564.67");
        p2.setRg("645738-2");
        
        conta2.setPessoaFisica(p2);
        conta2.exibirDados();
        
        System.out.println("======================");
        conta1.exibirDados();
        
        
    }
    
}
