package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum T1 implements InterfaceC0649m2 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(0),
    f11364b(1),
    f11365c(2),
    f11366d(3),
    f11367e(4),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(5),
    /* JADX INFO: Fake field, exist only in values array */
    EF6(6),
    f11368f(7),
    /* JADX INFO: Fake field, exist only in values array */
    EF8(8),
    f11369g(9),
    f11370h(10),
    /* JADX INFO: Fake field, exist only in values array */
    EF11(11),
    j(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f11372a;

    T1(int i3) {
        this.f11372a = i3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0649m2
    public final int a() {
        if (this != j) {
            return this.f11372a;
        }
        throw new IllegalArgumentException(StubApp.getString2(10075));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11372a);
    }
}
