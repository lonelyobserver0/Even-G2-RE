package wc;

import com.stub.StubApp;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1883H f22413a;

    /* renamed from: b, reason: collision with root package name */
    public final C1891h f22414b;

    /* renamed from: c, reason: collision with root package name */
    public final List f22415c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f22416d;

    public r(EnumC1883H tlsVersion, C1891h cipherSuite, List localCertificates, Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f22413a = tlsVersion;
        this.f22414b = cipherSuite;
        this.f22415c = localCertificates;
        this.f22416d = LazyKt.lazy(new X.e(peerCertificatesFn, 1));
    }

    public final List a() {
        return (List) this.f22416d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f22413a == this.f22413a && Intrinsics.areEqual(rVar.f22414b, this.f22414b) && Intrinsics.areEqual(rVar.a(), a()) && Intrinsics.areEqual(rVar.f22415c, this.f22415c);
    }

    public final int hashCode() {
        return this.f22415c.hashCode() + ((a().hashCode() + ((this.f22414b.hashCode() + ((this.f22413a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String string2;
        String type;
        String type2;
        List a3 = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.f(a3));
        Iterator it = a3.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            string2 = StubApp.getString2(660);
            if (!hasNext) {
                break;
            }
            Certificate certificate = (Certificate) it.next();
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Intrinsics.checkNotNullExpressionValue(type2, string2);
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(35570));
        sb2.append(this.f22413a);
        sb2.append(StubApp.getString2(24993));
        sb2.append(this.f22414b);
        sb2.append(StubApp.getString2(35571));
        sb2.append(obj);
        sb2.append(StubApp.getString2(35572));
        List<Certificate> list = this.f22415c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Intrinsics.checkNotNullExpressionValue(type, string2);
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
