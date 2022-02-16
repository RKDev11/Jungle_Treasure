package com.jeulng.terreuas;


import static com.jeulng.terreuas.J8T.FILE_JEULNG_TERREUAS;
import static com.jeulng.terreuas.J8T.PHOTO_JEULNG_TERREUAS;
import static com.jeulng.terreuas.J8T.Refr;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.IOException;

public class WebSetting extends AppCompatActivity {
    public static J8T jt;


    WebSetting(WebView webStart, Context context) {
        webStart.getSettings().setJavaScriptEnabled(true);
        webStart.getSettings().setAppCacheEnabled(true);
        webStart.getSettings().setDomStorageEnabled(true);
        webStart.getSettings().setAllowContentAccess(true);
        webStart.getSettings().setAllowFileAccess(true);
        webStart.getSettings().setAppCacheEnabled(true);
        webStart.getSettings().setAllowFileAccessFromFileURLs(true);
        webStart.getSettings().setSaveFormData(true);
        webStart.getSettings().setMixedContentMode(0);
        webStart.getSettings().setSavePassword(true);
        webStart.getSettings().setAllowContentAccess(true);
        webStart.getSettings().setLoadsImagesAutomatically(true);
        webStart.getSettings().setAllowUniversalAccessFromFileURLs(true);
        webStart.getSettings().setDatabaseEnabled(true);
        webStart.getSettings().setLoadWithOverviewMode(true);
        webStart.getSettings().setUseWideViewPort(true);
        webStart.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webStart.getSettings().setDomStorageEnabled(true);
        webStart.getSettings().setAllowFileAccess(true);
        webStart.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webStart.getSettings().setEnableSmoothTransition(true);

        webStart.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                SharedPreferences lol = PreferenceManager.getDefaultSharedPreferences(view.getContext());
                SharedPreferences.Editor lolPref = lol.edit();
                lolPref.putString(Refr("bG9sX2tleQ=="), url);
                lolPref.apply();
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                view.setVisibility(View.VISIBLE);
                if (url.contains(J8T.Refr("NDA0"))) {
                    Intent intent = new Intent(jt.getApplicationContext(), Wait.class);
                    jt.startActivity(intent);
                    jt.finishAffinity();
                }

            }
        });
        webStart.setWebChromeClient(new WebChromeClient() {
            @SuppressLint("QueryPermissionsNeeded")
            @Override
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, FileChooserParams fileChooserParams) {
                if (FILE_JEULNG_TERREUAS != null) {
                    FILE_JEULNG_TERREUAS.onReceiveValue(null);
                }
                FILE_JEULNG_TERREUAS = filePathCallback;


                Intent intentImage = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (intentImage.resolveActivity(context.getPackageManager()) != null) {
                    File photo = null;
                    try {
                        photo = downloadFile();
                        intentImage.putExtra(J8T.Refr("UGhvdG9QYXRo"), PHOTO_JEULNG_TERREUAS);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (photo != null) {
                        PHOTO_JEULNG_TERREUAS = J8T.Refr("ZmlsZTo=") + photo.getAbsolutePath();
                        intentImage.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photo));
                    } else {
                        intentImage = null;
                    }
                }
                Intent intentContentSsetcerOefljgun = new Intent(Intent.ACTION_GET_CONTENT);
                intentContentSsetcerOefljgun.addCategory(Intent.CATEGORY_OPENABLE);
                intentContentSsetcerOefljgun.setType(J8T.Refr("aW1hZ2UvKg=="));

                Intent[] arrayIntentSsetcerOefljgun;
                if (intentImage != null) {
                    arrayIntentSsetcerOefljgun = new Intent[]{intentImage};
                } else {
                    arrayIntentSsetcerOefljgun = new Intent[0];
                }
                Intent intentChooserSsetcerOefljgun = new Intent(Intent.ACTION_CHOOSER);
                intentChooserSsetcerOefljgun.putExtra(Intent.EXTRA_INTENT, intentContentSsetcerOefljgun);
                intentChooserSsetcerOefljgun.putExtra(Intent.EXTRA_TITLE, J8T.Refr("RmlsZSBDaG9vc2Vy"));
                intentChooserSsetcerOefljgun.putExtra(Intent.EXTRA_INITIAL_INTENTS, arrayIntentSsetcerOefljgun);
                jt.startActivityForResult(intentChooserSsetcerOefljgun, 1);
                return true;
            }

            public File downloadFile() throws IOException {
                File imageFileSsetcerOefljgun = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                        J8T.Refr("RGlyZWN0b3J5TmFtZUhlcmU="));

                if (imageFileSsetcerOefljgun.exists()) {
                    imageFileSsetcerOefljgun.mkdirs();
                }
                imageFileSsetcerOefljgun = new File(imageFileSsetcerOefljgun + File.separator +
                        J8T.Refr("SU1HXw==") + String.valueOf(System.currentTimeMillis()) +
                        J8T.Refr("LmpwZw=="));
                return imageFileSsetcerOefljgun;
            }
        });


    }

}
