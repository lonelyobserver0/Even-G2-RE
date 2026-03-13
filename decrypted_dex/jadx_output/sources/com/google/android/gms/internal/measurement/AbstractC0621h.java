package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0621h implements InterfaceC0651n, InterfaceC0631j {

    /* renamed from: a, reason: collision with root package name */
    public final String f11576a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f11577b = new HashMap();

    public AbstractC0621h(String str) {
        this.f11576a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final String b() {
        return this.f11576a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Iterator c() {
        return new C0626i(this.f11577b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Double d() {
        return Double.valueOf(Double.NaN);
    }

    public abstract InterfaceC0651n e(p2.h hVar, List list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0621h)) {
            return false;
        }
        AbstractC0621h abstractC0621h = (AbstractC0621h) obj;
        String str = this.f11576a;
        if (str != null) {
            return str.equals(abstractC0621h.f11576a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0631j
    public final InterfaceC0651n f(String str) {
        HashMap hashMap = this.f11577b;
        return hashMap.containsKey(str) ? (InterfaceC0651n) hashMap.get(str) : InterfaceC0651n.f11619U;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0631j
    public final void g(String str, InterfaceC0651n interfaceC0651n) {
        HashMap hashMap = this.f11577b;
        if (interfaceC0651n == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, interfaceC0651n);
        }
    }

    public final int hashCode() {
        String str = this.f11576a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n i(String str, p2.h hVar, ArrayList arrayList) {
        return StubApp.getString2(11908).equals(str) ? new C0666q(this.f11576a) : InterfaceC0631j.j(this, new C0666q(str), hVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0631j
    public final boolean l(String str) {
        return this.f11577b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public InterfaceC0651n m() {
        return this;
    }
}
