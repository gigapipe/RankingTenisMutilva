package org.rankingtenis.rankingtenismutilva;

import java.util.Vector;

public class PlayersList {
    
    public Vector<Jugador> jugadores = new Vector<Jugador>();
    
    public Vector<Jugador> getJugadores() {
		return jugadores;
	}


	public void setJugadores(Vector<Jugador> jugadores) {
		this.jugadores = jugadores;
	}


	public PlayersList(){
    	
    	jugadores.add(new Jugador("Alberto Andérez","629216941","alberto.anderez@hotmail.com"));
    	jugadores.add(new Jugador("Carlos Bolea","600057222","calosbolea@hotmail.com"));
    	jugadores.add(new Jugador("Calos Lopez","646825444","carlos.lopez@hotmail.com"));
    }
    
    
    public class Jugador {
    	
    	private String nombre;
    	private String telefono;
    	private String email;
    	
    	public Jugador() {
    		super();
    	}

    	public Jugador(String nombre, String telefono, String email) {
    		super();
    		this.nombre = nombre;
    		this.telefono = telefono;
    		this.email = email;
    	}
    	
    	public String getNombre() {
    		return nombre;
    	}
    	public void setNombre(String nombre) {
    		this.nombre = nombre;
    	}
    	public String getTelefono() {
    		return telefono;
    	}
    	public void setTelefono(String telefono) {
    		this.telefono = telefono;
    	}
    	public String getEmail() {
    		return email;
    	}
    	public void setEmail(String email) {
    		this.email = email;
    	}
    	
    	

    }
}
