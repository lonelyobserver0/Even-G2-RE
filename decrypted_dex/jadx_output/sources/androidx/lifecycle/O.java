package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import i0.C1031d;
import j0.C1071a;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class O implements U {

    /* renamed from: a, reason: collision with root package name */
    public final Application f9889a;

    /* renamed from: b, reason: collision with root package name */
    public final T f9890b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f9891c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0440o f9892d;

    /* renamed from: e, reason: collision with root package name */
    public final E0 f9893e;

    public O(Application application, M1.e owner, Bundle bundle) {
        T t3;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f9893e = owner.f();
        this.f9892d = owner.i();
        this.f9891c = bundle;
        this.f9889a = application;
        if (application != null) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (T.f9897e == null) {
                Intrinsics.checkNotNullParameter(application, "application");
                T.f9897e = new T(application);
            }
            t3 = T.f9897e;
            Intrinsics.checkNotNull(t3);
        } else {
            t3 = new T(null);
        }
        this.f9890b = t3;
    }

    public final S a(Class modelClass, String key) {
        I i3;
        S b2;
        AutoCloseable autoCloseable;
        Application application;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        AbstractC0440o lifecycle = this.f9892d;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0426a.class.isAssignableFrom(modelClass);
        Constructor a3 = (!isAssignableFrom || this.f9889a == null) ? P.a(modelClass, P.f9895b) : P.a(modelClass, P.f9894a);
        if (a3 == null) {
            if (this.f9889a != null) {
                return this.f9890b.b(modelClass);
            }
            if (u5.d.f21451c == null) {
                u5.d.f21451c = new u5.d(28);
            }
            u5.d dVar = u5.d.f21451c;
            Intrinsics.checkNotNull(dVar);
            return dVar.b(modelClass);
        }
        E0 registry = this.f9893e;
        Intrinsics.checkNotNull(registry);
        Bundle source = this.f9891c;
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(key);
        Bundle w10 = registry.w(key);
        if (w10 != null) {
            source = w10;
        }
        if (source == null) {
            i3 = new I();
        } else {
            ClassLoader classLoader = I.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            source.setClassLoader(classLoader);
            Intrinsics.checkNotNullParameter(source, "source");
            Map createMapBuilder = MapsKt.createMapBuilder(source.size());
            for (String str : source.keySet()) {
                Intrinsics.checkNotNull(str);
                createMapBuilder.put(str, source.get(str));
            }
            i3 = new I(MapsKt.build(createMapBuilder));
        }
        J closeable = new J(key, i3);
        closeable.a(lifecycle, registry);
        EnumC0439n enumC0439n = ((C0446v) lifecycle).f9925c;
        if (enumC0439n == EnumC0439n.f9914b || enumC0439n.a(EnumC0439n.f9916d)) {
            registry.M();
        } else {
            lifecycle.a(new C0431f(lifecycle, registry));
        }
        if (!isAssignableFrom || (application = this.f9889a) == null) {
            b2 = P.b(modelClass, a3, i3);
        } else {
            Intrinsics.checkNotNull(application);
            b2 = P.b(modelClass, a3, application, i3);
        }
        b2.getClass();
        Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        C1071a c1071a = b2.f9896a;
        if (c1071a == null) {
            return b2;
        }
        Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (c1071a.f15223d) {
            C1071a.a(closeable);
            return b2;
        }
        synchronized (c1071a.f15220a) {
            autoCloseable = (AutoCloseable) c1071a.f15221b.put("androidx.lifecycle.savedstate.vm.tag", closeable);
        }
        C1071a.a(autoCloseable);
        return b2;
    }

    @Override // androidx.lifecycle.U
    public final S b(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return a(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.U
    public final S f(Class modelClass, C1031d extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(L.f9883d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(L.f9880a) == null || extras.a(L.f9881b) == null) {
            if (this.f9892d != null) {
                return a(modelClass, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(T.f9898f);
        boolean isAssignableFrom = AbstractC0426a.class.isAssignableFrom(modelClass);
        Constructor a3 = (!isAssignableFrom || application == null) ? P.a(modelClass, P.f9895b) : P.a(modelClass, P.f9894a);
        return a3 == null ? this.f9890b.f(modelClass, extras) : (!isAssignableFrom || application == null) ? P.b(modelClass, a3, L.b(extras)) : P.b(modelClass, a3, application, L.b(extras));
    }

    @Override // androidx.lifecycle.U
    public final S n(KClass modelClass, C1031d extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return f(JvmClassMappingKt.getJavaClass(modelClass), extras);
    }
}
