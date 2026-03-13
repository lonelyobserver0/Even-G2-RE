package i4;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: i4.r, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1054r extends T3.a {
    public static final Parcelable.Creator<C1054r> CREATOR = new h1.n(13);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14801a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14802b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14803c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14804d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14805e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14806f;

    public C1054r(boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f14801a = z2;
        this.f14802b = z10;
        this.f14803c = z11;
        this.f14804d = z12;
        this.f14805e = z13;
        this.f14806f = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f14801a ? 1 : 0);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f14802b ? 1 : 0);
        a4.f.P(parcel, 3, 4);
        parcel.writeInt(this.f14803c ? 1 : 0);
        a4.f.P(parcel, 4, 4);
        parcel.writeInt(this.f14804d ? 1 : 0);
        a4.f.P(parcel, 5, 4);
        parcel.writeInt(this.f14805e ? 1 : 0);
        a4.f.P(parcel, 6, 4);
        parcel.writeInt(this.f14806f ? 1 : 0);
        a4.f.N(parcel, I10);
    }
}
