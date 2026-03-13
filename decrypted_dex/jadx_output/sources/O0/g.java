package O0;

import o0.C1417N;
import o0.C1438m;
import v0.AbstractC1810e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends o implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f5118e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5119f;

    public g(int i3, C1417N c1417n, int i10, j jVar, int i11) {
        super(i3, c1417n, i10);
        int i12;
        this.f5118e = AbstractC1810e.m(i11, jVar.f5137w) ? 1 : 0;
        C1438m c1438m = this.f5157d;
        int i13 = c1438m.f18223u;
        int i14 = -1;
        if (i13 != -1 && (i12 = c1438m.f18224v) != -1) {
            i14 = i13 * i12;
        }
        this.f5119f = i14;
    }

    @Override // O0.o
    public final int a() {
        return this.f5118e;
    }

    @Override // O0.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f5119f, ((g) obj).f5119f);
    }
}
