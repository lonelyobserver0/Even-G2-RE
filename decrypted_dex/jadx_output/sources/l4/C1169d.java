package l4;

import android.os.Parcel;
import android.os.Parcelable;
import j1.C1081j;

/* renamed from: l4.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1169d extends T3.a {
    public static final Parcelable.Creator<C1169d> CREATOR = new C1081j(3);

    /* renamed from: a, reason: collision with root package name */
    public final long f16403a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16404b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16405c;

    public C1169d(long j, int i3, long j3) {
        this.f16403a = j;
        this.f16404b = i3;
        this.f16405c = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 8);
        parcel.writeLong(this.f16403a);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f16404b);
        a4.f.P(parcel, 3, 8);
        parcel.writeLong(this.f16405c);
        a4.f.N(parcel, I10);
    }
}
