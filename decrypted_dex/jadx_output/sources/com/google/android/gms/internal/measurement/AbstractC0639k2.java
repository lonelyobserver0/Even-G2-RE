package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: com.google.android.gms.internal.measurement.k2, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0639k2 extends V1 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected P2 zzc;

    public AbstractC0639k2() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = P2.f11341f;
    }

    public static AbstractC0639k2 l(Class cls) {
        Map map = zzd;
        AbstractC0639k2 abstractC0639k2 = (AbstractC0639k2) map.get(cls);
        if (abstractC0639k2 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0639k2 = (AbstractC0639k2) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(StubApp.getString2(12106), e10);
            }
        }
        if (abstractC0639k2 != null) {
            return abstractC0639k2;
        }
        AbstractC0639k2 abstractC0639k22 = (AbstractC0639k2) ((AbstractC0639k2) U2.d(cls)).o(6);
        if (abstractC0639k22 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC0639k22);
        return abstractC0639k22;
    }

    public static void m(Class cls, AbstractC0639k2 abstractC0639k2) {
        abstractC0639k2.f();
        zzd.put(cls, abstractC0639k2);
    }

    public static Object n(Method method, V1 v12, Object... objArr) {
        try {
            return method.invoke(v12, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(StubApp.getString2(12108), e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(StubApp.getString2(12107), cause);
        }
    }

    @Override // com.google.android.gms.internal.measurement.V1
    public final int b(L2 l22) {
        boolean e10 = e();
        String string2 = StubApp.getString2(12109);
        if (e10) {
            int b2 = l22.b(this);
            if (b2 >= 0) {
                return b2;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(b2).length() + 42);
            sb2.append(string2);
            sb2.append(b2);
            throw new IllegalStateException(sb2.toString());
        }
        int i3 = this.zzb & IntCompanionObject.MAX_VALUE;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int b10 = l22.b(this);
        if (b10 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | b10;
            return b10;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(b10).length() + 42);
        sb3.append(string2);
        sb3.append(b10);
        throw new IllegalStateException(sb3.toString());
    }

    public final void d(C0599c2 c0599c2) {
        L2 a3 = I2.f11287c.a(getClass());
        C0708y2 c0708y2 = c0599c2.f11463e;
        if (c0708y2 == null) {
            c0708y2 = new C0708y2(c0599c2);
        }
        a3.d(this, c0708y2);
    }

    public final boolean e() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return I2.f11287c.a(getClass()).g(this, (AbstractC0639k2) obj);
    }

    public final void f() {
        this.zzb &= IntCompanionObject.MAX_VALUE;
    }

    public final void g() {
        I2.f11287c.a(getClass()).f(this);
        f();
    }

    public final AbstractC0634j2 h() {
        return (AbstractC0634j2) o(5);
    }

    public final int hashCode() {
        if (e()) {
            return I2.f11287c.a(getClass()).i(this);
        }
        int i3 = this.zza;
        if (i3 != 0) {
            return i3;
        }
        int i10 = I2.f11287c.a(getClass()).i(this);
        this.zza = i10;
        return i10;
    }

    public final AbstractC0634j2 i() {
        AbstractC0634j2 abstractC0634j2 = (AbstractC0634j2) o(5);
        abstractC0634j2.f(this);
        return abstractC0634j2;
    }

    public final void j() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | IntCompanionObject.MAX_VALUE;
    }

    public final int k() {
        boolean e10 = e();
        String string2 = StubApp.getString2(12109);
        if (e10) {
            int b2 = I2.f11287c.a(getClass()).b(this);
            if (b2 >= 0) {
                return b2;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(b2).length() + 42);
            sb2.append(string2);
            sb2.append(b2);
            throw new IllegalStateException(sb2.toString());
        }
        int i3 = this.zzb & IntCompanionObject.MAX_VALUE;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int b10 = I2.f11287c.a(getClass()).b(this);
        if (b10 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | b10;
            return b10;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(b10).length() + 42);
        sb3.append(string2);
        sb3.append(b10);
        throw new IllegalStateException(sb3.toString());
    }

    public abstract Object o(int i3);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = D2.f11247a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StubApp.getString2(12110));
        sb2.append(obj);
        D2.b(this, sb2, 0);
        return sb2.toString();
    }
}
