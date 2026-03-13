package com.google.protobuf;

import com.stub.StubApp;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class E0 extends F0 {
    @Override // com.google.protobuf.F0
    public final void c(long j, byte[] bArr, long j3) {
        this.f12093a.copyMemory((Object) null, j, bArr, G0.f12102f, j3);
    }

    @Override // com.google.protobuf.F0
    public final boolean d(long j, Object obj) {
        return this.f12093a.getBoolean(obj, j);
    }

    @Override // com.google.protobuf.F0
    public final byte e(long j) {
        return this.f12093a.getByte(j);
    }

    @Override // com.google.protobuf.F0
    public final byte f(long j, Object obj) {
        return this.f12093a.getByte(obj, j);
    }

    @Override // com.google.protobuf.F0
    public final double g(long j, Object obj) {
        return this.f12093a.getDouble(obj, j);
    }

    @Override // com.google.protobuf.F0
    public final float h(long j, Object obj) {
        return this.f12093a.getFloat(obj, j);
    }

    @Override // com.google.protobuf.F0
    public final void m(Object obj, long j, boolean z2) {
        this.f12093a.putBoolean(obj, j, z2);
    }

    @Override // com.google.protobuf.F0
    public final void n(Object obj, long j, byte b2) {
        this.f12093a.putByte(obj, j, b2);
    }

    @Override // com.google.protobuf.F0
    public final void o(Object obj, long j, double d8) {
        this.f12093a.putDouble(obj, j, d8);
    }

    @Override // com.google.protobuf.F0
    public final void p(Object obj, long j, float f10) {
        this.f12093a.putFloat(obj, j, f10);
    }

    @Override // com.google.protobuf.F0
    public final boolean t() {
        if (!super.t()) {
            return false;
        }
        try {
            Class<?> cls = this.f12093a.getClass();
            String string2 = StubApp.getString2("12608");
            Class cls2 = Long.TYPE;
            cls.getMethod(string2, Object.class, cls2);
            cls.getMethod(StubApp.getString2("12609"), Object.class, cls2, Byte.TYPE);
            cls.getMethod(StubApp.getString2("12610"), Object.class, cls2);
            cls.getMethod(StubApp.getString2("12611"), Object.class, cls2, Boolean.TYPE);
            cls.getMethod(StubApp.getString2("12612"), Object.class, cls2);
            cls.getMethod(StubApp.getString2("12613"), Object.class, cls2, Float.TYPE);
            cls.getMethod(StubApp.getString2("12614"), Object.class, cls2);
            cls.getMethod(StubApp.getString2("12615"), Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            G0.a(th);
            return false;
        }
    }

    @Override // com.google.protobuf.F0
    public final boolean u() {
        String string2 = StubApp.getString2(12616);
        String string22 = StubApp.getString2(11833);
        Unsafe unsafe = this.f12093a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod(StubApp.getString2("11834"), Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod(string22, Object.class, cls2);
                if (G0.e() != null) {
                    try {
                        Class<?> cls3 = this.f12093a.getClass();
                        cls3.getMethod(StubApp.getString2("12608"), cls2);
                        cls3.getMethod(StubApp.getString2("12609"), cls2, Byte.TYPE);
                        cls3.getMethod(StubApp.getString2("11837"), cls2);
                        cls3.getMethod(StubApp.getString2("11838"), cls2, Integer.TYPE);
                        cls3.getMethod(string22, cls2);
                        cls3.getMethod(StubApp.getString2("11839"), cls2, cls2);
                        cls3.getMethod(string2, cls2, cls2, cls2);
                        cls3.getMethod(string2, Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        G0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                G0.a(th2);
            }
        }
        return false;
    }
}
