package com.google.android.gms.common.api;

import B0.s;
import S3.D;
import T3.a;
import a4.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new s(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f11168a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11169b;

    public Scope(int i3, String str) {
        D.f(str, StubApp.getString2(11461));
        this.f11168a = i3;
        this.f11169b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f11169b.equals(((Scope) obj).f11169b);
    }

    public final int hashCode() {
        return this.f11169b.hashCode();
    }

    public final String toString() {
        return this.f11169b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = f.I(parcel, 20293);
        f.P(parcel, 1, 4);
        parcel.writeInt(this.f11168a);
        f.F(parcel, 2, this.f11169b);
        f.N(parcel, I10);
    }
}
