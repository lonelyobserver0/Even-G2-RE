package n;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class X0 extends R.b {
    public static final Parcelable.Creator<X0> CREATOR = new A.g(5);

    /* renamed from: c, reason: collision with root package name */
    public int f17483c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17484d;

    public X0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f17483c = parcel.readInt();
        this.f17484d = parcel.readInt() != 0;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f17483c);
        parcel.writeInt(this.f17484d ? 1 : 0);
    }
}
