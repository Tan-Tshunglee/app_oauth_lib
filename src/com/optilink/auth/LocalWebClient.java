package com.optilink.auth;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LocalWebClient extends WebViewClient{
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        return super.shouldOverrideUrlLoading(view, url);
    }
}
