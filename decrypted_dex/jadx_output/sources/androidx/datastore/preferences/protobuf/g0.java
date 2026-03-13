package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f9784a;

    public g0(Unsafe unsafe) {
        this.f9784a = unsafe;
    }

    public final int a(Class cls) {
        return this.f9784a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f9784a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, Object obj);

    public abstract double d(long j, Object obj);

    public abstract float e(long j, Object obj);

    public final int f(long j, Object obj) {
        return this.f9784a.getInt(obj, j);
    }

    public final long g(long j, Object obj) {
        return this.f9784a.getLong(obj, j);
    }

    public final Object h(long j, Object obj) {
        return this.f9784a.getObject(obj, j);
    }

    public final long i(Field field) {
        return this.f9784a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j, boolean z2);

    public abstract void k(Object obj, long j, byte b2);

    public abstract void l(Object obj, long j, double d8);

    public abstract void m(Object obj, long j, float f10);

    public final void n(int i3, long j, Object obj) {
        this.f9784a.putInt(obj, j, i3);
    }

    public final void o(Object obj, long j, long j3) {
        this.f9784a.putLong(obj, j, j3);
    }

    public final void p(Object obj, long j, Object obj2) {
        this.f9784a.putObject(obj, j, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f9784a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            h0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
