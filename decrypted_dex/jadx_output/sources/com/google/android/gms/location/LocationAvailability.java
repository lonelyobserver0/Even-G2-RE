package com.google.android.gms.location;

import T3.a;
import a4.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.stub.StubApp;
import h1.n;
import i4.v;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new n(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f11779a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11780b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11781c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11782d;

    /* renamed from: e, reason: collision with root package name */
    public final v[] f11783e;

    public LocationAvailability(int i3, int i10, int i11, long j, v[] vVarArr) {
        this.f11782d = i3 < 1000 ? 0 : 1000;
        this.f11779a = i10;
        this.f11780b = i11;
        this.f11781c = j;
        this.f11783e = vVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f11779a == locationAvailability.f11779a && this.f11780b == locationAvailability.f11780b && this.f11781c == locationAvailability.f11781c && this.f11782d == locationAvailability.f11782d && Arrays.equals(this.f11783e, locationAvailability.f11783e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11782d)});
    }

    public final String toString() {
        boolean z2 = this.f11782d < 1000;
        StringBuilder sb2 = new StringBuilder(String.valueOf(z2).length() + 22);
        sb2.append(StubApp.getString2(12334));
        sb2.append(z2);
        sb2.append(StubApp.getString2(511));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = f.I(parcel, 20293);
        f.P(parcel, 1, 4);
        parcel.writeInt(this.f11779a);
        f.P(parcel, 2, 4);
        parcel.writeInt(this.f11780b);
        f.P(parcel, 3, 8);
        parcel.writeLong(this.f11781c);
        f.P(parcel, 4, 4);
        int i10 = this.f11782d;
        parcel.writeInt(i10);
        f.G(parcel, 5, this.f11783e, i3);
        int i11 = i10 >= 1000 ? 0 : 1;
        f.P(parcel, 6, 4);
        parcel.writeInt(i11);
        f.N(parcel, I10);
    }
}
