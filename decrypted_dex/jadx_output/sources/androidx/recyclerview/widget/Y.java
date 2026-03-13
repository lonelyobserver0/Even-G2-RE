package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Y extends R.b {
    public static final Parcelable.Creator<Y> CREATOR = new A.g(4);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f10092c;

    public Y(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10092c = parcel.readParcelable(classLoader == null ? M.class.getClassLoader() : classLoader);
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeParcelable(this.f10092c, 0);
    }
}
