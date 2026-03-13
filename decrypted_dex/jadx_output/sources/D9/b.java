package D9;

import Qb.I;
import i8.C1064b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Collection f1501a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f1502b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f1503c;

    /* renamed from: d, reason: collision with root package name */
    public int f1504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f1505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Vb.f f1506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1064b f1507g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list, Vb.f fVar, C1064b c1064b, Continuation continuation) {
        super(2, continuation);
        this.f1505e = list;
        this.f1506f = fVar;
        this.f1507g = c1064b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f1505e, this.f1506f, this.f1507g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007c -> B:5:0x007d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f1504d
            r2 = 1
            if (r1 == 0) goto L22
            if (r1 != r2) goto L15
            java.util.Collection r1 = r8.f1503c
            java.util.Iterator r3 = r8.f1502b
            java.util.Collection r4 = r8.f1501a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L7d
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r9.<init>(r0)
            throw r9
        L22:
            kotlin.ResultKt.throwOnFailure(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.List r1 = r8.f1505e
            int r3 = kotlin.collections.CollectionsKt.f(r1)
            r9.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L34:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r1.next()
            Xb.d r4 = Qb.W.f5838a
            D9.a r5 = new D9.a
            i8.b r6 = r8.f1507g
            r7 = 0
            r5.<init>(r6, r3, r7)
            r3 = 2
            Vb.f r6 = r8.f1506f
            Qb.P r3 = Qb.L.c(r6, r4, r5, r3)
            r9.add(r3)
            goto L34
        L53:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt.f(r9)
            r1.<init>(r3)
            java.util.Iterator r9 = r9.iterator()
            r3 = r9
        L61:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L82
            java.lang.Object r9 = r3.next()
            Qb.O r9 = (Qb.O) r9
            r8.f1501a = r1
            r8.f1502b = r3
            r8.f1503c = r1
            r8.f1504d = r2
            java.lang.Object r9 = r9.p(r8)
            if (r9 != r0) goto L7c
            return r0
        L7c:
            r4 = r1
        L7d:
            r1.add(r9)
            r1 = r4
            goto L61
        L82:
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
