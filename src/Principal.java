import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String opcao;
		String frase;

		System.out.println(" --- Sistema de criptografia ---");
		System.out.println("+-------------------------------+");
		System.out.println("|\tCIFRA DE CÉSAR\t\t|");
		System.out.println("+-------------------------------+");

		System.out.println("Digite 1 para Encriptar:");
		System.out.println("Digite 2 para Decriptar");
		System.out.println("Digite 3 para Menu");
		System.out.println("Digite 0 para Sair");
		System.out.print("Digite opção ->");

		do {

			opcao = sc.nextLine();

			switch (opcao) {

			case "1":
				System.out.print("\n");
				System.out.println("Digite a palavra para encriptar:");
				System.out.print("Palavra: ");
				frase = sc.nextLine();
				System.out.println(frase);
				break;

			case "2":
				System.out.print("\n");
				System.out.println("Digite a palavra para encriptar:");
				System.out.print("Palavra-> ");
				break;

			case "3":
				System.out.println(" --- Sistema de criptografia ---");
				System.out.println("+-------------------------------+");
				System.out.println("|\tCIFRA DE CÉSAR\t\t|");
				System.out.println("+-------------------------------+");

				System.out.println("Digite 1 para Encriptar:");
				System.out.println("Digite 2 para Decriptar");
				System.out.println("Digite 3 para Menu");
				System.out.println("Digite 0 para Sair");
				System.out.print("Digite opção ->");
				break;

			case "0":
				System.out.println("Sair");
				break;

			default:
				System.out.println("operação inválida...");
				break;

			}
		} while (opcao != "0");

	}

	public void Menu() {

	}

}
