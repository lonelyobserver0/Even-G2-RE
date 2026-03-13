package com.google.protobuf;

import com.stub.StubApp;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f12230a;

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f12231b;

    /* renamed from: c, reason: collision with root package name */
    public static final y0 f12232c;

    static {
        Class<?> cls;
        Class<?> cls2;
        y0 y0Var = null;
        try {
            cls = Class.forName(StubApp.getString2("12662"));
        } catch (Throwable unused) {
            cls = null;
        }
        f12230a = cls;
        try {
            cls2 = Class.forName(StubApp.getString2("12663"));
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                y0Var = (y0) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f12231b = y0Var;
        f12232c = new y0();
    }

    public static void A(int i3, List list, C0720c0 c0720c0, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0747q abstractC0747q = (AbstractC0747q) c0720c0.f12143a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                abstractC0747q.j0(i3, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        abstractC0747q.g0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += AbstractC0747q.T(((Long) list.get(i12)).longValue());
        }
        abstractC0747q.i0(i11);
        while (i10 < list.size()) {
            abstractC0747q.k0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static int a(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += AbstractC0747q.P(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i10;
        }
        G g10 = (G) list;
        int i11 = 0;
        while (i3 < size) {
            g10.c(i3);
            i11 += AbstractC0747q.P(g10.f12095b[i3]);
            i3++;
        }
        return i11;
    }

    public static int b(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0747q.R(i3) + 4) * size;
    }

    public static int c(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0747q.R(i3) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += AbstractC0747q.P(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i10;
        }
        G g10 = (G) list;
        int i11 = 0;
        while (i3 < size) {
            g10.c(i3);
            i11 += AbstractC0747q.P(g10.f12095b[i3]);
            i3++;
        }
        return i11;
    }

    public static int e(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0716a0)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += AbstractC0747q.T(((Long) list.get(i3)).longValue());
                i3++;
            }
            return i10;
        }
        C0716a0 c0716a0 = (C0716a0) list;
        int i11 = 0;
        while (i3 < size) {
            c0716a0.c(i3);
            i11 += AbstractC0747q.T(c0716a0.f12139b[i3]);
            i3++;
        }
        return i11;
    }

    public static int f(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G)) {
            int i10 = 0;
            while (i3 < size) {
                int intValue = ((Integer) list.get(i3)).intValue();
                i10 += AbstractC0747q.S((intValue >> 31) ^ (intValue << 1));
                i3++;
            }
            return i10;
        }
        G g10 = (G) list;
        int i11 = 0;
        while (i3 < size) {
            g10.c(i3);
            int i12 = g10.f12095b[i3];
            i11 += AbstractC0747q.S((i12 >> 31) ^ (i12 << 1));
            i3++;
        }
        return i11;
    }

    public static int g(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0716a0)) {
            int i10 = 0;
            while (i3 < size) {
                long longValue = ((Long) list.get(i3)).longValue();
                i10 += AbstractC0747q.T((longValue >> 63) ^ (longValue << 1));
                i3++;
            }
            return i10;
        }
        C0716a0 c0716a0 = (C0716a0) list;
        int i11 = 0;
        while (i3 < size) {
            c0716a0.c(i3);
            long j = c0716a0.f12139b[i3];
            i11 += AbstractC0747q.T((j >> 63) ^ (j << 1));
            i3++;
        }
        return i11;
    }

    public static int h(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += AbstractC0747q.S(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i10;
        }
        G g10 = (G) list;
        int i11 = 0;
        while (i3 < size) {
            g10.c(i3);
            i11 += AbstractC0747q.S(g10.f12095b[i3]);
            i3++;
        }
        return i11;
    }

    public static int i(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0716a0)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += AbstractC0747q.T(((Long) list.get(i3)).longValue());
                i3++;
            }
            return i10;
        }
        C0716a0 c0716a0 = (C0716a0) list;
        int i11 = 0;
        while (i3 < size) {
            c0716a0.c(i3);
            i11 += AbstractC0747q.T(c0716a0.f12139b[i3]);
            i3++;
        }
        return i11;
    }

    public static Object j(Object obj, int i3, List list, L l9, Object obj2, y0 y0Var) {
        if (l9 == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!l9.isInRange(intValue)) {
                    obj2 = m(obj, i3, intValue, obj2, y0Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = (Integer) list.get(i11);
            int intValue2 = num.intValue();
            if (l9.isInRange(intValue2)) {
                if (i11 != i10) {
                    list.set(i10, num);
                }
                i10++;
            } else {
                obj2 = m(obj, i3, intValue2, obj2, y0Var);
            }
        }
        if (i10 != size) {
            list.subList(i10, size).clear();
        }
        return obj2;
    }

    public static void k(y0 y0Var, Object obj, Object obj2) {
        y0Var.getClass();
        F f10 = (F) obj;
        x0 x0Var = f10.unknownFields;
        x0 x0Var2 = ((F) obj2).unknownFields;
        x0 x0Var3 = x0.f12241f;
        if (!x0Var3.equals(x0Var2)) {
            if (x0Var3.equals(x0Var)) {
                x0Var = x0.e(x0Var, x0Var2);
            } else {
                x0Var.getClass();
                if (!x0Var2.equals(x0Var3)) {
                    x0Var.a();
                    int i3 = x0Var.f12242a + x0Var2.f12242a;
                    x0Var.b(i3);
                    System.arraycopy(x0Var2.f12243b, 0, x0Var.f12243b, x0Var.f12242a, x0Var2.f12242a);
                    System.arraycopy(x0Var2.f12244c, 0, x0Var.f12244c, x0Var.f12242a, x0Var2.f12242a);
                    x0Var.f12242a = i3;
                }
            }
        }
        f10.unknownFields = x0Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object m(Object obj, int i3, int i10, Object obj2, y0 y0Var) {
        if (obj2 == null) {
            y0Var.getClass();
            obj2 = y0.a(obj);
        }
        y0Var.getClass();
        ((x0) obj2).f(i3 << 3, Long.valueOf(i10));
        return obj2;
    }

    public static void n(int i3, List list, C0720c0 c0720c0, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0747q abstractC0747q = (AbstractC0747q) c0720c0.f12143a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                abstractC0747q.W(i3, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        abstractC0747q.g0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = AbstractC0747q.f12210e;
            i11++;
        }
        abstractC0747q.i0(i11);
        while (i10 < list.size()) {
            abstractC0747q.V(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void o(int i3, List list, C0720c0 c0720c0, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0747q abstractC0747q = (AbstractC0747q) c0720c0.f12143a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                double doubleValue = ((Double) list.get(i10)).doubleValue();
                abstractC0747q.getClass();
                abstractC0747q.a0(i3, Double.doubleToRawLongBits(doubleValue));
                i10++;
            }
            return;
        }
        abstractC0747q.g0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = AbstractC0747q.f12210e;
            i11 += 8;
        }
        abstractC0747q.i0(i11);
        while (i10 < list.size()) {
            abstractC0747q.b0(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void p(int i3, List list, C0720c0 c0720c0, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0747q abstractC0747q = (AbstractC0747q) c0720c0.f12143a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                abstractC0747q.c0(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        abstractC0747q.g0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += AbstractC0747q.P(((Integer) list.get(i12)).intValue());
        }
        abstractC0747q.i0(i11);
        while (i10 < list.size()) {
            abstractC0747q.d0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void q(int i3, List list, C0720c0 c0720c0, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0747q abstractC0747q = (AbstractC0747q) c0720c0.f12143a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                abstractC0747q.Y(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        abstractC0747q.g0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = AbstractC0747q.f12210e;
            i11 += 4;
        }
        abstractC0747q.i0(i11);
        while (i10 < list.size()) {
            abstractC0747q.Z(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void r(int i3, List list, C0720c0 c0720c0, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0747q abstractC0747q = (AbstractC0747q) c0720c0.f12143a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                abstractC0747q.a0(i3, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        abstractC0747q.g0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = AbstractC0747q.f12210e;
            i11 += 8;
        }
        abstractC0747q.i0(i11);
        while (i10 < list.size()) {
            abstractC0747q.b0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void s(int i3, List list, C0720c0 c0720c0, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0747q abstractC0747q = (AbstractC0747q) c0720c0.f12143a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                float floatValue = ((Float) list.get(i10)).floatValue();
                abstractC0747q.getClass();
                abstractC0747q.Y(i3, Float.floatToRawIntBits(floatValue));
                i10++;
            }
            return;
        }
        abstractC0747q.g0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = AbstractC0747q.f12210e;
            i11 += 4;
        }
        abstractC0747q.i0(i11);
        while (i10 < list.size()) {
            abstractC0747q.Z(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void t(int i3, List list, C0720c0 c0720c0, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0747q abstractC0747q = (AbstractC0747q) c0720c0.f12143a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                abstractC0747q.c0(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        abstractC0747q.g0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += AbstractC0747q.P(((Integer) list.get(i12)).intValue());
        }
        abstractC0747q.i0(i11);
        while (i10 < list.size()) {
            abstractC0747q.d0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void u(int i3, List list, C0720c0 c0720c0, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0747q abstractC0747q = (AbstractC0747q) c0720c0.f12143a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                abstractC0747q.j0(i3, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        abstractC0747q.g0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += AbstractC0747q.T(((Long) list.get(i12)).longValue());
        }
        abstractC0747q.i0(i11);
        while (i10 < list.size()) {
            abstractC0747q.k0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void v(int i3, List list, C0720c0 c0720c0, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0747q abstractC0747q = (AbstractC0747q) c0720c0.f12143a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                abstractC0747q.Y(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        abstractC0747q.g0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = AbstractC0747q.f12210e;
            i11 += 4;
        }
        abstractC0747q.i0(i11);
        while (i10 < list.size()) {
            abstractC0747q.Z(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void w(int i3, List list, C0720c0 c0720c0, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0747q abstractC0747q = (AbstractC0747q) c0720c0.f12143a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                abstractC0747q.a0(i3, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        abstractC0747q.g0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = AbstractC0747q.f12210e;
            i11 += 8;
        }
        abstractC0747q.i0(i11);
        while (i10 < list.size()) {
            abstractC0747q.b0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void x(int i3, List list, C0720c0 c0720c0, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0747q abstractC0747q = (AbstractC0747q) c0720c0.f12143a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                abstractC0747q.h0(i3, (intValue >> 31) ^ (intValue << 1));
                i10++;
            }
            return;
        }
        abstractC0747q.g0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int intValue2 = ((Integer) list.get(i12)).intValue();
            i11 += AbstractC0747q.S((intValue2 >> 31) ^ (intValue2 << 1));
        }
        abstractC0747q.i0(i11);
        while (i10 < list.size()) {
            int intValue3 = ((Integer) list.get(i10)).intValue();
            abstractC0747q.i0((intValue3 >> 31) ^ (intValue3 << 1));
            i10++;
        }
    }

    public static void y(int i3, List list, C0720c0 c0720c0, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0747q abstractC0747q = (AbstractC0747q) c0720c0.f12143a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                long longValue = ((Long) list.get(i10)).longValue();
                abstractC0747q.j0(i3, (longValue >> 63) ^ (longValue << 1));
                i10++;
            }
            return;
        }
        abstractC0747q.g0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long longValue2 = ((Long) list.get(i12)).longValue();
            i11 += AbstractC0747q.T((longValue2 >> 63) ^ (longValue2 << 1));
        }
        abstractC0747q.i0(i11);
        while (i10 < list.size()) {
            long longValue3 = ((Long) list.get(i10)).longValue();
            abstractC0747q.k0((longValue3 >> 63) ^ (longValue3 << 1));
            i10++;
        }
    }

    public static void z(int i3, List list, C0720c0 c0720c0, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0747q abstractC0747q = (AbstractC0747q) c0720c0.f12143a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                abstractC0747q.h0(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        abstractC0747q.g0(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += AbstractC0747q.S(((Integer) list.get(i12)).intValue());
        }
        abstractC0747q.i0(i11);
        while (i10 < list.size()) {
            abstractC0747q.i0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }
}
