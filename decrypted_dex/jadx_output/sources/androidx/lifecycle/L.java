package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import i0.AbstractC1030c;
import i0.C1028a;
import i0.C1031d;
import j0.C1071a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final I4.e f9880a = new I4.e(27);

    /* renamed from: b, reason: collision with root package name */
    public static final u5.d f9881b = new u5.d(27);

    /* renamed from: c, reason: collision with root package name */
    public static final C2.i f9882c = new C2.i();

    /* renamed from: d, reason: collision with root package name */
    public static final C2.i f9883d = new C2.i();

    public static final void a(S viewModel, E0 registry, AbstractC0440o lifecycle) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        viewModel.getClass();
        Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
        C1071a c1071a = viewModel.f9896a;
        if (c1071a != null) {
            Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
            synchronized (c1071a.f15220a) {
                autoCloseable = (AutoCloseable) c1071a.f15221b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        J j = (J) autoCloseable;
        if (j == null || j.f9879c) {
            return;
        }
        j.a(lifecycle, registry);
        EnumC0439n enumC0439n = ((C0446v) lifecycle).f9925c;
        if (enumC0439n == EnumC0439n.f9914b || enumC0439n.a(EnumC0439n.f9916d)) {
            registry.M();
        } else {
            lifecycle.a(new C0431f(lifecycle, registry));
        }
    }

    public static final I b(C1031d c1031d) {
        I i3;
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(c1031d, "<this>");
        M1.e eVar = (M1.e) c1031d.a(f9880a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        W w10 = (W) c1031d.a(f9881b);
        if (w10 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle source = (Bundle) c1031d.a(f9882c);
        String key = (String) c1031d.a(f9883d);
        if (key == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        M1.d C10 = eVar.f().C();
        Bundle bundle = null;
        M m4 = C10 instanceof M ? (M) C10 : null;
        if (m4 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        N d8 = d(w10);
        I i10 = (I) d8.f9888b.get(key);
        if (i10 != null) {
            return i10;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        m4.b();
        Bundle source2 = m4.f9886c;
        if (source2 != null) {
            Intrinsics.checkNotNullParameter(source2, "source");
            Intrinsics.checkNotNullParameter(key, "key");
            if (source2.containsKey(key)) {
                Intrinsics.checkNotNullParameter(source2, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                Bundle source3 = source2.getBundle(key);
                if (source3 == null) {
                    Map emptyMap = MapsKt.emptyMap();
                    if (emptyMap.isEmpty()) {
                        pairArr = new Pair[0];
                    } else {
                        ArrayList arrayList = new ArrayList(emptyMap.size());
                        for (Map.Entry entry : emptyMap.entrySet()) {
                            arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
                        }
                        pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                    }
                    source3 = AbstractC0624h2.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                    Intrinsics.checkNotNullParameter(source3, "source");
                }
                Intrinsics.checkNotNullParameter(source2, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                source2.remove(key);
                Intrinsics.checkNotNullParameter(source2, "source");
                if (source2.isEmpty()) {
                    m4.f9886c = null;
                }
                bundle = source3;
            }
        }
        if (bundle != null) {
            source = bundle;
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
        d8.f9888b.put(key, i3);
        return i3;
    }

    public static final void c(M1.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        EnumC0439n enumC0439n = eVar.i().f9925c;
        if (enumC0439n != EnumC0439n.f9914b && enumC0439n != EnumC0439n.f9915c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (eVar.f().C() == null) {
            M m4 = new M(eVar.f(), (W) eVar);
            eVar.f().K("androidx.lifecycle.internal.SavedStateHandlesProvider", m4);
            eVar.i().a(new M1.b(m4));
        }
    }

    public static final N d(W owner) {
        Intrinsics.checkNotNullParameter(owner, "<this>");
        K factory = new K();
        Intrinsics.checkNotNullParameter(owner, "owner");
        AbstractC1030c defaultCreationExtras = owner instanceof InterfaceC0434i ? ((InterfaceC0434i) owner).d() : C1028a.f14702b;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "extras");
        V store = owner.e();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        D5.B b2 = new D5.B(store, factory, defaultCreationExtras);
        KClass modelClass = Reflection.getOrCreateKotlinClass(N.class);
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesVM", "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (N) b2.E(modelClass, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void e(View view, InterfaceC0444t interfaceC0444t) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(2131231163, interfaceC0444t);
    }
}
