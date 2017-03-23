package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;

public class ProcurarCliente {
	public ProcurarCliente(ArrayList<Cliente> cli){
		int idCli;
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\nInsira o ID do Cliente: ");
		idCli = s.nextInt();
		s.nextLine();
		
		System.out.print("\n\nID: " +cli.get(idCli).getId());
		System.out.print("\nNome: " +cli.get(idCli).getNome());
		System.out.print("\nEmail: " +cli.get(idCli).getEmail());
		System.out.print("\nMorada: " +cli.get(idCli).getMorada());
		System.out.print("\nTelefone: " +cli.get(idCli).getTelefone());
		
		s.close();
	}
}
