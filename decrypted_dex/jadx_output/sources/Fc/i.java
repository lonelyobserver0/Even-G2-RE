package Fc;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class i implements k {
    @Override // Fc.k
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Ec.h.f2148d && Conscrypt.isConscrypt(sslSocket);
    }

    @Override // Fc.k
    public final m b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return new j();
    }
}
