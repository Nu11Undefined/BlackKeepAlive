package com.min.black;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Держим экран включенным
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        
        // Устанавливаем черный фон
        getWindow().getDecorView().setBackgroundColor(Color.BLACK);
        
        // Скрываем статус-бар и навигацию (полноэкранный режим)
        getWindow().getDecorView().setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
            View.SYSTEM_UI_FLAG_FULLSCREEN
        );
    }
}
