package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new B0.s(28);

    /* renamed from: a, reason: collision with root package name */
    public final m f11894a;

    /* renamed from: b, reason: collision with root package name */
    public final m f11895b;

    /* renamed from: c, reason: collision with root package name */
    public final m f11896c;

    /* renamed from: d, reason: collision with root package name */
    public final c f11897d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11898e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11899f;

    public b(m mVar, m mVar2, m mVar3, c cVar) {
        this.f11894a = mVar;
        this.f11895b = mVar2;
        this.f11896c = mVar3;
        this.f11897d = cVar;
        if (mVar.f11935a.compareTo(mVar3.f11935a) > 0) {
            throw new IllegalArgumentException(StubApp.getString2(12498));
        }
        if (mVar3.f11935a.compareTo(mVar2.f11935a) > 0) {
            throw new IllegalArgumentException(StubApp.getString2(12497));
        }
        this.f11899f = mVar.f(mVar2) + 1;
        this.f11898e = (mVar2.f11938d - mVar.f11938d) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11894a.equals(bVar.f11894a) && this.f11895b.equals(bVar.f11895b) && this.f11896c.equals(bVar.f11896c) && this.f11897d.equals(bVar.f11897d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11894a, this.f11895b, this.f11896c, this.f11897d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f11894a, 0);
        parcel.writeParcelable(this.f11895b, 0);
        parcel.writeParcelable(this.f11896c, 0);
        parcel.writeParcelable(this.f11897d, 0);
    }
}
