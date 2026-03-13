package Fc;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final k f2366a;

    /* renamed from: b, reason: collision with root package name */
    public m f2367b;

    public l(k socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f2366a = socketAdapterFactory;
    }

    @Override // Fc.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f2366a.a(sslSocket);
    }

    @Override // Fc.m
    public final boolean b() {
        return true;
    }

    @Override // Fc.m
    public final String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        m e10 = e(sslSocket);
        if (e10 == null) {
            return null;
        }
        return e10.c(sslSocket);
    }

    @Override // Fc.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        m e10 = e(sslSocket);
        if (e10 == null) {
            return;
        }
        e10.d(sslSocket, str, protocols);
    }

    public final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f2367b == null && this.f2366a.a(sSLSocket)) {
                this.f2367b = this.f2366a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2367b;
    }
}
