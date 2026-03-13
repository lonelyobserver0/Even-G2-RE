package A;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends R.b {
    public static final Parcelable.Creator<h> CREATOR = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f24c;

    public h(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f24c = new SparseArray(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            this.f24c.append(iArr[i3], readParcelableArray[i3]);
        }
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        SparseArray sparseArray = this.f24c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.f24c.keyAt(i10);
            parcelableArr[i10] = (Parcelable) this.f24c.valueAt(i10);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i3);
    }
}
