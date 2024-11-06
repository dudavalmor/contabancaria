package conta;

import java.util.Scanner;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		int opcao;
		Scanner leia = new Scanner(System.in);
		
		while(true) {		
			
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND+
				"---------------------------------------------------------------------");
		System.out.println("                      Banco do Brazil com Z                          ");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("             1- Criar conta                                        ");
		System.out.println("             2- Listar todas as contas existentes                  ");
		System.out.println("             3- Buscar conta por número                            ");
		System.out.println("             4- Atualizar dados da conta                           ");
		System.out.println("             5- Apagar conta                                       ");
		System.out.println("             6- Sacar                                              ");
		System.out.println("             7- Depositar                                          ");
		System.out.println("             8- Transferências                                     ");
		System.out.println("             9- Sair                                               ");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Entre com a opção desejada: \n" + Cores.TEXT_RESET);
		opcao = leia.nextInt();	
		
		if (opcao == 9) {
			System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
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
			System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");
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
			System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
            break;
            
		case 8:
			System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
            break;
            		
		default:
			System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
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
