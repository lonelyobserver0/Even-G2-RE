package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0646m extends AbstractC0621h {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f11612c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11613d;

    /* renamed from: e, reason: collision with root package name */
    public final p2.h f11614e;

    public C0646m(C0646m c0646m) {
        super(c0646m.f11576a);
        ArrayList arrayList = new ArrayList(c0646m.f11612c.size());
        this.f11612c = arrayList;
        arrayList.addAll(c0646m.f11612c);
        ArrayList arrayList2 = new ArrayList(c0646m.f11613d.size());
        this.f11613d = arrayList2;
        arrayList2.addAll(c0646m.f11613d);
        this.f11614e = c0646m.f11614e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0621h
    public final InterfaceC0651n e(p2.h hVar, List list) {
        r rVar;
        p2.h m4 = this.f11614e.m();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f11612c;
            int size = arrayList.size();
            rVar = InterfaceC0651n.f11619U;
            if (i3 >= size) {
                break;
            }
            if (i3 < list.size()) {
                m4.p((String) arrayList.get(i3), ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) list.get(i3)));
            } else {
                m4.p((String) arrayList.get(i3), rVar);
            }
            i3++;
        }
        Iterator it = this.f11613d.iterator();
        while (it.hasNext()) {
            InterfaceC0651n interfaceC0651n = (InterfaceC0651n) it.next();
            C0680t c0680t = (C0680t) m4.f19672b;
            InterfaceC0651n c10 = c0680t.c(m4, interfaceC0651n);
            if (c10 instanceof C0656o) {
                c10 = c0680t.c(m4, interfaceC0651n);
            }
            if (c10 instanceof C0611f) {
                return ((C0611f) c10).f11558a;
            }
        }
        return rVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0621h, com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n m() {
        return new C0646m(this);
    }

    public C0646m(String str, ArrayList arrayList, List list, p2.h hVar) {
        super(str);
        this.f11612c = new ArrayList();
        this.f11614e = hVar;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f11612c.add(((InterfaceC0651n) it.next()).b());
            }
        }
        this.f11613d = new ArrayList(list);
    }
}
