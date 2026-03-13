package com.mapbox.common.module.okhttp;

import com.stub.StubApp;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import wc.C1893j;
import wc.p;
import wc.w;
import wc.x;
import wc.y;
import xc.b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class LazyClient {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long DEFAULT_CONNECT_TIMEOUT_SEC = 30;
    private static final long DEFAULT_READ_TIMEOUT_SEC = 60;
    private static final C1893j connectionPool = new C1893j();
    private volatile x client;
    private final boolean disableHttp2;
    private byte maxRequestsPerHost = 0;
    private final SocketFactory socketFactory;

    public LazyClient(SocketFactory socketFactory, boolean z2) {
        this.socketFactory = socketFactory;
        this.disableHttp2 = z2;
    }

    private static x buildOkHttpClient(SocketFactory socketFactory, boolean z2) {
        w wVar = new w();
        p eventListenerFactory = NetworkUsageListener.FACTORY;
        Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
        Intrinsics.checkNotNullParameter(eventListenerFactory, "<set-?>");
        wVar.f22436e = eventListenerFactory;
        TimeUnit unit = TimeUnit.SECONDS;
        wVar.a(DEFAULT_CONNECT_TIMEOUT_SEC, unit);
        Intrinsics.checkNotNullParameter(unit, "unit");
        wVar.f22453w = b.b(StubApp.getString2(1987), 60L, unit);
        C1893j connectionPool2 = connectionPool;
        Intrinsics.checkNotNullParameter(connectionPool2, "connectionPool");
        Intrinsics.checkNotNullParameter(connectionPool2, "<set-?>");
        wVar.f22433b = connectionPool2;
        if (socketFactory != null) {
            Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException(StubApp.getString2(13787));
            }
            if (!Intrinsics.areEqual(socketFactory, wVar.f22444n)) {
                wVar.f22431A = null;
            }
            Intrinsics.checkNotNullParameter(socketFactory, "<set-?>");
            wVar.f22444n = socketFactory;
        }
        if (z2) {
            wVar.b(Arrays.asList(y.f22486c));
        }
        return new x(wVar);
    }

    public x get() {
        if (this.client == null) {
            synchronized (this) {
                try {
                    if (this.client == null) {
                        this.client = buildOkHttpClient(this.socketFactory, this.disableHttp2);
                        if (this.maxRequestsPerHost != 0) {
                            this.client.f22463a.i(this.maxRequestsPerHost);
                        }
                    }
                } finally {
                }
            }
        }
        return this.client;
    }

    public synchronized void setMaxRequestsPerHost(byte b2) {
        this.maxRequestsPerHost = b2;
        if (b2 != 0) {
            synchronized (this) {
                try {
                    x xVar = this.client;
                    if (xVar != null) {
                        xVar.f22463a.i(b2);
                    }
                } finally {
                }
            }
        }
    }
}
