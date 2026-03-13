package com.mapbox.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.SystemClock;
import com.stub.StubApp;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0010\u0010\b\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\nH\u0002¨\u0006\u000b"}, d2 = {"gatherSystemInfo", "", "initializerData", "Lcom/mapbox/common/InitializerData;", "context", "Landroid/content/Context;", "t", "", "skipFurtherInitialization", "", "Ljava/lang/Class;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BaseMapboxInitializerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String gatherSystemInfo(InitializerData initializerData, Context context, Throwable th) {
        Object m40constructorimpl;
        Object m40constructorimpl2;
        String str;
        ApplicationInfo applicationInfo;
        try {
            Result.Companion companion = Result.INSTANCE;
            PackageManager packageManager = context.getPackageManager();
            m40constructorimpl = Result.m40constructorimpl(packageManager != null ? Boolean.valueOf(packageManager.isInstantApp()) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m40constructorimpl = Result.m40constructorimpl(ResultKt.createFailure(th2));
        }
        try {
            PackageManager packageManager2 = context.getPackageManager();
            if (packageManager2 == null || (applicationInfo = packageManager2.getApplicationInfo(context.getPackageName(), 0)) == null) {
                str = null;
            } else {
                String[] list = new File(applicationInfo.nativeLibraryDir).list();
                if (list != null) {
                    Intrinsics.checkNotNullExpressionValue(list, "list()");
                    str = ArraysKt___ArraysKt.joinToString$default(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
                    if (str == null) {
                    }
                }
                str = "";
            }
            m40constructorimpl2 = Result.m40constructorimpl(str);
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            m40constructorimpl2 = Result.m40constructorimpl(ResultKt.createFailure(th3));
        }
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(13213));
        sb2.append(initializerData.getCurrentInitAttempt());
        sb2.append(StubApp.getString2(13214));
        sb2.append(th.getClass().getSimpleName());
        sb2.append(StubApp.getString2(13215));
        sb2.append(SystemClock.elapsedRealtime() - initializerData.getFirstInitElapsedTimeMs());
        sb2.append(StubApp.getString2(13216));
        sb2.append(th.getMessage());
        sb2.append(StubApp.getString2(13217));
        Throwable cause = th.getCause();
        sb2.append(cause != null ? cause.getClass().getSimpleName() : null);
        sb2.append(StubApp.getString2(13218));
        Throwable cause2 = th.getCause();
        sb2.append(cause2 != null ? cause2.getMessage() : null);
        sb2.append(StubApp.getString2(13219));
        if (Result.m46isFailureimpl(m40constructorimpl2)) {
            m40constructorimpl2 = null;
        }
        sb2.append((String) m40constructorimpl2);
        sb2.append(StubApp.getString2(13220));
        sb2.append(Result.m46isFailureimpl(m40constructorimpl) ? null : m40constructorimpl);
        sb2.append(StubApp.getString2(13221));
        sb2.append(Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()));
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean skipFurtherInitialization(Class<?> cls) {
        InitializerData initializerData = BaseMapboxInitializer.INSTANCE.getInitializersMap().get(cls);
        if (initializerData != null) {
            return initializerData.getState() == InitializerState.SUCCESS || initializerData.getState() == InitializerState.IN_PROGRESS;
        }
        return false;
    }
}
