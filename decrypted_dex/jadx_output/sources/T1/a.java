package T1;

import android.view.View;
import android.view.ViewGroup;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends n {

    /* renamed from: A, reason: collision with root package name */
    public int f7083A;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f7086y = new ArrayList();

    /* renamed from: B, reason: collision with root package name */
    public boolean f7084B = false;

    /* renamed from: C, reason: collision with root package name */
    public int f7085C = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7087z = false;

    public a() {
        G(new j(2));
        G(new g());
        G(new j(1));
    }

    @Override // T1.n
    public final void A() {
        this.f7085C |= 1;
        ArrayList arrayList = this.f7086y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((n) this.f7086y.get(i3)).A();
            }
        }
    }

    @Override // T1.n
    public final void B(C2.i iVar) {
        super.B(iVar);
        this.f7085C |= 4;
        if (this.f7086y != null) {
            for (int i3 = 0; i3 < this.f7086y.size(); i3++) {
                ((n) this.f7086y.get(i3)).B(iVar);
            }
        }
    }

    @Override // T1.n
    public final void C() {
        this.f7085C |= 2;
        int size = this.f7086y.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((n) this.f7086y.get(i3)).C();
        }
    }

    @Override // T1.n
    public final void D(long j) {
        this.f7123b = j;
    }

    @Override // T1.n
    public final String F(String str) {
        String F3 = super.F(str);
        for (int i3 = 0; i3 < this.f7086y.size(); i3++) {
            StringBuilder n10 = AbstractC1482f.n(F3, StubApp.getString2(3692));
            n10.append(((n) this.f7086y.get(i3)).F(str + StubApp.getString2(6127)));
            F3 = n10.toString();
        }
        return F3;
    }

    public final void G(n nVar) {
        this.f7086y.add(nVar);
        nVar.f7129h = this;
        long j = this.f7124c;
        if (j >= 0) {
            nVar.y(j);
        }
        if ((this.f7085C & 1) != 0) {
            nVar.A();
        }
        if ((this.f7085C & 2) != 0) {
            nVar.C();
        }
        if ((this.f7085C & 4) != 0) {
            nVar.B(this.f7138t);
        }
        if ((this.f7085C & 8) != 0) {
            nVar.z(null);
        }
    }

    @Override // T1.n
    public final void c() {
        super.c();
        int size = this.f7086y.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((n) this.f7086y.get(i3)).c();
        }
    }

    @Override // T1.n
    public final void d(s sVar) {
        if (s(sVar.f7147b)) {
            Iterator it = this.f7086y.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (nVar.s(sVar.f7147b)) {
                    nVar.d(sVar);
                    sVar.f7148c.add(nVar);
                }
            }
        }
    }

    @Override // T1.n
    public final void f(s sVar) {
        int size = this.f7086y.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((n) this.f7086y.get(i3)).f(sVar);
        }
    }

    @Override // T1.n
    public final void g(s sVar) {
        if (s(sVar.f7147b)) {
            Iterator it = this.f7086y.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (nVar.s(sVar.f7147b)) {
                    nVar.g(sVar);
                    sVar.f7148c.add(nVar);
                }
            }
        }
    }

    @Override // T1.n
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final n clone() {
        a aVar = (a) super.clone();
        aVar.f7086y = new ArrayList();
        int size = this.f7086y.size();
        for (int i3 = 0; i3 < size; i3++) {
            n clone = ((n) this.f7086y.get(i3)).clone();
            aVar.f7086y.add(clone);
            clone.f7129h = aVar;
        }
        return aVar;
    }

    @Override // T1.n
    public final void l(ViewGroup viewGroup, p2.h hVar, p2.h hVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f7123b;
        int size = this.f7086y.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = (n) this.f7086y.get(i3);
            if (j > 0 && (this.f7087z || i3 == 0)) {
                long j3 = nVar.f7123b;
                if (j3 > 0) {
                    nVar.D(j3 + j);
                } else {
                    nVar.D(j);
                }
            }
            nVar.l(viewGroup, hVar, hVar2, arrayList, arrayList2);
        }
    }

    @Override // T1.n
    public final void u(ViewGroup viewGroup) {
        super.u(viewGroup);
        int size = this.f7086y.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((n) this.f7086y.get(i3)).u(viewGroup);
        }
    }

    @Override // T1.n
    public final void w(View view) {
        super.w(view);
        int size = this.f7086y.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((n) this.f7086y.get(i3)).w(view);
        }
    }

    @Override // T1.n
    public final void x() {
        if (this.f7086y.isEmpty()) {
            E();
            m();
            return;
        }
        h hVar = new h();
        hVar.f7106b = this;
        Iterator it = this.f7086y.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a(hVar);
        }
        this.f7083A = this.f7086y.size();
        if (this.f7087z) {
            Iterator it2 = this.f7086y.iterator();
            while (it2.hasNext()) {
                ((n) it2.next()).x();
            }
            return;
        }
        for (int i3 = 1; i3 < this.f7086y.size(); i3++) {
            ((n) this.f7086y.get(i3 - 1)).a(new h((n) this.f7086y.get(i3), 1));
        }
        n nVar = (n) this.f7086y.get(0);
        if (nVar != null) {
            nVar.x();
        }
    }

    @Override // T1.n
    public final void y(long j) {
        ArrayList arrayList;
        this.f7124c = j;
        if (j < 0 || (arrayList = this.f7086y) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((n) this.f7086y.get(i3)).y(j);
        }
    }

    @Override // T1.n
    public final void z(Tc.d dVar) {
        this.f7085C |= 8;
        int size = this.f7086y.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((n) this.f7086y.get(i3)).z(dVar);
        }
    }
}
