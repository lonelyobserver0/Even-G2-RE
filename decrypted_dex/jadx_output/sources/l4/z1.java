package l4;

import android.os.Parcel;
import android.os.Parcelable;
import j1.C1081j;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class z1 extends T3.a {
    public static final Parcelable.Creator<z1> CREATOR = new C1081j(11);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16712a;

    public z1(ArrayList arrayList) {
        this.f16712a = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.H(parcel, 1, this.f16712a);
        a4.f.N(parcel, I10);
    }
}
