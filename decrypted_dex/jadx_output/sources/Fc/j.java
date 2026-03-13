package Fc;

import com.stub.StubApp;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final i f2365a = new i();

    @Override // Fc.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // Fc.m
    public final boolean b() {
        boolean z2 = Ec.h.f2148d;
        return Ec.h.f2148d;
    }

    @Override // Fc.m
    public final String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // Fc.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Ec.n nVar = Ec.n.f2161a;
            Object[] array = C2.i.t(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException(StubApp.getString2(11601));
            }
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
        }
    }
}
