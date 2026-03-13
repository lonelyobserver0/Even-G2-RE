package F;

import android.graphics.Insets;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f2164e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2165a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2166b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2167c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2168d;

    public c(int i3, int i10, int i11, int i12) {
        this.f2165a = i3;
        this.f2166b = i10;
        this.f2167c = i11;
        this.f2168d = i12;
    }

    public static c a(int i3, int i10, int i11, int i12) {
        return (i3 == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? f2164e : new c(i3, i10, i11, i12);
    }

    public static c b(Insets insets) {
        int i3;
        int i10;
        int i11;
        int i12;
        i3 = insets.left;
        i10 = insets.top;
        i11 = insets.right;
        i12 = insets.bottom;
        return a(i3, i10, i11, i12);
    }

    public final Insets c() {
        return b.a(this.f2165a, this.f2166b, this.f2167c, this.f2168d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2168d == cVar.f2168d && this.f2165a == cVar.f2165a && this.f2167c == cVar.f2167c && this.f2166b == cVar.f2166b;
    }

    public final int hashCode() {
        return (((((this.f2165a * 31) + this.f2166b) * 31) + this.f2167c) * 31) + this.f2168d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1982));
        sb2.append(this.f2165a);
        sb2.append(StubApp.getString2(1983));
        sb2.append(this.f2166b);
        sb2.append(StubApp.getString2(1984));
        sb2.append(this.f2167c);
        sb2.append(StubApp.getString2(1985));
        return com.mapbox.common.b.j(sb2, this.f2168d, '}');
    }
}
