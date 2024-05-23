import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Gerente gerente = new Gerente();
        Programador programador = new Programador();

        System.out.print("Informe o nome do programador: ");

        String nomeProgramador = sc.next();
        System.out.print("Informe o nome do gerente: ");
        String nomeGerente = sc.next();
        System.out.print("Informe o salario do programador: ");
        double salarioProgramador = sc.nextDouble();
        System.out.print("Informe o salario do gerente: ");
        double salarioGerente = sc.nextDouble();

        System.out.print("Qual o projeto do gerente? ");
        gerente.setProjeto(sc.next());
        System.out.print("Qual a linguagem do programador? ");
        programador.setLingugagem(sc.next());

        gerente.informarPorjeto();
        programador.informarLingugagem();

        Funcionario f1 = new Gerente();
        Funcionario f2 = new Programador();


    }
}