package q4;

import i.RunnableC1018B;
import java.util.concurrent.Executor;
import l4.O0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p implements q, f, e, InterfaceC1522c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20067a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f20068b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20069c;

    /* renamed from: d, reason: collision with root package name */
    public Object f20070d;

    public p(Executor executor, InterfaceC1522c interfaceC1522c) {
        this.f20067a = 0;
        this.f20069c = new Object();
        this.f20068b = executor;
        this.f20070d = interfaceC1522c;
    }

    @Override // q4.e
    public void C(Exception exc) {
        ((s) this.f20070d).a(exc);
    }

    @Override // q4.q
    public final void a(j jVar) {
        switch (this.f20067a) {
            case 0:
                if (jVar.isCanceled()) {
                    synchronized (this.f20069c) {
                        try {
                            if (((InterfaceC1522c) this.f20070d) != null) {
                                this.f20068b.execute(new RunnableC1018B(this, 16));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.f20069c) {
                    try {
                        if (((d) this.f20070d) == null) {
                            return;
                        }
                        this.f20068b.execute(new O0(this, jVar, 12, false));
                        return;
                    } finally {
                    }
                }
            case 2:
                if (jVar.isSuccessful() || jVar.isCanceled()) {
                    return;
                }
                synchronized (this.f20069c) {
                    try {
                        if (((e) this.f20070d) != null) {
                            this.f20068b.execute(new O0(this, jVar, 13, false));
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                if (jVar.isSuccessful()) {
                    synchronized (this.f20069c) {
                        try {
                            if (((f) this.f20070d) != null) {
                                this.f20068b.execute(new O0(this, jVar, 14, false));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                this.f20068b.execute(new O0(this, jVar, 15, false));
                return;
        }
    }

    @Override // q4.q
    public final void b() {
        switch (this.f20067a) {
            case 0:
                synchronized (this.f20069c) {
                    this.f20070d = null;
                }
                return;
            case 1:
                synchronized (this.f20069c) {
                    this.f20070d = null;
                }
                return;
            case 2:
                synchronized (this.f20069c) {
                    this.f20070d = null;
                }
                return;
            case 3:
                synchronized (this.f20069c) {
                    this.f20070d = null;
                }
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // q4.InterfaceC1522c
    public void c() {
        ((s) this.f20070d).c();
    }

    @Override // q4.f
    public void i(Object obj) {
        ((s) this.f20070d).b(obj);
    }

    public p(Executor executor, d dVar) {
        this.f20067a = 1;
        this.f20069c = new Object();
        this.f20068b = executor;
        this.f20070d = dVar;
    }

    public p(Executor executor, e eVar) {
        this.f20067a = 2;
        this.f20069c = new Object();
        this.f20068b = executor;
        this.f20070d = eVar;
    }

    public p(Executor executor, f fVar) {
        this.f20067a = 3;
        this.f20069c = new Object();
        this.f20068b = executor;
        this.f20070d = fVar;
    }

    public p(Executor executor, i iVar, s sVar) {
        this.f20067a = 4;
        this.f20068b = executor;
        this.f20069c = iVar;
        this.f20070d = sVar;
    }
}
