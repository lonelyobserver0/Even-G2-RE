package wc;

import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import n.Q0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final k f22393e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f22394f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22395a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22396b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f22397c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f22398d;

    static {
        C1891h c1891h = C1891h.f22388r;
        C1891h c1891h2 = C1891h.f22389s;
        C1891h c1891h3 = C1891h.f22390t;
        C1891h c1891h4 = C1891h.f22382l;
        C1891h c1891h5 = C1891h.f22384n;
        C1891h c1891h6 = C1891h.f22383m;
        C1891h c1891h7 = C1891h.f22385o;
        C1891h c1891h8 = C1891h.f22387q;
        C1891h c1891h9 = C1891h.f22386p;
        C1891h[] c1891hArr = {c1891h, c1891h2, c1891h3, c1891h4, c1891h5, c1891h6, c1891h7, c1891h8, c1891h9};
        C1891h[] c1891hArr2 = {c1891h, c1891h2, c1891h3, c1891h4, c1891h5, c1891h6, c1891h7, c1891h8, c1891h9, C1891h.j, C1891h.f22381k, C1891h.f22379h, C1891h.f22380i, C1891h.f22377f, C1891h.f22378g, C1891h.f22376e};
        Q0 q02 = new Q0();
        q02.c((C1891h[]) Arrays.copyOf(c1891hArr, 9));
        EnumC1883H enumC1883H = EnumC1883H.f22340b;
        EnumC1883H enumC1883H2 = EnumC1883H.f22341c;
        q02.e(enumC1883H, enumC1883H2);
        boolean z2 = q02.f17457a;
        String string2 = StubApp.getString2(35551);
        if (!z2) {
            throw new IllegalArgumentException(string2);
        }
        q02.f17458b = true;
        q02.a();
        Q0 q03 = new Q0();
        q03.c((C1891h[]) Arrays.copyOf(c1891hArr2, 16));
        q03.e(enumC1883H, enumC1883H2);
        if (!q03.f17457a) {
            throw new IllegalArgumentException(string2);
        }
        q03.f17458b = true;
        f22393e = q03.a();
        Q0 q04 = new Q0();
        q04.c((C1891h[]) Arrays.copyOf(c1891hArr2, 16));
        q04.e(enumC1883H, enumC1883H2, EnumC1883H.f22342d, EnumC1883H.f22343e);
        if (!q04.f17457a) {
            throw new IllegalArgumentException(string2);
        }
        q04.f17458b = true;
        q04.a();
        f22394f = new k(false, false, null, null);
    }

    public k(boolean z2, boolean z10, String[] strArr, String[] strArr2) {
        this.f22395a = z2;
        this.f22396b = z10;
        this.f22397c = strArr;
        this.f22398d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f22397c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C1891h.f22373b.c(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean b(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f22395a) {
            return false;
        }
        String[] strArr = this.f22398d;
        if (strArr != null && !xc.b.j(strArr, socket.getEnabledProtocols(), ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.f22397c;
        return strArr2 == null || xc.b.j(strArr2, socket.getEnabledCipherSuites(), C1891h.f22374c);
    }

    public final List c() {
        String[] strArr = this.f22398d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(L1.m(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        k kVar = (k) obj;
        boolean z2 = kVar.f22395a;
        boolean z10 = this.f22395a;
        if (z10 != z2) {
            return false;
        }
        if (z10) {
            return Arrays.equals(this.f22397c, kVar.f22397c) && Arrays.equals(this.f22398d, kVar.f22398d) && this.f22396b == kVar.f22396b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f22395a) {
            return 17;
        }
        String[] strArr = this.f22397c;
        int hashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f22398d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f22396b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f22395a) {
            return StubApp.getString2(35552);
        }
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(35553));
        List a3 = a();
        String string2 = StubApp.getString2(35554);
        sb2.append((Object) Objects.toString(a3, string2));
        sb2.append(StubApp.getString2(35555));
        sb2.append((Object) Objects.toString(c(), string2));
        sb2.append(StubApp.getString2(35556));
        sb2.append(this.f22396b);
        sb2.append(')');
        return sb2.toString();
    }
}
