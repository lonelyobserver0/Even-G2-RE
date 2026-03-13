package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class U extends T3.a {
    public static final Parcelable.Creator<U> CREATOR = new V(0);

    /* renamed from: a, reason: collision with root package name */
    public final long f11374a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11375b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11376c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f11377d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11378e;

    public U(long j, long j3, boolean z2, Bundle bundle, String str) {
        this.f11374a = j;
        this.f11375b = j3;
        this.f11376c = z2;
        this.f11377d = bundle;
        this.f11378e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 8);
        parcel.writeLong(this.f11374a);
        a4.f.P(parcel, 2, 8);
        parcel.writeLong(this.f11375b);
        a4.f.P(parcel, 3, 4);
        parcel.writeInt(this.f11376c ? 1 : 0);
        a4.f.B(parcel, 7, this.f11377d);
        a4.f.F(parcel, 8, this.f11378e);
        a4.f.N(parcel, I10);
    }
}
