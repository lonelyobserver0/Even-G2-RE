package com.mapbox.maps;

import com.mapbox.common.MapboxMapsAndroidLogger;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\b"}, d2 = {"logD", "", "tag", "", "message", "logE", "logI", "logW", "sdk-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@JvmName(name = "MapboxLogger")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxLogger {
    public static final void logD(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        MapboxMapsAndroidLogger.INSTANCE.internalLogD$sdk_base_release(tag, message);
    }

    public static final void logE(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        MapboxMapsAndroidLogger.INSTANCE.internalLogE$sdk_base_release(tag, message);
    }

    public static final void logI(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        MapboxMapsAndroidLogger.INSTANCE.internalLogI$sdk_base_release(tag, message);
    }

    public static final void logW(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        MapboxMapsAndroidLogger.INSTANCE.internalLogW$sdk_base_release(tag, message);
    }
}
