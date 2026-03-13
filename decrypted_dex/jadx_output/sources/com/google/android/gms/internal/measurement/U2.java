package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.security.AccessController;
import sun.misc.Unsafe;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class U2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f11386a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f11387b;

    /* renamed from: c, reason: collision with root package name */
    public static final T2 f11388c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f11389d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f11390e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f11391f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f11392g;

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(18:(1:65)(1:(1:67))|4|(7:43|44|45|46|47|(4:51|52|(1:54)|57)|(14:50|8|(14:36|37|38|39|11|12|13|(3:26|27|(6:31|(1:19)|20|(1:22)|23|24))|15|(2:17|19)|20|(0)|23|24)|10|11|12|13|(0)|15|(0)|20|(0)|23|24))|6|7|8|(0)|10|11|12|13|(0)|15|(0)|20|(0)|23|24)|3|4|(0)|6|7|8|(0)|10|11|12|13|(0)|15|(0)|20|(0)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0198, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009b, code lost:
    
        if (r0.getType() == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    static {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.U2.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f11390e) {
            f11388c.f11373a.arrayIndexScale(cls);
        }
    }

    public static void b(Object obj, long j, byte b2) {
        Unsafe unsafe = f11388c.f11373a;
        long j3 = (-4) & j;
        int i3 = unsafe.getInt(obj, j3);
        int i10 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j3, ((255 & b2) << i10) | (i3 & (~(255 << i10))));
    }

    public static void c(Object obj, long j, byte b2) {
        Unsafe unsafe = f11388c.f11373a;
        long j3 = (-4) & j;
        int i3 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j3, ((255 & b2) << i3) | (unsafe.getInt(obj, j3) & (~(255 << i3))));
    }

    public static Object d(Class cls) {
        try {
            return f11386a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int e(long j, Object obj) {
        return f11388c.f11373a.getInt(obj, j);
    }

    public static void f(int i3, long j, Object obj) {
        f11388c.f11373a.putInt(obj, j, i3);
    }

    public static long g(long j, Object obj) {
        return f11388c.f11373a.getLong(obj, j);
    }

    public static void h(Object obj, long j, long j3) {
        f11388c.f11373a.putLong(obj, j, j3);
    }

    public static Object i(long j, Object obj) {
        return f11388c.f11373a.getObject(obj, j);
    }

    public static void j(Object obj, long j, Object obj2) {
        f11388c.f11373a.putObject(obj, j, obj2);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Q2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean l(Class cls) {
        int i3 = X1.f11407a;
        try {
            Class cls2 = f11387b;
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

    public static /* synthetic */ boolean m(long j, Object obj) {
        return ((byte) ((f11388c.f11373a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean n(long j, Object obj) {
        return ((byte) ((f11388c.f11373a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static int o(Class cls) {
        if (f11390e) {
            return f11388c.f11373a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
