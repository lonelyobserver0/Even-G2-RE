package kb;

import D5.z;
import Xa.A;
import Xa.v;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import bb.RunnableC0536b;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f15523a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public MethodChannel f15524b;

    /* renamed from: c, reason: collision with root package name */
    public Ya.c f15525c;

    public final void a(Intent intent, CountDownLatch countDownLatch) {
        Ya.c cVar = this.f15525c;
        String string2 = StubApp.getString2(7449);
        if (cVar == null) {
            Log.i(string2, StubApp.getString2(18369));
            return;
        }
        C1123b c1123b = countDownLatch != null ? new C1123b(countDownLatch) : null;
        byte[] byteArrayExtra = intent.getByteArrayExtra(StubApp.getString2(490));
        if (byteArrayExtra == null) {
            Log.e(string2, StubApp.getString2(19158));
            return;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            HashMap H2 = AbstractC1526a.H(z.CREATOR.createFromParcel(obtain));
            MethodChannel methodChannel = this.f15524b;
            String string22 = StubApp.getString2("19155");
            A a3 = new A();
            a3.put(StubApp.getString2("19157"), Long.valueOf(hc.b.f14499b.getSharedPreferences(StubApp.getString2("18365"), 0).getLong(StubApp.getString2("19156"), 0L)));
            a3.put(StubApp.getString2("1905"), H2);
            methodChannel.invokeMethod(string22, a3, c1123b);
        } finally {
            obtain.recycle();
        }
    }

    public final void b(final long j, final A0.c cVar) {
        if (this.f15525c != null) {
            Log.e(StubApp.getString2(7449), StubApp.getString2(19159));
            return;
        }
        final bb.d dVar = (bb.d) Q2.g.H().f5711b;
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() { // from class: kb.a
            @Override // java.lang.Runnable
            public final void run() {
                c cVar2 = c.this;
                cVar2.getClass();
                Context context = hc.b.f14499b;
                bb.d dVar2 = dVar;
                dVar2.c(context);
                Context context2 = hc.b.f14499b;
                v vVar = new v(cVar2, dVar2, cVar, j);
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new IllegalStateException(StubApp.getString2(9374));
                }
                if (((I4.e) dVar2.f10744c) == null) {
                    throw new IllegalStateException(StubApp.getString2(9373));
                }
                boolean z2 = dVar2.f10743b;
                Handler handler2 = handler;
                if (z2) {
                    handler2.post(vVar);
                } else {
                    ((ExecutorService) dVar2.f10747f).execute(new RunnableC0536b(dVar2, context2, handler2, vVar, 0));
                }
            }
        });
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (!methodCall.method.equals(StubApp.getString2(19160))) {
            result.notImplemented();
            return;
        }
        this.f15523a.set(true);
        List list = FlutterFirebaseMessagingBackgroundService.f15085h;
        Log.i(StubApp.getString2(18366), StubApp.getString2(19161));
        List list2 = FlutterFirebaseMessagingBackgroundService.f15085h;
        synchronized (list2) {
            try {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    FlutterFirebaseMessagingBackgroundService.j.a((Intent) it.next(), null);
                }
                FlutterFirebaseMessagingBackgroundService.f15085h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        result.success(Boolean.TRUE);
    }
}
