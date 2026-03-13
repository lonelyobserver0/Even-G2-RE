package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f9744a;

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f9745b;

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f9746c;

    static {
        Class<?> cls;
        Class<?> cls2;
        Q q10 = Q.f9734c;
        c0 c0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f9744a = cls;
        try {
            Q q11 = Q.f9734c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                c0Var = (c0) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (Throwable unused3) {
        }
        f9745b = c0Var;
        f9746c = new c0();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i3 += C0411k.S(((Integer) list.get(i10)).intValue());
        }
        return i3;
    }

    public static int b(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0411k.Q(i3) + 4) * size;
    }

    public static int c(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0411k.Q(i3) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i3 += C0411k.S(((Integer) list.get(i10)).intValue());
        }
        return i3;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i3 += C0411k.S(((Long) list.get(i10)).longValue());
        }
        return i3;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int intValue = ((Integer) list.get(i10)).intValue();
            i3 += C0411k.R((intValue >> 31) ^ (intValue << 1));
        }
        return i3;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) list.get(i10)).longValue();
            i3 += C0411k.S((longValue >> 63) ^ (longValue << 1));
        }
        return i3;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i3 += C0411k.R(((Integer) list.get(i10)).intValue());
        }
        return i3;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i3 += C0411k.S(((Long) list.get(i10)).longValue());
        }
        return i3;
    }

    public static Object j(Object obj, int i3, InterfaceC0421v interfaceC0421v, Object obj2, c0 c0Var) {
        return obj2;
    }

    public static void k(c0 c0Var, Object obj, Object obj2) {
        c0Var.getClass();
        AbstractC0420u abstractC0420u = (AbstractC0420u) obj;
        b0 b0Var = abstractC0420u.unknownFields;
        b0 b0Var2 = ((AbstractC0420u) obj2).unknownFields;
        b0 b0Var3 = b0.f9764f;
        if (!b0Var3.equals(b0Var2)) {
            if (b0Var3.equals(b0Var)) {
                int i3 = b0Var.f9765a + b0Var2.f9765a;
                int[] copyOf = Arrays.copyOf(b0Var.f9766b, i3);
                System.arraycopy(b0Var2.f9766b, 0, copyOf, b0Var.f9765a, b0Var2.f9765a);
                Object[] copyOf2 = Arrays.copyOf(b0Var.f9767c, i3);
                System.arraycopy(b0Var2.f9767c, 0, copyOf2, b0Var.f9765a, b0Var2.f9765a);
                b0Var = new b0(i3, copyOf, copyOf2, true);
            } else {
                b0Var.getClass();
                if (!b0Var2.equals(b0Var3)) {
                    if (!b0Var.f9769e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = b0Var.f9765a + b0Var2.f9765a;
                    b0Var.a(i10);
                    System.arraycopy(b0Var2.f9766b, 0, b0Var.f9766b, b0Var.f9765a, b0Var2.f9765a);
                    System.arraycopy(b0Var2.f9767c, 0, b0Var.f9767c, b0Var.f9765a, b0Var2.f9765a);
                    b0Var.f9765a = i10;
                }
            }
        }
        abstractC0420u.unknownFields = b0Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i3, List list, D d8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0411k c0411k = (C0411k) d8.f9705a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c0411k.X(i3, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        c0411k.j0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = C0411k.f9809g;
            i11++;
        }
        c0411k.l0(i11);
        while (i10 < list.size()) {
            c0411k.V(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void n(int i3, List list, D d8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0411k c0411k = (C0411k) d8.f9705a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                double doubleValue = ((Double) list.get(i10)).doubleValue();
                c0411k.getClass();
                c0411k.c0(i3, Double.doubleToRawLongBits(doubleValue));
                i10++;
            }
            return;
        }
        c0411k.j0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = C0411k.f9809g;
            i11 += 8;
        }
        c0411k.l0(i11);
        while (i10 < list.size()) {
            c0411k.d0(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void o(int i3, List list, D d8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0411k c0411k = (C0411k) d8.f9705a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c0411k.e0(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c0411k.j0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += C0411k.S(((Integer) list.get(i12)).intValue());
        }
        c0411k.l0(i11);
        while (i10 < list.size()) {
            c0411k.f0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void p(int i3, List list, D d8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0411k c0411k = (C0411k) d8.f9705a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c0411k.a0(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c0411k.j0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = C0411k.f9809g;
            i11 += 4;
        }
        c0411k.l0(i11);
        while (i10 < list.size()) {
            c0411k.b0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void q(int i3, List list, D d8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0411k c0411k = (C0411k) d8.f9705a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c0411k.c0(i3, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        c0411k.j0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = C0411k.f9809g;
            i11 += 8;
        }
        c0411k.l0(i11);
        while (i10 < list.size()) {
            c0411k.d0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void r(int i3, List list, D d8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0411k c0411k = (C0411k) d8.f9705a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                float floatValue = ((Float) list.get(i10)).floatValue();
                c0411k.getClass();
                c0411k.a0(i3, Float.floatToRawIntBits(floatValue));
                i10++;
            }
            return;
        }
        c0411k.j0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = C0411k.f9809g;
            i11 += 4;
        }
        c0411k.l0(i11);
        while (i10 < list.size()) {
            c0411k.b0(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void s(int i3, List list, D d8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0411k c0411k = (C0411k) d8.f9705a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c0411k.e0(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c0411k.j0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += C0411k.S(((Integer) list.get(i12)).intValue());
        }
        c0411k.l0(i11);
        while (i10 < list.size()) {
            c0411k.f0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void t(int i3, List list, D d8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0411k c0411k = (C0411k) d8.f9705a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c0411k.m0(i3, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        c0411k.j0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += C0411k.S(((Long) list.get(i12)).longValue());
        }
        c0411k.l0(i11);
        while (i10 < list.size()) {
            c0411k.n0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void u(int i3, List list, D d8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0411k c0411k = (C0411k) d8.f9705a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c0411k.a0(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c0411k.j0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = C0411k.f9809g;
            i11 += 4;
        }
        c0411k.l0(i11);
        while (i10 < list.size()) {
            c0411k.b0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void v(int i3, List list, D d8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0411k c0411k = (C0411k) d8.f9705a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c0411k.c0(i3, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        c0411k.j0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = C0411k.f9809g;
            i11 += 8;
        }
        c0411k.l0(i11);
        while (i10 < list.size()) {
            c0411k.d0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void w(int i3, List list, D d8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0411k c0411k = (C0411k) d8.f9705a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                c0411k.k0(i3, (intValue >> 31) ^ (intValue << 1));
                i10++;
            }
            return;
        }
        c0411k.j0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int intValue2 = ((Integer) list.get(i12)).intValue();
            i11 += C0411k.R((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0411k.l0(i11);
        while (i10 < list.size()) {
            int intValue3 = ((Integer) list.get(i10)).intValue();
            c0411k.l0((intValue3 >> 31) ^ (intValue3 << 1));
            i10++;
        }
    }

    public static void x(int i3, List list, D d8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0411k c0411k = (C0411k) d8.f9705a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                long longValue = ((Long) list.get(i10)).longValue();
                c0411k.m0(i3, (longValue >> 63) ^ (longValue << 1));
                i10++;
            }
            return;
        }
        c0411k.j0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long longValue2 = ((Long) list.get(i12)).longValue();
            i11 += C0411k.S((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0411k.l0(i11);
        while (i10 < list.size()) {
            long longValue3 = ((Long) list.get(i10)).longValue();
            c0411k.n0((longValue3 >> 63) ^ (longValue3 << 1));
            i10++;
        }
    }

    public static void y(int i3, List list, D d8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0411k c0411k = (C0411k) d8.f9705a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c0411k.k0(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c0411k.j0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += C0411k.R(((Integer) list.get(i12)).intValue());
        }
        c0411k.l0(i11);
        while (i10 < list.size()) {
            c0411k.l0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void z(int i3, List list, D d8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0411k c0411k = (C0411k) d8.f9705a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c0411k.m0(i3, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        c0411k.j0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += C0411k.S(((Long) list.get(i12)).longValue());
        }
        c0411k.l0(i11);
        while (i10 < list.size()) {
            c0411k.n0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
