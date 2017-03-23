package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;
import model.Reserva;
import model.Restaurante;

public class InserirReserva {
	public ArrayList<Reserva> inserirReserva(ArrayList<Reserva> reser, ArrayList<Cliente> cli, ArrayList<Restaurante> rest) {
		int idCli, idRest;
		String data, prato;
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\nInsira o id do Cliente: ");
		idCli = s.nextInt();
		s.nextLine();
		
		System.out.print("\nInsira o id do Restaurante: ");
		idRest = s.nextInt();
		s.nextLine();
		
		System.out.print("\nInsira a data da Reserva: ");
		data = s.nextLine();
		
		System.out.print("\nInsira o prato a Reservar: ");
		prato = s.nextLine();

		Reserva reserva = new Reserva(reser.size(), data, prato, cli.get(idCli), rest.get(idRest));
		reser.add(reserva);
		
		return reser;
	}
}
