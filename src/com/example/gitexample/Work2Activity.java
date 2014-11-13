package com.example.gitexample;

import android.app.Activity;
import android.os.Bundle;

public class Work2Activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
	}
}
