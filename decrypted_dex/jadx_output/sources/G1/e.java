package G1;

import Qb.C0203k;
import Qb.J;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f2372a;

    public e(MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f2372a = mMeasurementManager;
    }

    public static Object b(e eVar, a aVar, Continuation<? super Unit> continuation) {
        new C0203k(1, IntrinsicsKt.intercepted(continuation)).s();
        MeasurementManager measurementManager = eVar.f2372a;
        throw null;
    }

    public static Object d(e eVar, Continuation<? super Integer> continuation) {
        C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuation));
        c0203k.s();
        eVar.f2372a.getMeasurementApiStatus(new c(0), new J.c(c0203k));
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return r8;
    }

    public static /* synthetic */ Object g(e eVar, f fVar, Continuation<? super Unit> continuation) {
        Object c10 = J.c(new d(eVar, null), continuation);
        return c10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c10 : Unit.INSTANCE;
    }

    public static Object h(e eVar, Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) {
        C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuation));
        c0203k.s();
        eVar.f2372a.registerSource(uri, inputEvent, new c(0), new J.c(c0203k));
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? r8 : Unit.INSTANCE;
    }

    public static Object j(e eVar, Uri uri, Continuation<? super Unit> continuation) {
        C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuation));
        c0203k.s();
        eVar.f2372a.registerTrigger(uri, new c(0), new J.c(c0203k));
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? r8 : Unit.INSTANCE;
    }

    public static Object l(e eVar, g gVar, Continuation<? super Unit> continuation) {
        new C0203k(1, IntrinsicsKt.intercepted(continuation)).s();
        MeasurementManager measurementManager = eVar.f2372a;
        throw null;
    }

    public static Object n(e eVar, h hVar, Continuation<? super Unit> continuation) {
        new C0203k(1, IntrinsicsKt.intercepted(continuation)).s();
        MeasurementManager measurementManager = eVar.f2372a;
        throw null;
    }

    public Object a(a aVar, Continuation<? super Unit> continuation) {
        return b(this, aVar, continuation);
    }

    public Object c(Continuation<? super Integer> continuation) {
        return d(this, continuation);
    }

    public Object e(f fVar, Continuation<? super Unit> continuation) {
        return g(this, fVar, continuation);
    }

    public Object f(Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) {
        return h(this, uri, inputEvent, continuation);
    }

    public Object i(Uri uri, Continuation<? super Unit> continuation) {
        return j(this, uri, continuation);
    }

    public Object k(g gVar, Continuation<? super Unit> continuation) {
        return l(this, gVar, continuation);
    }

    public Object m(h hVar, Continuation<? super Unit> continuation) {
        return n(this, hVar, continuation);
    }
}
