package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0611f implements InterfaceC0651n {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0651n f11558a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11559b;

    public C0611f(String str) {
        this.f11558a = InterfaceC0651n.f11619U;
        this.f11559b = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Boolean a() {
        throw new IllegalStateException(StubApp.getString2(12029));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final String b() {
        throw new IllegalStateException(StubApp.getString2(12030));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Iterator c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Double d() {
        throw new IllegalStateException(StubApp.getString2(12031));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0611f)) {
            return false;
        }
        C0611f c0611f = (C0611f) obj;
        return this.f11559b.equals(c0611f.f11559b) && this.f11558a.equals(c0611f.f11558a);
    }

    public final int hashCode() {
        return this.f11558a.hashCode() + (this.f11559b.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n i(String str, p2.h hVar, ArrayList arrayList) {
        throw new IllegalStateException(StubApp.getString2(12032));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n m() {
        return new C0611f(this.f11559b, this.f11558a.m());
    }

    public C0611f(String str, InterfaceC0651n interfaceC0651n) {
        this.f11558a = interfaceC0651n;
        this.f11559b = str;
    }
}
