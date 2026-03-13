package i4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: i4.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1051o extends T3.a {
    public static final Parcelable.Creator<C1051o> CREATOR = new h1.n(11);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14795a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14796b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14797c;

    public C1051o(ArrayList arrayList, boolean z2, boolean z10) {
        this.f14795a = arrayList;
        this.f14796b = z2;
        this.f14797c = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.H(parcel, 1, Collections.unmodifiableList(this.f14795a));
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f14796b ? 1 : 0);
        a4.f.P(parcel, 3, 4);
        parcel.writeInt(this.f14797c ? 1 : 0);
        a4.f.N(parcel, I10);
    }
}
