package P3;

import D5.C0047k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.stub.StubApp;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l4.C1172e;
import l4.C1189j1;
import l4.C1200n0;
import l4.C1215v;
import l4.H1;
import l4.InterfaceC1151G;
import l4.M1;
import l4.T;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Parcelable f5510c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5512e;

    public /* synthetic */ i(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z2, BroadcastReceiver.PendingResult pendingResult) {
        this.f5508a = 0;
        this.f5510c = intent;
        this.f5511d = context;
        this.f5509b = z2;
        this.f5512e = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        int i3;
        switch (this.f5508a) {
            case 0:
                Intent intent = (Intent) this.f5510c;
                Context context = (Context) this.f5511d;
                boolean z2 = this.f5509b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f5512e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra(StubApp.getString2("4872"));
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        i3 = FirebaseInstanceIdReceiver.a(intent2);
                    } else {
                        int i10 = 500;
                        if (intent.getExtras() != null) {
                            a aVar = new a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f12053b;
                                    executor = softReference != null ? (Executor) softReference.get() : null;
                                    if (executor == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new X3.a(StubApp.getString2("4873")));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f12053b = new SoftReference(executor);
                                    }
                                } finally {
                                }
                            }
                            executor.execute(new K.m(context, aVar, countDownLatch, 1));
                            try {
                                i10 = ((Integer) a4.f.b(new C0047k(context).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e10) {
                                Log.e(StubApp.getString2("493"), StubApp.getString2("4874"), e10);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w(StubApp.getString2("4875"), StubApp.getString2("4876"));
                                }
                            } catch (InterruptedException e11) {
                                Log.w(StubApp.getString2("4875"), StubApp.getString2("4877").concat(e11.toString()));
                            }
                        }
                        i3 = i10;
                    }
                    if (z2 && pendingResult != null) {
                        pendingResult.setResultCode(i3);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th;
                }
            case 1:
                C1189j1 c1189j1 = (C1189j1) this.f5512e;
                InterfaceC1151G interfaceC1151G = c1189j1.f16480d;
                if (interfaceC1151G == null) {
                    T t3 = ((C1200n0) c1189j1.f4728a).f16541f;
                    C1200n0.l(t3);
                    t3.f16242f.b(StubApp.getString2(4871));
                    return;
                } else {
                    c1189j1.C(interfaceC1151G, this.f5509b ? null : (H1) this.f5511d, (M1) this.f5510c);
                    c1189j1.x();
                    return;
                }
            case 2:
                C1189j1 c1189j12 = (C1189j1) this.f5512e;
                InterfaceC1151G interfaceC1151G2 = c1189j12.f16480d;
                if (interfaceC1151G2 == null) {
                    T t10 = ((C1200n0) c1189j12.f4728a).f16541f;
                    C1200n0.l(t10);
                    t10.f16242f.b(StubApp.getString2(4870));
                    return;
                } else {
                    c1189j12.C(interfaceC1151G2, this.f5509b ? null : (C1215v) this.f5511d, (M1) this.f5510c);
                    c1189j12.x();
                    return;
                }
            default:
                C1189j1 c1189j13 = (C1189j1) this.f5512e;
                InterfaceC1151G interfaceC1151G3 = c1189j13.f16480d;
                if (interfaceC1151G3 == null) {
                    T t11 = ((C1200n0) c1189j13.f4728a).f16541f;
                    C1200n0.l(t11);
                    t11.f16242f.b(StubApp.getString2(4869));
                    return;
                } else {
                    c1189j13.C(interfaceC1151G3, this.f5509b ? null : (C1172e) this.f5511d, (M1) this.f5510c);
                    c1189j13.x();
                    return;
                }
        }
    }

    public /* synthetic */ i(C1189j1 c1189j1, M1 m12, boolean z2, T3.a aVar, int i3) {
        this.f5508a = i3;
        this.f5510c = m12;
        this.f5509b = z2;
        this.f5511d = aVar;
        this.f5512e = c1189j1;
    }

    public i(C1189j1 c1189j1, M1 m12, boolean z2, C1172e c1172e) {
        this.f5508a = 3;
        this.f5510c = m12;
        this.f5509b = z2;
        this.f5511d = c1172e;
        Objects.requireNonNull(c1189j1);
        this.f5512e = c1189j1;
    }
}
