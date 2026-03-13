package Ac;

import C.E;
import com.stub.StubApp;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;
import wc.InterfaceC1888e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1888e f329a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f331c;

    public g(j this$0, InterfaceC1888e responseCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        this.f331c = this$0;
        this.f329a = responseCallback;
        this.f330b = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        Throwable th;
        IOException e10;
        E e11;
        String stringPlus = Intrinsics.stringPlus("OkHttp ", this.f331c.f335b.f22493a.g());
        j jVar = this.f331c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(stringPlus);
        try {
            jVar.f339f.i();
            try {
                try {
                    z2 = true;
                    try {
                        this.f329a.onResponse(jVar, jVar.h());
                        e11 = jVar.f334a.f22463a;
                    } catch (IOException e12) {
                        e10 = e12;
                        if (z2) {
                            Ec.n nVar = Ec.n.f2161a;
                            Ec.n nVar2 = Ec.n.f2161a;
                            String stringPlus2 = Intrinsics.stringPlus(StubApp.getString2("24946"), j.a(jVar));
                            nVar2.getClass();
                            Ec.n.i(stringPlus2, 4, e10);
                        } else {
                            this.f329a.onFailure(jVar, e10);
                        }
                        e11 = jVar.f334a.f22463a;
                        e11.g(this);
                    } catch (Throwable th2) {
                        th = th2;
                        jVar.d();
                        if (!z2) {
                            IOException iOException = new IOException(Intrinsics.stringPlus("canceled due to ", th));
                            ExceptionsKt.addSuppressed(iOException, th);
                            this.f329a.onFailure(jVar, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    jVar.f334a.f22463a.g(this);
                    throw th3;
                }
            } catch (IOException e13) {
                z2 = false;
                e10 = e13;
            } catch (Throwable th4) {
                z2 = false;
                th = th4;
            }
            e11.g(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
