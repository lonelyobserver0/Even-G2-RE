package D5;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.stub.StubApp;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: D5.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0048l implements w5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1436a;

    public /* synthetic */ C0048l(int i3) {
        this.f1436a = i3;
    }

    @Override // w5.b
    public final Object get() {
        switch (this.f1436a) {
            case 0:
                F5.c cVar = FirebaseMessaging.f12055l;
                return null;
            case 1:
                return Collections.EMPTY_SET;
            case 2:
                return null;
            case 3:
                W4.m mVar = ExecutorsRegistrar.f12044a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                detectNetwork.detectUnbufferedIo();
                return new X4.f(Executors.newFixedThreadPool(4, new X4.a(StubApp.getString2(1462), 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f12047d.get());
            case 4:
                W4.m mVar2 = ExecutorsRegistrar.f12044a;
                return new X4.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new X4.a(StubApp.getString2(1461), 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f12047d.get());
            case 5:
                W4.m mVar3 = ExecutorsRegistrar.f12044a;
                return new X4.f(Executors.newCachedThreadPool(new X4.a(StubApp.getString2(1460), 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f12047d.get());
            default:
                W4.m mVar4 = ExecutorsRegistrar.f12044a;
                return Executors.newSingleThreadScheduledExecutor(new X4.a(StubApp.getString2(1459), 0, null));
        }
    }
}
