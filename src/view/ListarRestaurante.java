package view;

import java.util.ArrayList;

import model.Restaurante;

public class ListarRestaurante {
	public ListarRestaurante(ArrayList<Restaurante> rest){
		for(int i = 0; i < rest.size(); i++){
			System.out.print("\n\nID: " +rest.get(i).getId());
			System.out.print("\nNome: " +rest.get(i).getNome());
			System.out.print("\nMorada: " +rest.get(i).getMorada());
			System.out.print("\nContacto: " +rest.get(i).getContacto());
			System.out.print("\nEspecialidade: " +rest.get(i).getEspecialidade());
		}
	}
}
