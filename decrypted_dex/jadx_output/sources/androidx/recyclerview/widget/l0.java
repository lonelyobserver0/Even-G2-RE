package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new B0.s(25);

    /* renamed from: a, reason: collision with root package name */
    public int f10209a;

    /* renamed from: b, reason: collision with root package name */
    public int f10210b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f10211c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10212d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f10209a + ", mGapDir=" + this.f10210b + ", mHasUnwantedGapAfter=" + this.f10212d + ", mGapPerSpan=" + Arrays.toString(this.f10211c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f10209a);
        parcel.writeInt(this.f10210b);
        parcel.writeInt(this.f10212d ? 1 : 0);
        int[] iArr = this.f10211c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f10211c);
        }
    }
}
