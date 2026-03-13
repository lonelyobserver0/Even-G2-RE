package o4;

import android.os.Parcel;
import android.os.Parcelable;
import j1.C1081j;
import java.util.ArrayList;

/* renamed from: o4.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1462e extends T3.a {
    public static final Parcelable.Creator<C1462e> CREATOR = new C1081j(22);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18370a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18371b;

    public C1462e(ArrayList arrayList, String str) {
        this.f18370a = arrayList;
        this.f18371b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        ArrayList arrayList = this.f18370a;
        if (arrayList != null) {
            int I11 = a4.f.I(parcel, 1);
            parcel.writeStringList(arrayList);
            a4.f.N(parcel, I11);
        }
        a4.f.F(parcel, 2, this.f18371b);
        a4.f.N(parcel, I10);
    }
}
