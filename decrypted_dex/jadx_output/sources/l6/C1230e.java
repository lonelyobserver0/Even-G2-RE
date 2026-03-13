package l6;

import N5.p;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: l6.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1230e {

    /* renamed from: f, reason: collision with root package name */
    public static final C1229d f16725f = new C1229d();

    /* renamed from: a, reason: collision with root package name */
    public final T5.b f16726a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16728c;

    /* renamed from: e, reason: collision with root package name */
    public final p f16730e;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16727b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final int[] f16729d = new int[5];

    public C1230e(T5.b bVar, p pVar) {
        this.f16726a = bVar;
        this.f16730e = pVar;
    }

    public static float a(int i3, int[] iArr) {
        return ((i3 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i3 < 5) {
                int i11 = iArr[i3];
                if (i11 == 0) {
                    break;
                }
                i10 += i11;
                i3++;
            } else if (i10 >= 7) {
                float f10 = i10 / 7.0f;
                float f11 = f10 / 2.0f;
                if (Math.abs(f10 - iArr[0]) >= f11 || Math.abs(f10 - iArr[1]) >= f11 || Math.abs((f10 * 3.0f) - iArr[2]) >= 3.0f * f11 || Math.abs(f10 - iArr[3]) >= f11 || Math.abs(f10 - iArr[4]) >= f11) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static double e(C1228c c1228c, C1228c c1228c2) {
        double d8 = c1228c.f4926a - c1228c2.f4926a;
        double d10 = c1228c.f4927b - c1228c2.f4927b;
        return (d10 * d10) + (d8 * d8);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r20, int r21, int[] r22) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.C1230e.c(int, int, int[]):boolean");
    }

    public final boolean d() {
        ArrayList arrayList = this.f16727b;
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        float f10 = 0.0f;
        int i3 = 0;
        float f11 = 0.0f;
        while (it.hasNext()) {
            C1228c c1228c = (C1228c) it.next();
            if (c1228c.f16724d >= 2) {
                i3++;
                f11 += c1228c.f16723c;
            }
        }
        if (i3 >= 3) {
            float f12 = f11 / size;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                f10 += Math.abs(((C1228c) it2.next()).f16723c - f12);
            }
            if (f10 <= f11 * 0.05f) {
                return true;
            }
        }
        return false;
    }
}
