package com.mapbox.navigator;

import android.content.Context;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0080.¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/mapbox/navigator/MapboxNavigationNative;", "", "()V", "<set-?>", "Landroid/content/Context;", "appContext", "getAppContext$dash_native_release", "()Landroid/content/Context;", "isInitialized", "", "()Z", "setInitialized", "(Z)V", "initialize", "", "context", "dash-native_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxNavigationNative {
    public static final MapboxNavigationNative INSTANCE = new MapboxNavigationNative();
    private static Context appContext;
    private static boolean isInitialized;

    private MapboxNavigationNative() {
    }

    public final Context getAppContext$dash_native_release() {
        Context context = appContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appContext");
        return null;
    }

    public final void initialize(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        isInitialized = true;
        Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(origApplicationContext, "context.applicationContext");
        appContext = origApplicationContext;
    }

    public final boolean isInitialized() {
        return isInitialized;
    }

    public final void setInitialized(boolean z2) {
        isInitialized = z2;
    }
}
