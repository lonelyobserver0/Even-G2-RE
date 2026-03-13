package o0;

import r0.AbstractC1560u;

/* renamed from: o0.r, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1443r {

    /* renamed from: a, reason: collision with root package name */
    public final long f18237a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18238b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18239c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18240d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18241e;

    static {
        new C1442q().a();
        AbstractC1560u.E(0);
        AbstractC1560u.E(1);
        AbstractC1560u.E(2);
        AbstractC1560u.E(3);
        AbstractC1560u.E(4);
    }

    public C1443r(C1442q c1442q) {
        long j = c1442q.f18232a;
        long j3 = c1442q.f18233b;
        long j10 = c1442q.f18234c;
        float f10 = c1442q.f18235d;
        float f11 = c1442q.f18236e;
        this.f18237a = j;
        this.f18238b = j3;
        this.f18239c = j10;
        this.f18240d = f10;
        this.f18241e = f11;
    }

    public final C1442q a() {
        C1442q c1442q = new C1442q();
        c1442q.f18232a = this.f18237a;
        c1442q.f18233b = this.f18238b;
        c1442q.f18234c = this.f18239c;
        c1442q.f18235d = this.f18240d;
        c1442q.f18236e = this.f18241e;
        return c1442q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1443r)) {
            return false;
        }
        C1443r c1443r = (C1443r) obj;
        return this.f18237a == c1443r.f18237a && this.f18238b == c1443r.f18238b && this.f18239c == c1443r.f18239c && this.f18240d == c1443r.f18240d && this.f18241e == c1443r.f18241e;
    }

    public final int hashCode() {
        long j = this.f18237a;
        long j3 = this.f18238b;
        int i3 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j10 = this.f18239c;
        int i10 = (i3 + ((int) ((j10 >>> 32) ^ j10))) * 31;
        float f10 = this.f18240d;
        int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f18241e;
        return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }
}
