package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class W extends T3.a {
    public static final Parcelable.Creator<W> CREATOR = new V(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f11397a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11398b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f11399c;

    public W(int i3, String str, Intent intent) {
        this.f11397a = i3;
        this.f11398b = str;
        this.f11399c = intent;
    }

    public static W d(Activity activity) {
        return new W(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w10 = (W) obj;
        return this.f11397a == w10.f11397a && Objects.equals(this.f11398b, w10.f11398b) && Objects.equals(this.f11399c, w10.f11399c);
    }

    public final int hashCode() {
        return this.f11397a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f11397a);
        a4.f.F(parcel, 2, this.f11398b);
        a4.f.E(parcel, 3, this.f11399c, i3);
        a4.f.N(parcel, I10);
    }
}
