package org.hackru.oneapp.hackru.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Sean on 3/21/2018.
 */

public class SharedPreferencesUtility {
    static final String PREF_AUTH_TOKEN= "authtoken";
    static final String PREF_EMAIL= "email";
    static final String PREF_PERMISSION= "permission";
    static final String PREF_MAP_USED= "map_used";
    static final String PREF_ALLOW_ONLY_ACCEPTED = "allow_only_accepted";

    static SharedPreferences getSharedPreferences(Context ctx) {
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public static void setAuthToken(Context ctx, String token) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_AUTH_TOKEN, token);
        editor.commit();
    }

    public static String getAuthToken(Context ctx) {
        return getSharedPreferences(ctx).getString(PREF_AUTH_TOKEN, "");
    }

    public static void setEmail(Context ctx, String email) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_EMAIL, email);
        editor.commit();
    }

    public static String getEmail(Context ctx) {
        return getSharedPreferences(ctx).getString(PREF_EMAIL, "");
    }

    // Permission: True means they can use the scanner, false means they cannot
    public static void setPermission(Context ctx, Boolean permission) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putBoolean(PREF_PERMISSION, permission);
        editor.commit();
    }

    public static boolean getPermission(Context ctx) {
        return getSharedPreferences(ctx).getBoolean(PREF_PERMISSION, false);
    }

    public static void setMapUsed(Context ctx, Boolean used) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putBoolean(PREF_MAP_USED, used);
        editor.commit();
    }

    public static boolean getMapUsed(Context ctx) {
        return getSharedPreferences(ctx).getBoolean(PREF_MAP_USED, false);
    }

    public static void setAllowOnlyAccepted(Context ctx, Boolean allow) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putBoolean(PREF_ALLOW_ONLY_ACCEPTED, allow);
        editor.commit();
    }

    public static boolean getAllowOnlyAccepted(Context ctx) {
        return getSharedPreferences(ctx).getBoolean(PREF_ALLOW_ONLY_ACCEPTED, true);
    }
}
