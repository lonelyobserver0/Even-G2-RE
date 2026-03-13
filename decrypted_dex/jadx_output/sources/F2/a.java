package F2;

import Ab.c;
import Y.g;
import android.content.Context;
import com.stub.StubApp;
import f5.u0;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2212a;

    public a(Context context, int i3) {
        switch (i3) {
            case 1:
                this.f2212a = StubApp.getOrigApplicationContext(context.getApplicationContext());
                break;
            default:
                this.f2212a = context;
                break;
        }
    }

    @Override // Y.g
    public void a(u0 u0Var) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new Y.a(StubApp.getString2(2009), 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new c(this, u0Var, threadPoolExecutor, 4));
    }
}
