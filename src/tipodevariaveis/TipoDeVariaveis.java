package tipodevariaveis;

import java.util.Scanner;

public class TipoDeVariaveis {
    public static void main(String[] args) {
        byte idade = 23;
        int rg = 1195661341;
        float salario = 600.00f;
        double decimoTerceiro = 450.50;
        String nome = "Victor Ramos";
        char inicial = 'V';
        
        //Entrevista
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomePessoa = ler.nextLine();
        System.out.println("Informe sua idade: ");
        int idadePessoa = ler.nextInt();
        System.out.println("Informe o seu salário: ");
        float salarioPessoa = ler.nextFloat();
        
        System.out.println("Seu nome é " +nomePessoa+ ", sua idade é " +idadePessoa+ " e o seu salário é "+salarioPessoa+".");
        
    }
    
}
