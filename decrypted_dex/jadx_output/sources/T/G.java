package T;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class G extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f6759a;

    /* renamed from: b, reason: collision with root package name */
    public int f6760b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f6761c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f6762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6763e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Q q10, int i3, Continuation continuation) {
        super(2, continuation);
        this.f6762d = q10;
        this.f6763e = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        G g10 = new G(this.f6762d, this.f6763e, continuation);
        g10.f6761c = ((Boolean) obj).booleanValue();
        return g10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((G) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        if (r7 == r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f6760b
            T.Q r2 = r6.f6762d
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L29
            if (r1 == r4) goto L23
            if (r1 != r3) goto L16
            java.lang.Object r0 = r6.f6759a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4c
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r7.<init>(r0)
            throw r7
        L23:
            boolean r1 = r6.f6761c
            kotlin.ResultKt.throwOnFailure(r7)
            goto L39
        L29:
            kotlin.ResultKt.throwOnFailure(r7)
            boolean r1 = r6.f6761c
            r6.f6761c = r1
            r6.f6760b = r4
            java.lang.Object r7 = r2.i(r6)
            if (r7 != r0) goto L39
            goto L49
        L39:
            if (r1 == 0) goto L53
            T.d0 r1 = r2.g()
            r6.f6759a = r7
            r6.f6760b = r3
            java.lang.Integer r1 = r1.a()
            if (r1 != r0) goto L4a
        L49:
            return r0
        L4a:
            r0 = r7
            r7 = r1
        L4c:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L58
        L53:
            int r0 = r6.f6763e
            r5 = r0
            r0 = r7
            r7 = r5
        L58:
            T.d r1 = new T.d
            if (r0 == 0) goto L61
            int r2 = r0.hashCode()
            goto L62
        L61:
            r2 = 0
        L62:
            r1.<init>(r2, r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T.G.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
