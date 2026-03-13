package p;

import java.util.Iterator;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1476b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f19588a;

    /* renamed from: b, reason: collision with root package name */
    public c f19589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19590c;

    public C1476b(c cVar, c cVar2, int i3) {
        this.f19590c = i3;
        this.f19588a = cVar2;
        this.f19589b = cVar;
    }

    @Override // p.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f19588a == cVar && cVar == this.f19589b) {
            this.f19589b = null;
            this.f19588a = null;
        }
        c cVar4 = this.f19588a;
        if (cVar4 == cVar) {
            switch (this.f19590c) {
                case 0:
                    cVar2 = cVar4.f19594d;
                    break;
                default:
                    cVar2 = cVar4.f19593c;
                    break;
            }
            this.f19588a = cVar2;
        }
        c cVar5 = this.f19589b;
        if (cVar5 == cVar) {
            c cVar6 = this.f19588a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f19589b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f19590c) {
            case 0:
                return cVar.f19593c;
            default:
                return cVar.f19594d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19589b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f19589b;
        c cVar2 = this.f19588a;
        this.f19589b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
