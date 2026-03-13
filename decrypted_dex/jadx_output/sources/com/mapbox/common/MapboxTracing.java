package com.mapbox.common;

import com.stub.StubApp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068\u0006@BX\u0087\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/mapbox/common/MapboxTracing;", "", "()V", "MAPBOX_TRACE_ID", "", "<set-?>", "", "platformTracingEnabled", "getPlatformTracingEnabled", "()Z", "disableAll", "", "enableAll", "enableCore", "enablePlatform", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxTracing {
    private static boolean platformTracingEnabled;
    public static final String MAPBOX_TRACE_ID = StubApp.getString2(13377);
    public static final MapboxTracing INSTANCE = new MapboxTracing();

    private MapboxTracing() {
    }

    public final void disableAll() {
        platformTracingEnabled = false;
        Tracing.setTracingBackendType(TracingBackendType.NOOP);
    }

    public final void enableAll() {
        platformTracingEnabled = true;
        Tracing.setTracingBackendType(TracingBackendType.PLATFORM);
    }

    public final void enableCore() {
        Tracing.setTracingBackendType(TracingBackendType.PLATFORM);
    }

    public final void enablePlatform() {
        platformTracingEnabled = true;
    }

    public final boolean getPlatformTracingEnabled() {
        return platformTracingEnabled;
    }
}
