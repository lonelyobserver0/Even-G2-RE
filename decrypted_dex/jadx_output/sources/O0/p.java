package O0;

import M4.AbstractC0154z;
import M4.X;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p extends o {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5158e;

    /* renamed from: f, reason: collision with root package name */
    public final j f5159f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5160g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5161h;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5162k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5163l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5164m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5165n;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5166p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f5167q;

    /* renamed from: r, reason: collision with root package name */
    public final int f5168r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5169s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f5170t;

    /* renamed from: v, reason: collision with root package name */
    public final int f5171v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d6 A[EDGE_INSN: B:126:0x00d6->B:67:0x00d6 BREAK  A[LOOP:0: B:59:0x00bc->B:124:0x00d4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p(int r9, o0.C1417N r10, int r11, O0.j r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.p.<init>(int, o0.N, int, O0.j, int, int, boolean):void");
    }

    public static int c(p pVar, p pVar2) {
        AbstractC0154z b2 = AbstractC0154z.f4667a.c(pVar.f5161h, pVar2.f5161h).a(pVar.f5165n, pVar2.f5165n).c(pVar.f5166p, pVar2.f5166p).c(pVar.j, pVar2.j).c(pVar.f5158e, pVar2.f5158e).c(pVar.f5160g, pVar2.f5160g).b(Integer.valueOf(pVar.f5164m), Integer.valueOf(pVar2.f5164m), X.f4576c);
        boolean z2 = pVar2.f5169s;
        boolean z10 = pVar.f5169s;
        AbstractC0154z c10 = b2.c(z10, z2);
        boolean z11 = pVar2.f5170t;
        boolean z12 = pVar.f5170t;
        AbstractC0154z c11 = c10.c(z12, z11);
        if (z10 && z12) {
            c11 = c11.a(pVar.f5171v, pVar2.f5171v);
        }
        return c11.e();
    }

    @Override // O0.o
    public final int a() {
        return this.f5168r;
    }

    @Override // O0.o
    public final boolean b(o oVar) {
        p pVar = (p) oVar;
        if (!this.f5167q && !Objects.equals(this.f5157d.f18216n, pVar.f5157d.f18216n)) {
            return false;
        }
        this.f5159f.getClass();
        return this.f5169s == pVar.f5169s && this.f5170t == pVar.f5170t;
    }
}
