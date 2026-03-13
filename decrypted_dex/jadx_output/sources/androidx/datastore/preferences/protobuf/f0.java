package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f0 extends g0 {
    @Override // androidx.datastore.preferences.protobuf.g0
    public final boolean c(long j, Object obj) {
        return this.f9784a.getBoolean(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final double d(long j, Object obj) {
        return this.f9784a.getDouble(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final float e(long j, Object obj) {
        return this.f9784a.getFloat(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final void j(Object obj, long j, boolean z2) {
        this.f9784a.putBoolean(obj, j, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final void k(Object obj, long j, byte b2) {
        this.f9784a.putByte(obj, j, b2);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final void l(Object obj, long j, double d8) {
        this.f9784a.putDouble(obj, j, d8);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final void m(Object obj, long j, float f10) {
        this.f9784a.putFloat(obj, j, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f9784a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            h0.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final boolean r() {
        Unsafe unsafe = this.f9784a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (h0.g() != null) {
                    try {
                        Class<?> cls3 = this.f9784a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        h0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                h0.a(th2);
            }
        }
        return false;
    }
}
