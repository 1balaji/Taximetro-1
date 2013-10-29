package br.com.mobyapps.taximetro;


//import com.google.android.maps.MapView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
//import com.google.android.gms.maps.GoogleMap;
//import com.google.android.gms.maps.MapFragment;


public class MapaCorridaActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mapa_corrida);
		
		//((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.mapa_corrida, menu);
		return true;
	}

	

}