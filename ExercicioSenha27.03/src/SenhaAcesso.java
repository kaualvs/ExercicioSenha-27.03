import java.util.Scanner;

public class SenhaAcesso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senha;

        do {
            System.out.println("Digite sua senha: ");
            senha = entrada.nextLine();

            if (!senha.equals("Java21")) {
                System.out.println("Senha incorreta! Tente novamente.");
            }

        } while (!senha.equals("Java21"));

        System.out.println("Acesso com sucesso!");




        entrada.close();
    }
}
