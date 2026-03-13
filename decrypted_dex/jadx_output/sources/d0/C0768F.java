package d0;

import com.stub.StubApp;
import i.AbstractActivityC1027h;
import java.lang.reflect.InvocationTargetException;
import t.C1697j;

/* renamed from: d0.F, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0768F {

    /* renamed from: b, reason: collision with root package name */
    public static final C1697j f13133b = new C1697j(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f13134a;

    public C0768F(M m4) {
        this.f13134a = m4;
    }

    public static Class b(ClassLoader classLoader, String str) {
        C1697j c1697j = f13133b;
        C1697j c1697j2 = (C1697j) c1697j.get(classLoader);
        if (c1697j2 == null) {
            c1697j2 = new C1697j(0);
            c1697j.put(classLoader, c1697j2);
        }
        Class cls = (Class) c1697j2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c1697j2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        String string2 = StubApp.getString2(16464);
        try {
            return b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new H9.b(E1.a.k(string2, str, StubApp.getString2(16465)), e10);
        } catch (ClassNotFoundException e11) {
            throw new H9.b(E1.a.k(string2, str, StubApp.getString2(16466)), e11);
        }
    }

    public final AbstractComponentCallbacksC0789t a(String str) {
        AbstractActivityC1027h abstractActivityC1027h = this.f13134a.f13179w.f13392b;
        String string2 = StubApp.getString2(16467);
        String string22 = StubApp.getString2(16464);
        try {
            return (AbstractComponentCallbacksC0789t) c(abstractActivityC1027h.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new H9.b(E1.a.k(string22, str, string2), e10);
        } catch (InstantiationException e11) {
            throw new H9.b(E1.a.k(string22, str, string2), e11);
        } catch (NoSuchMethodException e12) {
            throw new H9.b(E1.a.k(string22, str, StubApp.getString2(16469)), e12);
        } catch (InvocationTargetException e13) {
            throw new H9.b(E1.a.k(string22, str, StubApp.getString2(16468)), e13);
        }
    }
}
