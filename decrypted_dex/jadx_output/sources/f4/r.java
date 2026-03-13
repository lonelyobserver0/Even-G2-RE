package f4;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r extends T3.a {
    public static final Parcelable.Creator<r> CREATOR = new com.google.android.material.datepicker.l(13);

    /* renamed from: a, reason: collision with root package name */
    public final int f13771a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f13772b;

    /* renamed from: c, reason: collision with root package name */
    public final IBinder f13773c;

    /* renamed from: d, reason: collision with root package name */
    public final PendingIntent f13774d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13775e;

    public r(int i3, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f13771a = i3;
        this.f13772b = iBinder;
        this.f13773c = iBinder2;
        this.f13774d = pendingIntent;
        this.f13775e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f13771a);
        a4.f.C(parcel, 2, this.f13772b);
        a4.f.C(parcel, 3, this.f13773c);
        a4.f.E(parcel, 4, this.f13774d, i3);
        a4.f.F(parcel, 6, this.f13775e);
        a4.f.N(parcel, I10);
    }
}
