package H5;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.stub.StubApp;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: H5.q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0084q {

    /* renamed from: a, reason: collision with root package name */
    public final R4.h f2911a;

    /* renamed from: b, reason: collision with root package name */
    public final L5.j f2912b;

    public C0084q(R4.h firebaseApp, L5.j settings, CoroutineContext backgroundDispatcher, c0 lifecycleServiceBinder) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(lifecycleServiceBinder, "lifecycleServiceBinder");
        this.f2911a = firebaseApp;
        this.f2912b = settings;
        String string2 = StubApp.getString2(2668);
        Log.d(string2, StubApp.getString2(2676));
        firebaseApp.a();
        Context origApplicationContext = StubApp.getOrigApplicationContext(firebaseApp.f6193a.getApplicationContext());
        if (origApplicationContext instanceof Application) {
            ((Application) origApplicationContext).registerActivityLifecycleCallbacks(d0.f2855a);
            Qb.L.j(Qb.J.a(backgroundDispatcher), null, new C0083p(this, backgroundDispatcher, lifecycleServiceBinder, null), 3);
        } else {
            Log.e(string2, StubApp.getString2(2677) + origApplicationContext.getClass() + '.');
        }
    }
}
