package B1;

import T0.D;
import T0.l;
import T0.o;
import T0.p;
import T0.q;
import T0.s;
import com.stub.StubApp;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f587a;

    /* renamed from: b, reason: collision with root package name */
    public final C1553n f588b;

    /* renamed from: c, reason: collision with root package name */
    public final D f589c;

    public a(int i3) {
        this.f587a = i3;
        switch (i3) {
            case 1:
                this.f588b = new C1553n(4);
                this.f589c = new D(-1, -1, StubApp.getString2(525));
                break;
            case 2:
                this.f588b = new C1553n(4);
                this.f589c = new D(-1, -1, StubApp.getString2(524));
                break;
            default:
                this.f588b = new C1553n(4);
                this.f589c = new D(-1, -1, StubApp.getString2(523));
                break;
        }
    }

    private final void a() {
    }

    private final void d() {
    }

    private final void e() {
    }

    @Override // T0.o
    public final void b(long j, long j3) {
        switch (this.f587a) {
            case 0:
                this.f589c.b(j, j3);
                break;
            case 1:
                this.f589c.b(j, j3);
                break;
            default:
                this.f589c.b(j, j3);
                break;
        }
    }

    @Override // T0.o
    public final int c(p pVar, s sVar) {
        switch (this.f587a) {
        }
        return this.f589c.c(pVar, sVar);
    }

    @Override // T0.o
    public final void f(q qVar) {
        switch (this.f587a) {
            case 0:
                this.f589c.f(qVar);
                break;
            case 1:
                this.f589c.f(qVar);
                break;
            default:
                this.f589c.f(qVar);
                break;
        }
    }

    @Override // T0.o
    public final boolean h(p pVar) {
        switch (this.f587a) {
            case 0:
                C1553n c1553n = this.f588b;
                c1553n.D(4);
                l lVar = (l) pVar;
                lVar.i(c1553n.f20176a, 0, 4, false);
                if (c1553n.w() == 1380533830) {
                    lVar.a(4, false);
                    c1553n.D(4);
                    lVar.i(c1553n.f20176a, 0, 4, false);
                    if (c1553n.w() == 1464156752) {
                    }
                }
                break;
            case 1:
                l lVar2 = (l) pVar;
                lVar2.a(4, false);
                C1553n c1553n2 = this.f588b;
                c1553n2.D(4);
                lVar2.i(c1553n2.f20176a, 0, 4, false);
                if (c1553n2.w() == 1718909296) {
                    c1553n2.D(4);
                    lVar2.i(c1553n2.f20176a, 0, 4, false);
                    if (c1553n2.w() == 1635150182) {
                    }
                }
                break;
            default:
                l lVar3 = (l) pVar;
                lVar3.a(4, false);
                C1553n c1553n3 = this.f588b;
                c1553n3.D(4);
                lVar3.i(c1553n3.f20176a, 0, 4, false);
                if (c1553n3.w() == 1718909296) {
                    c1553n3.D(4);
                    lVar3.i(c1553n3.f20176a, 0, 4, false);
                    if (c1553n3.w() == 1751476579) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // T0.o
    public final void release() {
        int i3 = this.f587a;
    }
}
