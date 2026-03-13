package w0;

import L0.B;
import f5.u0;
import java.util.Arrays;
import o0.AbstractC1416M;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f21979a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1416M f21980b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21981c;

    /* renamed from: d, reason: collision with root package name */
    public final B f21982d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21983e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1416M f21984f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21985g;

    /* renamed from: h, reason: collision with root package name */
    public final B f21986h;

    /* renamed from: i, reason: collision with root package name */
    public final long f21987i;
    public final long j;

    public a(long j, AbstractC1416M abstractC1416M, int i3, B b2, long j3, AbstractC1416M abstractC1416M2, int i10, B b10, long j10, long j11) {
        this.f21979a = j;
        this.f21980b = abstractC1416M;
        this.f21981c = i3;
        this.f21982d = b2;
        this.f21983e = j3;
        this.f21984f = abstractC1416M2;
        this.f21985g = i10;
        this.f21986h = b10;
        this.f21987i = j10;
        this.j = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f21979a == aVar.f21979a && this.f21981c == aVar.f21981c && this.f21983e == aVar.f21983e && this.f21985g == aVar.f21985g && this.f21987i == aVar.f21987i && this.j == aVar.j && u0.j(this.f21980b, aVar.f21980b) && u0.j(this.f21982d, aVar.f21982d) && u0.j(this.f21984f, aVar.f21984f) && u0.j(this.f21986h, aVar.f21986h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f21979a), this.f21980b, Integer.valueOf(this.f21981c), this.f21982d, Long.valueOf(this.f21983e), this.f21984f, Integer.valueOf(this.f21985g), this.f21986h, Long.valueOf(this.f21987i), Long.valueOf(this.j)});
    }
}
