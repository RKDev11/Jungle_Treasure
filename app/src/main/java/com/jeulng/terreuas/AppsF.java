package com.jeulng.terreuas;

import android.content.Context;
import android.util.Log;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;

import java.util.Map;
import java.util.Objects;

public class AppsF {
    public static String statusJeulngTerreuas = "";
    public static String parsStatusJeulngTerreuas;
    public static String COMCYHRERRLOL_ID = "R3dzUGl6em9weEczUnNVQUxINEZKRg==";
    public static String appsIdJeulngTerreuas;
    J8T jt = new J8T();

    AppsF(Context context){

        AppsFlyerConversionListener ppJeulngTerreuas = new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> mapJeulngTerreuas) {
                statusJeulngTerreuas = Objects.requireNonNull(mapJeulngTerreuas.get(J8T.Refr("YWZfc3RhdHVz"))).toString();

                if (statusJeulngTerreuas.equals(J8T.Refr("Tm9uLW9yZ2FuaWM="))) {
                    String campaingJeulngTerreuas = Objects.requireNonNull(mapJeulngTerreuas.get(J8T.Refr("Y2FtcGFpZ24="))).toString();
                    parsStatusJeulngTerreuas = jt.aLa(campaingJeulngTerreuas);
                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        };

        AppsFlyerLib.getInstance().init(J8T.Refr(COMCYHRERRLOL_ID), ppJeulngTerreuas, context);
        AppsFlyerLib.getInstance().start(context);
        appsIdJeulngTerreuas = AppsFlyerLib.getInstance().getAppsFlyerUID(context);
    }
}
