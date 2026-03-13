package l4;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractBinderC0700x;
import com.google.android.gms.internal.measurement.AbstractC0705y;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: l4.t0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class BinderC1212t0 extends AbstractBinderC0700x implements InterfaceC1151G {

    /* renamed from: e, reason: collision with root package name */
    public final F1 f16629e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f16630f;

    /* renamed from: g, reason: collision with root package name */
    public String f16631g;

    public BinderC1212t0(F1 f12) {
        super(StubApp.getString2(19671));
        S3.D.h(f12);
        this.f16629e = f12;
        this.f16631g = null;
    }

    @Override // l4.InterfaceC1151G
    public final void A(M1 m12) {
        S3.D.e(m12.f16165a);
        S3.D.h(m12.f16182v);
        f(new RunnableC1203o0(this, m12, 4));
    }

    @Override // l4.InterfaceC1151G
    public final void B(C1172e c1172e, M1 m12) {
        S3.D.h(c1172e);
        S3.D.h(c1172e.f16412c);
        g(m12);
        C1172e c1172e2 = new C1172e(c1172e);
        c1172e2.f16410a = m12.f16165a;
        L(new K.m(this, c1172e2, m12));
    }

    @Override // l4.InterfaceC1151G
    public final byte[] C(String str, C1215v c1215v) {
        S3.D.e(str);
        S3.D.h(c1215v);
        K(str, true);
        F1 f12 = this.f16629e;
        T a3 = f12.a();
        C1200n0 c1200n0 = f12.f16069m;
        C1159O c1159o = c1200n0.f16544k;
        String str2 = c1215v.f16638a;
        a3.f16248n.c(c1159o.a(str2), StubApp.getString2(20891));
        f12.f().getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) f12.b().s(new M9.b(this, c1215v, str)).get();
            if (bArr == null) {
                f12.a().f16242f.c(T.s(str), StubApp.getString2("20892"));
                bArr = new byte[0];
            }
            f12.f().getClass();
            f12.a().f16248n.e(StubApp.getString2("20893"), c1200n0.f16544k.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            T a9 = f12.a();
            S s10 = T.s(str);
            String a10 = c1200n0.f16544k.a(str2);
            a9.f16242f.e(StubApp.getString2(20894), s10, a10, e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            T a92 = f12.a();
            S s102 = T.s(str);
            String a102 = c1200n0.f16544k.a(str2);
            a92.f16242f.e(StubApp.getString2(20894), s102, a102, e);
            return null;
        }
    }

    @Override // l4.InterfaceC1151G
    public final void D(Bundle bundle, M1 m12) {
        g(m12);
        String str = m12.f16165a;
        S3.D.h(str);
        L(new N9.c((Object) this, (Object) bundle, (Object) str, (Parcelable) m12, 3));
    }

    @Override // l4.InterfaceC1151G
    public final void E(C1215v c1215v, M1 m12) {
        S3.D.h(c1215v);
        g(m12);
        L(new K.m(this, c1215v, m12));
    }

    @Override // l4.InterfaceC1151G
    public final List H(String str, String str2, boolean z2, M1 m12) {
        g(m12);
        String str3 = m12.f16165a;
        S3.D.h(str3);
        F1 f12 = this.f16629e;
        try {
            List<I1> list = (List) f12.b().r(new CallableC1207q0(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (I1 i12 : list) {
                if (!z2 && K1.I(i12.f16116c)) {
                }
                arrayList.add(new H1(i12));
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            Object obj = e;
            T a3 = f12.a();
            S s10 = T.s(str3);
            a3.f16242f.d(StubApp.getString2(20895), s10, obj);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            Object obj2 = e;
            T a32 = f12.a();
            S s102 = T.s(str3);
            a32.f16242f.d(StubApp.getString2(20895), s102, obj2);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // l4.InterfaceC1151G
    public final void I(M1 m12) {
        String str = m12.f16165a;
        S3.D.e(str);
        K(str, false);
        L(new RunnableC1203o0(this, m12, 3));
    }

    @Override // l4.InterfaceC1151G
    public final void J(M1 m12) {
        g(m12);
        L(new RunnableC1203o0(this, m12, 1));
    }

    public final void K(String str, boolean z2) {
        String string2 = StubApp.getString2(20896);
        boolean isEmpty = TextUtils.isEmpty(str);
        F1 f12 = this.f16629e;
        if (isEmpty) {
            Ac.b bVar = f12.a().f16242f;
            String string22 = StubApp.getString2(20898);
            bVar.b(string22);
            throw new SecurityException(string22);
        }
        if (z2) {
            try {
                if (this.f16630f == null) {
                    boolean z10 = true;
                    if (!StubApp.getString2("0").equals(this.f16631g) && !W3.b.b(f12.f16069m.f16536a, Binder.getCallingUid()) && !com.google.android.gms.common.i.a(f12.f16069m.f16536a).b(Binder.getCallingUid())) {
                        z10 = false;
                    }
                    this.f16630f = Boolean.valueOf(z10);
                }
                if (this.f16630f.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                f12.a().f16242f.c(T.s(str), StubApp.getString2(20897));
                throw e10;
            }
        }
        if (this.f16631g == null) {
            Context context = f12.f16069m.f16536a;
            int callingUid = Binder.getCallingUid();
            int i3 = com.google.android.gms.common.h.f11189e;
            if (W3.b.d(context, callingUid, str)) {
                this.f16631g = str;
            }
        }
        if (str.equals(this.f16631g)) {
            return;
        }
        throw new SecurityException(string2 + str + StubApp.getString2("11644"));
    }

    public final void L(Runnable runnable) {
        F1 f12 = this.f16629e;
        if (f12.b().q()) {
            runnable.run();
        } else {
            f12.b().t(runnable);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0700x
    public final boolean e(int i3, Parcel parcel, Parcel parcel2) {
        boolean z2;
        List list;
        F1 f12 = this.f16629e;
        ArrayList arrayList = null;
        InterfaceC1153I interfaceC1153I = null;
        InterfaceC1155K interfaceC1155K = null;
        switch (i3) {
            case 1:
                C1215v c1215v = (C1215v) AbstractC0705y.a(parcel, C1215v.CREATOR);
                M1 m12 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                AbstractC0705y.d(parcel);
                E(c1215v, m12);
                parcel2.writeNoException();
                return true;
            case 2:
                H1 h12 = (H1) AbstractC0705y.a(parcel, H1.CREATOR);
                M1 m13 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                AbstractC0705y.d(parcel);
                z(h12, m13);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                M1 m14 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                AbstractC0705y.d(parcel);
                t(m14);
                parcel2.writeNoException();
                return true;
            case 5:
                C1215v c1215v2 = (C1215v) AbstractC0705y.a(parcel, C1215v.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                AbstractC0705y.d(parcel);
                S3.D.h(c1215v2);
                S3.D.e(readString);
                K(readString, true);
                L(new K.m(this, c1215v2, readString));
                parcel2.writeNoException();
                return true;
            case 6:
                M1 m15 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                AbstractC0705y.d(parcel);
                l(m15);
                parcel2.writeNoException();
                return true;
            case 7:
                M1 m16 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                z2 = parcel.readInt() != 0;
                AbstractC0705y.d(parcel);
                g(m16);
                String str = m16.f16165a;
                S3.D.h(str);
                try {
                    List<I1> list2 = (List) f12.b().r(new J9.c(this, str)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (I1 i12 : list2) {
                        if (!z2 && K1.I(i12.f16116c)) {
                        }
                        arrayList2.add(new H1(i12));
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e10) {
                    e = e10;
                    f12.a().f16242f.d(StubApp.getString2(20900), T.s(str), e);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e11) {
                    e = e11;
                    f12.a().f16242f.d(StubApp.getString2(20900), T.s(str), e);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                C1215v c1215v3 = (C1215v) AbstractC0705y.a(parcel, C1215v.CREATOR);
                String readString2 = parcel.readString();
                AbstractC0705y.d(parcel);
                byte[] C10 = C(readString2, c1215v3);
                parcel2.writeNoException();
                parcel2.writeByteArray(C10);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                AbstractC0705y.d(parcel);
                m(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                return true;
            case 11:
                M1 m17 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                AbstractC0705y.d(parcel);
                String w10 = w(m17);
                parcel2.writeNoException();
                parcel2.writeString(w10);
                return true;
            case 12:
                C1172e c1172e = (C1172e) AbstractC0705y.a(parcel, C1172e.CREATOR);
                M1 m18 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                AbstractC0705y.d(parcel);
                B(c1172e, m18);
                parcel2.writeNoException();
                return true;
            case 13:
                C1172e c1172e2 = (C1172e) AbstractC0705y.a(parcel, C1172e.CREATOR);
                AbstractC0705y.d(parcel);
                S3.D.h(c1172e2);
                S3.D.h(c1172e2.f16412c);
                S3.D.e(c1172e2.f16410a);
                K(c1172e2.f16410a, true);
                L(new Q4.b(this, new C1172e(c1172e2)));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ClassLoader classLoader = AbstractC0705y.f11769a;
                z2 = parcel.readInt() != 0;
                M1 m19 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                AbstractC0705y.d(parcel);
                List H2 = H(readString6, readString7, z2, m19);
                parcel2.writeNoException();
                parcel2.writeTypedList(H2);
                return true;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ClassLoader classLoader2 = AbstractC0705y.f11769a;
                z2 = parcel.readInt() != 0;
                AbstractC0705y.d(parcel);
                List h2 = h(readString8, readString9, readString10, z2);
                parcel2.writeNoException();
                parcel2.writeTypedList(h2);
                return true;
            case 16:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                M1 m110 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                AbstractC0705y.d(parcel);
                List x7 = x(readString11, readString12, m110);
                parcel2.writeNoException();
                parcel2.writeTypedList(x7);
                return true;
            case 17:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                AbstractC0705y.d(parcel);
                List q10 = q(readString13, readString14, readString15);
                parcel2.writeNoException();
                parcel2.writeTypedList(q10);
                return true;
            case 18:
                M1 m111 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                AbstractC0705y.d(parcel);
                I(m111);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) AbstractC0705y.a(parcel, Bundle.CREATOR);
                M1 m112 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                AbstractC0705y.d(parcel);
                D(bundle, m112);
                parcel2.writeNoException();
                return true;
            case 20:
                M1 m113 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                AbstractC0705y.d(parcel);
                A(m113);
                parcel2.writeNoException();
                return true;
            case 21:
                M1 m114 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                AbstractC0705y.d(parcel);
                C1184i r8 = r(m114);
                parcel2.writeNoException();
                if (r8 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                r8.writeToParcel(parcel2, 1);
                return true;
            case 24:
                M1 m115 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC0705y.a(parcel, Bundle.CREATOR);
                AbstractC0705y.d(parcel);
                g(m115);
                String str2 = m115.f16165a;
                S3.D.h(str2);
                boolean u2 = f12.d0().u(null, AbstractC1148D.f15970Y0);
                String string2 = StubApp.getString2(20899);
                if (u2) {
                    try {
                        list = (List) f12.b().s(new CallableC1208r0(this, m115, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e12) {
                        f12.a().f16242f.d(string2, T.s(str2), e12);
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) f12.b().r(new CallableC1208r0(this, m115, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e13) {
                        f12.a().f16242f.d(string2, T.s(str2), e13);
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                M1 m116 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                AbstractC0705y.d(parcel);
                j(m116);
                parcel2.writeNoException();
                return true;
            case 26:
                M1 m117 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                AbstractC0705y.d(parcel);
                i(m117);
                parcel2.writeNoException();
                return true;
            case 27:
                M1 m118 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                AbstractC0705y.d(parcel);
                J(m118);
                parcel2.writeNoException();
                return true;
            case 29:
                M1 m119 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                y1 y1Var = (y1) AbstractC0705y.a(parcel, y1.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    String string22 = StubApp.getString2(20401);
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(string22);
                    interfaceC1155K = queryLocalInterface instanceof InterfaceC1155K ? (InterfaceC1155K) queryLocalInterface : new C1154J(readStrongBinder, string22, 1);
                }
                AbstractC0705y.d(parcel);
                u(m119, y1Var, interfaceC1155K);
                parcel2.writeNoException();
                return true;
            case 30:
                M1 m120 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                C1169d c1169d = (C1169d) AbstractC0705y.a(parcel, C1169d.CREATOR);
                AbstractC0705y.d(parcel);
                s(m120, c1169d);
                parcel2.writeNoException();
                return true;
            case 31:
                M1 m121 = (M1) AbstractC0705y.a(parcel, M1.CREATOR);
                Bundle bundle3 = (Bundle) AbstractC0705y.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    String string23 = StubApp.getString2(20382);
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(string23);
                    interfaceC1153I = queryLocalInterface2 instanceof InterfaceC1153I ? (InterfaceC1153I) queryLocalInterface2 : new C1152H(readStrongBinder2, string23, 1);
                }
                AbstractC0705y.d(parcel);
                o(m121, bundle3, interfaceC1153I);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void f(Runnable runnable) {
        F1 f12 = this.f16629e;
        if (f12.b().q()) {
            runnable.run();
        } else {
            f12.b().v(runnable);
        }
    }

    public final void g(M1 m12) {
        S3.D.h(m12);
        String str = m12.f16165a;
        S3.D.e(str);
        K(str, false);
        this.f16629e.j0().o(m12.f16166b);
    }

    @Override // l4.InterfaceC1151G
    public final List h(String str, String str2, String str3, boolean z2) {
        K(str, true);
        F1 f12 = this.f16629e;
        try {
            List<I1> list = (List) f12.b().r(new CallableC1207q0(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (I1 i12 : list) {
                if (!z2 && K1.I(i12.f16116c)) {
                }
                arrayList.add(new H1(i12));
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            Object obj = e;
            T a3 = f12.a();
            S s10 = T.s(str);
            a3.f16242f.d(StubApp.getString2(20901), s10, obj);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            Object obj2 = e;
            T a32 = f12.a();
            S s102 = T.s(str);
            a32.f16242f.d(StubApp.getString2(20901), s102, obj2);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // l4.InterfaceC1151G
    public final void i(M1 m12) {
        S3.D.e(m12.f16165a);
        S3.D.h(m12.f16182v);
        f(new RunnableC1203o0(this, m12, 5, false));
    }

    @Override // l4.InterfaceC1151G
    public final void j(M1 m12) {
        S3.D.e(m12.f16165a);
        S3.D.h(m12.f16182v);
        f(new RunnableC1203o0(this, m12, 6, false));
    }

    @Override // l4.InterfaceC1151G
    public final void l(M1 m12) {
        g(m12);
        L(new RunnableC1203o0(this, m12, 2));
    }

    @Override // l4.InterfaceC1151G
    public final void m(long j, String str, String str2, String str3) {
        L(new RunnableC1205p0(this, str2, str3, str, j));
    }

    @Override // l4.InterfaceC1151G
    public final void o(M1 m12, Bundle bundle, InterfaceC1153I interfaceC1153I) {
        g(m12);
        String str = m12.f16165a;
        S3.D.h(str);
        this.f16629e.b().t(new RunnableC1210s0(this, m12, bundle, interfaceC1153I, str));
    }

    @Override // l4.InterfaceC1151G
    public final List q(String str, String str2, String str3) {
        K(str, true);
        F1 f12 = this.f16629e;
        try {
            return (List) f12.b().r(new CallableC1207q0(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            T a3 = f12.a();
            a3.f16242f.c(e10, StubApp.getString2(20902));
            return Collections.EMPTY_LIST;
        }
    }

    @Override // l4.InterfaceC1151G
    public final C1184i r(M1 m12) {
        g(m12);
        String str = m12.f16165a;
        S3.D.e(str);
        F1 f12 = this.f16629e;
        try {
            return (C1184i) f12.b().s(new J9.c(this, m12)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            T a3 = f12.a();
            S s10 = T.s(str);
            a3.f16242f.d(StubApp.getString2(20903), s10, e10);
            return new C1184i(null);
        }
    }

    @Override // l4.InterfaceC1151G
    public final void s(M1 m12, C1169d c1169d) {
        g(m12);
        L(new K.m(this, m12, c1169d, 12));
    }

    @Override // l4.InterfaceC1151G
    public final void t(M1 m12) {
        g(m12);
        L(new RunnableC1203o0(this, m12, 0));
    }

    @Override // l4.InterfaceC1151G
    public final void u(M1 m12, y1 y1Var, InterfaceC1155K interfaceC1155K) {
        g(m12);
        String str = m12.f16165a;
        S3.D.h(str);
        this.f16629e.b().t(new N9.c(this, str, y1Var, interfaceC1155K));
    }

    @Override // l4.InterfaceC1151G
    public final String w(M1 m12) {
        g(m12);
        F1 f12 = this.f16629e;
        try {
            return (String) f12.b().r(new J9.c(f12, m12)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            T a3 = f12.a();
            S s10 = T.s(m12.f16165a);
            a3.f16242f.d(StubApp.getString2(20904), s10, e10);
            return null;
        }
    }

    @Override // l4.InterfaceC1151G
    public final List x(String str, String str2, M1 m12) {
        g(m12);
        String str3 = m12.f16165a;
        S3.D.h(str3);
        F1 f12 = this.f16629e;
        try {
            return (List) f12.b().r(new CallableC1207q0(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            T a3 = f12.a();
            a3.f16242f.c(e10, StubApp.getString2(20905));
            return Collections.EMPTY_LIST;
        }
    }

    @Override // l4.InterfaceC1151G
    public final void z(H1 h12, M1 m12) {
        S3.D.h(h12);
        g(m12);
        L(new K.m(this, h12, m12));
    }
}
