package com.juno.testapp;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TestAppActivity extends Activity implements OnClickListener {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("TestAppActivity", "onCreate");
		setContentView(R.layout.main);

		Button btnAuth = (Button) findViewById(R.id.btn_finish);
		btnAuth.setOnClickListener(this);
		Button btnPopup = (Button) findViewById(R.id.btn_popup);
		btnPopup.setOnClickListener(this);
		Button btnNewAct = (Button) findViewById(R.id.btn_new_activity);
		btnNewAct.setOnClickListener(this);
	}
	
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		Log.d("TestAppActivity", "onPostCreate");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d("TestAppActivity", "onStart");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d("TestAppActivity", "onRestart");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Log.d("TestAppActivity", "onStop");
	}
	
	@Override
	protected void onPostResume() {
		super.onPostResume();	
		Log.d("TestAppActivity", "onPostResume");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Log.d("TestAppActivity", "onPause");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.d("TestAppActivity", "onResume");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("onPostCreate", "onDestroy");
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		switch (id) {
		case R.id.btn_finish:
			finish();
			break;
		case R.id.btn_popup:
			AlertDialog.Builder ab=new AlertDialog.Builder(TestAppActivity.this);
		 	ab.setMessage(Html.fromHtml("<strong><font color=\"#000055\">Title</font></strong><br> Message!!"));
		 	ab.setPositiveButton("OK", null);
		 	ab.show();
			break;
		case R.id.btn_new_activity:
			Intent intent = new Intent(getBaseContext(), NewActivity.class);	
			startActivity(intent);
		default:
			break;
		}
	}
	
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		Log.d("TestAppActivity", "onRestoreInstanceState");
		super.onRestoreInstanceState(savedInstanceState);
	}
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		Log.d("TestAppActivity", "onSaveInstanceState");
		super.onSaveInstanceState(outState);
	}

	@Override
	public void onLowMemory() {
		Log.d("TestAppActivity", "onLowMemory");
		super.onLowMemory();
	}
}
	/*private class SimpleView extends View {
		
		private ShapeDrawable mDrawable = null;//new ShapeDrawable();
		
		float[] outerRadii = {20,20,0,0,20,20,0,0};
		float[] interRadii = {20,20,0,0,20,20,0,0};
		//float[] outerRadii = {20,0,20,20};
		//RectF inset, float[] innerRadii
		RectF rect = new RectF(40,40,40,40);
		
		public SimpleView(Context context) {
			super(context);
			
			//Log.d("test", "SimpleView create");
			
			setFocusable(true);
			this.mDrawable = new ShapeDrawable(new RoundRectShape(outerRadii, rect, interRadii));
			this.mDrawable.getPaint().setColor(0x4400DD44);
		}
		
		int height = 100;
		@Override
		protected void onDraw(Canvas canvas) {
			int x = 10;
			int y = 10;
			int width = 300;
			
			this.mDrawable.setBounds(x, y, x+width, y+height);
			this.mDrawable.draw(canvas);
			y += 5;
			this.mDrawable.setBounds(x, y, x+width, y+height);
			this.mDrawable.draw(canvas);
		}
	}*/
	

