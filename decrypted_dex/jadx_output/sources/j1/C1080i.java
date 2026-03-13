package j1;

import android.os.Parcel;
import android.os.Parcelable;
import h1.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: j1.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1080i extends AbstractC1073b {
    public static final Parcelable.Creator<C1080i> CREATOR = new n(29);

    /* renamed from: a, reason: collision with root package name */
    public final List f15257a;

    public C1080i(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            arrayList.add(new C1079h(parcel));
        }
        this.f15257a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        List list = this.f15257a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            C1079h c1079h = (C1079h) list.get(i10);
            parcel.writeLong(c1079h.f15247a);
            parcel.writeByte(c1079h.f15248b ? (byte) 1 : (byte) 0);
            parcel.writeByte(c1079h.f15249c ? (byte) 1 : (byte) 0);
            parcel.writeByte(c1079h.f15250d ? (byte) 1 : (byte) 0);
            List list2 = c1079h.f15252f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                C1078g c1078g = (C1078g) list2.get(i11);
                parcel.writeInt(c1078g.f15245a);
                parcel.writeLong(c1078g.f15246b);
            }
            parcel.writeLong(c1079h.f15251e);
            parcel.writeByte(c1079h.f15253g ? (byte) 1 : (byte) 0);
            parcel.writeLong(c1079h.f15254h);
            parcel.writeInt(c1079h.f15255i);
            parcel.writeInt(c1079h.j);
            parcel.writeInt(c1079h.f15256k);
        }
    }

    public C1080i(ArrayList arrayList) {
        this.f15257a = Collections.unmodifiableList(arrayList);
    }
}
