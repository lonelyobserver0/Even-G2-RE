package S3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class K extends T3.a {
    public static final Parcelable.Creator<K> CREATOR = new B0.s(14);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f6463a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.gms.common.d[] f6464b;

    /* renamed from: c, reason: collision with root package name */
    public int f6465c;

    /* renamed from: d, reason: collision with root package name */
    public C0273g f6466d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.B(parcel, 1, this.f6463a);
        a4.f.G(parcel, 2, this.f6464b, i3);
        a4.f.P(parcel, 3, 4);
        parcel.writeInt(this.f6465c);
        a4.f.E(parcel, 4, this.f6466d, i3);
        a4.f.N(parcel, I10);
    }
}
