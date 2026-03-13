package R3;

import com.google.android.gms.common.GoogleApiAvailability;
import com.stub.StubApp;
import t.C1693f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p extends I {

    /* renamed from: f, reason: collision with root package name */
    public final C1693f f6145f;

    /* renamed from: g, reason: collision with root package name */
    public final C0236e f6146g;

    public p(InterfaceC0240i interfaceC0240i, C0236e c0236e, GoogleApiAvailability googleApiAvailability) {
        super(interfaceC0240i, googleApiAvailability);
        this.f6145f = new C1693f(0);
        this.f6146g = c0236e;
        interfaceC0240i.g(StubApp.getString2(5161), this);
    }

    @Override // R3.AbstractC0239h
    public final void f() {
        if (this.f6145f.isEmpty()) {
            return;
        }
        this.f6146g.a(this);
    }

    @Override // R3.I, R3.AbstractC0239h
    public final void h() {
        this.f6102b = true;
        if (this.f6145f.isEmpty()) {
            return;
        }
        this.f6146g.a(this);
    }

    @Override // R3.I, R3.AbstractC0239h
    public final void i() {
        this.f6102b = false;
        C0236e c0236e = this.f6146g;
        c0236e.getClass();
        synchronized (C0236e.f6121t) {
            try {
                if (c0236e.f6132l == this) {
                    c0236e.f6132l = null;
                    c0236e.f6133m.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // R3.I
    public final void j(com.google.android.gms.common.b bVar, int i3) {
        this.f6146g.g(bVar, i3);
    }

    @Override // R3.I
    public final void k() {
        c4.h hVar = this.f6146g.f6135p;
        hVar.sendMessage(hVar.obtainMessage(3));
    }
}
