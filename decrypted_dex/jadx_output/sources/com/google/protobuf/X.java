package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class X extends Z {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f12134c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i3, long j, Object obj) {
        List list = (List) G0.f12099c.k(j, obj);
        if (list.isEmpty()) {
            List v2 = list instanceof W ? new V(i3) : ((list instanceof q0) && (list instanceof P)) ? ((P) list).e(i3) : new ArrayList(i3);
            G0.p(obj, j, v2);
            return v2;
        }
        if (f12134c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i3);
            arrayList.addAll(list);
            G0.p(obj, j, arrayList);
            return arrayList;
        }
        if (list instanceof B0) {
            V v8 = new V(list.size() + i3);
            v8.addAll((B0) list);
            G0.p(obj, j, v8);
            return v8;
        }
        if ((list instanceof q0) && (list instanceof P)) {
            P p8 = (P) list;
            if (!((AbstractC0721d) p8).f12144a) {
                P e10 = p8.e(list.size() + i3);
                G0.p(obj, j, e10);
                return e10;
            }
        }
        return list;
    }

    @Override // com.google.protobuf.Z
    public final void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) G0.f12099c.k(j, obj);
        if (list instanceof W) {
            unmodifiableList = ((W) list).v();
        } else {
            if (f12134c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof q0) && (list instanceof P)) {
                AbstractC0721d abstractC0721d = (AbstractC0721d) ((P) list);
                boolean z2 = abstractC0721d.f12144a;
                if (z2 && z2) {
                    abstractC0721d.f12144a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        G0.p(obj, j, unmodifiableList);
    }

    @Override // com.google.protobuf.Z
    public final void b(Object obj, long j, Object obj2) {
        List list = (List) G0.f12099c.k(j, obj2);
        List d8 = d(list.size(), j, obj);
        int size = d8.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d8.addAll(list);
        }
        if (size > 0) {
            list = d8;
        }
        G0.p(obj, j, list);
    }

    @Override // com.google.protobuf.Z
    public final List c(long j, Object obj) {
        return d(10, j, obj);
    }
}
