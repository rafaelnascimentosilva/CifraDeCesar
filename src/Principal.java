import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);// reponsável pela entrada de dados do teclado

		String opcao; // escolhe as opções do Menu

		String frase = null; // frase a ser criptografada

		String fraseIni = null; // guarda a frase inicial para compararmos no fim do programa

		int chave; // chave de criptografia

		Menu();

		do {
			opcao = sc.nextLine(); // recebe a opção do teclado
			switch (opcao) {
			case "1":

				System.out.print("\n");
				System.out.println("Digite a palavra para Encriptar:");				
				System.out.print("Palavra: ");				
				frase = sc.nextLine(); // recebe a frase do teclado
				fraseIni = frase; // guarda a frase
				System.out.println("Digite a Chave:");
				System.out.print("Chave: ");				
				chave = sc.nextInt();// recebe a chave do teclado
				System.out.println("Frase Criptografada: " + Encripta(chave, frase)); // Método que mostra a frase criptografada
				break;

			case "2":
				System.out.print("\n");
				System.out.println("Digite a palavra para Decifrar:");
				System.out.print("Palavra: ");
				frase = sc.nextLine(); // recebe a frase do teclado
				System.out.println("Digite a chave");
				System.out.print("Chave-> ");
				chave = sc.nextInt();// recebe a chave do teclado
				System.out.println("Frase Decriptografada: " + Decripta(chave, frase));
				if (Decripta(chave, frase).equals(fraseIni)) {
					System.out.println("PALAVRA DESCOBERTA");
				} else {
					System.out.println("PALAVRA errada");
				}
				break;

			case "3":
				Menu();
				break;

			case "0":
				System.out.println("Sair");
				break;

			default:
				break;
			}
		} while (opcao != "0");
	}

	public static void Menu() {
		System.out.println(" --- Sistema de criptografia ---");
		System.out.println("+-------------------------------+");
		System.out.println("|\tCIFRA DE CÉSAR\t\t|");
		System.out.println("+-------------------------------+");

		System.out.println("Digite 1 para Encriptar:");
		System.out.println("Digite 2 para Decriptar");
		System.out.println("Digite 3 para Menu");
		System.out.println("Digite 0 para Sair");
		System.out.print("Digite opção ->");
	}

	public static String Encripta(int chave, String texto) {

		StringBuilder textoCrifrado = new StringBuilder();

		int tamanhoTexto = texto.length();

		for (int i = 0; i < tamanhoTexto; i++) {

			int letraCifradaASCII = ((int) texto.charAt(i)) + chave;

			while (letraCifradaASCII > 126)
				letraCifradaASCII -= 94;

			textoCrifrado.append((char) letraCifradaASCII);
		}
		return textoCrifrado.toString();
	}

	public static String Decripta(int chave, String texto) {

		StringBuilder textoDeCifrado = new StringBuilder();

		int tamanhoTexto = texto.length();

		for (int i = 0; i < tamanhoTexto; i++) {

			int letraDecifrada = ((int) texto.charAt(i)) - chave;

			while (letraDecifrada < 32)
				letraDecifrada += 94;

			textoDeCifrado.append((char) letraDecifrada);
		}
		return textoDeCifrado.toString();
	}
};