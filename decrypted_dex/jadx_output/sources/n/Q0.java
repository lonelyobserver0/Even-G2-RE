package n;

import com.stub.StubApp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import wc.C1891h;
import wc.EnumC1883H;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17457a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17458b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17459c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f17460d;

    public wc.k a() {
        return new wc.k(this.f17457a, this.f17458b, (String[]) this.f17459c, (String[]) this.f17460d);
    }

    public void b(String... cipherSuites) {
        Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
        if (!this.f17457a) {
            throw new IllegalArgumentException(StubApp.getString2(21238));
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException(StubApp.getString2(21237));
        }
        this.f17459c = (String[]) cipherSuites.clone();
    }

    public void c(C1891h... cipherSuites) {
        Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
        if (!this.f17457a) {
            throw new IllegalArgumentException(StubApp.getString2(21238));
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (C1891h c1891h : cipherSuites) {
            arrayList.add(c1891h.f22391a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException(StubApp.getString2(11601));
        }
        String[] strArr = (String[]) array;
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... tlsVersions) {
        Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
        if (!this.f17457a) {
            throw new IllegalArgumentException(StubApp.getString2(21240));
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException(StubApp.getString2(21239));
        }
        this.f17460d = (String[]) tlsVersions.clone();
    }

    public void e(EnumC1883H... tlsVersions) {
        Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
        if (!this.f17457a) {
            throw new IllegalArgumentException(StubApp.getString2(21240));
        }
        ArrayList arrayList = new ArrayList(tlsVersions.length);
        for (EnumC1883H enumC1883H : tlsVersions) {
            arrayList.add(enumC1883H.f22346a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException(StubApp.getString2(11601));
        }
        String[] strArr = (String[]) array;
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
