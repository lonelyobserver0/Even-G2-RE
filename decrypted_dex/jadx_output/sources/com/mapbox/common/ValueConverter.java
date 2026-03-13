package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ValueConverter {
    protected long peer;

    public static class ValueConverterPeerCleaner implements Runnable {
        private long peer;

        public ValueConverterPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ValueConverter.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ValueConverter(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native Expected<String, Value> fromJson(String str);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new ValueConverterPeerCleaner(j));
    }

    public static native String toJson(Value value);

    public static native String toJson(Value value, int i3);
}
