package i4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: i4.q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1053q extends T3.a {
    public static final Parcelable.Creator<C1053q> CREATOR = new h1.n(12);

    /* renamed from: a, reason: collision with root package name */
    public final Status f14799a;

    /* renamed from: b, reason: collision with root package name */
    public final C1054r f14800b;

    public C1053q(Status status, C1054r c1054r) {
        this.f14799a = status;
        this.f14800b = c1054r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.E(parcel, 1, this.f14799a, i3);
        a4.f.E(parcel, 2, this.f14800b, i3);
        a4.f.N(parcel, I10);
    }
}
