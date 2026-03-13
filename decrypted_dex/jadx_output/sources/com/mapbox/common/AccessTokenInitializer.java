package com.mapbox.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import com.stub.StubApp;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0003J\b\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/mapbox/common/AccessTokenInitializer;", "", "()V", "MAPBOX_PREFERENCES_NAME", "", "SETTING_NAME", "TAG", "preferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences$delegate", "Lkotlin/Lazy;", "getAccessTokenFromEnv", "getAllowInitialization", "", "isAccessTokenInitializationAllowed", "readEnvAndSetAccessToken", "", "setAllowInitialization", "allowed", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class AccessTokenInitializer {
    private static final String MAPBOX_PREFERENCES_NAME = StubApp.getString2(13186);
    private static final String SETTING_NAME = StubApp.getString2(13187);
    private static final String TAG = StubApp.getString2(13188);
    public static final AccessTokenInitializer INSTANCE = new AccessTokenInitializer();

    /* renamed from: preferences$delegate, reason: from kotlin metadata */
    private static final Lazy preferences = LazyKt.lazy(new Function0<SharedPreferences>() { // from class: com.mapbox.common.AccessTokenInitializer$preferences$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return MapboxSDKCommon.INSTANCE.getContext().getSharedPreferences(StubApp.getString2(13186), 0);
        }
    });

    private AccessTokenInitializer() {
    }

    @JvmStatic
    public static final String getAccessTokenFromEnv() {
        String str;
        Resources resources;
        int identifier;
        try {
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null || (str = applicationInfo.packageName) == null || (identifier = (resources = context.getResources()).getIdentifier(StubApp.getString2("13189"), StubApp.getString2("983"), str)) == 0) {
                return "";
            }
            String string = resources.getString(identifier);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(defa…boxAccessTokenResourceId)");
            return string;
        } catch (Throwable unused) {
            Log.warning(StubApp.getString2(13190), StubApp.getString2(13188));
            return "";
        }
    }

    @JvmStatic
    private static final boolean getAllowInitialization() {
        try {
            return INSTANCE.getPreferences().getBoolean(StubApp.getString2("13187"), false);
        } catch (ClassCastException e10) {
            Log.error(StubApp.getString2(13191) + e10.getMessage(), StubApp.getString2(13188));
            return false;
        }
    }

    private final SharedPreferences getPreferences() {
        return (SharedPreferences) preferences.getValue();
    }

    @JvmStatic
    public static final boolean isAccessTokenInitializationAllowed() {
        String str;
        Resources resources;
        int identifier;
        try {
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null || (str = applicationInfo.packageName) == null || (identifier = (resources = context.getResources()).getIdentifier(StubApp.getString2("13192"), StubApp.getString2("1002"), str)) == 0 || !resources.getBoolean(identifier)) {
                return true;
            }
            return getAllowInitialization();
        } catch (Throwable th) {
            Log.error(StubApp.getString2(13193) + th.getMessage(), StubApp.getString2(13188));
        }
        return true;
    }

    @Deprecated(message = "Setting and getting access token now separated. Method does nothing and left for API compatibility")
    @JvmStatic
    public static final void readEnvAndSetAccessToken() {
    }

    @JvmStatic
    public static final void setAllowInitialization(boolean allowed) {
        if (allowed) {
            FeatureTelemetryCounter.create(StubApp.getString2(13194)).increment();
        } else {
            FeatureTelemetryCounter.create(StubApp.getString2(13195)).increment();
        }
        SharedPreferences.Editor edit = INSTANCE.getPreferences().edit();
        edit.putBoolean(StubApp.getString2(13187), allowed);
        edit.apply();
    }
}
