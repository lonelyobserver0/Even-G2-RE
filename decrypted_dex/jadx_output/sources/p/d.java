package p;

import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f19595a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19596b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f19597c;

    public d(f fVar) {
        this.f19597c = fVar;
    }

    @Override // p.e
    public final void a(c cVar) {
        c cVar2 = this.f19595a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f19594d;
            this.f19595a = cVar3;
            this.f19596b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f19596b) {
            return this.f19597c.f19598a != null;
        }
        c cVar = this.f19595a;
        return (cVar == null || cVar.f19593c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f19596b) {
            this.f19596b = false;
            this.f19595a = this.f19597c.f19598a;
        } else {
            c cVar = this.f19595a;
            this.f19595a = cVar != null ? cVar.f19593c : null;
        }
        return this.f19595a;
    }
}
