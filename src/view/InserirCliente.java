package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;

public class InserirCliente {
	public ArrayList<Cliente> InserirCliente(ArrayList<Cliente> cli){
		int contacto;
		String nome, email, morada;
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\nInsira o nome do Cliente: ");
		nome = s.nextLine();
		
		System.out.print("\nInsira o email do Cliente: ");
		email = s.nextLine();
		
		System.out.print("\nInsira a morada do Cliente: ");
		morada = s.nextLine();
		
		System.out.print("\nInsira o contacto do Cliente: ");
		contacto = s.nextInt();
		
		Cliente cliente = new Cliente(cli.size(), contacto, nome, morada, email);
		cli.add(cliente);
		
		return cli;
	}
}
