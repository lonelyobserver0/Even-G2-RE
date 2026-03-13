package l4;

import android.os.RemoteException;
import com.stub.StubApp;
import java.util.Objects;

/* renamed from: l4.e1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1174e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M1 f16422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1189j1 f16423c;

    public /* synthetic */ RunnableC1174e1(C1189j1 c1189j1, M1 m12, int i3) {
        this.f16421a = i3;
        this.f16422b = m12;
        this.f16423c = c1189j1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16421a) {
            case 0:
                C1189j1 c1189j1 = this.f16423c;
                InterfaceC1151G interfaceC1151G = c1189j1.f16480d;
                C1200n0 c1200n0 = (C1200n0) c1189j1.f4728a;
                if (interfaceC1151G != null) {
                    try {
                        interfaceC1151G.I(this.f16422b);
                    } catch (RemoteException e10) {
                        T t3 = c1200n0.f16541f;
                        C1200n0.l(t3);
                        t3.f16242f.c(e10, StubApp.getString2(20413));
                    }
                    c1189j1.x();
                    break;
                } else {
                    T t10 = c1200n0.f16541f;
                    C1200n0.l(t10);
                    t10.f16242f.b(StubApp.getString2(20412));
                    break;
                }
            case 1:
                C1189j1 c1189j12 = this.f16423c;
                InterfaceC1151G interfaceC1151G2 = c1189j12.f16480d;
                C1200n0 c1200n02 = (C1200n0) c1189j12.f4728a;
                if (interfaceC1151G2 == null) {
                    T t11 = c1200n02.f16541f;
                    C1200n0.l(t11);
                    t11.f16242f.b(StubApp.getString2(20410));
                    break;
                } else {
                    try {
                        M1 m12 = this.f16422b;
                        C1178g c1178g = c1200n02.f16539d;
                        C1147C c1147c = AbstractC1148D.f15980c1;
                        if (c1178g.u(null, c1147c)) {
                            c1189j12.C(interfaceC1151G2, null, m12);
                        }
                        interfaceC1151G2.t(m12);
                        c1200n02.n().p();
                        c1200n02.f16539d.u(null, c1147c);
                        c1189j12.C(interfaceC1151G2, null, m12);
                        c1189j12.x();
                        break;
                    } catch (RemoteException e11) {
                        T t12 = c1200n02.f16541f;
                        C1200n0.l(t12);
                        t12.f16242f.c(e11, StubApp.getString2(20411));
                        return;
                    }
                }
            case 2:
                C1189j1 c1189j13 = this.f16423c;
                InterfaceC1151G interfaceC1151G3 = c1189j13.f16480d;
                C1200n0 c1200n03 = (C1200n0) c1189j13.f4728a;
                if (interfaceC1151G3 == null) {
                    T t13 = c1200n03.f16541f;
                    C1200n0.l(t13);
                    t13.j.b(StubApp.getString2(20408));
                    break;
                } else {
                    try {
                        interfaceC1151G3.J(this.f16422b);
                        c1189j13.x();
                        break;
                    } catch (RemoteException e12) {
                        T t14 = c1200n03.f16541f;
                        C1200n0.l(t14);
                        t14.f16242f.c(e12, StubApp.getString2(20409));
                        return;
                    }
                }
            case 3:
                C1189j1 c1189j14 = this.f16423c;
                InterfaceC1151G interfaceC1151G4 = c1189j14.f16480d;
                C1200n0 c1200n04 = (C1200n0) c1189j14.f4728a;
                if (interfaceC1151G4 == null) {
                    T t15 = c1200n04.f16541f;
                    C1200n0.l(t15);
                    t15.f16242f.b(StubApp.getString2(20406));
                    break;
                } else {
                    try {
                        interfaceC1151G4.l(this.f16422b);
                        c1189j14.x();
                        break;
                    } catch (RemoteException e13) {
                        T t16 = c1200n04.f16541f;
                        C1200n0.l(t16);
                        t16.f16242f.c(e13, StubApp.getString2(20407));
                        return;
                    }
                }
            default:
                C1189j1 c1189j15 = this.f16423c;
                InterfaceC1151G interfaceC1151G5 = c1189j15.f16480d;
                C1200n0 c1200n05 = (C1200n0) c1189j15.f4728a;
                if (interfaceC1151G5 == null) {
                    T t17 = c1200n05.f16541f;
                    C1200n0.l(t17);
                    t17.f16242f.b(StubApp.getString2(20404));
                    break;
                } else {
                    try {
                        interfaceC1151G5.A(this.f16422b);
                        c1189j15.x();
                        break;
                    } catch (RemoteException e14) {
                        T t18 = c1200n05.f16541f;
                        C1200n0.l(t18);
                        t18.f16242f.c(e14, StubApp.getString2(20405));
                    }
                }
        }
    }

    public RunnableC1174e1(C1189j1 c1189j1, M1 m12) {
        this.f16421a = 4;
        this.f16422b = m12;
        Objects.requireNonNull(c1189j1);
        this.f16423c = c1189j1;
    }
}
