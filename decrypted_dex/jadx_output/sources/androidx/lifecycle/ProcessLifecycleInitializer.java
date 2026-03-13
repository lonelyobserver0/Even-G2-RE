package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "LR1/b;", "Landroidx/lifecycle/t;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ProcessLifecycleInitializer implements R1.b {
    @Override // R1.b
    public final Object create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        R1.a c10 = R1.a.c(context);
        Intrinsics.checkNotNullExpressionValue(c10, "getInstance(...)");
        if (!c10.f6070b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        AtomicBoolean atomicBoolean = AbstractC0442q.f9920a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!AbstractC0442q.f9920a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0441p());
        }
        E e10 = E.j;
        Intrinsics.checkNotNullParameter(context, "context");
        E e11 = E.j;
        e11.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        e11.f9870e = new Handler();
        e11.f9871f.e(EnumC0438m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new D(e11));
        return e11;
    }

    @Override // R1.b
    public final List dependencies() {
        return CollectionsKt.emptyList();
    }
}
