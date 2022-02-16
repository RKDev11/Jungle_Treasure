package com.jeulng.terreuas;

import android.content.Context;
import android.provider.Settings;

import androidx.appcompat.app.AppCompatActivity;



public class Dev extends AppCompatActivity {

    public static int START_JEULNG_TERREUAS;

    Dev(Context context){
        START_JEULNG_TERREUAS = Settings.Secure.getInt(context.getContentResolver(), Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0);
    }
}
