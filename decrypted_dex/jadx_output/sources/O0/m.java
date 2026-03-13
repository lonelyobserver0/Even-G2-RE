package O0;

import M4.AbstractC0154z;
import M4.I;
import M4.X;
import M4.Y;
import M4.Z;
import kotlin.jvm.internal.IntCompanionObject;
import o0.C1417N;
import v0.AbstractC1810e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m extends o implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f5146e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5147f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5148g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5149h;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5150k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5151l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5152m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f5153n;

    public m(int i3, C1417N c1417n, int i10, j jVar, int i11, String str) {
        super(i3, c1417n, i10);
        int i12;
        int i13;
        int i14 = 0;
        this.f5147f = AbstractC1810e.m(i11, false);
        int i15 = this.f5157d.f18208e;
        jVar.getClass();
        this.f5148g = (i15 & 1) != 0;
        this.f5149h = (i15 & 2) != 0;
        Z z2 = jVar.f18101n;
        Z q10 = z2.isEmpty() ? I.q("") : z2;
        int i16 = 0;
        while (true) {
            int i17 = q10.f4580d;
            i12 = IntCompanionObject.MAX_VALUE;
            if (i16 >= i17) {
                i13 = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                i13 = q.b(this.f5157d, (String) q10.get(i16), false);
                if (i13 > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.j = i16;
        this.f5150k = i13;
        int i18 = this.f5157d.f18209f;
        Y y10 = q.f5172i;
        int i19 = jVar.f18102o;
        i12 = (i18 == 0 || i18 != i19) ? Integer.bitCount(i18 & i19) : i12;
        this.f5151l = i12;
        this.f5153n = (this.f5157d.f18209f & 1088) != 0;
        int b2 = q.b(this.f5157d, str, q.d(str) == null);
        this.f5152m = b2;
        boolean z10 = i13 > 0 || (z2.isEmpty() && i12 > 0) || this.f5148g || (this.f5149h && b2 > 0);
        if (AbstractC1810e.m(i11, jVar.f5137w) && z10) {
            i14 = 1;
        }
        this.f5146e = i14;
    }

    @Override // O0.o
    public final int a() {
        return this.f5146e;
    }

    @Override // O0.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(m mVar) {
        AbstractC0154z c10 = AbstractC0154z.f4667a.c(this.f5147f, mVar.f5147f);
        Integer valueOf = Integer.valueOf(this.j);
        Integer valueOf2 = Integer.valueOf(mVar.j);
        X x7 = X.f4576c;
        AbstractC0154z b2 = c10.b(valueOf, valueOf2, x7);
        int i3 = this.f5150k;
        AbstractC0154z a3 = b2.a(i3, mVar.f5150k);
        int i10 = this.f5151l;
        AbstractC0154z c11 = a3.a(i10, mVar.f5151l).c(this.f5148g, mVar.f5148g);
        Boolean valueOf3 = Boolean.valueOf(this.f5149h);
        Boolean valueOf4 = Boolean.valueOf(mVar.f5149h);
        if (i3 == 0) {
            x7 = X.f4575b;
        }
        AbstractC0154z a9 = c11.b(valueOf3, valueOf4, x7).a(this.f5152m, mVar.f5152m);
        if (i10 == 0) {
            a9 = a9.d(this.f5153n, mVar.f5153n);
        }
        return a9.e();
    }
}
