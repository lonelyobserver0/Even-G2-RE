package Fc;

import com.stub.StubApp;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final g f2364a = new g();

    @Override // Fc.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return false;
    }

    @Override // Fc.m
    public final boolean b() {
        boolean z2 = Ec.e.f2145d;
        return Ec.e.f2145d;
    }

    @Override // Fc.m
    public final String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // Fc.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Ec.n nVar = Ec.n.f2161a;
            Object[] array = C2.i.t(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException(StubApp.getString2(11601));
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
