package f4;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import i4.C1035B;
import i4.InterfaceC1034A;
import i4.InterfaceC1036C;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class t extends T3.a {
    public static final Parcelable.Creator<t> CREATOR = new com.google.android.material.datepicker.l(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f13777a;

    /* renamed from: b, reason: collision with root package name */
    public final s f13778b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1036C f13779c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1034A f13780d;

    /* renamed from: e, reason: collision with root package name */
    public final PendingIntent f13781e;

    /* renamed from: f, reason: collision with root package name */
    public final E f13782f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13783g;

    public t(int i3, s sVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        InterfaceC1036C interfaceC1036C;
        InterfaceC1034A interfaceC1034A;
        String string2 = StubApp.getString2(17496);
        this.f13777a = i3;
        this.f13778b = sVar;
        E e10 = null;
        if (iBinder != null) {
            int i10 = o.f13761f;
            String string22 = StubApp.getString2(17505);
            IInterface queryLocalInterface = iBinder.queryLocalInterface(string22);
            interfaceC1036C = queryLocalInterface instanceof InterfaceC1036C ? (InterfaceC1036C) queryLocalInterface : new C1035B(iBinder, string22, 3);
        } else {
            interfaceC1036C = null;
        }
        this.f13779c = interfaceC1036C;
        this.f13781e = pendingIntent;
        if (iBinder2 != null) {
            int i11 = n.f13759g;
            String string23 = StubApp.getString2(17500);
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface(string23);
            interfaceC1034A = queryLocalInterface2 instanceof InterfaceC1034A ? (InterfaceC1034A) queryLocalInterface2 : new i4.z(iBinder2, string23, 3);
        } else {
            interfaceC1034A = null;
        }
        this.f13780d = interfaceC1034A;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface(string2);
            e10 = queryLocalInterface3 instanceof E ? (E) queryLocalInterface3 : new C0876D(iBinder3, string2, 3);
        }
        this.f13782f = e10;
        this.f13783g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(this.f13777a);
        a4.f.E(parcel, 2, this.f13778b, i3);
        InterfaceC1036C interfaceC1036C = this.f13779c;
        a4.f.C(parcel, 3, interfaceC1036C == null ? null : interfaceC1036C.asBinder());
        a4.f.E(parcel, 4, this.f13781e, i3);
        InterfaceC1034A interfaceC1034A = this.f13780d;
        a4.f.C(parcel, 5, interfaceC1034A == null ? null : interfaceC1034A.asBinder());
        E e10 = this.f13782f;
        a4.f.C(parcel, 6, e10 != null ? e10.asBinder() : null);
        a4.f.F(parcel, 8, this.f13783g);
        a4.f.N(parcel, I10);
    }
}
