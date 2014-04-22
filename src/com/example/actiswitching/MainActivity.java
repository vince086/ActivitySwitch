package com.example.actiswitching;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;


public class MainActivity extends ActionBarActivity {

	Button button;
	
	EditText mEdit;
	EditText mEditt;
	
	TextView mText; //Testing----------
	
	
	// TODO Int need to be replaced
	static double total = 0;
	static double num1;
	static double num2;
	
	private static double NumOne;
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();		//Run this sub   
    }
    
    //This sub listens to the button
	private void addListenerOnButton() {
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener(){

			//What to do when the button is pushed
			@Override
			public void onClick(View v) {
			
				//Read number one and same it as a float
				mEdit   = (EditText)findViewById(R.id.editText1);
				num1 = Float.parseFloat(mEdit.getText().toString());
				
				//Read number two and same it as a float
				mEditt   = (EditText)findViewById(R.id.editText2);
				num2 = Float.parseFloat(mEditt.getText().toString());

				total = num1 + num2;
				
				//This line is now new
				//mText = (TextView)findViewById(R.id.textView3); //Remove for final code ------------
				//mText.setText("Total is: "+total);				//Remove for final code ------------
				
				//Open up new screen
				Intent intent = new Intent(MainActivity.this, Screentwo.class);
				startActivity(intent);
			}
			
		});
		
		
	}


	public static double getNumOne() {
		return num1;
	}
	
	public static double getNumTwo() {
		return num2;
	}
	
	public static double getTotal() {
		return total;
	}
}
