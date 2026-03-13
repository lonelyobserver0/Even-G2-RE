package i4;

import S3.D;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class x extends T3.a {
    public static final Parcelable.Creator<x> CREATOR = new h1.n(17);

    /* renamed from: a, reason: collision with root package name */
    public final long f14821a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14822b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkSource f14823c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14824d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f14825e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14826f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14827g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14828h;
    public String j;

    public x(long j, boolean z2, WorkSource workSource, String str, int[] iArr, boolean z10, String str2, long j3, String str3) {
        this.f14821a = j;
        this.f14822b = z2;
        this.f14823c = workSource;
        this.f14824d = str;
        this.f14825e = iArr;
        this.f14826f = z10;
        this.f14827g = str2;
        this.f14828h = j3;
        this.j = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        D.h(parcel);
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 8);
        parcel.writeLong(this.f14821a);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f14822b ? 1 : 0);
        a4.f.E(parcel, 3, this.f14823c, i3);
        a4.f.F(parcel, 4, this.f14824d);
        a4.f.D(parcel, 5, this.f14825e);
        a4.f.P(parcel, 6, 4);
        parcel.writeInt(this.f14826f ? 1 : 0);
        a4.f.F(parcel, 7, this.f14827g);
        a4.f.P(parcel, 8, 8);
        parcel.writeLong(this.f14828h);
        a4.f.F(parcel, 9, this.j);
        a4.f.N(parcel, I10);
    }
}
