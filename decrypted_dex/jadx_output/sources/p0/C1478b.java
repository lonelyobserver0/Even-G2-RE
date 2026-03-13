package p0;

import com.stub.StubApp;
import java.util.Arrays;
import r0.AbstractC1560u;

/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1478b {

    /* renamed from: e, reason: collision with root package name */
    public static final C1478b f19606e = new C1478b(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f19607a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19608b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19609c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19610d;

    public C1478b(int i3, int i10, int i11) {
        this.f19607a = i3;
        this.f19608b = i10;
        this.f19609c = i11;
        this.f19610d = AbstractC1560u.F(i11) ? AbstractC1560u.z(i11, i10) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1478b)) {
            return false;
        }
        C1478b c1478b = (C1478b) obj;
        return this.f19607a == c1478b.f19607a && this.f19608b == c1478b.f19608b && this.f19609c == c1478b.f19609c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19607a), Integer.valueOf(this.f19608b), Integer.valueOf(this.f19609c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(22069));
        sb2.append(this.f19607a);
        sb2.append(StubApp.getString2(22070));
        sb2.append(this.f19608b);
        sb2.append(StubApp.getString2(17389));
        return com.mapbox.common.b.j(sb2, this.f19609c, ']');
    }
}
