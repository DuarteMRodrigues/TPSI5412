package view;

import java.util.ArrayList;

import model.Cliente;

public class ListarCliente {
	public ListarCliente(ArrayList<Cliente> cli){
		for(int i = 0; i < cli.size(); i++){
			System.out.print("\n\nID: " +cli.get(i).getId());
			System.out.print("\nNome: " +cli.get(i).getNome());
			System.out.print("\nEmail: " +cli.get(i).getEmail());
			System.out.print("\nMorada: " +cli.get(i).getMorada());
			System.out.print("\nTelefone: " +cli.get(i).getTelefone());
		}
	}
}
