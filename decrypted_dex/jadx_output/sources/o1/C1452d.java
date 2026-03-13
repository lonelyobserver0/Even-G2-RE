package o1;

import T0.AbstractC0311b;
import T0.l;
import T0.o;
import T0.p;
import T0.q;
import o0.C1406C;
import r0.AbstractC1560u;
import r0.C1553n;

/* renamed from: o1.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1452d implements o {

    /* renamed from: a, reason: collision with root package name */
    public q f18322a;

    /* renamed from: b, reason: collision with root package name */
    public i f18323b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18324c;

    public final boolean a(l lVar) {
        boolean z2;
        f fVar = new f();
        if (fVar.a(lVar, true) && (fVar.f18330a & 2) == 2) {
            int min = Math.min(fVar.f18334e, 8);
            C1553n c1553n = new C1553n(min);
            lVar.i(c1553n.f20176a, 0, min, false);
            c1553n.G(0);
            if (c1553n.a() >= 5 && c1553n.u() == 127 && c1553n.w() == 1179402563) {
                this.f18323b = new C1451c();
                return true;
            }
            c1553n.G(0);
            try {
                z2 = AbstractC0311b.z(1, c1553n, true);
            } catch (C1406C unused) {
                z2 = false;
            }
            if (z2) {
                this.f18323b = new j();
            } else {
                c1553n.G(0);
                if (h.e(c1553n, h.f18337o)) {
                    this.f18323b = new h();
                }
            }
            return true;
        }
        return false;
    }

    @Override // T0.o
    public final void b(long j, long j3) {
        i iVar = this.f18323b;
        if (iVar != null) {
            C1453e c1453e = iVar.f18340a;
            f fVar = (f) c1453e.f18328d;
            fVar.f18330a = 0;
            fVar.f18331b = 0L;
            fVar.f18332c = 0;
            fVar.f18333d = 0;
            fVar.f18334e = 0;
            ((C1553n) c1453e.f18329e).D(0);
            c1453e.f18325a = -1;
            c1453e.f18327c = false;
            if (j == 0) {
                iVar.d(!iVar.f18350l);
                return;
            }
            if (iVar.f18347h != 0) {
                long j10 = (iVar.f18348i * j3) / 1000000;
                iVar.f18344e = j10;
                g gVar = iVar.f18343d;
                int i3 = AbstractC1560u.f20190a;
                gVar.e(j10);
                iVar.f18347h = 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    @Override // T0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(T0.p r20, T0.s r21) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.C1452d.c(T0.p, T0.s):int");
    }

    @Override // T0.o
    public final void f(q qVar) {
        this.f18322a = qVar;
    }

    @Override // T0.o
    public final boolean h(p pVar) {
        try {
            return a((l) pVar);
        } catch (C1406C unused) {
            return false;
        }
    }

    @Override // T0.o
    public final void release() {
    }
}
