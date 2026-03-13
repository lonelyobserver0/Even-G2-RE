package Ec;

import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile n f2161a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f2162b;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00da, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010a, code lost:
    
        if (java.lang.Integer.parseInt(r3) >= 9) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d  */
    static {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ec.n.<clinit>():void");
    }

    public static void i(String message, int i3, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        f2162b.log(i3 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    public L1 b(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new Ic.a(c(trustManager));
    }

    public Ic.d c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new Ic.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public void e(Socket socket, InetSocketAddress address, int i3) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i3);
    }

    public String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public Object g() {
        Intrinsics.checkNotNullParameter("response.body().close()", StubApp.getString2(25275));
        if (f2162b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void j(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = Intrinsics.stringPlus(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(message, 5, (Throwable) obj);
    }

    public SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance(StubApp.getString2(25234));
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext k3 = k();
            k3.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = k3.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError(Intrinsics.stringPlus("No System TLS: ", e10), e10);
        }
    }

    public X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
