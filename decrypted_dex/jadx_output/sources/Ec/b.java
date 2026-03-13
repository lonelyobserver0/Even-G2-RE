package Ec;

import com.stub.StubApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class b implements Ic.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f2137a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2138b;

    public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
        this.f2137a = trustManager;
        this.f2138b = findByIssuerAndSignatureMethod;
    }

    @Override // Ic.d
    public final X509Certificate a(X509Certificate cert) {
        Intrinsics.checkNotNullParameter(cert, "cert");
        try {
            Object invoke = this.f2138b.invoke(this.f2137a, cert);
            if (invoke != null) {
                return ((TrustAnchor) invoke).getTrustedCert();
            }
            throw new NullPointerException(StubApp.getString2("25211"));
        } catch (IllegalAccessException e10) {
            throw new AssertionError(StubApp.getString2(25212), e10);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f2137a, bVar.f2137a) && Intrinsics.areEqual(this.f2138b, bVar.f2138b);
    }

    public final int hashCode() {
        return this.f2138b.hashCode() + (this.f2137a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(25213) + this.f2137a + StubApp.getString2(25214) + this.f2138b + ')';
    }
}
