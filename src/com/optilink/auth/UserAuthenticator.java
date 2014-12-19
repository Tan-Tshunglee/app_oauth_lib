package com.optilink.auth;

import android.app.Application;

public class UserAuthenticator {
    private static UserAuthenticator singleInstance = null;
    public static final UserAuthenticator getInstance (Application hostApp) {
        if(singleInstance == null) {
            singleInstance = new UserAuthenticator(hostApp);
        }
        return singleInstance;
    }

    private Application mHostApplication;
    private TokenStore mToken;
    
    private UserAuthenticator(Application hostApp) {
        mHostApplication = hostApp;
        mToken = new TokenStore(hostApp);
    }

    public boolean userValidate() {
        // TODO Auto-generated method stub
        return false;
    }
}
