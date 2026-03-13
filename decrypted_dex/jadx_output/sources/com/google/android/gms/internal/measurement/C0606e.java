package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0606e implements InterfaceC0651n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11477a;

    public C0606e(Boolean bool) {
        this.f11477a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Boolean a() {
        return Boolean.valueOf(this.f11477a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final String b() {
        return Boolean.toString(this.f11477a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Iterator c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Double d() {
        return Double.valueOf(true != this.f11477a ? 0.0d : 1.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0606e) && this.f11477a == ((C0606e) obj).f11477a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f11477a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n i(String str, p2.h hVar, ArrayList arrayList) {
        boolean equals = StubApp.getString2(11908).equals(str);
        boolean z2 = this.f11477a;
        if (equals) {
            return new C0666q(Boolean.toString(z2));
        }
        throw new IllegalArgumentException(Boolean.toString(z2) + StubApp.getString2(1) + str + StubApp.getString2(12027));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n m() {
        return new C0606e(Boolean.valueOf(this.f11477a));
    }

    public final String toString() {
        return String.valueOf(this.f11477a);
    }
}
