package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0636k implements InterfaceC0651n, InterfaceC0631j {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11596a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final String b() {
        return StubApp.getString2(12117);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Iterator c() {
        return new C0626i(this.f11596a.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Double d() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0636k) {
            return this.f11596a.equals(((C0636k) obj).f11596a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0631j
    public final InterfaceC0651n f(String str) {
        HashMap hashMap = this.f11596a;
        return hashMap.containsKey(str) ? (InterfaceC0651n) hashMap.get(str) : InterfaceC0651n.f11619U;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0631j
    public final void g(String str, InterfaceC0651n interfaceC0651n) {
        HashMap hashMap = this.f11596a;
        if (interfaceC0651n == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, interfaceC0651n);
        }
    }

    public final int hashCode() {
        return this.f11596a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public InterfaceC0651n i(String str, p2.h hVar, ArrayList arrayList) {
        return StubApp.getString2(11908).equals(str) ? new C0666q(toString()) : InterfaceC0631j.j(this, new C0666q(str), hVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0631j
    public final boolean l(String str) {
        return this.f11596a.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n m() {
        C0636k c0636k = new C0636k();
        for (Map.Entry entry : this.f11596a.entrySet()) {
            boolean z2 = entry.getValue() instanceof InterfaceC0631j;
            HashMap hashMap = c0636k.f11596a;
            if (z2) {
                hashMap.put((String) entry.getKey(), (InterfaceC0651n) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((InterfaceC0651n) entry.getValue()).m());
            }
        }
        return c0636k;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1352));
        HashMap hashMap = this.f11596a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb2.append(String.format(StubApp.getString2(12118), str, hashMap.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(StubApp.getString2(321)));
        }
        sb2.append(StubApp.getString2(265));
        return sb2.toString();
    }
}
