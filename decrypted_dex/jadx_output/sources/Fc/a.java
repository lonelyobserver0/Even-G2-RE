package Fc;

import android.net.ssl.SSLSockets;
import android.os.Build;
import com.stub.StubApp;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a implements m {
    @Override // Fc.m
    public final boolean a(SSLSocket sslSocket) {
        boolean isSupportedSocket;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        isSupportedSocket = SSLSockets.isSupportedSocket(sslSocket);
        return isSupportedSocket;
    }

    @Override // Fc.m
    public final boolean b() {
        Ec.n nVar = Ec.n.f2161a;
        return C2.i.y() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // Fc.m
    public final String c(SSLSocket sslSocket) {
        String applicationProtocol;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // Fc.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            Ec.n nVar = Ec.n.f2161a;
            Object[] array = C2.i.t(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException(StubApp.getString2("11601"));
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException(StubApp.getString2(25276), e10);
        }
    }
}
