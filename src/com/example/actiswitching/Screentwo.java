package com.example.actiswitching;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Screentwo extends ActionBarActivity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_screentwo);
		
		TextView numone = (TextView) findViewById(R.id.dispone);
		TextView numtwo = (TextView) findViewById(R.id.disptwo);
		TextView total = (TextView) findViewById(R.id.total);
		
		//Below changes what is orriginaly in the Textview to what we now want it to display
		numone.setText("Number one is: " + MainActivity.getNumOne());
		numtwo.setText("Number two is: "+MainActivity.getNumTwo());
		total.setText("The total is: "+MainActivity.getTotal());
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.screentwo, menu);
		return true;
	}
	
}

