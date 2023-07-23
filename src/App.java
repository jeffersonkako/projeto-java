public class App {
    public static void main(String[] args) {
        String nome = "Jefferson";
        String sobrenome = "Pessoa";
        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String nome, String sobrenome) {
        return "Resultado do metodo" + " " + nome + " " + sobrenome;
    }
}
