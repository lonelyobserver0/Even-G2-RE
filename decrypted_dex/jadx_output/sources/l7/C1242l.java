package l7;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.stub.StubApp;
import i5.C1059c;
import java.util.LinkedHashSet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l7.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1242l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16766a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1059c f16768c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242l(C1059c c1059c, Continuation continuation) {
        super(2, continuation);
        this.f16768c = c1059c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1242l c1242l = new C1242l(this.f16768c, continuation);
        c1242l.f16767b = obj;
        return c1242l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1242l) create((Sb.v) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f16766a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Sb.v vVar = (Sb.v) this.f16767b;
            C1241k compassListener = new C1241k(vVar);
            C1059c c1059c = this.f16768c;
            o oVar = (o) c1059c.f14842a;
            oVar.getClass();
            Intrinsics.checkNotNullParameter(compassListener, "compassListener");
            LinkedHashSet linkedHashSet = oVar.f16775c;
            if (linkedHashSet.isEmpty()) {
                Sensor sensor = oVar.f16777e;
                boolean z2 = sensor != null;
                SensorManager sensorManager = oVar.f16774b;
                if (z2) {
                    sensorManager.registerListener(oVar, sensor, 100000);
                } else {
                    sensorManager.registerListener(oVar, oVar.f16778f, 100000);
                    sensorManager.registerListener(oVar, oVar.f16779g, 100000);
                }
            }
            linkedHashSet.add(compassListener);
            A9.m mVar = new A9.m(9, c1059c, compassListener);
            this.f16766a = 1;
            if (Sb.t.a(vVar, mVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
