package P3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends T3.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public final Intent f5488a;

    public a(Intent intent) {
        this.f5488a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.E(parcel, 1, this.f5488a, i3);
        a4.f.N(parcel, I10);
    }
}
