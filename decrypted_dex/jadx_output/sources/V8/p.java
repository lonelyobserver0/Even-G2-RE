package V8;

import Qb.C0203k;
import Qb.I;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import com.mapbox.common.LoggingLevel;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public C0349a f7860a;

    /* renamed from: b, reason: collision with root package name */
    public VoiceInstructions f7861b;

    /* renamed from: c, reason: collision with root package name */
    public Ref.BooleanRef f7862c;

    /* renamed from: d, reason: collision with root package name */
    public int f7863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f7864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f7865f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7866g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kb.e f7867h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Ref.BooleanRef booleanRef, int i3, kb.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f7864e = qVar;
        this.f7865f = booleanRef;
        this.f7866g = i3;
        this.f7867h = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f7864e, this.f7865f, this.f7866g, this.f7867h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        VoiceInstructions voiceInstructions;
        C0349a c0349a;
        Ref.BooleanRef booleanRef;
        String string2 = StubApp.getString2(6686);
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f7863d;
        kb.e eVar = this.f7867h;
        q qVar = this.f7864e;
        Ref.BooleanRef booleanRef2 = this.f7865f;
        String string22 = StubApp.getString2(6675);
        int i10 = this.f7866g;
        E0 e02 = qVar.f7884p;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                o oVar = new o(StubApp.getString2("6687"), i10, qVar, "");
                if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
                    D9.l.d((String) oVar.invoke(), string22);
                }
                C0349a c0349a2 = (C0349a) e02.f16037b;
                voiceInstructions = qVar.f7885q;
                Z8.f fVar = qVar.f7872c;
                this.f7860a = c0349a2;
                this.f7861b = voiceInstructions;
                this.f7862c = booleanRef2;
                this.f7863d = 1;
                C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(this));
                c0203k.s();
                fVar.a().changeLeg(i10, new Z9.q(c0203k, 29));
                Object r8 = c0203k.r();
                if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (r8 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c0349a = c0349a2;
                obj = r8;
                booleanRef = booleanRef2;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException(StubApp.getString2(275));
                }
                booleanRef = this.f7862c;
                voiceInstructions = this.f7861b;
                c0349a = this.f7860a;
                ResultKt.throwOnFailure(obj);
            }
            booleanRef.element = ((Boolean) obj).booleanValue();
            if (booleanRef2.element) {
                if (Intrinsics.areEqual(c0349a, (C0349a) e02.f16037b)) {
                    e02.f16037b = null;
                }
                if (Intrinsics.areEqual(qVar.f7885q, voiceInstructions)) {
                    qVar.f7885q = null;
                }
            }
            o oVar2 = new o(StubApp.getString2("6688"), i10, qVar, string2 + booleanRef2.element + StubApp.getString2("6689") + c0349a + StubApp.getString2("6690") + voiceInstructions + StubApp.getString2("6691"));
            if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
                D9.l.d((String) oVar2.invoke(), string22);
            }
            eVar.b(booleanRef2.element);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            eVar.b(booleanRef2.element);
            throw th;
        }
    }
}
