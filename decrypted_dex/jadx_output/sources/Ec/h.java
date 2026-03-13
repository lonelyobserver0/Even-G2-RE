package Ec;

import com.stub.StubApp;
import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import wc.y;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class h extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2148d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f2149c;

    static {
        boolean z2 = false;
        try {
            Class.forName(StubApp.getString2("25238"), false, f.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (f.a()) {
                    z2 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f2148d = z2;
    }

    public h() {
        Provider newProvider = Conscrypt.newProvider();
        Intrinsics.checkNotNullExpressionValue(newProvider, "newProvider()");
        this.f2149c = newProvider;
    }

    @Override // Ec.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.d(sslSocket, str, protocols);
            return;
        }
        Conscrypt.setUseSessionTickets(sslSocket, true);
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((y) obj) != y.f22485b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((y) it.next()).f22492a);
        }
        Object[] array = arrayList2.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException(StubApp.getString2(11601));
        }
        Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
    }

    @Override // Ec.n
    public final String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    @Override // Ec.n
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance(StubApp.getString2(25234), this.f2149c);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // Ec.n
    public final SSLSocketFactory l(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext k3 = k();
        k3.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = k3.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // Ec.n
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager == null) {
                    throw new NullPointerException(StubApp.getString2(25237));
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, g.f2147a);
                return x509TrustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        throw new IllegalStateException(Intrinsics.stringPlus("Unexpected default trust managers: ", arrays).toString());
    }
}
