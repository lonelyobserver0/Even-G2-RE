package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class HttpServiceFactory {
    protected long peer;

    public static class HttpServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        public HttpServiceFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public HttpServiceFactory(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native HttpServiceInterface getInstance();

    public static native void reset();

    public static native Cancelable setCancellationCallback(HttpServiceCancellationCallback httpServiceCancellationCallback);

    public static native void setHttpServiceInterceptor(HttpServiceInterceptorInterface httpServiceInterceptorInterface);

    public static native void setMaxRequestsPerHost(byte b2);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new HttpServiceFactoryPeerCleaner(j));
    }

    public static native void setUserDefined(HttpServiceInterface httpServiceInterface);
}
