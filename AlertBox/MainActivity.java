package com.mubashir.alertbox_mr;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button alert=(Button)findViewById(R.id.btnDialog);
        alert.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        		builder.setCancelable(true);
        		builder.setMessage("This is an Alert Box");
        		builder.setPositiveButton("OK", null);
        		builder.setNeutralButton("Cancel", null);
        		AlertDialog myAlert=builder.create();
        		myAlert.show();
        	}
        });
    }



    
}
