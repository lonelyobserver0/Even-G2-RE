package com.mapbox.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\r"}, d2 = {"Lcom/mapbox/common/NativeLoggerWrapper;", "", "()V", "debug", "", "message", "", "category", "error", "getLogLevel", "Lcom/mapbox/common/LoggingLevel;", "info", "warning", "utils_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class NativeLoggerWrapper {
    public static final NativeLoggerWrapper INSTANCE = new NativeLoggerWrapper();

    private NativeLoggerWrapper() {
    }

    public final void debug(String message, String category) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.debug(message, category);
    }

    public final void error(String message, String category) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.error(message, category);
    }

    public final LoggingLevel getLogLevel(String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        return LogConfiguration.getLoggingLevel(category);
    }

    public final void info(String message, String category) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.info(message, category);
    }

    public final void warning(String message, String category) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.warning(message, category);
    }
}
