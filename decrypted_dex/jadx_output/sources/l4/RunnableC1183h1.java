package l4;

import android.os.RemoteException;
import com.stub.StubApp;

/* renamed from: l4.h1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class RunnableC1183h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1189j1 f16459b;

    public /* synthetic */ RunnableC1183h1(C1189j1 c1189j1, int i3) {
        this.f16458a = i3;
        this.f16459b = c1189j1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16458a) {
            case 0:
                this.f16459b.q();
                break;
            case 1:
                C1189j1 c1189j1 = this.f16459b;
                InterfaceC1151G interfaceC1151G = c1189j1.f16480d;
                C1200n0 c1200n0 = (C1200n0) c1189j1.f4728a;
                if (interfaceC1151G == null) {
                    T t3 = c1200n0.f16541f;
                    C1200n0.l(t3);
                    t3.f16242f.b(StubApp.getString2(20463));
                    break;
                } else {
                    try {
                        interfaceC1151G.i(c1189j1.A(false));
                        c1189j1.x();
                        break;
                    } catch (RemoteException e10) {
                        T t10 = c1200n0.f16541f;
                        C1200n0.l(t10);
                        t10.f16242f.c(e10, StubApp.getString2(20464));
                        return;
                    }
                }
            default:
                C1189j1 c1189j12 = this.f16459b;
                InterfaceC1151G interfaceC1151G2 = c1189j12.f16480d;
                C1200n0 c1200n02 = (C1200n0) c1189j12.f4728a;
                if (interfaceC1151G2 == null) {
                    T t11 = c1200n02.f16541f;
                    C1200n0.l(t11);
                    t11.f16242f.b(StubApp.getString2(20461));
                    break;
                } else {
                    try {
                        interfaceC1151G2.j(c1189j12.A(false));
                        c1189j12.x();
                        break;
                    } catch (RemoteException e11) {
                        T t12 = c1200n02.f16541f;
                        C1200n0.l(t12);
                        t12.f16242f.c(e11, StubApp.getString2(20462));
                    }
                }
        }
    }
}
