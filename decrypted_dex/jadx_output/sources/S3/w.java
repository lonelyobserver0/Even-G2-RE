package S3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class w extends T3.a {
    public static final Parcelable.Creator<w> CREATOR = new B0.s(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f6570a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f6571b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.b f6572c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6573d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6574e;

    public w(int i3, IBinder iBinder, com.google.android.gms.common.b bVar, boolean z2, boolean z10) {
        this.f6570a = i3;
        this.f6571b = iBinder;
        this.f6572c = bVar;
        this.f6573d = z2;
        this.f6574e = z10;
    }

    public final boolean equals(Object obj) {
        Object q10;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.f6572c.equals(wVar.f6572c)) {
            return false;
        }
        String string2 = StubApp.getString2(5244);
        Object obj2 = null;
        IBinder iBinder = this.f6571b;
        if (iBinder == null) {
            q10 = null;
        } else {
            int i3 = AbstractBinderC0267a.f6489f;
            IInterface queryLocalInterface = iBinder.queryLocalInterface(string2);
            q10 = queryLocalInterface instanceof InterfaceC0276j ? (InterfaceC0276j) queryLocalInterface : new Q(iBinder, string2, 2);
        }
        IBinder iBinder2 = wVar.f6571b;
        if (iBinder2 != null) {
            int i10 = AbstractBinderC0267a.f6489f;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface(string2);
            obj2 = queryLocalInterface2 instanceof InterfaceC0276j ? (InterfaceC0276j) queryLocalInterface2 : new Q(iBinder2, string2, 2);
        }
        return D.k(q10, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f6570a);
        a4.f.C(parcel, 2, this.f6571b);
        a4.f.E(parcel, 3, this.f6572c, i3);
        a4.f.P(parcel, 4, 4);
        parcel.writeInt(this.f6573d ? 1 : 0);
        a4.f.P(parcel, 5, 4);
        parcel.writeInt(this.f6574e ? 1 : 0);
        a4.f.N(parcel, I10);
    }
}
