package com.jeulng.terreuas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PPpp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pppp);
        getWindow().addFlags(1024);
        WebView webView = findViewById(R.id.tyui);
        webView.loadUrl(J8T.Refr("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49ODA1WmpBbFJaQXJiNTRDNmVSaFpkekNtMUtscDBHc1E="));
    }
}