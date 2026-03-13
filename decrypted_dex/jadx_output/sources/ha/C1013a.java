package ha;

import Xa.h;
import java.io.Serializable;

/* renamed from: ha.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1013a implements Cloneable, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public double f14471a;

    /* renamed from: b, reason: collision with root package name */
    public double f14472b;

    /* renamed from: c, reason: collision with root package name */
    public double f14473c;

    /* renamed from: d, reason: collision with root package name */
    public double f14474d;

    /* renamed from: e, reason: collision with root package name */
    public double f14475e;

    /* renamed from: f, reason: collision with root package name */
    public double f14476f;

    public final void a() {
        double d8 = this.f14471a;
        double d10 = this.f14473c;
        double d11 = 0.0d * d10;
        double d12 = (1000.0d * d8) + d11;
        double d13 = this.f14472b;
        double d14 = this.f14474d;
        double d15 = 0.0d * d14;
        double d16 = d15 + (1000.0d * d13);
        double d17 = d8 * 0.0d;
        double d18 = (d10 * 1000.0d) + d17;
        double d19 = d13 * 0.0d;
        double d20 = d11 + d17 + this.f14475e;
        double d21 = d15 + d19 + this.f14476f;
        this.f14471a = d12;
        this.f14472b = d16;
        this.f14473c = d18;
        this.f14474d = (d14 * 1000.0d) + d19;
        this.f14475e = d20;
        this.f14476f = d21;
    }

    public final void b(float[] fArr, float[] fArr2) {
        int i3 = 0;
        int i10 = 1;
        int i11 = 0;
        while (true) {
            i10--;
            if (i10 < 0) {
                return;
            }
            float f10 = fArr[i3];
            double d8 = f10;
            double d10 = fArr[i3 + 1];
            fArr2[i11] = (float) ((this.f14473c * d10) + (this.f14471a * d8) + this.f14475e);
            fArr2[i11 + 1] = (float) ((d10 * this.f14474d) + (d8 * this.f14472b) + this.f14476f);
            i3 += 2;
            i11 += 2;
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1013a) {
            C1013a c1013a = (C1013a) obj;
            if (this.f14471a == c1013a.f14471a && this.f14473c == c1013a.f14473c && this.f14475e == c1013a.f14475e && this.f14472b == c1013a.f14472b && this.f14474d == c1013a.f14474d && this.f14476f == c1013a.f14476f) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        h.w(C1013a.class, sb2, "[[");
        sb2.append(this.f14471a);
        sb2.append(", ");
        sb2.append(this.f14473c);
        sb2.append(", ");
        sb2.append(this.f14475e);
        sb2.append("], [");
        sb2.append(this.f14472b);
        sb2.append(", ");
        sb2.append(this.f14474d);
        sb2.append(", ");
        sb2.append(this.f14476f);
        sb2.append("]]");
        return sb2.toString();
    }
}
