package N2;

import Qb.I;
import android.service.notification.StatusBarNotification;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StatusBarNotification f4846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f4847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f4848c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StatusBarNotification statusBarNotification, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, long j, Continuation continuation) {
        super(2, continuation);
        this.f4846a = statusBarNotification;
        this.f4847b = objectRef;
        this.f4848c = objectRef2;
        this.f4849d = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f4846a, this.f4847b, this.f4848c, this.f4849d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int id = this.f4846a.getId();
        Object obj2 = this.f4847b.element;
        Object obj3 = this.f4848c.element;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(3671));
        sb2.append(id);
        String string2 = StubApp.getString2(321);
        sb2.append(string2);
        sb2.append(obj2);
        sb2.append(string2);
        sb2.append(obj3);
        sb2.append(string2);
        sb2.append(this.f4849d);
        R2.c.b(StubApp.getString2(3505), sb2.toString());
        return Unit.INSTANCE;
    }
}
