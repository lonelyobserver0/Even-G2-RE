package com.mapbox.maps;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.maps.exception.WorkerThreadException;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/ThreadChecker;", "", "()V", "DEBUG_FIELD", "", "DEBUG_LOOKUP_FAILED", "METADATA_KEY", "METADATA_LOOKUP_FAILED", "TAG", "debug", "", "enabled", "isMainThread", "resolveDebugState", "resolveEnabledState", "throwIfNotMainThread", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ThreadChecker {
    public static final ThreadChecker INSTANCE;
    private static final boolean debug;
    private static final boolean enabled;
    private static final String DEBUG_FIELD = StubApp.getString2(13364);
    private static final String DEBUG_LOOKUP_FAILED = StubApp.getString2(14295);
    private static final String METADATA_KEY = StubApp.getString2(14296);
    private static final String METADATA_LOOKUP_FAILED = StubApp.getString2(14297);
    private static final String TAG = StubApp.getString2(14298);

    static {
        ThreadChecker threadChecker = new ThreadChecker();
        INSTANCE = threadChecker;
        enabled = threadChecker.resolveEnabledState();
        debug = threadChecker.resolveDebugState();
    }

    private ThreadChecker() {
    }

    private final boolean isMainThread() {
        return Intrinsics.areEqual(Thread.currentThread(), Looper.getMainLooper().getThread());
    }

    private final boolean resolveDebugState() {
        try {
            return Class.forName(MapboxSDKCommon.INSTANCE.getContext().getApplicationInfo().packageName + StubApp.getString2("14299")).getField(StubApp.getString2("13364")).getBoolean(null);
        } catch (Exception e10) {
            MapboxLogger.logI(StubApp.getString2(14298), StubApp.getString2(14300) + e10.getLocalizedMessage());
            return false;
        }
    }

    private final boolean resolveEnabledState() {
        String string2 = StubApp.getString2(14296);
        try {
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageManager.getApplic…ger.GET_META_DATA\n      )");
            Bundle bundle = applicationInfo.metaData;
            if (bundle.containsKey(string2)) {
                return bundle.getBoolean(string2);
            }
            return true;
        } catch (Exception e10) {
            MapboxLogger.logI(StubApp.getString2(14298), StubApp.getString2(14301) + e10.getLocalizedMessage());
            return true;
        }
    }

    public final void throwIfNotMainThread() {
        if ((!(!enabled) && !(!debug)) && !isMainThread()) {
            throw new WorkerThreadException();
        }
    }
}
