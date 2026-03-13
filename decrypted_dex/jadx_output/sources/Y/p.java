package Y;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import com.stub.StubApp;
import f5.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8682a;

    /* renamed from: b, reason: collision with root package name */
    public final K.d f8683b;

    /* renamed from: c, reason: collision with root package name */
    public final C2.i f8684c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8685d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f8686e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f8687f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f8688g;

    /* renamed from: h, reason: collision with root package name */
    public u0 f8689h;

    public p(Context context, K.d dVar) {
        C2.i iVar = q.f8690d;
        this.f8685d = new Object();
        M.d.e(context, StubApp.getString2(7486));
        this.f8682a = StubApp.getOrigApplicationContext(context.getApplicationContext());
        this.f8683b = dVar;
        this.f8684c = iVar;
    }

    @Override // Y.g
    public final void a(u0 u0Var) {
        synchronized (this.f8685d) {
            this.f8689h = u0Var;
        }
        synchronized (this.f8685d) {
            try {
                if (this.f8689h == null) {
                    return;
                }
                if (this.f8687f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a(StubApp.getString2("7487"), 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f8688g = threadPoolExecutor;
                    this.f8687f = threadPoolExecutor;
                }
                this.f8687f.execute(new B0.o(this, 13));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f8685d) {
            try {
                this.f8689h = null;
                Handler handler = this.f8686e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f8686e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f8688g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f8687f = null;
                this.f8688g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final K.j c() {
        try {
            C2.i iVar = this.f8684c;
            Context context = this.f8682a;
            K.d dVar = this.f8683b;
            iVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            K.i a3 = K.c.a(context, Collections.unmodifiableList(arrayList));
            int i3 = a3.f3562a;
            if (i3 != 0) {
                throw new RuntimeException(Xa.h.g(i3, StubApp.getString2(7489), StubApp.getString2(74)));
            }
            K.j[] jVarArr = (K.j[]) a3.f3563b.get(0);
            if (jVarArr == null || jVarArr.length == 0) {
                throw new RuntimeException(StubApp.getString2(7488));
            }
            return jVarArr[0];
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException(StubApp.getString2(7490), e10);
        }
    }
}
