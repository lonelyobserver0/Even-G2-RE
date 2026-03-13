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
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class e extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2145d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f2146c = new BouncyCastleJsseProvider();

    static {
        boolean z2 = false;
        try {
            Class.forName(StubApp.getString2("25233"), false, d.class.getClassLoader());
            z2 = true;
        } catch (ClassNotFoundException unused) {
        }
        f2145d = z2;
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
        SSLContext sSLContext = SSLContext.getInstance(StubApp.getString2(25234), this.f2146c);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // Ec.n
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(StubApp.getString2(25235), StubApp.getString2(25236));
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
