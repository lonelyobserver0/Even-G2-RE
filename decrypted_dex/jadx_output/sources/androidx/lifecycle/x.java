package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f9933a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f9934b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0443s interfaceC0443s) {
        try {
            Object newInstance = constructor.newInstance(interfaceC0443s);
            Intrinsics.checkNotNull(newInstance);
            if (newInstance == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static final String b(String className) {
        String replace$default;
        Intrinsics.checkNotNullParameter(className, "className");
        StringBuilder sb2 = new StringBuilder();
        replace$default = StringsKt__StringsJVMKt.replace$default(className, ".", "_", false, 4, (Object) null);
        sb2.append(replace$default);
        sb2.append("_LifecycleAdapter");
        return sb2.toString();
    }

    public static int c(Class cls) {
        Constructor<?> constructor;
        boolean z2;
        HashMap hashMap = f9933a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i3 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r32 != null ? r32.getName() : "";
                Intrinsics.checkNotNull(name);
                if (name.length() != 0) {
                    Intrinsics.checkNotNull(canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    Intrinsics.checkNotNullExpressionValue(canonicalName, "substring(...)");
                }
                Intrinsics.checkNotNull(canonicalName);
                String b2 = b(canonicalName);
                if (name.length() != 0) {
                    b2 = name + '.' + b2;
                }
                Class<?> cls2 = Class.forName(b2);
                Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
                constructor = cls2.getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap hashMap2 = f9934b;
            if (constructor != null) {
                hashMap2.put(cls, CollectionsKt.listOf(constructor));
            } else {
                C0429d c0429d = C0429d.f9905c;
                HashMap hashMap3 = c0429d.f9907b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z2 = false;
                                break;
                            }
                            if (((B) declaredMethods[i10].getAnnotation(B.class)) != null) {
                                c0429d.a(cls, declaredMethods);
                                z2 = true;
                                break;
                            }
                            i10++;
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!z2) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0443s.class.isAssignableFrom(superclass)) {
                        Intrinsics.checkNotNull(superclass);
                        if (c(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            Intrinsics.checkNotNull(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Iterator it = ArrayIteratorKt.iterator(cls.getInterfaces());
                    while (true) {
                        if (it.hasNext()) {
                            Class cls3 = (Class) it.next();
                            if (cls3 != null && InterfaceC0443s.class.isAssignableFrom(cls3)) {
                                Intrinsics.checkNotNull(cls3);
                                if (c(cls3) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls3);
                                Intrinsics.checkNotNull(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i3 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i3));
        return i3;
    }
}
