package Vc;

import Z9.C0366a;
import android.app.Service;
import android.content.Intent;
import com.stub.StubApp;
import l4.C1200n0;
import l4.InterfaceC1198m1;
import l4.T;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8034a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8035b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8036c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8038e;

    public /* synthetic */ m(C0366a c0366a, int i3, T t3, Intent intent) {
        this.f8036c = c0366a;
        this.f8035b = i3;
        this.f8037d = t3;
        this.f8038e = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int h2;
        switch (this.f8034a) {
            case 0:
                n nVar = (n) this.f8038e;
                if (nVar.f8040b) {
                    int i3 = nVar.f8046h;
                    while (nVar.f8040b) {
                        Boolean bool = (Boolean) this.f8037d;
                        Integer num = (Integer) this.f8036c;
                        int i10 = this.f8035b;
                        if (i3 == 7 || i3 == 8) {
                            h2 = nVar.h(num, bool, i10);
                        } else {
                            try {
                                h2 = bool.booleanValue() ? nVar.j(num, bool, i10) : nVar.i(num, i10);
                            } catch (Exception e10) {
                                System.out.println(e10);
                                return;
                            }
                        }
                        if (nVar.f8040b) {
                            nVar.f8049l.post(nVar.f8047i);
                        }
                        if (h2 == 0) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Service service = (Service) ((C0366a) this.f8036c).f9105b;
                InterfaceC1198m1 interfaceC1198m1 = (InterfaceC1198m1) service;
                int i11 = this.f8035b;
                if (interfaceC1198m1.a(i11)) {
                    ((T) this.f8037d).f16249p.c(Integer.valueOf(i11), StubApp.getString2(25814));
                    T t3 = C1200n0.r(service, null, null).f16541f;
                    C1200n0.l(t3);
                    t3.f16249p.b(StubApp.getString2(25815));
                    interfaceC1198m1.b((Intent) this.f8038e);
                    break;
                }
                break;
        }
    }

    public m(n nVar, Integer num, Boolean bool, int i3) {
        this.f8038e = nVar;
        this.f8036c = num;
        this.f8037d = bool;
        this.f8035b = i3;
    }
}
