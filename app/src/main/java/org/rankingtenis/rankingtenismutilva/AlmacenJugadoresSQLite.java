package org.rankingtenis.rankingtenismutilva;

import java.util.Vector;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class AlmacenJugadoresSQLite extends SQLiteOpenHelper implements
		AlmacenJugadores {


    public AlmacenJugadoresSQLite(Context context, String nombre, CursorFactory factory, int version) {
          super(context, nombre, factory, version);
          
          
          
    }
    
    
    
	//M�todos de SQLiteOpenHelper
    
    @Override 
    public void onCreate(SQLiteDatabase db) {
    	Log.d("AlmacenJugadoresSQLite", "onCreate");
        db.execSQL("CREATE TABLE jugadores (_id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, telefono TEXT, email TEXT)");
        
    }

    @Override    
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    
    	db.execSQL("drop table if exists jugadores");
    	db.execSQL("CREATE TABLE jugadores (_id int PRIMARY KEY AUTOINCREMENT, nombre TEXT, telefono TEXT, email TEXT)");
    }

    @Override
    public void insertarJugadores(){
    	
    	SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Alberto Andérez  ','629216941  ','alberto.anderez@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Carlos Bolea  ','600057222  ','calosbolea@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Carlos Lopez  ','646825444  ','carlos.lopez@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'David Usar  ','638004619  ','dausarpepino@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Eduado Bazus  ','665695266  ','ebazus@msn.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Enrique Jurio  ','650216189  ','jurio8@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Felipe Melero  ','646288443  ','gigapipe@gmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Fernando Elcarte  ','657604032  ','felcarte@ono.es')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Imanol Iribarren  ','699774853  ','imanol139@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Iñigo Izuriaga  ','665852832  ','izuriaga10@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Jesús Gil  ','678620532  ','jexuxhill@gmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Jesús María Otazu  ','687726184  ','txumata@gmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Jon Bru  ','601372614  ','info@jonbru.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Jordi Ciurana  ','609550412  ','j.ciurana@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'José J. Gutiérrez  ','636355198  ','irelna@yahoo.es')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'José Luis López  ','607596457  ','13028lopez@coam.es')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'José Rodríguez  ','616485812  ','geojosebilbo@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'José María Mateo  ','666739770  ','j.mateo.albornoz@gmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Juan Jesús Beato  ','636058690  ','jesusbeatolopez@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Juan Morán  ','610263052  ','j.moran72@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Juantxo Ituláin  ','649928735  ','juantxo@infotec-navarra.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Julio Caño  ','606538905  ','jccano99@gmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Michel Menéndez  ','670672683  ','michel@galeriad...o.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Miguel Ángel Ortega  ','651962903  ','cybergondor@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Miguel Echaide  ','676121260  ','mjnonimo@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Miguel Pulido  ','606124792  ','ulipulido@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Óscar Villanueva  ','647617234  ','oscarudo7@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Pablo Moreno  ','607457034  ','patapal0@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Raúl Martínez  ','638419470  ','r.martinez@meura.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Ricardo Gutierrez  ','659309746  ','ricardoagp@yahoo.es')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Roi Montenegro  ','654164719  ','roimv@hotmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Svetoslav Savov  ','678546112  ','arquisav@gmail.com')");
        db.execSQL("INSERT INTO jugadores VALUES ( null, 'Txema Pérez  ','666070824  ','txemperez@yahoo.es')");
               
        
    }
    
    
   
    
	public Vector<Jugador> listaJugadores() {
          Vector<Jugador> result = new Vector<Jugador>();
          SQLiteDatabase db = getReadableDatabase();
          Log.d("AlmacenJugadoresSQLite", "listaJugadores");
          Cursor cursor = db.rawQuery("SELECT nombre, telefono, email FROM " +
           "jugadores ORDER BY nombre ASC ", null);
          while (cursor.moveToNext()){
        	  Jugador jugador = new Jugador(cursor.getString(0),cursor.getString(1),cursor.getString(2));
                        result.add(jugador);
           }
          cursor.close();
          return result;
    }



	@Override
	public void deleteJugadores() {
		
		SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM Jugadores");
		
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
