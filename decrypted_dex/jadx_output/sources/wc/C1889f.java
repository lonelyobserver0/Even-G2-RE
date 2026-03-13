package wc;

import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wc.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1889f {

    /* renamed from: c, reason: collision with root package name */
    public static final C1889f f22370c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f22371a;

    /* renamed from: b, reason: collision with root package name */
    public final L1 f22372b;

    static {
        Set set;
        set = CollectionsKt___CollectionsKt.toSet(new ArrayList());
        f22370c = new C1889f(set, null);
    }

    public C1889f(Set pins, L1 l12) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f22371a = pins;
        this.f22372b = l12;
    }

    public final void a(String hostname, Function0 cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        List emptyList = CollectionsKt.emptyList();
        Iterator it = this.f22371a.iterator();
        if (it.hasNext()) {
            throw com.mapbox.common.b.e(it);
        }
        if (emptyList.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it2 = emptyList.iterator();
            if (it2.hasNext()) {
                throw com.mapbox.common.b.e(it2);
            }
        }
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(35430));
        for (X509Certificate x509Certificate2 : list) {
            sb2.append(StubApp.getString2(13819));
            sb2.append(Y3.a.r(x509Certificate2));
            sb2.append(StubApp.getString2(994));
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append(StubApp.getString2(35431));
        sb2.append(hostname);
        sb2.append(StubApp.getString2(478));
        Iterator it3 = emptyList.iterator();
        while (it3.hasNext()) {
            if (it3.next() != null) {
                throw new ClassCastException();
            }
            sb2.append(StubApp.getString2(35432));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1889f)) {
            return false;
        }
        C1889f c1889f = (C1889f) obj;
        return Intrinsics.areEqual(c1889f.f22371a, this.f22371a) && Intrinsics.areEqual(c1889f.f22372b, this.f22372b);
    }

    public final int hashCode() {
        int hashCode = (this.f22371a.hashCode() + 1517) * 41;
        L1 l12 = this.f22372b;
        return hashCode + (l12 != null ? l12.hashCode() : 0);
    }
}
