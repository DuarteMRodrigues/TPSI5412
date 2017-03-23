package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Restaurante;

public class InserirRestaurante {
	public ArrayList<Restaurante> inserirRestaurante(ArrayList<Restaurante> rest) {
		int contacto;
		String nome, especialidade, morada;
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\nInsira o nome do Restaurante: ");
		nome = s.nextLine();
		
		System.out.print("\nInsira a morada do Restaurante: ");
		morada = s.nextLine();
		
		System.out.print("\nInsira o contacto do Restaurante: ");
		contacto = s.nextInt();
		s.nextLine();
		
		System.out.print("\nInsira a especialidade do Restaurante: ");
		especialidade = s.nextLine();
		
		Restaurante restaurante = new Restaurante(rest.size(), contacto, nome, morada, especialidade);
		rest.add(restaurante);
		
		return rest;
	}
}
