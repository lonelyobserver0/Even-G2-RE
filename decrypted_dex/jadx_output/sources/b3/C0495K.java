package b3;

import Qb.S;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import no.nordicsemi.android.dfu.DfuServiceInitiator;

/* renamed from: b3.K, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0495K extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f10527b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0510l f10528c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0498N f10529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0495K(AtomicBoolean atomicBoolean, C0510l c0510l, C0498N c0498n, Continuation continuation) {
        super(2, continuation);
        this.f10527b = atomicBoolean;
        this.f10528c = c0510l;
        this.f10529d = c0498n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0495K(this.f10527b, this.f10528c, this.f10529d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0495K) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C0510l c0510l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f10526a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f10526a = 1;
            if (S.a(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!this.f10527b.get() && (c0510l = this.f10528c) != null) {
            this.f10529d.getClass();
            R2.c.f(StubApp.getString2(103), StubApp.getString2(8955));
            Result.Companion companion = Result.INSTANCE;
            c0510l.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(8956))))));
        }
        return Unit.INSTANCE;
    }
}
