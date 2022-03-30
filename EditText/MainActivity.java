package com.mubashir.edittextandtextview_mr;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView txt;
    EditText etxt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btn=(Button)findViewById(R.id.btn);
    etxt=(EditText)findViewById(R.id.etxt);
    txt=(TextView)findViewById(R.id.txt);
    btn.setOnClickListener(new View.OnClickListener() {
        String data;
        @Override
        public void onClick(View v) {
            data=etxt.getText().toString();
            txt.setText(data);
        }
    });
    }
}