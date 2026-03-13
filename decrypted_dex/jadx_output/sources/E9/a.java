package E9;

import D5.B;
import Qb.I;
import b3.C0509k;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public C0509k f2047a;

    /* renamed from: b, reason: collision with root package name */
    public int f2048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0509k f2049c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f2050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ VoiceInstructions f2051e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C0509k c0509k, B b2, VoiceInstructions voiceInstructions, Continuation continuation) {
        super(2, continuation);
        this.f2049c = c0509k;
        this.f2050d = b2;
        this.f2051e = voiceInstructions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f2049c, this.f2050d, this.f2051e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C0509k c0509k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f2048b;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            C0509k c0509k2 = this.f2049c;
            this.f2047a = c0509k2;
            this.f2048b = 1;
            Object s10 = B.s(this.f2050d, this.f2051e, this);
            if (s10 == coroutine_suspended) {
                return coroutine_suspended;
            }
            c0509k = c0509k2;
            obj = s10;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            c0509k = this.f2047a;
            ResultKt.throwOnFailure(obj);
        }
        c0509k.accept(obj);
        return Unit.INSTANCE;
    }
}
