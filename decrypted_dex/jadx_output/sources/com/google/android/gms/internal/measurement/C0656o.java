package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0656o implements InterfaceC0651n {

    /* renamed from: a, reason: collision with root package name */
    public final String f11632a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11633b;

    public C0656o(ArrayList arrayList, String str) {
        this.f11632a = str;
        ArrayList arrayList2 = new ArrayList();
        this.f11633b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Boolean a() {
        throw new IllegalStateException(StubApp.getString2(12183));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final String b() {
        throw new IllegalStateException(StubApp.getString2(12184));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Iterator c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Double d() {
        throw new IllegalStateException(StubApp.getString2(12185));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0656o)) {
            return false;
        }
        C0656o c0656o = (C0656o) obj;
        String str = this.f11632a;
        if (str == null ? c0656o.f11632a == null : str.equals(c0656o.f11632a)) {
            return this.f11633b.equals(c0656o.f11633b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11632a;
        return this.f11633b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n i(String str, p2.h hVar, ArrayList arrayList) {
        throw new IllegalStateException(StubApp.getString2(12186));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n m() {
        return this;
    }
}
