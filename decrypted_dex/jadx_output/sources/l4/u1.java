package l4;

import android.os.Parcel;
import android.os.Parcelable;
import j1.C1081j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class u1 extends T3.a {
    public static final Parcelable.Creator<u1> CREATOR = new C1081j(8);

    /* renamed from: a, reason: collision with root package name */
    public final String f16635a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16636b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16637c;

    public u1(long j, String str, int i3) {
        this.f16635a = str;
        this.f16636b = j;
        this.f16637c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.F(parcel, 1, this.f16635a);
        a4.f.P(parcel, 2, 8);
        parcel.writeLong(this.f16636b);
        a4.f.P(parcel, 3, 4);
        parcel.writeInt(this.f16637c);
        a4.f.N(parcel, I10);
    }
}
