package com.guoyonghui.ndktest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private Button mUseNDKButton;
	
	static {
		System.loadLibrary("AndroidNDKTest");
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mUseNDKButton = (Button)findViewById(R.id.use_ndk_button);
		mUseNDKButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(v.equals(mUseNDKButton)) {
			double a = 1, b = 2;
			double result;
			result = JNICalculator.add(a, b);
			Toast.makeText(this, "a = " + a + " b = " + b + " a + b = " + result, Toast.LENGTH_SHORT).show();
		}
	}

}
