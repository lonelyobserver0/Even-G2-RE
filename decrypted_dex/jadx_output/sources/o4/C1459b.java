package o4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import j1.C1081j;

/* renamed from: o4.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1459b extends T3.a {
    public static final Parcelable.Creator<C1459b> CREATOR = new C1081j(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f18367a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18368b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f18369c;

    public C1459b(int i3, int i10, Intent intent) {
        this.f18367a = i3;
        this.f18368b = i10;
        this.f18369c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f18367a);
        a4.f.P(parcel, 2, 4);
        parcel.writeInt(this.f18368b);
        a4.f.E(parcel, 3, this.f18369c, i3);
        a4.f.N(parcel, I10);
    }
}
