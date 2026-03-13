package S3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: S3.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0281o extends T3.a {
    public static final Parcelable.Creator<C0281o> CREATOR = new B0.s(13);

    /* renamed from: a, reason: collision with root package name */
    public final int f6549a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6550b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6551c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6552d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6553e;

    public C0281o(int i3, boolean z2, boolean z10, int i10, int i11) {
        this.f6549a = i3;
        this.f6550b = z2;
        this.f6551c = z10;
        this.f6552d = i10;
        this.f6553e = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f6549a);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f6550b ? 1 : 0);
        a4.f.P(parcel, 3, 4);
        parcel.writeInt(this.f6551c ? 1 : 0);
        a4.f.P(parcel, 4, 4);
        parcel.writeInt(this.f6552d);
        a4.f.P(parcel, 5, 4);
        parcel.writeInt(this.f6553e);
        a4.f.N(parcel, I10);
    }
}
