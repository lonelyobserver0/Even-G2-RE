package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0420u extends AbstractC0401a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0420u> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected b0 unknownFields;

    public AbstractC0420u() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = b0.f9764f;
    }

    public static AbstractC0420u d(Class cls) {
        AbstractC0420u abstractC0420u = defaultInstanceMap.get(cls);
        if (abstractC0420u == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0420u = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC0420u != null) {
            return abstractC0420u;
        }
        AbstractC0420u abstractC0420u2 = (AbstractC0420u) ((AbstractC0420u) h0.d(cls)).c(6);
        if (abstractC0420u2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC0420u2);
        return abstractC0420u2;
    }

    public static Object e(Method method, AbstractC0401a abstractC0401a, Object... objArr) {
        try {
            return method.invoke(abstractC0401a, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean f(AbstractC0420u abstractC0420u, boolean z2) {
        byte byteValue = ((Byte) abstractC0420u.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        Q q10 = Q.f9734c;
        q10.getClass();
        boolean c10 = q10.a(abstractC0420u.getClass()).c(abstractC0420u);
        if (z2) {
            abstractC0420u.c(2);
        }
        return c10;
    }

    public static void j(Class cls, AbstractC0420u abstractC0420u) {
        abstractC0420u.h();
        defaultInstanceMap.put(cls, abstractC0420u);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0401a
    public final int a(U u2) {
        int g10;
        int g11;
        if (g()) {
            if (u2 == null) {
                Q q10 = Q.f9734c;
                q10.getClass();
                g11 = q10.a(getClass()).g(this);
            } else {
                g11 = u2.g(this);
            }
            if (g11 >= 0) {
                return g11;
            }
            throw new IllegalStateException(i2.u.p(g11, "serialized size must be non-negative, was "));
        }
        int i3 = this.memoizedSerializedSize;
        if ((i3 & IntCompanionObject.MAX_VALUE) != Integer.MAX_VALUE) {
            return i3 & IntCompanionObject.MAX_VALUE;
        }
        if (u2 == null) {
            Q q11 = Q.f9734c;
            q11.getClass();
            g10 = q11.a(getClass()).g(this);
        } else {
            g10 = u2.g(this);
        }
        k(g10);
        return g10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0401a
    public final void b(C0411k c0411k) {
        Q q10 = Q.f9734c;
        q10.getClass();
        U a3 = q10.a(getClass());
        D d8 = c0411k.f9811b;
        if (d8 == null) {
            d8 = new D(c0411k);
        }
        a3.e(this, d8);
    }

    public abstract Object c(int i3);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Q q10 = Q.f9734c;
        q10.getClass();
        return q10.a(getClass()).i(this, (AbstractC0420u) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= IntCompanionObject.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            Q q10 = Q.f9734c;
            q10.getClass();
            return q10.a(getClass()).h(this);
        }
        if (this.memoizedHashCode == 0) {
            Q q11 = Q.f9734c;
            q11.getClass();
            this.memoizedHashCode = q11.a(getClass()).h(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC0420u i() {
        return (AbstractC0420u) c(4);
    }

    public final void k(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException(i2.u.p(i3, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i3 & IntCompanionObject.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = K.f9714a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        K.c(this, sb2, 0);
        return sb2.toString();
    }
}
