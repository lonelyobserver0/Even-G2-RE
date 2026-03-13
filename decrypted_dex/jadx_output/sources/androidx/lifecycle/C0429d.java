package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0429d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0429d f9905c = new C0429d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9906a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9907b = new HashMap();

    public static void b(HashMap hashMap, C0428c c0428c, EnumC0438m enumC0438m, Class cls) {
        EnumC0438m enumC0438m2 = (EnumC0438m) hashMap.get(c0428c);
        if (enumC0438m2 == null || enumC0438m == enumC0438m2) {
            if (enumC0438m2 == null) {
                hashMap.put(c0428c, enumC0438m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0428c.f9904b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0438m2 + ", new value " + enumC0438m);
    }

    public final C0427b a(Class cls, Method[] methodArr) {
        int i3;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f9906a;
        if (superclass != null) {
            C0427b c0427b = (C0427b) hashMap2.get(superclass);
            if (c0427b == null) {
                c0427b = a(superclass, null);
            }
            hashMap.putAll(c0427b.f9902b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0427b c0427b2 = (C0427b) hashMap2.get(cls2);
            if (c0427b2 == null) {
                c0427b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0427b2.f9902b.entrySet()) {
                b(hashMap, (C0428c) entry.getKey(), (EnumC0438m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            B b2 = (B) method.getAnnotation(B.class);
            if (b2 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i3 = 0;
                } else {
                    if (!InterfaceC0444t.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i3 = 1;
                }
                EnumC0438m value = b2.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0438m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0438m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i3 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0428c(method, i3), value, cls);
                z2 = true;
            }
        }
        C0427b c0427b3 = new C0427b(hashMap);
        hashMap2.put(cls, c0427b3);
        this.f9907b.put(cls, Boolean.valueOf(z2));
        return c0427b3;
    }
}
