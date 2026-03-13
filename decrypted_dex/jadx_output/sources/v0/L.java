package v0;

import java.util.Objects;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final L0.B f21607a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21608b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21609c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21610d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21611e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f21612f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21613g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f21614h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f21615i;

    public L(L0.B b2, long j, long j3, long j10, long j11, boolean z2, boolean z10, boolean z11, boolean z12) {
        boolean z13 = true;
        AbstractC1550k.c(!z12 || z10);
        AbstractC1550k.c(!z11 || z10);
        if (z2 && (z10 || z11 || z12)) {
            z13 = false;
        }
        AbstractC1550k.c(z13);
        this.f21607a = b2;
        this.f21608b = j;
        this.f21609c = j3;
        this.f21610d = j10;
        this.f21611e = j11;
        this.f21612f = z2;
        this.f21613g = z10;
        this.f21614h = z11;
        this.f21615i = z12;
    }

    public final L a(long j) {
        if (j == this.f21609c) {
            return this;
        }
        return new L(this.f21607a, this.f21608b, j, this.f21610d, this.f21611e, this.f21612f, this.f21613g, this.f21614h, this.f21615i);
    }

    public final L b(long j) {
        if (j == this.f21608b) {
            return this;
        }
        return new L(this.f21607a, j, this.f21609c, this.f21610d, this.f21611e, this.f21612f, this.f21613g, this.f21614h, this.f21615i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && L.class == obj.getClass()) {
            L l9 = (L) obj;
            if (this.f21608b == l9.f21608b && this.f21609c == l9.f21609c && this.f21610d == l9.f21610d && this.f21611e == l9.f21611e && this.f21612f == l9.f21612f && this.f21613g == l9.f21613g && this.f21614h == l9.f21614h && this.f21615i == l9.f21615i) {
                int i3 = AbstractC1560u.f20190a;
                if (Objects.equals(this.f21607a, l9.f21607a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f21607a.hashCode() + 527) * 31) + ((int) this.f21608b)) * 31) + ((int) this.f21609c)) * 31) + ((int) this.f21610d)) * 31) + ((int) this.f21611e)) * 31) + (this.f21612f ? 1 : 0)) * 31) + (this.f21613g ? 1 : 0)) * 31) + (this.f21614h ? 1 : 0)) * 31) + (this.f21615i ? 1 : 0);
    }
}
