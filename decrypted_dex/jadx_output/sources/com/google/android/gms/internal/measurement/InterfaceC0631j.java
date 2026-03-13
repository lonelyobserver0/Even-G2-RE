package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import p0.AbstractC1482f;

/* renamed from: com.google.android.gms.internal.measurement.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface InterfaceC0631j {
    static InterfaceC0651n j(InterfaceC0631j interfaceC0631j, C0666q c0666q, p2.h hVar, ArrayList arrayList) {
        String str = c0666q.f11647a;
        if (interfaceC0631j.l(str)) {
            InterfaceC0651n f10 = interfaceC0631j.f(str);
            if (f10 instanceof AbstractC0621h) {
                return ((AbstractC0621h) f10).e(hVar, arrayList);
            }
            throw new IllegalArgumentException(AbstractC1482f.g(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(E1.a.j("Object has no function ", str));
        }
        a4.f.L(1, "hasOwnProperty", arrayList);
        return interfaceC0631j.l(((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(0)).b()) ? InterfaceC0651n.f11624c0 : InterfaceC0651n.f11625d0;
    }

    InterfaceC0651n f(String str);

    void g(String str, InterfaceC0651n interfaceC0651n);

    boolean l(String str);
}
