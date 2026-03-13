package com.google.protobuf;

import com.stub.StubApp;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class G0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f12097a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f12098b;

    /* renamed from: c, reason: collision with root package name */
    public static final F0 f12099c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f12100d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f12101e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f12102f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f12103g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f12104h;

    static {
        Unsafe j = j();
        f12097a = j;
        f12098b = AbstractC0723e.f12147a;
        boolean f10 = f(Long.TYPE);
        boolean f11 = f(Integer.TYPE);
        F0 f02 = null;
        if (j != null) {
            if (!AbstractC0723e.a()) {
                f02 = new E0(j);
            } else if (f10) {
                f02 = new D0(j, 1);
            } else if (f11) {
                f02 = new D0(j, 0);
            }
        }
        f12099c = f02;
        f12100d = f02 == null ? false : f02.u();
        f12101e = f02 == null ? false : f02.t();
        f12102f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field e10 = e();
        f12103g = (e10 == null || f02 == null) ? -1L : f02.l(e10);
        f12104h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(G0.class.getName()).log(Level.WARNING, StubApp.getString2(11831) + th);
    }

    public static Object b(Class cls) {
        try {
            return f12097a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int c(Class cls) {
        if (f12101e) {
            return f12099c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f12101e) {
            f12099c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (AbstractC0723e.a()) {
            try {
                field2 = Buffer.class.getDeclaredField(StubApp.getString2(11832));
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField(StubApp.getString2(661));
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean f(Class cls) {
        if (!AbstractC0723e.a()) {
            return false;
        }
        try {
            Class cls2 = f12098b;
            String string2 = StubApp.getString2("11842");
            Class cls3 = Boolean.TYPE;
            cls2.getMethod(string2, cls, cls3);
            cls2.getMethod(StubApp.getString2("11843"), cls, Long.TYPE, cls3);
            String string22 = StubApp.getString2("11844");
            Class cls4 = Integer.TYPE;
            cls2.getMethod(string22, cls, cls4, cls3);
            cls2.getMethod(StubApp.getString2("11845"), cls, cls3);
            cls2.getMethod(StubApp.getString2("11846"), cls, Byte.TYPE);
            cls2.getMethod(StubApp.getString2("11847"), cls);
            cls2.getMethod(StubApp.getString2("11848"), cls, byte[].class, cls4, cls4);
            cls2.getMethod(StubApp.getString2("11849"), cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(long j, byte[] bArr) {
        return f12099c.f(f12102f + j, bArr);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((f12099c.i((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((f12099c.i((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j, byte b2) {
        f12099c.n(bArr, f12102f + j, b2);
    }

    public static void l(Object obj, long j, byte b2) {
        long j3 = (-4) & j;
        int i3 = f12099c.i(j3, obj);
        int i10 = ((~((int) j)) & 3) << 3;
        n(((255 & b2) << i10) | (i3 & (~(255 << i10))), j3, obj);
    }

    public static void m(Object obj, long j, byte b2) {
        long j3 = (-4) & j;
        int i3 = (((int) j) & 3) << 3;
        n(((255 & b2) << i3) | (f12099c.i(j3, obj) & (~(255 << i3))), j3, obj);
    }

    public static void n(int i3, long j, Object obj) {
        f12099c.q(i3, j, obj);
    }

    public static void o(Object obj, long j, long j3) {
        f12099c.r(obj, j, j3);
    }

    public static void p(Object obj, long j, Object obj2) {
        f12099c.s(obj, j, obj2);
    }
}
