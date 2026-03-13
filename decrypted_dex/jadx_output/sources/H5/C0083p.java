package H5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: H5.p, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0083p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0084q f2908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f2909c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f2910d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083p(C0084q c0084q, CoroutineContext coroutineContext, c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.f2908b = c0084q;
        this.f2909c = coroutineContext;
        this.f2910d = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0083p(this.f2908b, this.f2909c, this.f2910d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0083p) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x006a, code lost:
    
        if (r10.b(r9) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0037, code lost:
    
        if (r10 == r1) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.C0083p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
