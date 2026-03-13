package l4;

import android.os.Parcel;
import android.os.Parcelable;
import j1.C1081j;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class y1 extends T3.a {
    public static final Parcelable.Creator<y1> CREATOR = new C1081j(10);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16690a;

    public y1(ArrayList arrayList) {
        this.f16690a = arrayList;
    }

    public static y1 d(W0... w0Arr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(w0Arr[0].f16272a));
        return new y1(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        ArrayList arrayList = this.f16690a;
        if (arrayList != null) {
            int I11 = a4.f.I(parcel, 1);
            int size = arrayList.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                parcel.writeInt(((Integer) arrayList.get(i10)).intValue());
            }
            a4.f.N(parcel, I11);
        }
        a4.f.N(parcel, I10);
    }
}
