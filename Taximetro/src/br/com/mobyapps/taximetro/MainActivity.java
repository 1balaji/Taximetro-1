package br.com.mobyapps.taximetro;

import java.util.List;

import br.com.mobyapps.taximetro.dao.CorridaDAO;
import br.com.mobyapps.taximetro.model.Corrida;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
/*Terminar de arrumar o LAYOUT  e resolver os erros*/
public class MainActivity extends Activity {
	private List<Corrida> corridas;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		//String[] listaDeCorridas = {"Segunda - 01/04", "Quarta - 10/04", "Sexta - 25/06", "Sábado - 23/12"};
		ListView listView = (ListView) findViewById(R.id.lista_corridas);
		
		CorridaDAO dao = new CorridaDAO(this);
		corridas = dao.getLista();
		dao.close();
		
		ArrayAdapter<Corrida> adapter = new ArrayAdapter<Corrida>(this, android.R.layout.simple_list_item_1, corridas);
		
		listView.setAdapter(adapter);
		
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				Toast.makeText(MainActivity.this, "Clique Simples", Toast.LENGTH_LONG).show();
			}
		});
		
		listView.setLongClickable(true);
		listView.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				Toast.makeText(MainActivity.this, "Clique Longo", Toast.LENGTH_LONG).show();
				return false;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.novaCorrida:		
				Intent intent = new Intent(this, MapaCorridaActivity.class);
				startActivity(intent);
				break;

			default:
				break;
		}
		return true;
	}

}