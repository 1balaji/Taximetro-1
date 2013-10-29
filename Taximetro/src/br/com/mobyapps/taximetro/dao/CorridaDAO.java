package br.com.mobyapps.taximetro.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.mobyapps.taximetro.model.Corrida;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CorridaDAO extends SQLiteOpenHelper{
	private static final int VERSAO = 1; //versão da tabela para marcar que foi alterado algum detalhe do modelo
	private static final String TABELA = "Corridas";
	private static final String DATABASE ="Taximetro";
	private static final String[] COLUNAS = {"id", "data", "dia", "inicio",
		"fim", "tempo", "preco"};
	
	
	
	public CorridaDAO(Context context) {
		super(context, DATABASE, null, VERSAO);
	}
	
	public List<Corrida> getLista(){
		List<Corrida> corridas = new ArrayList<Corrida>();
		
		Cursor c = getWritableDatabase().query(TABELA, COLUNAS, null, null, null, null, null);
		
		while (c.moveToNext()) {
			Corrida corrida = new Corrida();
			corrida.setId(c.getLong(0));
			corrida.setDataDaCorrida(c.getString(1));
			corrida.setDiaDaSemana(c.getString(2));
			corrida.setInicioDaCorrida(c.getString(3));
			corrida.setFimDaCorrida(c.getString(4));
			corrida.setTempoDaCorrida(c.getString(5));
			corrida.setPrecoDaCorrida(c.getDouble(6));
			
			corridas.add(corrida);
		}
		c.close();
		return corridas;
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String ddl = "CREATE TABLE " + TABELA + " (id INTEGER PRIMARY KEY," +
			" data TEXT NOT NULL, dia TEXT NOT NULL, inicio TEXT NOT NULL, " +
			" fim TEXT NOT NULL, tempo TEXT NOT NULL, preco REAL NOT NULL);";
		db.execSQL(ddl);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		String sql ="DROP TABLE IF EXISTS " + TABELA;
		db.execSQL(sql);
		onCreate(db);
	}
	
	public void insere(Corrida corrida){
		ContentValues values = new ContentValues();
		
		values.put("data", corrida.getDataDaCorrida());
		values.put("dia", corrida.getDiaDaSemana());
		values.put("inicio", corrida.getInicioDaCorrida());
		values.put("fim", corrida.getFimDaCorrida());
		values.put("tempo", corrida.getTempoDaCorrida());
		values.put("preco", corrida.getPrecoDaCorrida());
		getWritableDatabase().insert(TABELA, null, values);
	}
	
}