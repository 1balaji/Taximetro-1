package br.com.mobyapps.taximetro;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CorridaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_corrida);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.corrida, menu);
		return true;
	}

}