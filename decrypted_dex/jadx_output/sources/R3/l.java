package R3;

import android.os.Looper;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6140a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f6141b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f6142c;

    public l(Looper looper, Object obj, String str) {
        this.f6140a = new B3.q(looper);
        S3.D.i(obj, StubApp.getString2(5644));
        this.f6141b = obj;
        S3.D.e(str);
        this.f6142c = new C0241j(obj, str);
    }

    public void a() {
        this.f6141b = null;
        this.f6142c = null;
    }

    public void b(InterfaceC0242k interfaceC0242k) {
        ((Executor) this.f6140a).execute(new Q4.b(12, this, interfaceC0242k));
    }

    public l(Object obj, String str, Executor executor) {
        S3.D.i(executor, StubApp.getString2(5645));
        this.f6140a = executor;
        S3.D.i(obj, StubApp.getString2(5644));
        this.f6141b = obj;
        S3.D.e(str);
        this.f6142c = new C0241j(obj, str);
    }

    public l(W4.o oVar) {
        b5.b bVar = new b5.b();
        C2.i iVar = new C2.i();
        this.f6142c = bVar;
        this.f6140a = new ArrayList();
        this.f6141b = iVar;
        oVar.a(new Y4.a(this));
    }

    public l(Y.h hVar) {
        this.f6140a = hVar;
    }
}
