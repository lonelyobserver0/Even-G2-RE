package L0;

import D5.C0043g;
import java.io.IOException;
import o0.C1438m;

/* renamed from: L0.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0113i implements G, A0.g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4096a;

    /* renamed from: b, reason: collision with root package name */
    public A0.f f4097b;

    /* renamed from: c, reason: collision with root package name */
    public A0.f f4098c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0115k f4099d;

    public C0113i(AbstractC0115k abstractC0115k, Object obj) {
        this.f4099d = abstractC0115k;
        this.f4097b = abstractC0115k.a(null);
        this.f4098c = new A0.f(abstractC0115k.f4042d.f34c, 0, null);
        this.f4096a = obj;
    }

    @Override // L0.G
    public final void B(int i3, B b2, C0123t c0123t, I0.g gVar) {
        if (a(i3, b2)) {
            A0.f fVar = this.f4097b;
            I0.g b10 = b(gVar, b2);
            fVar.getClass();
            fVar.a(new D(fVar, c0123t, b10, 1));
        }
    }

    @Override // L0.G
    public final void C(int i3, B b2, C0123t c0123t, I0.g gVar) {
        if (a(i3, b2)) {
            A0.f fVar = this.f4097b;
            I0.g b10 = b(gVar, b2);
            fVar.getClass();
            fVar.a(new D(fVar, c0123t, b10, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (java.util.Objects.equals(r0.f33b, r5) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r4, L0.B r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4096a
            L0.k r1 = r3.f4099d
            if (r5 == 0) goto Le
            L0.B r5 = r1.w(r0, r5)
            if (r5 != 0) goto Lf
            r4 = 0
            return r4
        Le:
            r5 = 0
        Lf:
            int r4 = r1.y(r4, r0)
            A0.f r0 = r3.f4097b
            int r2 = r0.f32a
            if (r2 != r4) goto L23
            int r2 = r0.AbstractC1560u.f20190a
            L0.B r0 = r0.f33b
            boolean r0 = java.util.Objects.equals(r0, r5)
            if (r0 != 0) goto L2e
        L23:
            A0.f r0 = new A0.f
            A0.f r2 = r1.f4041c
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.f34c
            r0.<init>(r2, r4, r5)
            r3.f4097b = r0
        L2e:
            A0.f r0 = r3.f4098c
            int r2 = r0.f32a
            if (r2 != r4) goto L3e
            int r2 = r0.AbstractC1560u.f20190a
            L0.B r0 = r0.f33b
            boolean r0 = java.util.Objects.equals(r0, r5)
            if (r0 != 0) goto L49
        L3e:
            A0.f r0 = new A0.f
            A0.f r1 = r1.f4042d
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.f34c
            r0.<init>(r1, r4, r5)
            r3.f4098c = r0
        L49:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.C0113i.a(int, L0.B):boolean");
    }

    public final I0.g b(I0.g gVar, B b2) {
        AbstractC0115k abstractC0115k = this.f4099d;
        Object obj = this.f4096a;
        long j = gVar.f3077d;
        long x7 = abstractC0115k.x(j, obj);
        long j3 = gVar.f3078e;
        long x10 = abstractC0115k.x(j3, obj);
        if (x7 == j && x10 == j3) {
            return gVar;
        }
        return new I0.g(gVar.f3074a, gVar.f3075b, (C1438m) gVar.f3079f, gVar.f3076c, gVar.f3080g, x7, x10);
    }

    @Override // L0.G
    public final void k(int i3, B b2, C0123t c0123t, I0.g gVar, IOException iOException, boolean z2) {
        if (a(i3, b2)) {
            A0.f fVar = this.f4097b;
            I0.g b10 = b(gVar, b2);
            fVar.getClass();
            fVar.a(new E(fVar, c0123t, b10, iOException, z2));
        }
    }

    @Override // L0.G
    public final void m(int i3, B b2, C0123t c0123t, I0.g gVar) {
        if (a(i3, b2)) {
            A0.f fVar = this.f4097b;
            I0.g b10 = b(gVar, b2);
            fVar.getClass();
            fVar.a(new D(fVar, c0123t, b10, 2));
        }
    }

    @Override // L0.G
    public final void n(int i3, B b2, I0.g gVar) {
        if (a(i3, b2)) {
            A0.f fVar = this.f4097b;
            I0.g b10 = b(gVar, b2);
            fVar.getClass();
            fVar.a(new C0043g(8, fVar, b10));
        }
    }

    @Override // L0.G
    public final void o(int i3, B b2, I0.g gVar) {
        if (a(i3, b2)) {
            A0.f fVar = this.f4097b;
            I0.g b10 = b(gVar, b2);
            B b11 = fVar.f33b;
            b11.getClass();
            fVar.a(new C2.e(fVar, b11, b10, 7));
        }
    }
}
