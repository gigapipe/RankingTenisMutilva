package org.rankingtenis.rankingtenismutilva;

import java.util.Vector;

import org.rankingtenis.rankingtenismutilva.AlmacenJugadoresSQLite.Jugador;

public interface AlmacenJugadores {
	
	

	public Vector<Jugador> listaJugadores();

	public void insertarJugadores();
	
	public void deleteJugadores();

	

}
