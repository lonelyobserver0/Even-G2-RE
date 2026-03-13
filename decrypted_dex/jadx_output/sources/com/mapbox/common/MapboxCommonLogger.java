package com.mapbox.common;

import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000bJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mapbox/common/MapboxCommonLogger;", "", "()V", "SDK_IDENTIFIER", "", "logD", "", "tag", "message", "logD$common_release", "logE", "logE$common_release", "logI", "logI$common_release", "logW", "logW$common_release", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxCommonLogger {
    private static final String SDK_IDENTIFIER = StubApp.getString2(13262);
    public static final MapboxCommonLogger INSTANCE = new MapboxCommonLogger();

    private MapboxCommonLogger() {
    }

    public final void logD$common_release(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.debug(message, StubApp.getString2(13369) + tag);
    }

    public final void logE$common_release(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.error(message, StubApp.getString2(13369) + tag);
    }

    public final void logI$common_release(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.info(message, StubApp.getString2(13369) + tag);
    }

    public final void logW$common_release(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.warning(message, StubApp.getString2(13369) + tag);
    }
}
