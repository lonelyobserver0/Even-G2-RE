package com.mapbox.common;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mapbox/common/RunloopErrorHandler;", "", "()V", "TAG", "", "postErrorToMainLooper", "", "error", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class RunloopErrorHandler {
    public static final String TAG = StubApp.getString2(13448);
    public static final RunloopErrorHandler INSTANCE = new RunloopErrorHandler();

    private RunloopErrorHandler() {
    }

    @JvmStatic
    @Keep
    public static final void postErrorToMainLooper(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Log.error(StubApp.getString2(13449) + error.getMessage(), StubApp.getString2(13448));
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new a(error, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postErrorToMainLooper$lambda$0(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "$error");
        throw error;
    }
}
