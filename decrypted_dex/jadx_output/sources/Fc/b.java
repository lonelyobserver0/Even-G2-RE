package Fc;

import android.net.http.X509TrustManagerExtensions;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class b extends L1 {

    /* renamed from: d, reason: collision with root package name */
    public final X509TrustManager f2353d;

    /* renamed from: e, reason: collision with root package name */
    public final X509TrustManagerExtensions f2354e;

    public b(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f2353d = trustManager;
        this.f2354e = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f2353d == this.f2353d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2353d);
    }

    @Override // com.google.android.gms.internal.measurement.L1
    public final List k(String hostname, List chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException(StubApp.getString2(11601));
        }
        try {
            List<X509Certificate> checkServerTrusted = this.f2354e.checkServerTrusted((X509Certificate[]) array, StubApp.getString2("24659"), hostname);
            Intrinsics.checkNotNullExpressionValue(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }
}
