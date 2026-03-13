package O0;

import M4.AbstractC0154z;
import M4.X;
import M4.Y;
import android.text.TextUtils;
import java.util.Objects;
import o0.C1438m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends o implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f5099A;

    /* renamed from: e, reason: collision with root package name */
    public final int f5100e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5101f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5102g;

    /* renamed from: h, reason: collision with root package name */
    public final j f5103h;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5104k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5105l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5106m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f5107n;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5108p;

    /* renamed from: q, reason: collision with root package name */
    public final int f5109q;

    /* renamed from: r, reason: collision with root package name */
    public final int f5110r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5111s;

    /* renamed from: t, reason: collision with root package name */
    public final int f5112t;

    /* renamed from: v, reason: collision with root package name */
    public final int f5113v;

    /* renamed from: w, reason: collision with root package name */
    public final int f5114w;

    /* renamed from: x, reason: collision with root package name */
    public final int f5115x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f5116y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f5117z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d A[LOOP:1: B:39:0x010a->B:41:0x010d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(int r14, o0.C1417N r15, int r16, O0.j r17, int r18, boolean r19, O0.e r20, int r21) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.f.<init>(int, o0.N, int, O0.j, int, boolean, O0.e, int):void");
    }

    @Override // O0.o
    public final int a() {
        return this.f5100e;
    }

    @Override // O0.o
    public final boolean b(o oVar) {
        int i3;
        String str;
        f fVar = (f) oVar;
        this.f5103h.getClass();
        C1438m c1438m = this.f5157d;
        int i10 = c1438m.f18193C;
        if (i10 == -1) {
            return false;
        }
        C1438m c1438m2 = fVar.f5157d;
        if (i10 != c1438m2.f18193C) {
            return false;
        }
        if ((this.f5107n || ((str = c1438m.f18216n) != null && TextUtils.equals(str, c1438m2.f18216n))) && (i3 = c1438m.f18194D) != -1 && i3 == c1438m2.f18194D) {
            return this.f5116y == fVar.f5116y && this.f5117z == fVar.f5117z;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        boolean z2 = this.j;
        boolean z10 = this.f5101f;
        Y a3 = (z10 && z2) ? q.f5172i : q.f5172i.a();
        AbstractC0154z c10 = AbstractC0154z.f4667a.c(z2, fVar.j);
        Integer valueOf = Integer.valueOf(this.f5105l);
        Integer valueOf2 = Integer.valueOf(fVar.f5105l);
        X x7 = X.f4576c;
        AbstractC0154z b2 = c10.b(valueOf, valueOf2, x7).a(this.f5104k, fVar.f5104k).a(this.f5106m, fVar.f5106m).c(this.f5111s, fVar.f5111s).c(this.f5108p, fVar.f5108p).b(Integer.valueOf(this.f5109q), Integer.valueOf(fVar.f5109q), x7).a(this.f5110r, fVar.f5110r).c(z10, fVar.f5101f).b(Integer.valueOf(this.f5115x), Integer.valueOf(fVar.f5115x), x7);
        this.f5103h.getClass();
        AbstractC0154z b10 = b2.c(this.f5116y, fVar.f5116y).c(this.f5117z, fVar.f5117z).c(this.f5099A, fVar.f5099A).b(Integer.valueOf(this.f5112t), Integer.valueOf(fVar.f5112t), a3).b(Integer.valueOf(this.f5113v), Integer.valueOf(fVar.f5113v), a3);
        if (Objects.equals(this.f5102g, fVar.f5102g)) {
            b10 = b10.b(Integer.valueOf(this.f5114w), Integer.valueOf(fVar.f5114w), a3);
        }
        return b10.e();
    }
}
