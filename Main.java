import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Instancia
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		Scanner scText = new Scanner(System.in);

		//Variáveis
		double resultado = 0;
		String opcao = "";		//Usado no Scanner
		String opcao2 = "";		//Usado no Scanner de texto
		boolean cont = false;	//Contador
		double num1 = 0;
		double num2 = 0;
		double aux = 0;

		//Laço de repetição
		do {
			System.out.println("------------------\nOPERAÇÕES\n");
			System.out.println("[+]Adição\n[-]Subtração\n[*]Multiplicação\n[/]Divisão\n[V]Raiz\n"
					+ "[^]Potência\n------------------\n");
			System.out.print("Informe o sinal da operação que deseja realizar: ");
			String sinal = sc.next();

			switch(sinal.toUpperCase()) {
			case "+":
				if (cont == true) {
					System.out.print("Informe um operando: ");
					aux = sc.nextDouble();
					resultado += aux;
				} else {
					System.out.print("Informe o 1º operando: ");
					num1 = sc.nextDouble();
					System.out.print("Informe o 2º operando: ");
					num2 = sc.nextDouble();
					resultado += num1 + num2;
				}
				System.out.println("O resultado da soma é:" + resultado);

				System.out.println("Deseja arrendondar o seu número? \n"
						+ "[S] sim \n"
						+ "[N] não");
				opcao2 = scText.next();

				if (opcao2.equalsIgnoreCase("S")) {
					resultado = Math.round(resultado);
					System.out.println("O número anterior foi arredondado para: " + resultado); 
				}
				break;

			case "-":
				if (cont == true) {
					System.out.print("Informe o subtraendo: ");
					aux = sc.nextDouble();
					resultado -= aux;
				} else {
					System.out.print("Informe o minuendo: ");
					num1 = sc.nextDouble();
					System.out.print("Informe o subtraendo: ");
					num2 = sc.nextDouble();
					resultado -= num2 - num1;
				}
				System.out.println("O resultado da subtração é: " + resultado);

				System.out.println("Deseja arrendondar o seu número? \n"
						+ "[S] sim \n"
						+ "[N] não");
				opcao2 = scText.next();

				if (opcao2.equalsIgnoreCase("S")) {
					resultado = Math.round(resultado);
					System.out.println("O número anterior foi arredondado para: " + resultado); 
				}
				break;

			case "*":
				if (cont == true) {
					System.out.print("Informe um valor: ");
					aux = sc.nextDouble();
					resultado *= aux;
				} else {
					System.out.println("Informe o 1º fator: ");
					num1 = sc.nextDouble();
					System.out.println("Informe o 2º fator: ");
					num2 = sc.nextDouble();
					resultado = num1 * num2;
				}

				System.out.println("O resultado da multiplicação é: " + resultado);

				System.out.println("Deseja arrendondar o seu número? \n"
						+ "[S] sim \n"
						+ "[N] não");
				opcao2 = scText.next();

				if (opcao2.equalsIgnoreCase("S")) {
					resultado = Math.round(resultado);
					System.out.println("O número anterior foi arredondado para: " + resultado); 
				}
				break;

			case "/":
				if (cont == true) {
					System.out.println("Informe o divisor: ");
					aux = sc.nextDouble();
					resultado /= aux;
				}else{
					System.out.print("Informe o dividendo: ");
					num1 = sc.nextDouble();
					System.out.print("Informe o divisor: ");
					num2 = sc.nextDouble();

					if(num2 == 0)
						System.out.print("Impossível dividir por 0");
					else 
						resultado = num1 / num2;
				}

				System.out.println("O resultado da divisão é: " + resultado);

				System.out.println("Deseja arrendondar o seu número? \n"
						+ "[S] sim \n"
						+ "[N] não");
				opcao2 = scText.next();

				if (opcao2.equalsIgnoreCase("S")) {
					resultado = Math.round(resultado);
					System.out.println("O número anterior foi arredondado para: " + resultado); 
				}
				break;

			case "V":
				System.out.print("Informe valor para descobrir sua raiz: ");
				aux = sc.nextDouble();
				resultado = (Math.sqrt(aux));
				System.out.println("O resultado da raiz é: " + resultado);

				System.out.println("Deseja arrendondar o seu número? \n"
						+ "[S] sim \n"
						+ "[N] não");
				opcao2 = scText.next();

				if (opcao2.equalsIgnoreCase("S")) {
					resultado = Math.round(resultado);
					System.out.println("O número anterior foi arredondado para: " + resultado); 
				}
				break;

			case "^":
				System.out.print("Informe a base: ");
				num1 = sc.nextDouble();
				System.out.print("Informe o expoente: ");
				num2 = sc.nextDouble();
				resultado = (Math.pow(num1, num2));	
				System.out.println("O resultado é: " + resultado);

				System.out.println("Deseja arrendondar o seu número? \n"
						+ "[S] sim \n"
						+ "[N] não");
				opcao2 = scText.next();

				if (opcao2.equalsIgnoreCase("S")) {
					resultado = Math.round(resultado);
					System.out.println("O número anterior foi arredondado para: " + resultado); 
				}
				break;

			default:
				System.err.println("Operação Inválida! \n");
				break;
			}

			System.out.println("Digite [ = ] para sair ou pressione qualquer tecla para continuar");
			opcao = scText.next();
			cont = true;	//contador
		}
		while (!opcao.equals("="));
	}
}
