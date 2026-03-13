package T;

import Qb.C0215q;
import Qb.K0;
import Tb.InterfaceC0327h;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Q implements InterfaceC0294j {

    /* renamed from: a, reason: collision with root package name */
    public final V.e f6798a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0287c f6799b;

    /* renamed from: c, reason: collision with root package name */
    public final Qb.I f6800c;

    /* renamed from: d, reason: collision with root package name */
    public final Z9.q f6801d;

    /* renamed from: e, reason: collision with root package name */
    public final Zb.e f6802e;

    /* renamed from: f, reason: collision with root package name */
    public int f6803f;

    /* renamed from: g, reason: collision with root package name */
    public K0 f6804g;

    /* renamed from: h, reason: collision with root package name */
    public final Z9.q f6805h;

    /* renamed from: i, reason: collision with root package name */
    public final D5.B f6806i;
    public final Lazy j;

    /* renamed from: k, reason: collision with root package name */
    public final Lazy f6807k;

    /* renamed from: l, reason: collision with root package name */
    public final Z f6808l;

    public Q(V.e storage, List initTasksList, InterfaceC0287c corruptionHandler, Qb.I scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f6798a = storage;
        this.f6799b = corruptionHandler;
        this.f6800c = scope;
        this.f6801d = new Z9.q(new C0305v(this, null));
        this.f6802e = Zb.f.a();
        this.f6805h = new Z9.q(20);
        D5.B b2 = new D5.B();
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        b2.f1343d = this;
        b2.f1340a = Zb.f.a();
        C0215q c0215q = new C0215q(true);
        c0215q.H(null);
        b2.f1341b = c0215q;
        b2.f1342c = CollectionsKt.toList(initTasksList);
        this.f6806i = b2;
        this.j = LazyKt.lazy(new C0299o(this, 1));
        this.f6807k = LazyKt.lazy(new C0299o(this, 0));
        this.f6808l = new Z(scope, new A8.a(this, 8), M.f6783a, new N(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:12:0x0052, B:14:0x005a, B:16:0x005e, B:17:0x0061, B:18:0x0066), top: B:11:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(T.Q r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof T.C0306w
            if (r0 == 0) goto L16
            r0 = r5
            T.w r0 = (T.C0306w) r0
            int r1 = r0.f6911e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f6911e = r1
            goto L1b
        L16:
            T.w r0 = new T.w
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f6909c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6911e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L32
            Zb.e r4 = r0.f6908b
            T.Q r0 = r0.f6907a
            kotlin.ResultKt.throwOnFailure(r5)
            r5 = r4
            r4 = r0
            goto L51
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r5 = 275(0x113, float:3.85E-43)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            r4.<init>(r5)
            throw r4
        L3f:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f6907a = r4
            Zb.e r5 = r4.f6802e
            r0.f6908b = r5
            r0.f6911e = r3
            java.lang.Object r0 = r5.e(r0)
            if (r0 != r1) goto L51
            return r1
        L51:
            r0 = 0
            int r1 = r4.f6803f     // Catch: java.lang.Throwable -> L64
            int r1 = r1 + (-1)
            r4.f6803f = r1     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto L66
            Qb.K0 r1 = r4.f6804g     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L61
            r1.d(r0)     // Catch: java.lang.Throwable -> L64
        L61:
            r4.f6804g = r0     // Catch: java.lang.Throwable -> L64
            goto L66
        L64:
            r4 = move-exception
            goto L6e
        L66:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L64
            r5.g(r0)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L6e:
            r5.g(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: T.Q.b(T.Q, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(7:(1:(1:(1:12)(2:23|24))(3:25|26|27))(1:39)|13|14|15|(1:17)(1:21)|18|19)(5:40|41|42|(3:44|45|46)(3:50|(1:52)(1:67)|(2:54|(2:56|(1:58))(2:59|60))(2:61|(2:63|64)(2:65|66)))|33)|28|29|30))|70|6|7|(0)(0)|28|29|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0038, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v0, types: [T.Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(T.Q r9, T.U r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.Q.c(T.Q, T.U, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:12:0x0052, B:14:0x0059, B:15:0x006a), top: B:11:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(T.Q r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof T.C0309z
            if (r0 == 0) goto L16
            r0 = r5
            T.z r0 = (T.C0309z) r0
            int r1 = r0.f6924e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f6924e = r1
            goto L1b
        L16:
            T.z r0 = new T.z
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f6922c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6924e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L32
            Zb.e r4 = r0.f6921b
            T.Q r0 = r0.f6920a
            kotlin.ResultKt.throwOnFailure(r5)
            r5 = r4
            r4 = r0
            goto L51
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r5 = 275(0x113, float:3.85E-43)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            r4.<init>(r5)
            throw r4
        L3f:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f6920a = r4
            Zb.e r5 = r4.f6802e
            r0.f6921b = r5
            r0.f6924e = r3
            java.lang.Object r0 = r5.e(r0)
            if (r0 != r1) goto L51
            return r1
        L51:
            r0 = 0
            int r1 = r4.f6803f     // Catch: java.lang.Throwable -> L68
            int r1 = r1 + r3
            r4.f6803f = r1     // Catch: java.lang.Throwable -> L68
            if (r1 != r3) goto L6a
            Qb.I r1 = r4.f6800c     // Catch: java.lang.Throwable -> L68
            T.A r2 = new T.A     // Catch: java.lang.Throwable -> L68
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L68
            r3 = 3
            Qb.K0 r1 = Qb.L.j(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L68
            r4.f6804g = r1     // Catch: java.lang.Throwable -> L68
            goto L6a
        L68:
            r4 = move-exception
            goto L72
        L6a:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L68
            r5.g(r0)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L72:
            r5.g(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: T.Q.d(T.Q, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(T.Q r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.Q.e(T.Q, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|72|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0069, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0145 A[Catch: all -> 0x0171, TryCatch #0 {all -> 0x0171, blocks: (B:27:0x0133, B:29:0x0145, B:32:0x014d), top: B:26:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014d A[Catch: all -> 0x0171, TRY_LEAVE, TryCatch #0 {all -> 0x0171, blocks: (B:27:0x0133, B:29:0x0145, B:32:0x014d), top: B:26:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9 A[Catch: b -> 0x0069, TryCatch #1 {b -> 0x0069, blocks: (B:36:0x0064, B:37:0x0108, B:40:0x0072, B:41:0x00ea, B:56:0x008f, B:58:0x00a9, B:59:0x00af, B:65:0x0098, B:68:0x00d7), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(T.Q r9, boolean r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.Q.f(T.Q, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // T.InterfaceC0294j
    public final Object a(Function2 function2, ContinuationImpl continuationImpl) {
        h0 h0Var = (h0) continuationImpl.get$context().get(g0.f6855a);
        if (h0Var != null) {
            h0Var.b(this);
        }
        return Qb.L.n(new h0(h0Var, this), new L(this, function2, null), continuationImpl);
    }

    public final d0 g() {
        return (d0) this.f6807k.getValue();
    }

    @Override // T.InterfaceC0294j
    public final InterfaceC0327h getData() {
        return this.f6801d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r4.K(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof T.B
            if (r0 == 0) goto L13
            r0 = r6
            T.B r0 = (T.B) r0
            int r1 = r0.f6736e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6736e = r1
            goto L18
        L13:
            T.B r0 = new T.B
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f6734c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6736e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L32
            int r1 = r0.f6733b
            T.Q r0 = r0.f6732a
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L30
            goto L6d
        L30:
            r6 = move-exception
            goto L76
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r6.<init>(r0)
            throw r6
        L3f:
            T.Q r2 = r0.f6732a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L58
        L45:
            kotlin.ResultKt.throwOnFailure(r6)
            T.d0 r6 = r5.g()
            r0.f6732a = r5
            r0.f6736e = r4
            java.lang.Integer r6 = r6.a()
            if (r6 != r1) goto L57
            goto L6c
        L57:
            r2 = r5
        L58:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            D5.B r4 = r2.f6806i     // Catch: java.lang.Throwable -> L74
            r0.f6732a = r2     // Catch: java.lang.Throwable -> L74
            r0.f6733b = r6     // Catch: java.lang.Throwable -> L74
            r0.f6736e = r3     // Catch: java.lang.Throwable -> L74
            java.lang.Object r6 = r4.K(r0)     // Catch: java.lang.Throwable -> L74
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L70:
            r1 = r6
            r6 = r0
            r0 = r2
            goto L76
        L74:
            r0 = move-exception
            goto L70
        L76:
            Z9.q r0 = r0.f6805h
            T.V r2 = new T.V
            r2.<init>(r6, r1)
            r0.K(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T.Q.h(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object i(ContinuationImpl continuationImpl) {
        return ((V.h) this.j.getValue()).a(new C0302s(3, (Continuation) null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Object r11, boolean r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof T.O
            if (r0 == 0) goto L13
            r0 = r13
            T.O r0 = (T.O) r0
            int r1 = r0.f6790d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6790d = r1
            goto L18
        L13:
            T.O r0 = new T.O
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f6788b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6790d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.Ref$IntRef r11 = r0.f6787a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L5d
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r12 = 275(0x113, float:3.85E-43)
            java.lang.String r12 = com.stub.StubApp.getString2(r12)
            r11.<init>(r12)
            throw r11
        L38:
            kotlin.ResultKt.throwOnFailure(r13)
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            kotlin.Lazy r13 = r10.j
            java.lang.Object r13 = r13.getValue()
            V.h r13 = (V.h) r13
            T.P r4 = new T.P
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f6787a = r5
            r0.f6790d = r3
            java.lang.Object r11 = r13.b(r4, r0)
            if (r11 != r1) goto L5c
            return r1
        L5c:
            r11 = r5
        L5d:
            int r11 = r11.element
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: T.Q.j(java.lang.Object, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
