package l6;

import N5.p;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: l6.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1227b {

    /* renamed from: a, reason: collision with root package name */
    public final T5.b f16714a;

    /* renamed from: c, reason: collision with root package name */
    public final int f16716c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16717d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16718e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16719f;

    /* renamed from: g, reason: collision with root package name */
    public final float f16720g;

    /* renamed from: i, reason: collision with root package name */
    public final p f16722i;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16715b = new ArrayList(5);

    /* renamed from: h, reason: collision with root package name */
    public final int[] f16721h = new int[3];

    public C1227b(T5.b bVar, int i3, int i10, int i11, int i12, float f10, p pVar) {
        this.f16714a = bVar;
        this.f16716c = i3;
        this.f16717d = i10;
        this.f16718e = i11;
        this.f16719f = i12;
        this.f16720g = f10;
        this.f16722i = pVar;
    }

    public final boolean a(int[] iArr) {
        float f10 = this.f16720g;
        float f11 = f10 / 2.0f;
        for (int i3 = 0; i3 < 3; i3++) {
            if (Math.abs(f10 - iArr[i3]) >= f11) {
                return false;
            }
        }
        return true;
    }

    public final C1226a b(int i3, int i10, int[] iArr) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = i11 + i12 + iArr[2];
        float f10 = (i10 - r5) - (i12 / 2.0f);
        int i14 = (int) f10;
        int i15 = i12 * 2;
        T5.b bVar = this.f16714a;
        int i16 = bVar.f7184b;
        int[] iArr2 = this.f16721h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i17 = i3;
        while (i17 >= 0 && bVar.b(i14, i17)) {
            int i18 = iArr2[1];
            if (i18 > i15) {
                break;
            }
            iArr2[1] = i18 + 1;
            i17--;
        }
        float f11 = Float.NaN;
        if (i17 >= 0 && iArr2[1] <= i15) {
            while (i17 >= 0 && !bVar.b(i14, i17)) {
                int i19 = iArr2[0];
                if (i19 > i15) {
                    break;
                }
                iArr2[0] = i19 + 1;
                i17--;
            }
            if (iArr2[0] <= i15) {
                int i20 = i3 + 1;
                while (i20 < i16 && bVar.b(i14, i20)) {
                    int i21 = iArr2[1];
                    if (i21 > i15) {
                        break;
                    }
                    iArr2[1] = i21 + 1;
                    i20++;
                }
                if (i20 != i16 && iArr2[1] <= i15) {
                    while (i20 < i16 && !bVar.b(i14, i20)) {
                        int i22 = iArr2[2];
                        if (i22 > i15) {
                            break;
                        }
                        iArr2[2] = i22 + 1;
                        i20++;
                    }
                    int i23 = iArr2[2];
                    if (i23 <= i15 && Math.abs(((iArr2[0] + iArr2[1]) + i23) - i13) * 5 < i13 * 2 && a(iArr2)) {
                        f11 = (i20 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (Float.isNaN(f11)) {
            return null;
        }
        float f12 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        ArrayList arrayList = this.f16715b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1226a c1226a = (C1226a) it.next();
            if (Math.abs(f11 - c1226a.f4927b) <= f12) {
                float f13 = c1226a.f4926a;
                if (Math.abs(f10 - f13) <= f12) {
                    float f14 = c1226a.f16713c;
                    float abs = Math.abs(f12 - f14);
                    if (abs <= 1.0f || abs <= f14) {
                        return new C1226a((f13 + f10) / 2.0f, (c1226a.f4927b + f11) / 2.0f, (f14 + f12) / 2.0f);
                    }
                } else {
                    continue;
                }
            }
        }
        C1226a c1226a2 = new C1226a(f10, f11, f12);
        arrayList.add(c1226a2);
        p pVar = this.f16722i;
        if (pVar == null) {
            return null;
        }
        pVar.a(c1226a2);
        return null;
    }
}
