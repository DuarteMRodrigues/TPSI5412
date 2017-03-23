package view;

import java.util.ArrayList;

import model.Reserva;

public class ListarReserva {
	public ListarReserva(ArrayList<Reserva> reser){
		for(int i = 0; i < reser.size(); i++){
			System.out.print("\n\nID: " +reser.get(i).getId());
			System.out.print("\nData da Reserva: " +reser.get(i).getData());
			System.out.print("\nCliente: " +reser.get(i).getCliente().getNome());
			System.out.print("\nRestaurante: " +reser.get(i).getRestaurante().getNome());
			System.out.print("\nPrato reservado: " +reser.get(i).getPrato());
		}
	}
}
