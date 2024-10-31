import pessoa.PessoaFisica;
import pessoa.PessoaJuridica;
import cadastro.Cadastro;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro(3);
        PessoaFisica pessoaFisica1 = new PessoaFisica("1", "Ana");
        PessoaFisica pessoaFisica2 = new PessoaFisica("2", "Bruna");
        PessoaFisica pessoaFisica3 = new PessoaFisica("3", "Caio");

        PessoaJuridica PessoaJuridica1 = new PessoaJuridica("1", "XYZ");
        PessoaJuridica PessoaJuridica2 = new PessoaJuridica("2", "ABC");
        PessoaJuridica PessoaJuridica3 = new PessoaJuridica("3", "MNP");

        cadastro.cadastrar(pessoaFisica1);
        cadastro.cadastrar(pessoaFisica2);
        cadastro.cadastrar(pessoaFisica3);

        cadastro.cadastrar(PessoaJuridica1);
        cadastro.cadastrar(PessoaJuridica2);
        cadastro.cadastrar(PessoaJuridica3);
        
        System.out.println(cadastro);
    }
}