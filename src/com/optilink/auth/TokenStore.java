package com.optilink.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class TokenStore {
    public static final String PREFS_TOKEN_STORE_FILE_NAME = "prefs_token_store";
    public static final String PREFS_TOKEN_KEY             = "prefs_token_key";
    public static final String PREFS_ID_KEY                = "prefs_id_key";
    // public static final String TOKEN
    private SharedPreferences  mSharedPreference;

    public TokenStore(Context ctx) {
        mSharedPreference = ctx.getSharedPreferences(
                PREFS_TOKEN_STORE_FILE_NAME, Context.MODE_PRIVATE);
    }

    public String getToken() {
        return mSharedPreference.getString(PREFS_TOKEN_KEY, null);
    }

    public boolean putToken(String token) {
        Editor editor = mSharedPreference.edit();
        editor.putString(PREFS_TOKEN_KEY, token);
        return editor.commit();
    }
}
