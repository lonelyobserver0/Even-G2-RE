package D4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends R.b {
    public static final Parcelable.Creator<b> CREATOR = new A.g(1);

    /* renamed from: c, reason: collision with root package name */
    public boolean f1277c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1277c = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f1277c ? 1 : 0);
    }
}
