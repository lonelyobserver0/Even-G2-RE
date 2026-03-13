package com.mapbox.common;

import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000bJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mapbox/common/MapboxMapsAndroidLogger;", "", "()V", "SDK_IDENTIFIER", "", "internalLogD", "", "tag", "message", "internalLogD$sdk_base_release", "internalLogE", "internalLogE$sdk_base_release", "internalLogI", "internalLogI$sdk_base_release", "internalLogW", "internalLogW$sdk_base_release", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxMapsAndroidLogger {
    public static final String SDK_IDENTIFIER = StubApp.getString2(13372);
    public static final MapboxMapsAndroidLogger INSTANCE = new MapboxMapsAndroidLogger();

    private MapboxMapsAndroidLogger() {
    }

    public final void internalLogD$sdk_base_release(String tag, String message) {
        String string2 = StubApp.getString2(13373);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Log.debug(message, string2 + tag);
        } catch (UnsatisfiedLinkError unused) {
            android.util.Log.d(string2 + tag, message);
        }
    }

    public final void internalLogE$sdk_base_release(String tag, String message) {
        String string2 = StubApp.getString2(13373);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Log.error(message, string2 + tag);
        } catch (UnsatisfiedLinkError unused) {
            android.util.Log.e(string2 + tag, message);
        }
    }

    public final void internalLogI$sdk_base_release(String tag, String message) {
        String string2 = StubApp.getString2(13373);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Log.info(message, string2 + tag);
        } catch (UnsatisfiedLinkError unused) {
            android.util.Log.i(string2 + tag, message);
        }
    }

    public final void internalLogW$sdk_base_release(String tag, String message) {
        String string2 = StubApp.getString2(13373);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Log.warning(message, string2 + tag);
        } catch (UnsatisfiedLinkError unused) {
            android.util.Log.w(string2 + tag, message);
        }
    }
}
