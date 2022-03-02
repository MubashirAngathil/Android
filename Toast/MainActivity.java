package com.mubashir.toast_mr;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

  @Override
  protected void onResume(){
	  Toast.makeText(getApplicationContext(),"Hello world",Toast.LENGTH_LONG ).show();
	  super.onResume();
  }

  
    
}
