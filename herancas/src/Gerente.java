public class Gerente extends Funcionario {
    private String projeto;

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public void informarPorjeto() {
        System.out.println("O projeto é " + getProjeto());
    }
}
