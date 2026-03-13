package Ec;

import com.stub.StubApp;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.openjsse.net.ssl.OpenJSSE;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class m extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2159d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f2160c = new OpenJSSE();

    static {
        boolean z2 = false;
        try {
            Class.forName(StubApp.getString2("25273"), false, l.class.getClassLoader());
            z2 = true;
        } catch (ClassNotFoundException unused) {
        }
        f2159d = z2;
    }

    @Override // Ec.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        super.d(sslSocket, str, protocols);
    }

    @Override // Ec.n
    public final String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    @Override // Ec.n
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance(StubApp.getString2(11731), this.f2160c);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // Ec.n
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f2160c);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new NullPointerException(StubApp.getString2(25237));
            }
        }
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        throw new IllegalStateException(Intrinsics.stringPlus("Unexpected default trust managers: ", arrays).toString());
    }
}
