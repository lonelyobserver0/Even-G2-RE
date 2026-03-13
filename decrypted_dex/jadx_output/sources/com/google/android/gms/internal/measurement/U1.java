package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum U1 implements InterfaceC0649m2 {
    f11379b(0),
    f11380c(1),
    f11381d(2),
    f11382e(3),
    f11383f(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f11385a;

    U1(int i3) {
        this.f11385a = i3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0649m2
    public final int a() {
        if (this != f11383f) {
            return this.f11385a;
        }
        throw new IllegalArgumentException(StubApp.getString2(10075));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11385a);
    }
}
