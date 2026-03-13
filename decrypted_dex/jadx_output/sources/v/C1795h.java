package v;

import V8.u;
import com.stub.StubApp;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1795h {

    /* renamed from: a, reason: collision with root package name */
    public Object f21513a;

    /* renamed from: b, reason: collision with root package name */
    public C1797j f21514b;

    /* renamed from: c, reason: collision with root package name */
    public k f21515c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21516d;

    public final void finalize() {
        k kVar;
        C1797j c1797j = this.f21514b;
        if (c1797j != null) {
            C1796i c1796i = c1797j.f21519b;
            if (!c1796i.isDone()) {
                c1796i.k(new u(StubApp.getString2(23594) + this.f21513a, 3));
            }
        }
        if (this.f21516d || (kVar = this.f21515c) == null) {
            return;
        }
        kVar.j(null);
    }
}
