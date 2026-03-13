package W8;

import B3.s;
import Qb.I;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f8183a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8184b;

    /* renamed from: c, reason: collision with root package name */
    public Function2 f8185c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f8186d;

    /* renamed from: e, reason: collision with root package name */
    public long f8187e;

    /* renamed from: f, reason: collision with root package name */
    public int f8188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f8189g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f8190h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(s sVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f8189g = sVar;
        this.f8190h = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f8189g, this.f8190h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00da: INVOKE (r8 I:java.lang.String) STATIC call: E7.a.b(java.lang.String):void A[MD:(java.lang.String):void (m)], block:B:49:0x00d7 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00d7: INVOKE (r9 I:java.lang.Object) VIRTUAL call: java.lang.Object.getClass():java.lang.Class A[MD:():java.lang.Class<?> (c)], block:B:49:0x00d7 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a0 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:7:0x0024, B:9:0x009a, B:11:0x00a0, B:13:0x00a6, B:20:0x00bf, B:21:0x00c4, B:23:0x00c5, B:47:0x0089), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.f8188f
            r2 = 345(0x159, float:4.83E-43)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L44
            if (r1 == r4) goto L38
            if (r1 != r3) goto L2b
            long r6 = r12.f8187e
            java.util.Iterator r1 = r12.f8186d
            kotlin.jvm.functions.Function2 r4 = r12.f8185c
            java.lang.Object r8 = r12.f8184b
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r12.f8183a
            E7.a r9 = (E7.a) r9
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> L28
            goto L9a
        L28:
            r13 = move-exception
            goto Ld7
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r13.<init>(r0)
            throw r13
        L38:
            java.lang.Object r1 = r12.f8184b
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r12.f8183a
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            kotlin.ResultKt.throwOnFailure(r13)
            goto L5d
        L44:
            kotlin.ResultKt.throwOnFailure(r13)
            E7.a r9 = E7.a.f1927a
            boolean r13 = E7.a.a()
            kotlin.coroutines.jvm.internal.SuspendLambda r1 = r12.f8190h
            B3.s r6 = r12.f8189g
            if (r13 != 0) goto L7f
            java.lang.Object r13 = r6.f652d
            java.util.concurrent.CopyOnWriteArraySet r13 = (java.util.concurrent.CopyOnWriteArraySet) r13
            java.util.Iterator r13 = r13.iterator()
            r3 = r1
            r1 = r13
        L5d:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto Ld4
            java.lang.Object r13 = r1.next()
            if (r13 != 0) goto L79
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            r12.f8183a = r3
            r12.f8184b = r1
            r12.f8188f = r4
            java.lang.Object r13 = r3.invoke(r5, r12)
            if (r13 != r0) goto L5d
            goto Lbe
        L79:
            java.lang.ClassCastException r13 = new java.lang.ClassCastException
            r13.<init>()
            throw r13
        L7f:
            r8 = 6930(0x1b12, float:9.711E-42)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            E7.a.c(r8)
            kotlin.time.TimeSource$Monotonic r13 = kotlin.time.TimeSource.Monotonic.INSTANCE     // Catch: java.lang.Throwable -> L28
            long r10 = r13.m1480markNowz9LOYto()     // Catch: java.lang.Throwable -> L28
            java.lang.Object r13 = r6.f652d     // Catch: java.lang.Throwable -> L28
            java.util.concurrent.CopyOnWriteArraySet r13 = (java.util.concurrent.CopyOnWriteArraySet) r13     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L28
            r4 = r1
            r6 = r10
            r1 = r13
        L9a:
            boolean r13 = r1.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r13 == 0) goto Lc5
            java.lang.Object r13 = r1.next()     // Catch: java.lang.Throwable -> L28
            if (r13 != 0) goto Lbf
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)     // Catch: java.lang.Throwable -> L28
            r12.f8183a = r9     // Catch: java.lang.Throwable -> L28
            r12.f8184b = r8     // Catch: java.lang.Throwable -> L28
            r13 = r4
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13     // Catch: java.lang.Throwable -> L28
            r12.f8185c = r13     // Catch: java.lang.Throwable -> L28
            r12.f8186d = r1     // Catch: java.lang.Throwable -> L28
            r12.f8187e = r6     // Catch: java.lang.Throwable -> L28
            r12.f8188f = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r13 = r4.invoke(r5, r12)     // Catch: java.lang.Throwable -> L28
            if (r13 != r0) goto L9a
        Lbe:
            return r0
        Lbf:
            java.lang.ClassCastException r13 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L28
            r13.<init>()     // Catch: java.lang.Throwable -> L28
            throw r13     // Catch: java.lang.Throwable -> L28
        Lc5:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L28
            long r0 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(r6)     // Catch: java.lang.Throwable -> L28
            kotlin.time.Duration.m1366boximpl(r0)     // Catch: java.lang.Throwable -> L28
            r9.getClass()
            E7.a.b(r8)
        Ld4:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        Ld7:
            r9.getClass()
            E7.a.b(r8)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: W8.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
