package com.mubashir.backgroundcolor_mr;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;;

public class MainActivity extends Activity {

	View screenView;
	Button dark;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        screenView=(View)findViewById(R.id.LinerLayout);
        dark=(Button)findViewById(R.id.dark);
        dark.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			screenView.setBackgroundResource(android.R.color.black);
			dark.setTextColor(android.graphics.Color.WHITE);
			}
		});
	}


}
