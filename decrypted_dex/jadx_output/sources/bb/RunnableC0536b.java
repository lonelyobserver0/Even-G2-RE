package bb;

import Xa.v;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.stub.StubApp;

/* renamed from: bb.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class RunnableC0536b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f10736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f10737c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Handler f10738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f10739e;

    public /* synthetic */ RunnableC0536b(d dVar, Context context, Handler handler, v vVar, int i3) {
        this.f10735a = i3;
        this.f10736b = dVar;
        this.f10737c = context;
        this.f10738d = handler;
        this.f10739e = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10735a) {
            case 0:
                d dVar = this.f10736b;
                try {
                    Handler.createAsync(Looper.getMainLooper()).post(new RunnableC0536b(dVar, this.f10737c, this.f10738d, this.f10739e, 1));
                    return;
                } catch (Exception e10) {
                    Log.e(StubApp.getString2(9340), StubApp.getString2(9341), e10);
                    throw new RuntimeException(e10);
                }
            default:
                this.f10736b.a(StubApp.getOrigApplicationContext(this.f10737c.getApplicationContext()), null);
                this.f10738d.post(this.f10739e);
                return;
        }
    }
}
