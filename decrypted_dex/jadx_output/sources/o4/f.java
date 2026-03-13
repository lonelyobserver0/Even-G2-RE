package o4;

import S3.w;
import android.os.Parcel;
import android.os.Parcelable;
import j1.C1081j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f extends T3.a {
    public static final Parcelable.Creator<f> CREATOR = new C1081j(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f18372a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.b f18373b;

    /* renamed from: c, reason: collision with root package name */
    public final w f18374c;

    public f(int i3, com.google.android.gms.common.b bVar, w wVar) {
        this.f18372a = i3;
        this.f18373b = bVar;
        this.f18374c = wVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f18372a);
        a4.f.E(parcel, 2, this.f18373b, i3);
        a4.f.E(parcel, 3, this.f18374c, i3);
        a4.f.N(parcel, I10);
    }
}
