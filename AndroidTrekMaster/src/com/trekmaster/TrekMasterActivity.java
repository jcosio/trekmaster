package com.trekmaster;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TrekMasterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_trekmaster);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.trek_master, menu);
		return true;
	}

}
