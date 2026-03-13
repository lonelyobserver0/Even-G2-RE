package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11236b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f11237a;

    public C(int i3) {
        this.f11237a = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        c10.getClass();
        int i3 = this.f11237a;
        if (i3 != 0) {
            return i3 == c10.f11237a;
        }
        throw null;
    }

    public final int hashCode() {
        int i3 = this.f11237a;
        if (i3 != 0) {
            return ((i3 ^ (-485106924)) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i3 = this.f11237a;
        String string2 = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? StubApp.getString2(1116) : StubApp.getString2(11575) : StubApp.getString2(11576) : StubApp.getString2(11577) : StubApp.getString2(11578);
        int length = string2.length() + "".length() + 73 + 91;
        String string22 = StubApp.getString2(11579);
        StringBuilder sb2 = new StringBuilder(string22.length() + length + 1);
        E1.a.v(sb2, StubApp.getString2(11580), string2, StubApp.getString2(11581), string22);
        sb2.append(StubApp.getString2(265));
        return sb2.toString();
    }
}
