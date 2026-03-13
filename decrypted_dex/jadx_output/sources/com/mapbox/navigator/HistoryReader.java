package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class HistoryReader implements HistoryReaderInterface {
    protected long peer;

    public static class HistoryReaderPeerCleaner implements Runnable {
        private long peer;

        public HistoryReaderPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            HistoryReader.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public HistoryReader(String str) {
        initialize(str);
    }

    public static native void cleanNativePeer(long j);

    private native void initialize(String str);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new HistoryReaderPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.HistoryReaderInterface
    public native HistoryRecord next();

    public HistoryReader(long j) {
        setPeer(j);
    }
}
