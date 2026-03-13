package W4;

import D5.C0043g;
import D5.C0048l;
import w5.InterfaceC1865a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o implements w5.b {

    /* renamed from: c, reason: collision with root package name */
    public static final R4.i f8148c = new R4.i(8);

    /* renamed from: d, reason: collision with root package name */
    public static final C0048l f8149d = new C0048l(2);

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1865a f8150a;

    /* renamed from: b, reason: collision with root package name */
    public volatile w5.b f8151b;

    public o(R4.i iVar, w5.b bVar) {
        this.f8150a = iVar;
        this.f8151b = bVar;
    }

    public final void a(InterfaceC1865a interfaceC1865a) {
        w5.b bVar;
        w5.b bVar2;
        w5.b bVar3 = this.f8151b;
        C0048l c0048l = f8149d;
        if (bVar3 != c0048l) {
            interfaceC1865a.c(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f8151b;
            if (bVar != c0048l) {
                bVar2 = bVar;
            } else {
                this.f8150a = new C0043g(13, this.f8150a, interfaceC1865a);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC1865a.c(bVar);
        }
    }

    @Override // w5.b
    public final Object get() {
        return this.f8151b.get();
    }
}
