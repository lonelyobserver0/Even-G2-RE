package Ya;

import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f8858a;

    public a(c cVar) {
        this.f8858a = cVar;
    }

    @Override // Ya.b
    public final void a() {
    }

    @Override // Ya.b
    public final void b() {
        c cVar = this.f8858a;
        Iterator it = cVar.f8879t.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
        cVar.f8877r.onPreEngineRestart();
        cVar.f8878s.onPreEngineRestart();
        cVar.f8870k.f14304b = null;
    }
}
