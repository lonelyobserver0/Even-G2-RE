package r1;

import a0.C0379a;
import c5.B;
import java.util.ArrayDeque;
import q1.i;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class h implements q1.e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f20284a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f20285b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f20286c;

    /* renamed from: d, reason: collision with root package name */
    public g f20287d;

    /* renamed from: e, reason: collision with root package name */
    public long f20288e;

    /* renamed from: f, reason: collision with root package name */
    public long f20289f;

    /* renamed from: g, reason: collision with root package name */
    public long f20290g;

    public h() {
        for (int i3 = 0; i3 < 10; i3++) {
            this.f20284a.add(new g(1));
        }
        this.f20285b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque arrayDeque = this.f20285b;
            B b2 = new B(this, 25);
            q1.c cVar = new q1.c();
            cVar.f19889h = b2;
            arrayDeque.add(cVar);
        }
        this.f20286c = new ArrayDeque();
        this.f20290g = -9223372036854775807L;
    }

    @Override // u0.c
    public final void a(i iVar) {
        AbstractC1550k.c(iVar == this.f20287d);
        g gVar = (g) iVar;
        long j = gVar.f21398g;
        if (j != Long.MIN_VALUE) {
            long j3 = this.f20290g;
            if (j3 != -9223372036854775807L && j < j3) {
                gVar.s();
                this.f20284a.add(gVar);
                this.f20287d = null;
            }
        }
        long j10 = this.f20289f;
        this.f20289f = 1 + j10;
        gVar.f20283l = j10;
        this.f20286c.add(gVar);
        this.f20287d = null;
    }

    @Override // u0.c
    public final void b(long j) {
        this.f20290g = j;
    }

    @Override // q1.e
    public final void c(long j) {
        this.f20288e = j;
    }

    @Override // u0.c
    public final Object e() {
        AbstractC1550k.g(this.f20287d == null);
        ArrayDeque arrayDeque = this.f20284a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f20287d = gVar;
        return gVar;
    }

    public abstract C0379a f();

    @Override // u0.c
    public void flush() {
        ArrayDeque arrayDeque;
        this.f20289f = 0L;
        this.f20288e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f20286c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f20284a;
            if (isEmpty) {
                break;
            }
            g gVar = (g) arrayDeque2.poll();
            int i3 = AbstractC1560u.f20190a;
            gVar.s();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f20287d;
        if (gVar2 != null) {
            gVar2.s();
            arrayDeque.add(gVar2);
            this.f20287d = null;
        }
    }

    public abstract void g(g gVar);

    @Override // u0.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public q1.c d() {
        ArrayDeque arrayDeque = this.f20285b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f20286c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            g gVar = (g) arrayDeque2.peek();
            int i3 = AbstractC1560u.f20190a;
            if (gVar.f21398g > this.f20288e) {
                return null;
            }
            g gVar2 = (g) arrayDeque2.poll();
            boolean k3 = gVar2.k(4);
            ArrayDeque arrayDeque3 = this.f20284a;
            if (k3) {
                q1.c cVar = (q1.c) arrayDeque.pollFirst();
                cVar.a(4);
                gVar2.s();
                arrayDeque3.add(gVar2);
                return cVar;
            }
            g(gVar2);
            if (i()) {
                C0379a f10 = f();
                q1.c cVar2 = (q1.c) arrayDeque.pollFirst();
                long j = gVar2.f21398g;
                cVar2.f21400c = j;
                cVar2.f19886e = f10;
                cVar2.f19887f = j;
                gVar2.s();
                arrayDeque3.add(gVar2);
                return cVar2;
            }
            gVar2.s();
            arrayDeque3.add(gVar2);
        }
    }

    public abstract boolean i();

    @Override // u0.c
    public void release() {
    }
}
