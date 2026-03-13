package V1;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import t.C1692e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final C1692e f7712a;

    /* renamed from: b, reason: collision with root package name */
    public final C1692e f7713b;

    /* renamed from: c, reason: collision with root package name */
    public final C1692e f7714c;

    public a(C1692e c1692e, C1692e c1692e2, C1692e c1692e3) {
        this.f7712a = c1692e;
        this.f7713b = c1692e2;
        this.f7714c = c1692e3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C1692e c1692e = this.f7714c;
        Class cls2 = (Class) c1692e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + StubApp.getString2(1) + cls.getSimpleName() + StubApp.getString2(6484), false, cls.getClassLoader());
        c1692e.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C1692e c1692e = this.f7712a;
        Method method = (Method) c1692e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod(StubApp.getString2(6485), a.class);
        c1692e.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C1692e c1692e = this.f7713b;
        Method method = (Method) c1692e.get(name);
        if (method != null) {
            return method;
        }
        Class b2 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b2.getDeclaredMethod(StubApp.getString2(6486), cls, a.class);
        c1692e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i3);

    public final int f(int i3, int i10) {
        return !e(i10) ? i3 : ((b) this).f7716e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i3) {
        if (!e(i3)) {
            return parcelable;
        }
        return ((b) this).f7716e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String readString = ((b) this).f7716e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(StubApp.getString2(6487), e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(StubApp.getString2(6490), e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(StubApp.getString2(6488), e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException(StubApp.getString2(6489), e13);
        }
    }

    public abstract void i(int i3);

    public final void j(int i3, int i10) {
        i(i10);
        ((b) this).f7716e.writeInt(i3);
    }

    public final void k(Parcelable parcelable, int i3) {
        i(i3);
        ((b) this).f7716e.writeParcelable(parcelable, 0);
    }

    public final void l(c cVar) {
        if (cVar == null) {
            ((b) this).f7716e.writeString(null);
            return;
        }
        try {
            ((b) this).f7716e.writeString(b(cVar.getClass()).getName());
            b a3 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a3);
                int i3 = a3.f7720i;
                if (i3 >= 0) {
                    int i10 = a3.f7715d.get(i3);
                    Parcel parcel = a3.f7716e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i10);
                    parcel.writeInt(dataPosition - i10);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(StubApp.getString2(6487), e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(StubApp.getString2(6490), e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException(StubApp.getString2(6488), e12);
            } catch (InvocationTargetException e13) {
                if (!(e13.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException(StubApp.getString2(6489), e13);
                }
                throw ((RuntimeException) e13.getCause());
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(StubApp.getString2(6491)), e14);
        }
    }
}
