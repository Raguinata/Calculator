import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Instancia
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		Scanner scText = new Scanner(System.in);

		//Vari�veis
		double resultado = 0;
		String opcao = "";		//Usado no Scanner
		String opcao2 = "";		//Usado no Scanner de texto
		boolean cont = false;	//Contador
		double num1 = 0;
		double num2 = 0;
		double aux = 0;

		//La�o de repeti��o
		do {
			System.out.println("------------------\nOPERA��ES\n");
			System.out.println("[+]Adi��o\n[-]Subtra��o\n[*]Multiplica��o\n[/]Divis�o\n[V]Raiz\n"
					+ "[^]Pot�ncia\n------------------\n");
			System.out.print("Informe o sinal da opera��o que deseja realizar: ");
			String sinal = sc.next();

			switch(sinal.toUpperCase()) {
			case "+":
				if (cont == true) {
					System.out.print("Informe um operando: ");
					aux = sc.nextDouble();
					resultado += aux;
				} else {
					System.out.print("Informe o 1� operando: ");
					num1 = sc.nextDouble();
					System.out.print("Informe o 2� operando: ");
					num2 = sc.nextDouble();
					resultado += num1 + num2;
				}
				System.out.println("O resultado da soma �:" + resultado);

				System.out.println("Deseja arrendondar o seu n�mero? \n"
						+ "[S] sim \n"
						+ "[N] n�o");
				opcao2 = scText.next();

				if (opcao2.equalsIgnoreCase("S")) {
					resultado = Math.round(resultado);
					System.out.println("O n�mero anterior foi arredondado para: " + resultado); 
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
				System.out.println("O resultado da subtra��o �: " + resultado);

				System.out.println("Deseja arrendondar o seu n�mero? \n"
						+ "[S] sim \n"
						+ "[N] n�o");
				opcao2 = scText.next();

				if (opcao2.equalsIgnoreCase("S")) {
					resultado = Math.round(resultado);
					System.out.println("O n�mero anterior foi arredondado para: " + resultado); 
				}
				break;

			case "*":
				if (cont == true) {
					System.out.print("Informe um valor: ");
					aux = sc.nextDouble();
					resultado *= aux;
				} else {
					System.out.println("Informe o 1� fator: ");
					num1 = sc.nextDouble();
					System.out.println("Informe o 2� fator: ");
					num2 = sc.nextDouble();
					resultado = num1 * num2;
				}

				System.out.println("O resultado da multiplica��o �: " + resultado);

				System.out.println("Deseja arrendondar o seu n�mero? \n"
						+ "[S] sim \n"
						+ "[N] n�o");
				opcao2 = scText.next();

				if (opcao2.equalsIgnoreCase("S")) {
					resultado = Math.round(resultado);
					System.out.println("O n�mero anterior foi arredondado para: " + resultado); 
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
						System.out.print("Imposs�vel dividir por 0");
					else 
						resultado = num1 / num2;
				}

				System.out.println("O resultado da divis�o �: " + resultado);

				System.out.println("Deseja arrendondar o seu n�mero? \n"
						+ "[S] sim \n"
						+ "[N] n�o");
				opcao2 = scText.next();

				if (opcao2.equalsIgnoreCase("S")) {
					resultado = Math.round(resultado);
					System.out.println("O n�mero anterior foi arredondado para: " + resultado); 
				}
				break;

			case "V":
				System.out.print("Informe valor para descobrir sua raiz: ");
				aux = sc.nextDouble();
				resultado = (Math.sqrt(aux));
				System.out.println("O resultado da raiz �: " + resultado);

				System.out.println("Deseja arrendondar o seu n�mero? \n"
						+ "[S] sim \n"
						+ "[N] n�o");
				opcao2 = scText.next();

				if (opcao2.equalsIgnoreCase("S")) {
					resultado = Math.round(resultado);
					System.out.println("O n�mero anterior foi arredondado para: " + resultado); 
				}
				break;

			case "^":
				System.out.print("Informe a base: ");
				num1 = sc.nextDouble();
				System.out.print("Informe o expoente: ");
				num2 = sc.nextDouble();
				resultado = (Math.pow(num1, num2));	
				System.out.println("O resultado �: " + resultado);

				System.out.println("Deseja arrendondar o seu n�mero? \n"
						+ "[S] sim \n"
						+ "[N] n�o");
				opcao2 = scText.next();

				if (opcao2.equalsIgnoreCase("S")) {
					resultado = Math.round(resultado);
					System.out.println("O n�mero anterior foi arredondado para: " + resultado); 
				}
				break;

			default:
				System.err.println("Opera��o Inv�lida! \n");
				break;
			}

			System.out.println("Digite [ = ] para sair ou pressione qualquer tecla para continuar");
			opcao = scText.next();
			cont = true;	//contador
		}
		while (!opcao.equals("="));
	}
}
