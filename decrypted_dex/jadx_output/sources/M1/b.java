package M1;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C0435j;
import androidx.lifecycle.EnumC0438m;
import androidx.lifecycle.InterfaceC0433h;
import androidx.lifecycle.InterfaceC0444t;
import androidx.lifecycle.L;
import androidx.lifecycle.M;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import androidx.lifecycle.r;
import com.stub.StubApp;
import d.h;
import d0.AbstractComponentCallbacksC0789t;
import i.AbstractActivityC1027h;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4510a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4511b;

    public /* synthetic */ b(Object obj, int i3) {
        this.f4510a = i3;
        this.f4511b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void h(InterfaceC0444t source, EnumC0438m event) {
        View view;
        switch (this.f4510a) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != EnumC0438m.ON_CREATE) {
                    throw new AssertionError(StubApp.getString2(3489));
                }
                source.i().b(this);
                e owner = (e) this.f4511b;
                Bundle source2 = owner.f().w(StubApp.getString2(3480));
                if (source2 == null) {
                    return;
                }
                Intrinsics.checkNotNullParameter(source2, "source");
                String key = StubApp.getString2(3481);
                Intrinsics.checkNotNullParameter(key, "key");
                ArrayList<String> stringArrayList = source2.getStringArrayList(key);
                if (stringArrayList == null) {
                    throw new IllegalStateException(StubApp.getString2(3488));
                }
                for (String str : stringArrayList) {
                    String string2 = StubApp.getString2(3483);
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        Intrinsics.checkNotNull(asSubclass);
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                Intrinsics.checkNotNull(newInstance);
                                ((C0435j) ((c) newInstance)).getClass();
                                Intrinsics.checkNotNullParameter(owner, "owner");
                                if (!(owner instanceof W)) {
                                    throw new IllegalStateException((StubApp.getString2(3484) + owner).toString());
                                }
                                V e10 = ((W) owner).e();
                                E0 f10 = owner.f();
                                e10.getClass();
                                LinkedHashMap linkedHashMap = e10.f9900a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String key2 = (String) it.next();
                                    Intrinsics.checkNotNullParameter(key2, "key");
                                    S s10 = (S) linkedHashMap.get(key2);
                                    if (s10 != null) {
                                        L.a(s10, f10, owner.i());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    f10.M();
                                }
                            } catch (Exception e11) {
                                throw new RuntimeException(E1.a.j(StubApp.getString2(3485), str), e11);
                            }
                        } catch (NoSuchMethodException e12) {
                            throw new IllegalStateException(string2 + asSubclass.getSimpleName() + StubApp.getString2(3486), e12);
                        }
                    } catch (ClassNotFoundException e13) {
                        throw new RuntimeException(E1.a.k(string2, str, StubApp.getString2(3487)), e13);
                    }
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                new HashMap();
                InterfaceC0433h[] interfaceC0433hArr = (InterfaceC0433h[]) this.f4511b;
                if (interfaceC0433hArr.length > 0) {
                    InterfaceC0433h interfaceC0433h = interfaceC0433hArr[0];
                    throw null;
                }
                if (interfaceC0433hArr.length <= 0) {
                    return;
                }
                InterfaceC0433h interfaceC0433h2 = interfaceC0433hArr[0];
                throw null;
            case 2:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != EnumC0438m.ON_CREATE) {
                    throw new IllegalStateException((StubApp.getString2(3482) + event).toString());
                }
                source.i().b(this);
                ((M) this.f4511b).b();
                return;
            case 3:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                AbstractActivityC1027h abstractActivityC1027h = (AbstractActivityC1027h) this.f4511b;
                if (abstractActivityC1027h.f13080e == null) {
                    h hVar = (h) abstractActivityC1027h.getLastNonConfigurationInstance();
                    if (hVar != null) {
                        abstractActivityC1027h.f13080e = hVar.f13060a;
                    }
                    if (abstractActivityC1027h.f13080e == null) {
                        abstractActivityC1027h.f13080e = new V();
                    }
                }
                abstractActivityC1027h.f13076a.b(this);
                return;
            default:
                if (event != EnumC0438m.ON_STOP || (view = ((AbstractComponentCallbacksC0789t) this.f4511b).f13354I) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
        }
    }

    public b(InterfaceC0433h[] generatedAdapters) {
        this.f4510a = 1;
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f4511b = generatedAdapters;
    }

    public b(e owner) {
        this.f4510a = 0;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f4511b = owner;
    }

    public b(M provider) {
        this.f4510a = 2;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f4511b = provider;
    }
}
