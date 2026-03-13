package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class M2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0629i2 f11311a;

    static {
        I2 i22 = I2.f11287c;
        f11311a = new C0629i2(6);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, Object obj2) {
        AbstractC0639k2 abstractC0639k2 = (AbstractC0639k2) obj;
        P2 p22 = abstractC0639k2.zzc;
        P2 p23 = ((AbstractC0639k2) obj2).zzc;
        P2 p24 = P2.f11341f;
        if (!p24.equals(p23)) {
            if (p24.equals(p22)) {
                int i3 = p22.f11342a + p23.f11342a;
                int[] copyOf = Arrays.copyOf(p22.f11343b, i3);
                System.arraycopy(p23.f11343b, 0, copyOf, p22.f11342a, p23.f11342a);
                Object[] copyOf2 = Arrays.copyOf(p22.f11344c, i3);
                System.arraycopy(p23.f11344c, 0, copyOf2, p22.f11342a, p23.f11342a);
                p22 = new P2(i3, copyOf, copyOf2, true);
            } else {
                p22.getClass();
                if (!p23.equals(p24)) {
                    if (!p22.f11346e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = p22.f11342a + p23.f11342a;
                    p22.e(i10);
                    System.arraycopy(p23.f11343b, 0, p22.f11343b, p22.f11342a, p23.f11342a);
                    System.arraycopy(p23.f11344c, 0, p22.f11344c, p22.f11342a, p23.f11342a);
                    p22.f11342a = i10;
                }
            }
        }
        abstractC0639k2.zzc = p22;
    }

    public static void c(int i3, List list, C0708y2 c0708y2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0599c2 c0599c2 = (C0599c2) c0708y2.f11771a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c0599c2.J(i3, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        c0599c2.E(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        c0599c2.N(i11);
        while (i10 < list.size()) {
            c0599c2.Q(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void d(int i3, List list, C0708y2 c0708y2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0599c2 c0599c2 = (C0599c2) c0708y2.f11771a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c0599c2.H(i3, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        c0599c2.E(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        c0599c2.N(i11);
        while (i10 < list.size()) {
            c0599c2.O(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void e(int i3, List list, C0708y2 c0708y2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0708y2.getClass();
        boolean z10 = list instanceof C0698w2;
        C0599c2 c0599c2 = (C0599c2) c0708y2.f11771a;
        int i10 = 0;
        if (!z10) {
            if (!z2) {
                while (i10 < list.size()) {
                    c0599c2.I(i3, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            c0599c2.E(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += C0599c2.C(((Long) list.get(i12)).longValue());
            }
            c0599c2.N(i11);
            while (i10 < list.size()) {
                c0599c2.P(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        C0698w2 c0698w2 = (C0698w2) list;
        if (!z2) {
            while (i10 < c0698w2.f11762c) {
                c0599c2.I(i3, c0698w2.b(i10));
                i10++;
            }
            return;
        }
        c0599c2.E(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < c0698w2.f11762c; i14++) {
            i13 += C0599c2.C(c0698w2.b(i14));
        }
        c0599c2.N(i13);
        while (i10 < c0698w2.f11762c) {
            c0599c2.P(c0698w2.b(i10));
            i10++;
        }
    }

    public static void f(int i3, List list, C0708y2 c0708y2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0708y2.getClass();
        boolean z10 = list instanceof C0698w2;
        C0599c2 c0599c2 = (C0599c2) c0708y2.f11771a;
        int i10 = 0;
        if (!z10) {
            if (!z2) {
                while (i10 < list.size()) {
                    c0599c2.I(i3, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            c0599c2.E(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += C0599c2.C(((Long) list.get(i12)).longValue());
            }
            c0599c2.N(i11);
            while (i10 < list.size()) {
                c0599c2.P(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        C0698w2 c0698w2 = (C0698w2) list;
        if (!z2) {
            while (i10 < c0698w2.f11762c) {
                c0599c2.I(i3, c0698w2.b(i10));
                i10++;
            }
            return;
        }
        c0599c2.E(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < c0698w2.f11762c; i14++) {
            i13 += C0599c2.C(c0698w2.b(i14));
        }
        c0599c2.N(i13);
        while (i10 < c0698w2.f11762c) {
            c0599c2.P(c0698w2.b(i10));
            i10++;
        }
    }

    public static void g(int i3, List list, C0708y2 c0708y2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0708y2.getClass();
        boolean z10 = list instanceof C0698w2;
        C0599c2 c0599c2 = (C0599c2) c0708y2.f11771a;
        int i10 = 0;
        if (!z10) {
            if (!z2) {
                while (i10 < list.size()) {
                    long longValue = ((Long) list.get(i10)).longValue();
                    c0599c2.I(i3, (longValue >> 63) ^ (longValue + longValue));
                    i10++;
                }
                return;
            }
            c0599c2.E(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long longValue2 = ((Long) list.get(i12)).longValue();
                i11 += C0599c2.C((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            c0599c2.N(i11);
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                c0599c2.P((longValue3 >> 63) ^ (longValue3 + longValue3));
                i10++;
            }
            return;
        }
        C0698w2 c0698w2 = (C0698w2) list;
        if (!z2) {
            while (i10 < c0698w2.f11762c) {
                long b2 = c0698w2.b(i10);
                c0599c2.I(i3, (b2 >> 63) ^ (b2 + b2));
                i10++;
            }
            return;
        }
        c0599c2.E(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < c0698w2.f11762c; i14++) {
            long b10 = c0698w2.b(i14);
            i13 += C0599c2.C((b10 >> 63) ^ (b10 + b10));
        }
        c0599c2.N(i13);
        while (i10 < c0698w2.f11762c) {
            long b11 = c0698w2.b(i10);
            c0599c2.P((b11 >> 63) ^ (b11 + b11));
            i10++;
        }
    }

    public static void h(int i3, List list, C0708y2 c0708y2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0708y2.getClass();
        boolean z10 = list instanceof C0698w2;
        C0599c2 c0599c2 = (C0599c2) c0708y2.f11771a;
        int i10 = 0;
        if (!z10) {
            if (!z2) {
                while (i10 < list.size()) {
                    c0599c2.J(i3, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            c0599c2.E(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            c0599c2.N(i11);
            while (i10 < list.size()) {
                c0599c2.Q(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        C0698w2 c0698w2 = (C0698w2) list;
        if (!z2) {
            while (i10 < c0698w2.f11762c) {
                c0599c2.J(i3, c0698w2.b(i10));
                i10++;
            }
            return;
        }
        c0599c2.E(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < c0698w2.f11762c; i14++) {
            c0698w2.b(i14);
            i13 += 8;
        }
        c0599c2.N(i13);
        while (i10 < c0698w2.f11762c) {
            c0599c2.Q(c0698w2.b(i10));
            i10++;
        }
    }

    public static void i(int i3, List list, C0708y2 c0708y2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0708y2.getClass();
        boolean z10 = list instanceof C0698w2;
        C0599c2 c0599c2 = (C0599c2) c0708y2.f11771a;
        int i10 = 0;
        if (!z10) {
            if (!z2) {
                while (i10 < list.size()) {
                    c0599c2.J(i3, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            c0599c2.E(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            c0599c2.N(i11);
            while (i10 < list.size()) {
                c0599c2.Q(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        C0698w2 c0698w2 = (C0698w2) list;
        if (!z2) {
            while (i10 < c0698w2.f11762c) {
                c0599c2.J(i3, c0698w2.b(i10));
                i10++;
            }
            return;
        }
        c0599c2.E(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < c0698w2.f11762c; i14++) {
            c0698w2.b(i14);
            i13 += 8;
        }
        c0599c2.N(i13);
        while (i10 < c0698w2.f11762c) {
            c0599c2.Q(c0698w2.b(i10));
            i10++;
        }
    }

    public static void j(int i3, List list, C0708y2 c0708y2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0708y2.getClass();
        boolean z10 = list instanceof C0644l2;
        C0599c2 c0599c2 = (C0599c2) c0708y2.f11771a;
        int i10 = 0;
        if (!z10) {
            if (!z2) {
                while (i10 < list.size()) {
                    c0599c2.F(i3, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            c0599c2.E(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += C0599c2.C(((Integer) list.get(i12)).intValue());
            }
            c0599c2.N(i11);
            while (i10 < list.size()) {
                c0599c2.M(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        C0644l2 c0644l2 = (C0644l2) list;
        if (!z2) {
            while (i10 < c0644l2.f11609c) {
                c0599c2.F(i3, c0644l2.c(i10));
                i10++;
            }
            return;
        }
        c0599c2.E(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < c0644l2.f11609c; i14++) {
            i13 += C0599c2.C(c0644l2.c(i14));
        }
        c0599c2.N(i13);
        while (i10 < c0644l2.f11609c) {
            c0599c2.M(c0644l2.c(i10));
            i10++;
        }
    }

    public static void k(int i3, List list, C0708y2 c0708y2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0708y2.getClass();
        boolean z10 = list instanceof C0644l2;
        C0599c2 c0599c2 = (C0599c2) c0708y2.f11771a;
        int i10 = 0;
        if (!z10) {
            if (!z2) {
                while (i10 < list.size()) {
                    c0599c2.G(i3, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            c0599c2.E(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += C0599c2.T(((Integer) list.get(i12)).intValue());
            }
            c0599c2.N(i11);
            while (i10 < list.size()) {
                c0599c2.N(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        C0644l2 c0644l2 = (C0644l2) list;
        if (!z2) {
            while (i10 < c0644l2.f11609c) {
                c0599c2.G(i3, c0644l2.c(i10));
                i10++;
            }
            return;
        }
        c0599c2.E(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < c0644l2.f11609c; i14++) {
            i13 += C0599c2.T(c0644l2.c(i14));
        }
        c0599c2.N(i13);
        while (i10 < c0644l2.f11609c) {
            c0599c2.N(c0644l2.c(i10));
            i10++;
        }
    }

    public static void l(int i3, List list, C0708y2 c0708y2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0708y2.getClass();
        boolean z10 = list instanceof C0644l2;
        C0599c2 c0599c2 = (C0599c2) c0708y2.f11771a;
        int i10 = 0;
        if (!z10) {
            if (!z2) {
                while (i10 < list.size()) {
                    int intValue = ((Integer) list.get(i10)).intValue();
                    c0599c2.G(i3, (intValue >> 31) ^ (intValue + intValue));
                    i10++;
                }
                return;
            }
            c0599c2.E(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue2 = ((Integer) list.get(i12)).intValue();
                i11 += C0599c2.T((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            c0599c2.N(i11);
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                c0599c2.N((intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
            return;
        }
        C0644l2 c0644l2 = (C0644l2) list;
        if (!z2) {
            while (i10 < c0644l2.f11609c) {
                int c10 = c0644l2.c(i10);
                c0599c2.G(i3, (c10 >> 31) ^ (c10 + c10));
                i10++;
            }
            return;
        }
        c0599c2.E(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < c0644l2.f11609c; i14++) {
            int c11 = c0644l2.c(i14);
            i13 += C0599c2.T((c11 >> 31) ^ (c11 + c11));
        }
        c0599c2.N(i13);
        while (i10 < c0644l2.f11609c) {
            int c12 = c0644l2.c(i10);
            c0599c2.N((c12 >> 31) ^ (c12 + c12));
            i10++;
        }
    }

    public static void m(int i3, List list, C0708y2 c0708y2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0708y2.getClass();
        boolean z10 = list instanceof C0644l2;
        C0599c2 c0599c2 = (C0599c2) c0708y2.f11771a;
        int i10 = 0;
        if (!z10) {
            if (!z2) {
                while (i10 < list.size()) {
                    c0599c2.H(i3, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            c0599c2.E(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            c0599c2.N(i11);
            while (i10 < list.size()) {
                c0599c2.O(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        C0644l2 c0644l2 = (C0644l2) list;
        if (!z2) {
            while (i10 < c0644l2.f11609c) {
                c0599c2.H(i3, c0644l2.c(i10));
                i10++;
            }
            return;
        }
        c0599c2.E(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < c0644l2.f11609c; i14++) {
            c0644l2.c(i14);
            i13 += 4;
        }
        c0599c2.N(i13);
        while (i10 < c0644l2.f11609c) {
            c0599c2.O(c0644l2.c(i10));
            i10++;
        }
    }

    public static void n(int i3, List list, C0708y2 c0708y2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0708y2.getClass();
        boolean z10 = list instanceof C0644l2;
        C0599c2 c0599c2 = (C0599c2) c0708y2.f11771a;
        int i10 = 0;
        if (!z10) {
            if (!z2) {
                while (i10 < list.size()) {
                    c0599c2.H(i3, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            c0599c2.E(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            c0599c2.N(i11);
            while (i10 < list.size()) {
                c0599c2.O(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        C0644l2 c0644l2 = (C0644l2) list;
        if (!z2) {
            while (i10 < c0644l2.f11609c) {
                c0599c2.H(i3, c0644l2.c(i10));
                i10++;
            }
            return;
        }
        c0599c2.E(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < c0644l2.f11609c; i14++) {
            c0644l2.c(i14);
            i13 += 4;
        }
        c0599c2.N(i13);
        while (i10 < c0644l2.f11609c) {
            c0599c2.O(c0644l2.c(i10));
            i10++;
        }
    }

    public static void o(int i3, List list, C0708y2 c0708y2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0708y2.getClass();
        boolean z10 = list instanceof C0644l2;
        C0599c2 c0599c2 = (C0599c2) c0708y2.f11771a;
        int i10 = 0;
        if (!z10) {
            if (!z2) {
                while (i10 < list.size()) {
                    c0599c2.F(i3, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            c0599c2.E(i3, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += C0599c2.C(((Integer) list.get(i12)).intValue());
            }
            c0599c2.N(i11);
            while (i10 < list.size()) {
                c0599c2.M(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        C0644l2 c0644l2 = (C0644l2) list;
        if (!z2) {
            while (i10 < c0644l2.f11609c) {
                c0599c2.F(i3, c0644l2.c(i10));
                i10++;
            }
            return;
        }
        c0599c2.E(i3, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < c0644l2.f11609c; i14++) {
            i13 += C0599c2.C(c0644l2.c(i14));
        }
        c0599c2.N(i13);
        while (i10 < c0644l2.f11609c) {
            c0599c2.M(c0644l2.c(i10));
            i10++;
        }
    }

    public static void p(int i3, List list, C0708y2 c0708y2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0599c2 c0599c2 = (C0599c2) c0708y2.f11771a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i10)).booleanValue();
                c0599c2.N(i3 << 3);
                c0599c2.L(booleanValue ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        c0599c2.E(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            i11++;
        }
        c0599c2.N(i11);
        while (i10 < list.size()) {
            c0599c2.L(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0698w2)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += C0599c2.C(((Long) list.get(i3)).longValue());
                i3++;
            }
            return i10;
        }
        C0698w2 c0698w2 = (C0698w2) list;
        int i11 = 0;
        while (i3 < size) {
            i11 += C0599c2.C(c0698w2.b(i3));
            i3++;
        }
        return i11;
    }

    public static int r(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0698w2)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += C0599c2.C(((Long) list.get(i3)).longValue());
                i3++;
            }
            return i10;
        }
        C0698w2 c0698w2 = (C0698w2) list;
        int i11 = 0;
        while (i3 < size) {
            i11 += C0599c2.C(c0698w2.b(i3));
            i3++;
        }
        return i11;
    }

    public static int s(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0698w2)) {
            int i10 = 0;
            while (i3 < size) {
                long longValue = ((Long) list.get(i3)).longValue();
                i10 += C0599c2.C((longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
            return i10;
        }
        C0698w2 c0698w2 = (C0698w2) list;
        int i11 = 0;
        while (i3 < size) {
            long b2 = c0698w2.b(i3);
            i11 += C0599c2.C((b2 >> 63) ^ (b2 + b2));
            i3++;
        }
        return i11;
    }

    public static int t(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0644l2)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += C0599c2.C(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i10;
        }
        C0644l2 c0644l2 = (C0644l2) list;
        int i11 = 0;
        while (i3 < size) {
            i11 += C0599c2.C(c0644l2.c(i3));
            i3++;
        }
        return i11;
    }

    public static int u(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0644l2)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += C0599c2.C(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i10;
        }
        C0644l2 c0644l2 = (C0644l2) list;
        int i11 = 0;
        while (i3 < size) {
            i11 += C0599c2.C(c0644l2.c(i3));
            i3++;
        }
        return i11;
    }

    public static int v(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0644l2)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += C0599c2.T(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i10;
        }
        C0644l2 c0644l2 = (C0644l2) list;
        int i11 = 0;
        while (i3 < size) {
            i11 += C0599c2.T(c0644l2.c(i3));
            i3++;
        }
        return i11;
    }

    public static int w(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0644l2)) {
            int i10 = 0;
            while (i3 < size) {
                int intValue = ((Integer) list.get(i3)).intValue();
                i10 += C0599c2.T((intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
            return i10;
        }
        C0644l2 c0644l2 = (C0644l2) list;
        int i11 = 0;
        while (i3 < size) {
            int c10 = c0644l2.c(i3);
            i11 += C0599c2.T((c10 >> 31) ^ (c10 + c10));
            i3++;
        }
        return i11;
    }

    public static int x(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0599c2.T(i3 << 3) + 4) * size;
    }

    public static int y(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0599c2.T(i3 << 3) + 8) * size;
    }
}
