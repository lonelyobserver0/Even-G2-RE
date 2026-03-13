package o0;

import android.net.Uri;
import java.util.Arrays;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1426a {

    /* renamed from: a, reason: collision with root package name */
    public final int f18117a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18118b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri[] f18119c;

    /* renamed from: d, reason: collision with root package name */
    public final C1447v[] f18120d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f18121e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f18122f;

    static {
        i2.u.A(0, 1, 2, 3, 4);
        AbstractC1560u.E(5);
        AbstractC1560u.E(6);
        AbstractC1560u.E(7);
        AbstractC1560u.E(8);
    }

    public C1426a(int i3, int i10, int[] iArr, C1447v[] c1447vArr, long[] jArr) {
        Uri uri;
        int i11 = 0;
        AbstractC1550k.c(iArr.length == c1447vArr.length);
        this.f18117a = i3;
        this.f18118b = i10;
        this.f18121e = iArr;
        this.f18120d = c1447vArr;
        this.f18122f = jArr;
        this.f18119c = new Uri[c1447vArr.length];
        while (true) {
            Uri[] uriArr = this.f18119c;
            if (i11 >= uriArr.length) {
                return;
            }
            C1447v c1447v = c1447vArr[i11];
            if (c1447v == null) {
                uri = null;
            } else {
                C1444s c1444s = c1447v.f18249b;
                c1444s.getClass();
                uri = c1444s.f18242a;
            }
            uriArr[i11] = uri;
            i11++;
        }
    }

    public final int a(int i3) {
        int i10;
        int i11 = i3 + 1;
        while (true) {
            int[] iArr = this.f18121e;
            if (i11 >= iArr.length || (i10 = iArr[i11]) == 0 || i10 == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1426a.class != obj.getClass()) {
            return false;
        }
        C1426a c1426a = (C1426a) obj;
        return this.f18117a == c1426a.f18117a && this.f18118b == c1426a.f18118b && Arrays.equals(this.f18120d, c1426a.f18120d) && Arrays.equals(this.f18121e, c1426a.f18121e) && Arrays.equals(this.f18122f, c1426a.f18122f);
    }

    public final int hashCode() {
        int i3 = ((this.f18117a * 31) + this.f18118b) * 31;
        int i10 = (int) 0;
        return (((Arrays.hashCode(this.f18122f) + ((Arrays.hashCode(this.f18121e) + ((Arrays.hashCode(this.f18120d) + ((i3 + i10) * 31)) * 31)) * 31)) * 31) + i10) * 31;
    }
}
