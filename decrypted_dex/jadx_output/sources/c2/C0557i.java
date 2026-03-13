package c2;

import Sb.t;
import Sb.v;
import android.app.Activity;
import com.stub.StubApp;
import d2.InterfaceC0798a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: c2.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0557i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10800a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10801b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0550b f10802c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f10803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0557i(C0550b c0550b, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.f10802c = c0550b;
        this.f10803d = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0557i c0557i = new C0557i(this.f10802c, this.f10803d, continuation);
        c0557i.f10801b = obj;
        return c0557i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0557i) create((v) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f10800a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            v vVar = (v) this.f10801b;
            Xa.o oVar = new Xa.o(vVar, 1);
            C0550b c0550b = this.f10802c;
            ((InterfaceC0798a) c0550b.f10786b).a(this.f10803d, new G1.c(0), oVar);
            A9.m mVar = new A9.m(7, c0550b, oVar);
            this.f10800a = 1;
            if (t.a(vVar, mVar, this) == coroutine_suspended) {
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
