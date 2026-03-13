package l4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import c4.AbstractC0566a;
import com.google.android.gms.internal.measurement.AbstractC0705y;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l4.E, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1149E extends AbstractC0566a implements InterfaceC1151G {
    public C1149E(IBinder iBinder) {
        super(iBinder, StubApp.getString2(19671), 1);
    }

    @Override // l4.InterfaceC1151G
    public final void A(M1 m12) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, m12);
        L(g10, 20);
    }

    @Override // l4.InterfaceC1151G
    public final void B(C1172e c1172e, M1 m12) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, c1172e);
        AbstractC0705y.b(g10, m12);
        L(g10, 12);
    }

    @Override // l4.InterfaceC1151G
    public final byte[] C(String str, C1215v c1215v) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, c1215v);
        g10.writeString(str);
        Parcel f10 = f(g10, 9);
        byte[] createByteArray = f10.createByteArray();
        f10.recycle();
        return createByteArray;
    }

    @Override // l4.InterfaceC1151G
    public final void D(Bundle bundle, M1 m12) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, bundle);
        AbstractC0705y.b(g10, m12);
        L(g10, 19);
    }

    @Override // l4.InterfaceC1151G
    public final void E(C1215v c1215v, M1 m12) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, c1215v);
        AbstractC0705y.b(g10, m12);
        L(g10, 1);
    }

    @Override // l4.InterfaceC1151G
    public final List H(String str, String str2, boolean z2, M1 m12) {
        Parcel g10 = g();
        g10.writeString(str);
        g10.writeString(str2);
        ClassLoader classLoader = AbstractC0705y.f11769a;
        g10.writeInt(z2 ? 1 : 0);
        AbstractC0705y.b(g10, m12);
        Parcel f10 = f(g10, 14);
        ArrayList createTypedArrayList = f10.createTypedArrayList(H1.CREATOR);
        f10.recycle();
        return createTypedArrayList;
    }

    @Override // l4.InterfaceC1151G
    public final void I(M1 m12) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, m12);
        L(g10, 18);
    }

    @Override // l4.InterfaceC1151G
    public final void J(M1 m12) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, m12);
        L(g10, 27);
    }

    @Override // l4.InterfaceC1151G
    public final List h(String str, String str2, String str3, boolean z2) {
        Parcel g10 = g();
        g10.writeString(null);
        g10.writeString(str2);
        g10.writeString(str3);
        ClassLoader classLoader = AbstractC0705y.f11769a;
        g10.writeInt(z2 ? 1 : 0);
        Parcel f10 = f(g10, 15);
        ArrayList createTypedArrayList = f10.createTypedArrayList(H1.CREATOR);
        f10.recycle();
        return createTypedArrayList;
    }

    @Override // l4.InterfaceC1151G
    public final void i(M1 m12) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, m12);
        L(g10, 26);
    }

    @Override // l4.InterfaceC1151G
    public final void j(M1 m12) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, m12);
        L(g10, 25);
    }

    @Override // l4.InterfaceC1151G
    public final void l(M1 m12) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, m12);
        L(g10, 6);
    }

    @Override // l4.InterfaceC1151G
    public final void m(long j, String str, String str2, String str3) {
        Parcel g10 = g();
        g10.writeLong(j);
        g10.writeString(str);
        g10.writeString(str2);
        g10.writeString(str3);
        L(g10, 10);
    }

    @Override // l4.InterfaceC1151G
    public final void o(M1 m12, Bundle bundle, InterfaceC1153I interfaceC1153I) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, m12);
        AbstractC0705y.b(g10, bundle);
        AbstractC0705y.c(g10, interfaceC1153I);
        L(g10, 31);
    }

    @Override // l4.InterfaceC1151G
    public final List q(String str, String str2, String str3) {
        Parcel g10 = g();
        g10.writeString(null);
        g10.writeString(str2);
        g10.writeString(str3);
        Parcel f10 = f(g10, 17);
        ArrayList createTypedArrayList = f10.createTypedArrayList(C1172e.CREATOR);
        f10.recycle();
        return createTypedArrayList;
    }

    @Override // l4.InterfaceC1151G
    public final C1184i r(M1 m12) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, m12);
        Parcel f10 = f(g10, 21);
        C1184i c1184i = (C1184i) AbstractC0705y.a(f10, C1184i.CREATOR);
        f10.recycle();
        return c1184i;
    }

    @Override // l4.InterfaceC1151G
    public final void s(M1 m12, C1169d c1169d) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, m12);
        AbstractC0705y.b(g10, c1169d);
        L(g10, 30);
    }

    @Override // l4.InterfaceC1151G
    public final void t(M1 m12) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, m12);
        L(g10, 4);
    }

    @Override // l4.InterfaceC1151G
    public final void u(M1 m12, y1 y1Var, InterfaceC1155K interfaceC1155K) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, m12);
        AbstractC0705y.b(g10, y1Var);
        AbstractC0705y.c(g10, interfaceC1155K);
        L(g10, 29);
    }

    @Override // l4.InterfaceC1151G
    public final String w(M1 m12) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, m12);
        Parcel f10 = f(g10, 11);
        String readString = f10.readString();
        f10.recycle();
        return readString;
    }

    @Override // l4.InterfaceC1151G
    public final List x(String str, String str2, M1 m12) {
        Parcel g10 = g();
        g10.writeString(str);
        g10.writeString(str2);
        AbstractC0705y.b(g10, m12);
        Parcel f10 = f(g10, 16);
        ArrayList createTypedArrayList = f10.createTypedArrayList(C1172e.CREATOR);
        f10.recycle();
        return createTypedArrayList;
    }

    @Override // l4.InterfaceC1151G
    public final void z(H1 h12, M1 m12) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, h12);
        AbstractC0705y.b(g10, m12);
        L(g10, 2);
    }
}
