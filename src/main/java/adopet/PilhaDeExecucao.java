public class PilhaDeExecucao {
    public static void metodo1() {
        System.out.println("[Inicio] - metodo1");

        metodo2();

        System.out.println("[Fim] - metodo1");
    }

    public static void metodo2() {
        System.out.println("[Inicio] - metodo2");

        Usuario usuario = null;//new Usuario("Vinicius");
        try {
            System.out.println(usuario.nome);
        } catch (NullPointerException ex) {
            System.out.println("Usuário não encontrado!");
        }

        System.out.println("[Fim] - metodo2");
    }

    public static void main(String[] args) {
        System.out.println("[Inicio] - main");

        metodo1();

        System.out.println("[Fim] - main");
    }
}

class Usuario {
    public String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }
}