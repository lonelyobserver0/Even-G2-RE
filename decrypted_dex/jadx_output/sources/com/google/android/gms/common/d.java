package com.google.android.gms.common;

import Z9.C;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends T3.a {
    public static final Parcelable.Creator<d> CREATOR = new n(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f11182a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11183b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11184c;

    public d(long j, String str, int i3) {
        this.f11182a = str;
        this.f11183b = i3;
        this.f11184c = j;
    }

    public final long d() {
        long j = this.f11184c;
        return j == -1 ? this.f11183b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f11182a;
            if (((str != null && str.equals(dVar.f11182a)) || (str == null && dVar.f11182a == null)) && d() == dVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11182a, Long.valueOf(d())});
    }

    public final String toString() {
        C c10 = new C(this);
        c10.a(this.f11182a, StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
        c10.a(Long.valueOf(d()), StubApp.getString2(2155));
        return c10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.F(parcel, 1, this.f11182a);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f11183b);
        long d8 = d();
        a4.f.P(parcel, 3, 8);
        parcel.writeLong(d8);
        a4.f.N(parcel, I10);
    }

    public d(String str, long j) {
        this.f11182a = str;
        this.f11184c = j;
        this.f11183b = -1;
    }
}
