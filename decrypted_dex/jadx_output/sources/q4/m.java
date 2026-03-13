package q4;

import com.stub.StubApp;
import java.util.concurrent.ExecutionException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class m implements f, e, InterfaceC1522c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20054a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final int f20055b;

    /* renamed from: c, reason: collision with root package name */
    public final s f20056c;

    /* renamed from: d, reason: collision with root package name */
    public int f20057d;

    /* renamed from: e, reason: collision with root package name */
    public int f20058e;

    /* renamed from: f, reason: collision with root package name */
    public int f20059f;

    /* renamed from: g, reason: collision with root package name */
    public Exception f20060g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20061h;

    public m(int i3, s sVar) {
        this.f20055b = i3;
        this.f20056c = sVar;
    }

    @Override // q4.e
    public final void C(Exception exc) {
        synchronized (this.f20054a) {
            this.f20058e++;
            this.f20060g = exc;
            a();
        }
    }

    public final void a() {
        int i3 = this.f20057d + this.f20058e + this.f20059f;
        int i10 = this.f20055b;
        if (i3 == i10) {
            Exception exc = this.f20060g;
            s sVar = this.f20056c;
            if (exc == null) {
                if (this.f20061h) {
                    sVar.c();
                    return;
                } else {
                    sVar.b(null);
                    return;
                }
            }
            sVar.a(new ExecutionException(this.f20058e + StubApp.getString2(14433) + i10 + StubApp.getString2(22224), this.f20060g));
        }
    }

    @Override // q4.InterfaceC1522c
    public final void c() {
        synchronized (this.f20054a) {
            this.f20059f++;
            this.f20061h = true;
            a();
        }
    }

    @Override // q4.f
    public final void i(Object obj) {
        synchronized (this.f20054a) {
            this.f20057d++;
            a();
        }
    }
}
