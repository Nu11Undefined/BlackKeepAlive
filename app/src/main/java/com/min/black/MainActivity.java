package com.min.black;
import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.View;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        View view = new View(this);
        view.setBackgroundColor(Color.BLACK);
        setContentView(view);
    }
}
