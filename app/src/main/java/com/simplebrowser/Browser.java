package com.simplebrowser;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Maxim_Ozarovskiy on 09.04.2017.
 */

public class Browser extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browser);

        WebView webView = (WebView) findViewById(R.id.webView);
        Uri data = getIntent().getData();
        webView.loadUrl(data.toString());
    }
}
