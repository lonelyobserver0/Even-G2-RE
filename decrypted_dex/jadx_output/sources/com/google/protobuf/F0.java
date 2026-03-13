package com.google.protobuf;

import com.stub.StubApp;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f12093a;

    public F0(Unsafe unsafe) {
        this.f12093a = unsafe;
    }

    public final int a(Class cls) {
        return this.f12093a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f12093a.arrayIndexScale(cls);
    }

    public abstract void c(long j, byte[] bArr, long j3);

    public abstract boolean d(long j, Object obj);

    public abstract byte e(long j);

    public abstract byte f(long j, Object obj);

    public abstract double g(long j, Object obj);

    public abstract float h(long j, Object obj);

    public final int i(long j, Object obj) {
        return this.f12093a.getInt(obj, j);
    }

    public final long j(long j, Object obj) {
        return this.f12093a.getLong(obj, j);
    }

    public final Object k(long j, Object obj) {
        return this.f12093a.getObject(obj, j);
    }

    public final long l(Field field) {
        return this.f12093a.objectFieldOffset(field);
    }

    public abstract void m(Object obj, long j, boolean z2);

    public abstract void n(Object obj, long j, byte b2);

    public abstract void o(Object obj, long j, double d8);

    public abstract void p(Object obj, long j, float f10);

    public final void q(int i3, long j, Object obj) {
        this.f12093a.putInt(obj, j, i3);
    }

    public final void r(Object obj, long j, long j3) {
        this.f12093a.putLong(obj, j, j3);
    }

    public final void s(Object obj, long j, Object obj2) {
        this.f12093a.putObject(obj, j, obj2);
    }

    public boolean t() {
        Unsafe unsafe = this.f12093a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod(StubApp.getString2("11834"), Field.class);
            cls.getMethod(StubApp.getString2("11835"), Class.class);
            cls.getMethod(StubApp.getString2("11836"), Class.class);
            String string2 = StubApp.getString2("11837");
            Class cls2 = Long.TYPE;
            cls.getMethod(string2, Object.class, cls2);
            cls.getMethod(StubApp.getString2("11838"), Object.class, cls2, Integer.TYPE);
            cls.getMethod(StubApp.getString2("11833"), Object.class, cls2);
            cls.getMethod(StubApp.getString2("11839"), Object.class, cls2, cls2);
            cls.getMethod(StubApp.getString2("11840"), Object.class, cls2);
            cls.getMethod(StubApp.getString2("11841"), Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            G0.a(th);
            return false;
        }
    }

    public abstract boolean u();
}
