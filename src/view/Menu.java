package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;
import model.Reserva;
import model.Restaurante;

public class Menu {
	public Menu(){
		int escolha;
		Scanner s = new Scanner(System.in);
		
		ArrayList<Cliente> cli = new ArrayList<Cliente>();
		ArrayList<Restaurante> rest = new ArrayList<Restaurante>();
		ArrayList<Reserva> reser = new ArrayList<Reserva>();
		
		InserirCliente insereCli = new InserirCliente();
		InserirRestaurante insereRestau = new InserirRestaurante();
		InserirReserva insereReserva = new InserirReserva();
		
		do{
			System.out.println("1 - Inserir Cliente");
			System.out.println("2 - Inserir Restaurante");
			System.out.println("3 - Criar Reserva");
			System.out.println("4 - Listar Clientes");
			System.out.println("5 - Listar Restaurantes");
			System.out.println("6 - Listar Reservas");
			System.out.println("99 - Sair");
			escolha = s.nextInt();
			s.nextLine();
			
			switch(escolha){
				case 1:
					cli = insereCli.InserirCliente(cli);
					break;
				
				case 2:
					rest = insereRestau.inserirRestaurante(rest);
					break;

				case 3:
					reser = insereReserva.inserirReserva(reser, cli, rest);
					break;
					
				case 4:
					new ListarCliente(cli);
					break;
				
				case 5:
					new ListarRestaurante(rest);
					break;

				case 6:
					new ListarReserva(reser);
					break;
					
				case 7:
					new ProcurarCliente(cli);
					break;
					
				case 99:
					System.out.println("\n\nAdeus");
					break;
					
				default:
					System.out.println("\n\nEscolha Invalida");
					break;
			}
			
			System.out.print("\n\nPressione a tecla enter para continuar...");
			s.nextLine();
		}while(escolha != 99);
		
		s.close();
	}
}
