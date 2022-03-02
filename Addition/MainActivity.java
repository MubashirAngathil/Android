package com.mubashir.addition_mr;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView Result;
	Button AddBtn;
	EditText num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Result=(TextView)findViewById(R.id.txtView);
        AddBtn=(Button)findViewById(R.id.addBtn);
        num1=(EditText)findViewById(R.id.first);        
        num2=(EditText)findViewById(R.id.second);
        
        AddBtn.setOnClickListener(new OnClickListener(){
        	@Override 
        	public void onClick(View v){
        	if(num1.length()>0&&num2.length()>0){
        	 int a=Integer.parseInt(num1.getText().toString());
        	 int b=Integer.parseInt(num2.getText().toString());
        	 int sum=a+b;
        	 Result.setText("Sum is: "+sum);
        	}else{
        		Result.setText("ERROR!!,Check your input ");
        	}
        	}
        });

        
    }



    
}
