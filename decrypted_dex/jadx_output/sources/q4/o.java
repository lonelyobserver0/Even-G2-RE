package q4;

import java.util.concurrent.Executor;
import l4.O0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o implements q, f, e, InterfaceC1522c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20063a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f20064b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1521b f20065c;

    /* renamed from: d, reason: collision with root package name */
    public final s f20066d;

    public /* synthetic */ o(Executor executor, InterfaceC1521b interfaceC1521b, s sVar, int i3) {
        this.f20063a = i3;
        this.f20064b = executor;
        this.f20065c = interfaceC1521b;
        this.f20066d = sVar;
    }

    @Override // q4.e
    public void C(Exception exc) {
        this.f20066d.a(exc);
    }

    @Override // q4.q
    public final void a(j jVar) {
        switch (this.f20063a) {
            case 0:
                this.f20064b.execute(new O0(this, jVar, 10, false));
                break;
            default:
                this.f20064b.execute(new O0(this, jVar, 11, false));
                break;
        }
    }

    @Override // q4.q
    public final void b() {
        switch (this.f20063a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // q4.InterfaceC1522c
    public void c() {
        this.f20066d.c();
    }

    @Override // q4.f
    public void i(Object obj) {
        this.f20066d.b(obj);
    }
}
