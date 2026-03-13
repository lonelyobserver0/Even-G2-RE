package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u extends T3.a {
    public static final Parcelable.Creator<u> CREATOR = new n(2);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11220a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11221b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11222c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11223d;

    public u(String str, int i3, int i10, boolean z2) {
        this.f11220a = z2;
        this.f11221b = str;
        this.f11222c = W.a.B(i3) - 1;
        this.f11223d = Tc.d.w(i10) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f11220a ? 1 : 0);
        a4.f.F(parcel, 2, this.f11221b);
        a4.f.P(parcel, 3, 4);
        parcel.writeInt(this.f11222c);
        a4.f.P(parcel, 4, 4);
        parcel.writeInt(this.f11223d);
        a4.f.N(parcel, I10);
    }
}
