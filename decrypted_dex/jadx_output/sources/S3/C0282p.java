package S3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: S3.p, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0282p extends T3.a {
    public static final Parcelable.Creator<C0282p> CREATOR = new B0.s(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f6554a;

    /* renamed from: b, reason: collision with root package name */
    public List f6555b;

    public C0282p(int i3, List list) {
        this.f6554a = i3;
        this.f6555b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f6554a);
        a4.f.H(parcel, 2, this.f6555b);
        a4.f.N(parcel, I10);
    }
}
