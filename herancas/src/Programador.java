public class Programador extends Funcionario {
    private String lingugagem;

    public String getLingugagem() {
        return lingugagem;
    }

    public void setLingugagem(String lingugagem) {
        this.lingugagem = lingugagem;
    }

    public void informarLingugagem() {
        System.out.println("A linguagem é " + getLingugagem());
    }
}
