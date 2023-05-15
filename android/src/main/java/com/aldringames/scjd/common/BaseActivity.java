package com.aldringames.scjd.common;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

public class BaseActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		hideSystemBars();
	}
	
	@Override
	public void onResume() {
		super.onResume();
		hideSystemBars();
	}
	
	private void hideSystemBars() {
		WindowInsetsControllerCompat windowInsetsController = ViewCompat.getWindowInsetsController(getWindow().getDecorView());
		if (windowInsetsController == null) {
			return;
		}
		windowInsetsController.setSystemBarsBehavior(WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
		windowInsetsController.hide(WindowInsetsCompat.Type.systemBars());
	}
}
