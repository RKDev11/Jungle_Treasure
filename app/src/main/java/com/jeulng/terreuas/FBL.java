package com.jeulng.terreuas;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;

import com.facebook.FacebookSdk;
import com.facebook.applinks.AppLinkData;

public class FBL {

    public static String DATA_JEULNG_TERREUAS;

    FBL(String fbId, Context context){
        FacebookSdk.setApplicationId(fbId);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);
        AppLinkData.fetchDeferredAppLinkData(context, new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(AppLinkData fffdataFb) {
                if (fffdataFb == null) {
                    fffdataFb = AppLinkData.createFromActivity((Activity) context);
                }
                if (fffdataFb != null) {
                    Uri urlSsetcerOefljgun = fffdataFb.getTargetUri();
                    String looo = urlSsetcerOefljgun.getQuery();
                    DATA_JEULNG_TERREUAS = J8T.aLa(looo);
                }
            }
        });
    }
}
