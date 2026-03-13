package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class PersistentStorageFactory {
    protected long peer;

    public static class PersistentStorageFactoryPeerCleaner implements Runnable {
        private long peer;

        public PersistentStorageFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            PersistentStorageFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public PersistentStorageFactory(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native Expected<PersistentStorageError, PersistentStorageInterface> getOrCreateByFile(String str);

    public static native Expected<PersistentStorageError, PersistentStorageInterface> getOrCreateByKey(String str);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new PersistentStorageFactoryPeerCleaner(j));
    }
}
