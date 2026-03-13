package o0;

import r0.AbstractC1560u;

/* renamed from: o0.W, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1425W {

    /* renamed from: d, reason: collision with root package name */
    public static final C1425W f18113d = new C1425W(1.0f, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f18114a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18115b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18116c;

    static {
        AbstractC1560u.E(0);
        AbstractC1560u.E(1);
        AbstractC1560u.E(3);
    }

    public C1425W(float f10, int i3, int i10) {
        this.f18114a = i3;
        this.f18115b = i10;
        this.f18116c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1425W) {
            C1425W c1425w = (C1425W) obj;
            if (this.f18114a == c1425w.f18114a && this.f18115b == c1425w.f18115b && this.f18116c == c1425w.f18116c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f18116c) + ((((217 + this.f18114a) * 31) + this.f18115b) * 31);
    }
}
