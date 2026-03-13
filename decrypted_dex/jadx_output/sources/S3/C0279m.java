package S3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: S3.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0279m extends T3.a {
    public static final Parcelable.Creator<C0279m> CREATOR = new B0.s(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f6538a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6539b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6540c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6541d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6542e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6543f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6544g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6545h;
    public final int j;

    public C0279m(int i3, int i10, int i11, long j, long j3, String str, String str2, int i12, int i13) {
        this.f6538a = i3;
        this.f6539b = i10;
        this.f6540c = i11;
        this.f6541d = j;
        this.f6542e = j3;
        this.f6543f = str;
        this.f6544g = str2;
        this.f6545h = i12;
        this.j = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f6538a);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f6539b);
        a4.f.P(parcel, 3, 4);
        parcel.writeInt(this.f6540c);
        a4.f.P(parcel, 4, 8);
        parcel.writeLong(this.f6541d);
        a4.f.P(parcel, 5, 8);
        parcel.writeLong(this.f6542e);
        a4.f.F(parcel, 6, this.f6543f);
        a4.f.F(parcel, 7, this.f6544g);
        a4.f.P(parcel, 8, 4);
        parcel.writeInt(this.f6545h);
        a4.f.P(parcel, 9, 4);
        parcel.writeInt(this.j);
        a4.f.N(parcel, I10);
    }
}
