package f4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: f4.C, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0875C extends T3.a {
    public static final Parcelable.Creator<C0875C> CREATOR = new com.google.android.material.datepicker.l(17);

    /* renamed from: a, reason: collision with root package name */
    public final Status f13739a;

    public C0875C(Status status) {
        this.f13739a = status;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.E(parcel, 1, this.f13739a, i3);
        a4.f.N(parcel, I10);
    }
}
