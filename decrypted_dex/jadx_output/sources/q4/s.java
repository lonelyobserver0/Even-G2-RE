package q4;

import S3.D;
import android.app.Activity;
import com.google.android.gms.internal.measurement.K1;
import com.stub.StubApp;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class s extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20072a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final K1 f20073b = new K1(3);

    /* renamed from: c, reason: collision with root package name */
    public boolean f20074c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f20075d;

    /* renamed from: e, reason: collision with root package name */
    public Object f20076e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f20077f;

    public final void a(Exception exc) {
        D.i(exc, StubApp.getString2(22223));
        synchronized (this.f20072a) {
            e();
            this.f20074c = true;
            this.f20077f = exc;
        }
        this.f20073b.e(this);
    }

    @Override // q4.j
    public final j addOnCanceledListener(Activity activity, InterfaceC1522c interfaceC1522c) {
        p pVar = new p(l.f20052a, interfaceC1522c);
        this.f20073b.c(pVar);
        r.j(activity).k(pVar);
        f();
        return this;
    }

    @Override // q4.j
    public final j addOnCompleteListener(Activity activity, d dVar) {
        p pVar = new p(l.f20052a, dVar);
        this.f20073b.c(pVar);
        r.j(activity).k(pVar);
        f();
        return this;
    }

    @Override // q4.j
    public final j addOnFailureListener(e eVar) {
        addOnFailureListener(l.f20052a, eVar);
        return this;
    }

    @Override // q4.j
    public final j addOnSuccessListener(f fVar) {
        addOnSuccessListener(l.f20052a, fVar);
        return this;
    }

    public final void b(Object obj) {
        synchronized (this.f20072a) {
            e();
            this.f20074c = true;
            this.f20076e = obj;
        }
        this.f20073b.e(this);
    }

    public final void c() {
        synchronized (this.f20072a) {
            try {
                if (this.f20074c) {
                    return;
                }
                this.f20074c = true;
                this.f20075d = true;
                this.f20073b.e(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q4.j
    public final j continueWith(InterfaceC1521b interfaceC1521b) {
        return continueWith(l.f20052a, interfaceC1521b);
    }

    @Override // q4.j
    public final j continueWithTask(InterfaceC1521b interfaceC1521b) {
        return continueWithTask(l.f20052a, interfaceC1521b);
    }

    public final boolean d(Object obj) {
        synchronized (this.f20072a) {
            try {
                if (this.f20074c) {
                    return false;
                }
                this.f20074c = true;
                this.f20076e = obj;
                this.f20073b.e(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (this.f20074c) {
            int i3 = Nb.b.f4972a;
            if (!isComplete()) {
                throw new IllegalStateException(StubApp.getString2(22231));
            }
            Exception exception = getException();
        }
    }

    public final void f() {
        synchronized (this.f20072a) {
            try {
                if (this.f20074c) {
                    this.f20073b.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q4.j
    public final Exception getException() {
        Exception exc;
        synchronized (this.f20072a) {
            exc = this.f20077f;
        }
        return exc;
    }

    @Override // q4.j
    public final Object getResult() {
        Object obj;
        synchronized (this.f20072a) {
            try {
                D.j(StubApp.getString2("22232"), this.f20074c);
                if (this.f20075d) {
                    throw new CancellationException(StubApp.getString2("22233"));
                }
                Exception exc = this.f20077f;
                if (exc != null) {
                    throw new h(exc);
                }
                obj = this.f20076e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // q4.j
    public final boolean isCanceled() {
        return this.f20075d;
    }

    @Override // q4.j
    public final boolean isComplete() {
        boolean z2;
        synchronized (this.f20072a) {
            z2 = this.f20074c;
        }
        return z2;
    }

    @Override // q4.j
    public final boolean isSuccessful() {
        boolean z2;
        synchronized (this.f20072a) {
            try {
                z2 = false;
                if (this.f20074c && !this.f20075d && this.f20077f == null) {
                    z2 = true;
                }
            } finally {
            }
        }
        return z2;
    }

    @Override // q4.j
    public final j onSuccessTask(i iVar) {
        B3.q qVar = l.f20052a;
        s sVar = new s();
        this.f20073b.c(new p(qVar, iVar, sVar));
        f();
        return sVar;
    }

    @Override // q4.j
    public final j addOnFailureListener(Executor executor, e eVar) {
        this.f20073b.c(new p(executor, eVar));
        f();
        return this;
    }

    @Override // q4.j
    public final j addOnSuccessListener(Executor executor, f fVar) {
        this.f20073b.c(new p(executor, fVar));
        f();
        return this;
    }

    @Override // q4.j
    public final j continueWith(Executor executor, InterfaceC1521b interfaceC1521b) {
        s sVar = new s();
        this.f20073b.c(new o(executor, interfaceC1521b, sVar, 0));
        f();
        return sVar;
    }

    @Override // q4.j
    public final j continueWithTask(Executor executor, InterfaceC1521b interfaceC1521b) {
        s sVar = new s();
        this.f20073b.c(new o(executor, interfaceC1521b, sVar, 1));
        f();
        return sVar;
    }

    @Override // q4.j
    public final j addOnCanceledListener(Executor executor, InterfaceC1522c interfaceC1522c) {
        this.f20073b.c(new p(executor, interfaceC1522c));
        f();
        return this;
    }

    @Override // q4.j
    public final j addOnCompleteListener(d dVar) {
        this.f20073b.c(new p(l.f20052a, dVar));
        f();
        return this;
    }

    @Override // q4.j
    public final j onSuccessTask(Executor executor, i iVar) {
        s sVar = new s();
        this.f20073b.c(new p(executor, iVar, sVar));
        f();
        return sVar;
    }

    @Override // q4.j
    public final j addOnCompleteListener(Executor executor, d dVar) {
        this.f20073b.c(new p(executor, dVar));
        f();
        return this;
    }

    @Override // q4.j
    public final Object getResult(Class cls) {
        Object obj;
        synchronized (this.f20072a) {
            try {
                D.j(StubApp.getString2("22232"), this.f20074c);
                if (!this.f20075d) {
                    if (!IOException.class.isInstance(this.f20077f)) {
                        Exception exc = this.f20077f;
                        if (exc == null) {
                            obj = this.f20076e;
                        } else {
                            throw new h(exc);
                        }
                    } else {
                        throw ((Throwable) IOException.class.cast(this.f20077f));
                    }
                } else {
                    throw new CancellationException(StubApp.getString2("22233"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
