package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0427b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9901a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9902b;

    public C0427b(HashMap hashMap) {
        this.f9902b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0438m enumC0438m = (EnumC0438m) entry.getValue();
            List list = (List) this.f9901a.get(enumC0438m);
            if (list == null) {
                list = new ArrayList();
                this.f9901a.put(enumC0438m, list);
            }
            list.add((C0428c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0444t interfaceC0444t, EnumC0438m enumC0438m, InterfaceC0443s interfaceC0443s) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0428c c0428c = (C0428c) list.get(size);
                c0428c.getClass();
                try {
                    int i3 = c0428c.f9903a;
                    Method method = c0428c.f9904b;
                    if (i3 == 0) {
                        method.invoke(interfaceC0443s, new Object[0]);
                    } else if (i3 == 1) {
                        method.invoke(interfaceC0443s, interfaceC0444t);
                    } else if (i3 == 2) {
                        method.invoke(interfaceC0443s, interfaceC0444t, enumC0438m);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}
