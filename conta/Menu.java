package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		//Teste da Classe conta
		Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		while(true) {		
			
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND+
				"---------------------------------------------------------------------");
		System.out.println("                      Banco do Brazil com Z                          ");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("             1- Criar conta                                        ");
		System.out.println("             2- Listar todas as contas existentes                  ");
		System.out.println("             3- Buscar conta por n�mero                            ");
		System.out.println("             4- Atualizar dados da conta                           ");
		System.out.println("             5- Apagar conta                                       ");
		System.out.println("             6- Sacar                                              ");
		System.out.println("             7- Depositar                                          ");
		System.out.println("             8- Transfer�ncias                                     ");
		System.out.println("             9- Sair                                               ");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Entre com a op��o desejada: \n" + Cores.TEXT_RESET);
		opcao = leia.nextInt();	
		
		if (opcao == 9) {
			System.out.println("\nBanco do Brazil com Z - O seu Futuro come�a aqui!");
			sobre();
             leia.close();
			System.exit(0);
		}
		
		switch (opcao) {
		
		case 1:
			System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
			break;
           
		case 2:
			System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
            break;
            
		case 3:
			System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por n�mero\n\n");
			break;
        
		case 4:
			System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
            break;
            
		case 5:
			System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
           	break;
		case 6:
			System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
			break;
			
		case 7:
			System.out.println(Cores.TEXT_WHITE + "Dep�sito\n\n");
            break;
            
		case 8:
			System.out.println(Cores.TEXT_WHITE + "Transfer�ncia entre Contas\n\n");
            break;
            		
		default:
			System.out.println(Cores.TEXT_RED_BOLD + "\nOp��o inv�lida!\n" + Cores.TEXT_RESET);
            break;

		}
	}

	}
	
	public static void sobre() {
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Eduarda Serrano Bueno Valmor - eduarda.bserrano@gmail.com");
		System.out.println("github.com/dudavalmor/contabancaria");
		System.out.println("---------------------------------------------------------------------");
		
	}

}
