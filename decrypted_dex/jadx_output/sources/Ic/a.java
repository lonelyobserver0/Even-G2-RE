package Ic;

import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import i2.u;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a extends L1 {

    /* renamed from: d, reason: collision with root package name */
    public final d f3250d;

    public a(d trustRootIndex) {
        Intrinsics.checkNotNullParameter(trustRootIndex, "trustRootIndex");
        this.f3250d = trustRootIndex;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(((a) obj).f3250d, this.f3250d);
    }

    public final int hashCode() {
        return this.f3250d.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.L1
    public final List k(String hostname, List chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        Intrinsics.checkNotNullExpressionValue(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i3 = 0;
        boolean z2 = false;
        while (i3 < 9) {
            i3++;
            X509Certificate x509Certificate = (X509Certificate) u.j(1, arrayList);
            X509Certificate a3 = this.f3250d.a(x509Certificate);
            if (a3 == null) {
                Iterator it = arrayDeque.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException(StubApp.getString2(25289));
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (Intrinsics.areEqual(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (!z2) {
                    throw new SSLPeerUnverifiedException(Intrinsics.stringPlus("Failed to find a trusted cert that signed ", x509Certificate));
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !Intrinsics.areEqual(x509Certificate, a3)) {
                arrayList.add(a3);
            }
            if (Intrinsics.areEqual(a3.getIssuerDN(), a3.getSubjectDN())) {
                try {
                    a3.verify(a3.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z2 = true;
        }
        throw new SSLPeerUnverifiedException(Intrinsics.stringPlus("Certificate chain too long: ", arrayList));
    }
}
