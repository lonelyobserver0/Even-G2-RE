package l4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j1.C1081j;

/* renamed from: l4.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1184i extends T3.a {
    public static final Parcelable.Creator<C1184i> CREATOR = new C1081j(5);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f16460a;

    public C1184i(Bundle bundle) {
        this.f16460a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.B(parcel, 1, this.f16460a);
        a4.f.N(parcel, I10);
    }
}
