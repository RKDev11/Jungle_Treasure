package com.jeulng.terreuas;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;


public class OneSGOne extends AppCompatActivity {

    private static String JEULNG_TERREUAS_SIGNAL = "YzkyYzYzNWEtZDQzNy00OWMyLWFiZTctMmFhZjIxMzZlMTM1";
    OneSGOne(Context context){
        com.onesignal.OneSignal.setLogLevel(com.onesignal.OneSignal.LOG_LEVEL.VERBOSE, com.onesignal.OneSignal.LOG_LEVEL.NONE);
        com.onesignal.OneSignal.initWithContext(context);
        com.onesignal.OneSignal.setAppId(J8T.Refr(JEULNG_TERREUAS_SIGNAL));
    }
}
