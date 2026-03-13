package n;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import j1.C1081j;

/* renamed from: n.O, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1314O extends View.BaseSavedState {
    public static final Parcelable.Creator<C1314O> CREATOR = new C1081j(14);

    /* renamed from: a, reason: collision with root package name */
    public boolean f17440a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeByte(this.f17440a ? (byte) 1 : (byte) 0);
    }
}
