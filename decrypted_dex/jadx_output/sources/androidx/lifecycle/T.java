package androidx.lifecycle;

import android.app.Application;
import i0.C1031d;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class T extends u5.d {

    /* renamed from: e, reason: collision with root package name */
    public static T f9897e;

    /* renamed from: f, reason: collision with root package name */
    public static final I4.e f9898f = new I4.e(28);

    /* renamed from: d, reason: collision with root package name */
    public final Application f9899d;

    public T(Application application) {
        super(28);
        this.f9899d = application;
    }

    @Override // u5.d, androidx.lifecycle.U
    public final S b(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Application application = this.f9899d;
        if (application != null) {
            return v(modelClass, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // u5.d, androidx.lifecycle.U
    public final S f(Class modelClass, C1031d extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (this.f9899d != null) {
            return b(modelClass);
        }
        Application application = (Application) extras.a(f9898f);
        if (application != null) {
            return v(modelClass, application);
        }
        if (AbstractC0426a.class.isAssignableFrom(modelClass)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.b(modelClass);
    }

    public final S v(Class cls, Application application) {
        if (!AbstractC0426a.class.isAssignableFrom(cls)) {
            return super.b(cls);
        }
        try {
            S s10 = (S) cls.getConstructor(Application.class).newInstance(application);
            Intrinsics.checkNotNull(s10);
            return s10;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Cannot create an instance of " + cls, e13);
        }
    }
}
