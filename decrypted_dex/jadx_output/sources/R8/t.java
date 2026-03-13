package R8;

import android.util.Log;
import com.stub.StubApp;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u8.h f6326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f6327c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pair f6328d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u8.h hVar, y yVar, Pair pair, Continuation continuation) {
        super(2, continuation);
        this.f6326b = hVar;
        this.f6327c = yVar;
        this.f6328d = pair;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new t(this.f6326b, this.f6327c, this.f6328d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f6325a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Pair pair = this.f6328d;
            u8.h hVar = this.f6326b;
            if (hVar == null) {
                Log.w(StubApp.getString2(277), StubApp.getString2(5795) + ((com.mapbox.navigation.base.route.g) pair.getFirst()).f12506i + StubApp.getString2(5796));
                return new C((com.mapbox.navigation.base.route.g) pair.getFirst(), hVar, E.f6265b);
            }
            com.mapbox.navigation.base.route.g gVar = (com.mapbox.navigation.base.route.g) pair.getFirst();
            this.f6325a = 1;
            obj = y.a(this.f6327c, gVar, hVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        return (C) obj;
    }
}
