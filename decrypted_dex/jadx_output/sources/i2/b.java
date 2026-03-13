package i2;

import java.util.HashSet;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b {

    /* renamed from: i, reason: collision with root package name */
    public static final b f14717i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14719b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14720c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14721d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14722e;

    /* renamed from: a, reason: collision with root package name */
    public int f14718a = 1;

    /* renamed from: f, reason: collision with root package name */
    public long f14723f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f14724g = -1;

    /* renamed from: h, reason: collision with root package name */
    public d f14725h = new d();

    static {
        d dVar = new d();
        b bVar = new b();
        bVar.f14718a = 1;
        bVar.f14723f = -1L;
        bVar.f14724g = -1L;
        new HashSet();
        bVar.f14719b = false;
        bVar.f14720c = false;
        bVar.f14718a = 1;
        bVar.f14721d = false;
        bVar.f14722e = false;
        bVar.f14725h = dVar;
        bVar.f14723f = -1L;
        bVar.f14724g = -1L;
        f14717i = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f14719b == bVar.f14719b && this.f14720c == bVar.f14720c && this.f14721d == bVar.f14721d && this.f14722e == bVar.f14722e && this.f14723f == bVar.f14723f && this.f14724g == bVar.f14724g && this.f14718a == bVar.f14718a) {
            return this.f14725h.equals(bVar.f14725h);
        }
        return false;
    }

    public final int hashCode() {
        int c10 = ((((((((AbstractC1856e.c(this.f14718a) * 31) + (this.f14719b ? 1 : 0)) * 31) + (this.f14720c ? 1 : 0)) * 31) + (this.f14721d ? 1 : 0)) * 31) + (this.f14722e ? 1 : 0)) * 31;
        long j = this.f14723f;
        int i3 = (c10 + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.f14724g;
        return this.f14725h.f14728a.hashCode() + ((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }
}
