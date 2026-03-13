package D9;

import Qb.I;
import Sb.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public m8.l f1520a;

    /* renamed from: b, reason: collision with root package name */
    public int f1521b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1522c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f1523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m8.l f1524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f1525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f1526g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Ref.BooleanRef booleanRef, m8.l lVar, w wVar, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f1523d = booleanRef;
        this.f1524e = lVar;
        this.f1525f = wVar;
        this.f1526g = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        j jVar = new j(this.f1523d, this.f1524e, this.f1525f, this.f1526g, continuation);
        jVar.f1522c = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0079 -> B:8:0x003c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f1521b
            kotlin.jvm.internal.Ref$BooleanRef r2 = r9.f1523d
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L34
            if (r1 == r3) goto L27
            if (r1 != r4) goto L1a
            java.lang.Object r1 = r9.f1522c
            Qb.I r1 = (Qb.I) r1
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L18
            goto L3c
        L18:
            r10 = move-exception
            goto L7b
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r10.<init>(r0)
            throw r10
        L27:
            m8.l r1 = r9.f1520a
            java.lang.Object r5 = r9.f1522c
            Qb.I r5 = (Qb.I) r5
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L31
            goto L6b
        L31:
            r10 = move-exception
            r1 = r5
            goto L7b
        L34:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.f1522c
            Qb.I r10 = (Qb.I) r10
            r1 = r10
        L3c:
            kotlin.coroutines.CoroutineContext r10 = r1.h()
            Qb.s0 r5 = Qb.C0219s0.f5892a
            kotlin.coroutines.CoroutineContext$Element r10 = r10.get(r5)
            Qb.t0 r10 = (Qb.InterfaceC0221t0) r10
            if (r10 == 0) goto L4f
            boolean r10 = r10.a()
            goto L50
        L4f:
            r10 = r3
        L50:
            if (r10 == 0) goto L87
            boolean r10 = r2.element
            if (r10 == 0) goto L87
            m8.l r10 = r9.f1524e     // Catch: java.lang.Exception -> L18
            Sb.w r5 = r9.f1525f     // Catch: java.lang.Exception -> L18
            r9.f1522c = r1     // Catch: java.lang.Exception -> L18
            r9.f1520a = r10     // Catch: java.lang.Exception -> L18
            r9.f1521b = r3     // Catch: java.lang.Exception -> L18
            java.lang.Object r5 = r5.f(r9)     // Catch: java.lang.Exception -> L18
            if (r5 != r0) goto L67
            goto L78
        L67:
            r8 = r1
            r1 = r10
            r10 = r5
            r5 = r8
        L6b:
            r9.f1522c = r5     // Catch: java.lang.Exception -> L31
            r6 = 0
            r9.f1520a = r6     // Catch: java.lang.Exception -> L31
            r9.f1521b = r4     // Catch: java.lang.Exception -> L31
            java.lang.Object r10 = r1.invoke(r10, r9)     // Catch: java.lang.Exception -> L31
            if (r10 != r0) goto L79
        L78:
            return r0
        L79:
            r1 = r5
            goto L3c
        L7b:
            A9.m r5 = new A9.m
            kotlin.jvm.functions.Function0 r6 = r9.f1526g
            r7 = 1
            r5.<init>(r7, r2, r6)
            D9.l.c(r10, r5)
            goto L3c
        L87:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
