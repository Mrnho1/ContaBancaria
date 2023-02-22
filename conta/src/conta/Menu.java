package conta;

import java.util.Scanner;


import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
//CRIAMOS O OBJETO CONTA C1
		/*Conta c1 = new Conta(1, 123, 1, "Erica Araújo", 30000.0f);
//VIZUALIZAMOS OS DADOS DA CONTA C1
		c1.visualizar();
//ALTERAMOS OS DADOS DA CONTA C1
		c1.setSaldo(35000.0f);
//VIZUALIZAMOS APENAS O SALDO DA CONTA C1
		System.out.println(c1.getSaldo());
		System.out.println();
//CRIAMOS A CONTA C2
		Conta c2 = new Conta(2, 123, 2, "Dener Cardoso", 50000.0f);
//VIZUALIZAMOS A CONTA C2
		c2.visualizar();

		System.out.println();
//EFETUAMOS UM SAQUE  NA CONTA C2 E VIZUALIZAMOS
		if (c2.sacar(1000.0f))
			System.out.println("\n" + c2.getSaldo() + "\n");
//EFETUAMOS UM DEPOSITO NA CONTA C1
		c1.depositar(10000.0f);
//VISUALIZAMOS OS DADOS DA CONTA C1	APOS O DEPOSITO	
		c1.visualizar();
		
		
//SOBREESCRITA DE METODO ContaCorrente		
		ContaCorrente c3 = new ContaCorrente(3, 123, 1, "Vitoria", 30000.0f,1000.0f);
		
		c3.visualizar();
		c3.sacar(30900.0f);
		c3.visualizar();*/
		
//TESTE DA CLASSE CONTA
		Conta c1 = new Conta(1,123,1,"Adriana",10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();
		
		ContaCorrente cc1 = new ContaCorrente(2,1223,1,"Mariana",15000.0f,1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		ContaPoupanca cp1 = new ContaPoupanca(3,123,2,"Victor",100000.0f,15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
		

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println(Cores.TEXT_WHITE+ Cores.ANSI_BLACK_BACKGROUND + "                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");

				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println("Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println("Saque\n\n");

				break;
			case 7:
				System.out.println("Depósito\n\n");

				break;
			case 8:
				System.out.println("Transferência entre Contas\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}

	}

}
