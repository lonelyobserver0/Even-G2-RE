package I;

import C.n;
import M.d;
import a4.f;
import android.location.LocationRequest;
import android.os.Build;
import com.stub.StubApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.LongCompanionObject;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f3018a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3019b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3020c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3021d;

    public c(long j, int i3, long j3, float f10) {
        this.f3019b = j;
        this.f3018a = i3;
        this.f3020c = j3;
        this.f3021d = f10;
    }

    public final LocationRequest a(String str) {
        long j = this.f3019b;
        if (Build.VERSION.SDK_INT >= 31) {
            return a.c(this);
        }
        Object obj = null;
        try {
            if (f.f9274c == null) {
                f.f9274c = Class.forName(StubApp.getString2("1100"));
            }
            Method method = f.f9275d;
            Class cls = Long.TYPE;
            if (method == null) {
                Method declaredMethod = f.f9274c.getDeclaredMethod(StubApp.getString2("2763"), String.class, cls, Float.TYPE, Boolean.TYPE);
                f.f9275d = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object invoke = f.f9275d.invoke(null, str, Long.valueOf(j), Float.valueOf(this.f3021d), Boolean.FALSE);
            if (invoke != null) {
                Method method2 = f.f9276e;
                Class cls2 = Integer.TYPE;
                if (method2 == null) {
                    Method declaredMethod2 = f.f9274c.getDeclaredMethod(StubApp.getString2("2764"), cls2);
                    f.f9276e = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f.f9276e.invoke(invoke, Integer.valueOf(this.f3018a));
                if (f.f9277f == null) {
                    Method declaredMethod3 = f.f9274c.getDeclaredMethod(StubApp.getString2("2765"), cls);
                    f.f9277f = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                Method method3 = f.f9277f;
                long j3 = this.f3020c;
                if (j3 != -1) {
                    j = j3;
                }
                method3.invoke(invoke, Long.valueOf(j));
                obj = invoke;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return n.c(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3018a == cVar.f3018a && this.f3019b == cVar.f3019b && this.f3020c == cVar.f3020c && Float.compare(cVar.f3021d, this.f3021d) == 0;
    }

    public final int hashCode() {
        int i3 = this.f3018a * 31;
        long j = this.f3019b;
        int i10 = (i3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.f3020c;
        return i10 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder b2 = AbstractC1856e.b(StubApp.getString2(2766));
        long j = this.f3019b;
        if (j != LongCompanionObject.MAX_VALUE) {
            b2.append(StubApp.getString2(893));
            d.f(j, b2);
            int i3 = this.f3018a;
            if (i3 == 100) {
                b2.append(StubApp.getString2(2769));
            } else if (i3 == 102) {
                b2.append(StubApp.getString2(2768));
            } else if (i3 == 104) {
                b2.append(StubApp.getString2(2767));
            }
        } else {
            b2.append(StubApp.getString2(2770));
        }
        long j3 = this.f3020c;
        if (j3 != -1 && j3 < j) {
            b2.append(StubApp.getString2(2771));
            d.f(j3, b2);
        }
        float f10 = this.f3021d;
        if (f10 > 0.0d) {
            b2.append(StubApp.getString2(2772));
            b2.append(f10);
        }
        if (0 > j) {
            b2.append(StubApp.getString2(2773));
            d.f(0L, b2);
        }
        b2.append(']');
        return b2.toString();
    }
}
