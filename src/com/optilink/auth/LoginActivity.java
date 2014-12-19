package com.optilink.auth;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.optilink.app_oauth_lib.R;

public class LoginActivity extends Activity {
    
    public static final String lOGIN_PAGE_URL = "http://www.baidu.com";
    private UserAuthenticator mAuthenticator;
    private WebView mWebView;
    private WebSettings mWebSettings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAuthenticator = UserAuthenticator.getInstance(getApplication());
        if (mAuthenticator.userValidate()) {
            finish();
            return;
        }
        
        setContentView(R.layout.login_activity_layout);
        
        mWebView = (WebView) findViewById(R.id.webview);
        mWebView.loadUrl(lOGIN_PAGE_URL);
        
        mWebSettings = mWebView.getSettings();
        mWebSettings.setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new LocalWebClient());
    }
}
