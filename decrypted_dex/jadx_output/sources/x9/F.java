package x9;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.Style;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n9.AbstractC1395a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class F extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f22920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Style f22921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Expected f22922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(I i3, Style style, Expected expected, Continuation continuation) {
        super(1, continuation);
        this.f22920a = i3;
        this.f22921b = style;
        this.f22922c = expected;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new F(this.f22920a, this.f22921b, this.f22922c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((F) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        I i3 = this.f22920a;
        u uVar = i3.f22948c;
        Style style = this.f22921b;
        String a3 = AbstractC1395a.a(style);
        w9.n nVar = i3.f22947b;
        nVar.getClass();
        Expected value = this.f22922c;
        Intrinsics.checkNotNullParameter(value, "value");
        w9.h.f22164a.c(new w9.j(nVar, a3, value, null));
        I.c(i3, style, uVar.f23082a);
        value.onValue(new kb.e(i3, style));
        return Unit.INSTANCE;
    }
}
