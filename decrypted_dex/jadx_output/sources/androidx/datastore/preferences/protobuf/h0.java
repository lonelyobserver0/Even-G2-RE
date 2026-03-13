package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f9792a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f9793b;

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f9794c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f9795d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f9796e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f9797f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f9798g;

    static {
        Unsafe i3 = i();
        f9792a = i3;
        f9793b = AbstractC0403c.f9770a;
        boolean h2 = h(Long.TYPE);
        boolean h4 = h(Integer.TYPE);
        g0 g0Var = null;
        if (i3 != null) {
            if (!AbstractC0403c.a()) {
                g0Var = new f0(i3);
            } else if (h2) {
                g0Var = new e0(i3, 1);
            } else if (h4) {
                g0Var = new e0(i3, 0);
            }
        }
        f9794c = g0Var;
        f9795d = g0Var == null ? false : g0Var.r();
        f9796e = g0Var == null ? false : g0Var.q();
        f9797f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field g10 = g();
        if (g10 != null && g0Var != null) {
            g0Var.i(g10);
        }
        f9798g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(h0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j, Object obj) {
        return ((byte) ((f9794c.f((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j, Object obj) {
        return ((byte) ((f9794c.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f9792a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int e(Class cls) {
        if (f9796e) {
            return f9794c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f9796e) {
            f9794c.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        if (AbstractC0403c.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean h(Class cls) {
        if (!AbstractC0403c.a()) {
            return false;
        }
        try {
            Class cls2 = f9793b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new d0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b2) {
        f9794c.k(bArr, f9797f + j, b2);
    }

    public static void k(Object obj, long j, byte b2) {
        long j3 = (-4) & j;
        int f10 = f9794c.f(j3, obj);
        int i3 = ((~((int) j)) & 3) << 3;
        m(((255 & b2) << i3) | (f10 & (~(255 << i3))), j3, obj);
    }

    public static void l(Object obj, long j, byte b2) {
        long j3 = (-4) & j;
        int i3 = (((int) j) & 3) << 3;
        m(((255 & b2) << i3) | (f9794c.f(j3, obj) & (~(255 << i3))), j3, obj);
    }

    public static void m(int i3, long j, Object obj) {
        f9794c.n(i3, j, obj);
    }

    public static void n(Object obj, long j, long j3) {
        f9794c.o(obj, j, j3);
    }

    public static void o(Object obj, long j, Object obj2) {
        f9794c.p(obj, j, obj2);
    }
}
