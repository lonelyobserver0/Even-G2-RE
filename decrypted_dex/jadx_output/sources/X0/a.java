package X0;

import T0.D;
import T0.o;
import T0.p;
import T0.q;
import T0.s;
import b1.C0484a;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8235a;

    /* renamed from: b, reason: collision with root package name */
    public final o f8236b;

    public a(int i3, byte b2) {
        this.f8235a = i3;
        switch (i3) {
            case 1:
                this.f8236b = new D(35152, 2, StubApp.getString2(6955));
                break;
            default:
                this.f8236b = new D(16973, 2, StubApp.getString2(6954));
                break;
        }
    }

    private final void a() {
    }

    private final void d() {
    }

    @Override // T0.o
    public final void b(long j, long j3) {
        switch (this.f8235a) {
            case 0:
                ((D) this.f8236b).b(j, j3);
                break;
            case 1:
                ((D) this.f8236b).b(j, j3);
                break;
            default:
                this.f8236b.b(j, j3);
                break;
        }
    }

    @Override // T0.o
    public final int c(p pVar, s sVar) {
        switch (this.f8235a) {
            case 0:
                return ((D) this.f8236b).c(pVar, sVar);
            case 1:
                return ((D) this.f8236b).c(pVar, sVar);
            default:
                return this.f8236b.c(pVar, sVar);
        }
    }

    @Override // T0.o
    public final void f(q qVar) {
        switch (this.f8235a) {
            case 0:
                ((D) this.f8236b).f(qVar);
                break;
            case 1:
                ((D) this.f8236b).f(qVar);
                break;
            default:
                this.f8236b.f(qVar);
                break;
        }
    }

    @Override // T0.o
    public final boolean h(p pVar) {
        switch (this.f8235a) {
            case 0:
                return ((D) this.f8236b).h(pVar);
            case 1:
                return ((D) this.f8236b).h(pVar);
            default:
                return this.f8236b.h(pVar);
        }
    }

    @Override // T0.o
    public final void release() {
        switch (this.f8235a) {
            case 0:
            case 1:
                break;
            default:
                this.f8236b.release();
                break;
        }
    }

    public a(int i3) {
        this.f8235a = 2;
        if ((i3 & 1) != 0) {
            this.f8236b = new D(65496, 2, StubApp.getString2(6953));
        } else {
            this.f8236b = new C0484a();
        }
    }
}
