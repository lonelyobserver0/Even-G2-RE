package Tb;

import Qb.C0197h;
import Qb.C0203k;
import Ub.AbstractC0346b;
import Ub.AbstractC0347c;
import Ub.AbstractC0348d;
import com.stub.StubApp;
import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class P extends AbstractC0346b implements M, InterfaceC0328i, InterfaceC0327h, Ub.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f7303e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7304f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7305g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f7306h;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public long f7307k;

    /* renamed from: l, reason: collision with root package name */
    public int f7308l;

    /* renamed from: m, reason: collision with root package name */
    public int f7309m;

    public P(int i3, int i10, int i11) {
        this.f7303e = i3;
        this.f7304f = i10;
        this.f7305g = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (r8 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r8.a() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        throw ((Qb.D0) r8).z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
    
        r0.f7296a = r5;
        r0.f7297b = r2;
        r0.f7298c = r9;
        r0.f7299d = r8;
        r0.f7302g = 3;
        r5 = r5;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if (r2.a(r10, r0) != r1) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[Catch: all -> 0x003a, TryCatch #2 {all -> 0x003a, blocks: (B:14:0x0033, B:18:0x0080, B:20:0x0088, B:29:0x009b, B:32:0x00a2, B:33:0x00a8, B:35:0x00a9, B:40:0x0052), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[EDGE_INSN: B:27:0x0099->B:28:0x0099 BREAK  A[LOOP:0: B:18:0x0080->B:26:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r5v1, types: [Ub.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [Tb.P] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Tb.i] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [Ub.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [Tb.S] */
    /* JADX WARN: Type inference failed for: r9v8, types: [Tb.S] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b7 -> B:15:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object i(Tb.P r8, Tb.InterfaceC0328i r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof Tb.O
            if (r0 == 0) goto L13
            r0 = r10
            Tb.O r0 = (Tb.O) r0
            int r1 = r0.f7302g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7302g = r1
            goto L18
        L13:
            Tb.O r0 = new Tb.O
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f7300e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7302g
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L65
            r8 = 1
            if (r2 == r8) goto L56
            if (r2 == r4) goto L4a
            if (r2 != r3) goto L3d
            Qb.t0 r8 = r0.f7299d
            Tb.S r9 = r0.f7298c
            Tb.i r2 = r0.f7297b
            Tb.P r5 = r0.f7296a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L3a
        L36:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L7d
        L3a:
            r8 = move-exception
            goto Lbd
        L3d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r9 = 275(0x113, float:3.85E-43)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            r8.<init>(r9)
            throw r8
        L4a:
            Qb.t0 r8 = r0.f7299d
            Tb.S r9 = r0.f7298c
            Tb.i r2 = r0.f7297b
            Tb.P r5 = r0.f7296a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L3a
            goto L80
        L56:
            Tb.S r9 = r0.f7298c
            Tb.i r8 = r0.f7297b
            Tb.P r2 = r0.f7296a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L62
            r10 = r8
            r8 = r2
            goto L71
        L62:
            r8 = move-exception
            r5 = r2
            goto Lbd
        L65:
            kotlin.ResultKt.throwOnFailure(r10)
            Ub.d r10 = r8.b()
            Tb.S r10 = (Tb.S) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L71:
            kotlin.coroutines.CoroutineContext r2 = r0.get$context()     // Catch: java.lang.Throwable -> Lba
            Qb.s0 r5 = Qb.C0219s0.f5892a     // Catch: java.lang.Throwable -> Lba
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lba
            Qb.t0 r2 = (Qb.InterfaceC0221t0) r2     // Catch: java.lang.Throwable -> Lba
        L7d:
            r5 = r8
            r8 = r2
            r2 = r10
        L80:
            java.lang.Object r10 = r5.t(r9)     // Catch: java.lang.Throwable -> L3a
            F5.c r6 = Tb.Q.f7310a     // Catch: java.lang.Throwable -> L3a
            if (r10 != r6) goto L99
            r0.f7296a = r5     // Catch: java.lang.Throwable -> L3a
            r0.f7297b = r2     // Catch: java.lang.Throwable -> L3a
            r0.f7298c = r9     // Catch: java.lang.Throwable -> L3a
            r0.f7299d = r8     // Catch: java.lang.Throwable -> L3a
            r0.f7302g = r4     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r10 = r5.g(r9, r0)     // Catch: java.lang.Throwable -> L3a
            if (r10 != r1) goto L80
            goto Lb9
        L99:
            if (r8 == 0) goto La9
            boolean r6 = r8.a()     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto La2
            goto La9
        La2:
            Qb.D0 r8 = (Qb.D0) r8     // Catch: java.lang.Throwable -> L3a
            java.util.concurrent.CancellationException r8 = r8.z()     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        La9:
            r0.f7296a = r5     // Catch: java.lang.Throwable -> L3a
            r0.f7297b = r2     // Catch: java.lang.Throwable -> L3a
            r0.f7298c = r9     // Catch: java.lang.Throwable -> L3a
            r0.f7299d = r8     // Catch: java.lang.Throwable -> L3a
            r0.f7302g = r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r10 = r2.a(r10, r0)     // Catch: java.lang.Throwable -> L3a
            if (r10 != r1) goto L36
        Lb9:
            return r1
        Lba:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lbd:
            r5.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.P.i(Tb.P, Tb.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // Tb.InterfaceC0328i
    public final Object a(Object obj, Continuation continuation) {
        Throwable th;
        Continuation[] l9;
        N n10;
        int i3 = 1;
        if (o(obj)) {
            return Unit.INSTANCE;
        }
        C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuation));
        c0203k.s();
        Continuation[] continuationArr = AbstractC0347c.f7576a;
        synchronized (this) {
            try {
                if (q(obj)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        c0203k.resumeWith(Result.m40constructorimpl(Unit.INSTANCE));
                        l9 = l(continuationArr);
                        n10 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        n10 = new N(this, m() + this.f7308l + this.f7309m, obj, c0203k);
                        k(n10);
                        this.f7309m++;
                        if (this.f7304f == 0) {
                            continuationArr = l(continuationArr);
                        }
                        l9 = continuationArr;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (n10 != null) {
                    c0203k.u(new C0197h(n10, i3));
                }
                for (Continuation continuation2 : l9) {
                    if (continuation2 != null) {
                        Result.Companion companion2 = Result.INSTANCE;
                        continuation2.resumeWith(Result.m40constructorimpl(Unit.INSTANCE));
                    }
                }
                Object r8 = c0203k.r();
                if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                if (r8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    r8 = Unit.INSTANCE;
                }
                return r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? r8 : Unit.INSTANCE;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // Ub.AbstractC0346b
    public final AbstractC0348d c() {
        S s10 = new S();
        s10.f7313a = -1L;
        return s10;
    }

    @Override // Ub.AbstractC0346b
    public final AbstractC0348d[] d() {
        return new S[2];
    }

    public final Object g(S s10, O o5) {
        C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(o5));
        c0203k.s();
        synchronized (this) {
            if (r(s10) < 0) {
                s10.f7314b = c0203k;
            } else {
                Result.Companion companion = Result.INSTANCE;
                c0203k.resumeWith(Result.m40constructorimpl(Unit.INSTANCE));
            }
            Unit unit = Unit.INSTANCE;
        }
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(o5);
        }
        return r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? r8 : Unit.INSTANCE;
    }

    public final void h() {
        if (this.f7304f != 0 || this.f7309m > 1) {
            Object[] objArr = this.f7306h;
            Intrinsics.checkNotNull(objArr);
            while (this.f7309m > 0 && Q.b(objArr, (m() + (this.f7308l + this.f7309m)) - 1) == Q.f7310a) {
                this.f7309m--;
                Q.c(objArr, m() + this.f7308l + this.f7309m, null);
            }
        }
    }

    public final void j() {
        AbstractC0348d[] abstractC0348dArr;
        Object[] objArr = this.f7306h;
        Intrinsics.checkNotNull(objArr);
        Q.c(objArr, m(), null);
        this.f7308l--;
        long m4 = m() + 1;
        if (this.j < m4) {
            this.j = m4;
        }
        if (this.f7307k < m4) {
            if (this.f7573b != 0 && (abstractC0348dArr = this.f7572a) != null) {
                for (AbstractC0348d abstractC0348d : abstractC0348dArr) {
                    if (abstractC0348d != null) {
                        S s10 = (S) abstractC0348d;
                        long j = s10.f7313a;
                        if (j >= 0 && j < m4) {
                            s10.f7313a = m4;
                        }
                    }
                }
            }
            this.f7307k = m4;
        }
    }

    public final void k(Object obj) {
        int i3 = this.f7308l + this.f7309m;
        Object[] objArr = this.f7306h;
        if (objArr == null) {
            objArr = n(null, 0, 2);
        } else if (i3 >= objArr.length) {
            objArr = n(objArr, i3, objArr.length * 2);
        }
        Q.c(objArr, m() + i3, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final Continuation[] l(Continuation[] continuationArr) {
        AbstractC0348d[] abstractC0348dArr;
        S s10;
        C0203k c0203k;
        int length = continuationArr.length;
        if (this.f7573b != 0 && (abstractC0348dArr = this.f7572a) != null) {
            int length2 = abstractC0348dArr.length;
            int i3 = 0;
            continuationArr = continuationArr;
            while (i3 < length2) {
                AbstractC0348d abstractC0348d = abstractC0348dArr[i3];
                if (abstractC0348d != null && (c0203k = (s10 = (S) abstractC0348d).f7314b) != null && r(s10) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                        continuationArr = copyOf;
                    }
                    continuationArr[length] = c0203k;
                    s10.f7314b = null;
                    length++;
                }
                i3++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    public final long m() {
        return Math.min(this.f7307k, this.j);
    }

    public final Object[] n(Object[] objArr, int i3, int i10) {
        if (i10 <= 0) {
            throw new IllegalStateException(StubApp.getString2(25663));
        }
        Object[] objArr2 = new Object[i10];
        this.f7306h = objArr2;
        if (objArr != null) {
            long m4 = m();
            for (int i11 = 0; i11 < i3; i11++) {
                long j = i11 + m4;
                Q.c(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean o(Object obj) {
        int i3;
        boolean z2;
        Continuation[] continuationArr = AbstractC0347c.f7576a;
        synchronized (this) {
            if (q(obj)) {
                continuationArr = l(continuationArr);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m40constructorimpl(Unit.INSTANCE));
            }
        }
        return z2;
    }

    @Override // Tb.InterfaceC0327h
    public final Object p(InterfaceC0328i interfaceC0328i, Continuation continuation) {
        return i(this, interfaceC0328i, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r1 != 2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f7573b
            int r2 = r12.f7303e
            r9 = 1
            if (r1 != 0) goto L22
            if (r2 != 0) goto La
            goto L76
        La:
            r12.k(r13)
            int r1 = r12.f7308l
            int r1 = r1 + r9
            r12.f7308l = r1
            if (r1 <= r2) goto L17
            r12.j()
        L17:
            long r1 = r12.m()
            int r3 = r12.f7308l
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f7307k = r1
            return r9
        L22:
            int r1 = r12.f7308l
            int r3 = r12.f7304f
            if (r1 < r3) goto L3e
            long r4 = r12.f7307k
            long r6 = r12.j
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L3e
            int r1 = r12.f7305g
            int r1 = w.AbstractC1856e.c(r1)
            if (r1 == 0) goto L3c
            r4 = 2
            if (r1 == r4) goto L76
            goto L3e
        L3c:
            r1 = 0
            return r1
        L3e:
            r12.k(r13)
            int r1 = r12.f7308l
            int r1 = r1 + r9
            r12.f7308l = r1
            if (r1 <= r3) goto L4b
            r12.j()
        L4b:
            long r3 = r12.m()
            int r1 = r12.f7308l
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.j
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L76
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.f7307k
            long r5 = r12.m()
            int r7 = r12.f7308l
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.m()
            int r10 = r12.f7308l
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f7309m
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.u(r1, r3, r5, r7)
        L76:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.P.q(java.lang.Object):boolean");
    }

    public final long r(S s10) {
        long j = s10.f7313a;
        if (j < m() + this.f7308l) {
            return j;
        }
        if (this.f7304f <= 0 && j <= m() && this.f7309m != 0) {
            return j;
        }
        return -1L;
    }

    @Override // Ub.r
    public final InterfaceC0327h s(CoroutineContext coroutineContext, int i3, int i10) {
        return Q.l(this, coroutineContext, i3, i10);
    }

    public final Object t(S s10) {
        Object obj;
        Continuation[] continuationArr = AbstractC0347c.f7576a;
        synchronized (this) {
            try {
                long r8 = r(s10);
                if (r8 < 0) {
                    obj = Q.f7310a;
                } else {
                    long j = s10.f7313a;
                    Object[] objArr = this.f7306h;
                    Intrinsics.checkNotNull(objArr);
                    Object b2 = Q.b(objArr, r8);
                    if (b2 instanceof N) {
                        b2 = ((N) b2).f7294c;
                    }
                    s10.f7313a = r8 + 1;
                    Object obj2 = b2;
                    continuationArr = v(j);
                    obj = obj2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m40constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    public final void u(long j, long j3, long j10, long j11) {
        long min = Math.min(j3, j);
        for (long m4 = m(); m4 < min; m4++) {
            Object[] objArr = this.f7306h;
            Intrinsics.checkNotNull(objArr);
            Q.c(objArr, m4, null);
        }
        this.j = j;
        this.f7307k = j3;
        this.f7308l = (int) (j10 - min);
        this.f7309m = (int) (j11 - j10);
    }

    public final Continuation[] v(long j) {
        long j3;
        long j10;
        long j11;
        int i3;
        Continuation[] continuationArr;
        AbstractC0348d[] abstractC0348dArr;
        long j12 = this.f7307k;
        Continuation[] continuationArr2 = AbstractC0347c.f7576a;
        if (j <= j12) {
            long m4 = m();
            long j13 = this.f7308l + m4;
            int i10 = this.f7304f;
            if (i10 == 0 && this.f7309m > 0) {
                j13++;
            }
            int i11 = 0;
            if (this.f7573b != 0 && (abstractC0348dArr = this.f7572a) != null) {
                for (AbstractC0348d abstractC0348d : abstractC0348dArr) {
                    if (abstractC0348d != null) {
                        long j14 = ((S) abstractC0348d).f7313a;
                        if (j14 >= 0 && j14 < j13) {
                            j13 = j14;
                        }
                    }
                }
            }
            if (j13 > this.f7307k) {
                long m10 = m() + this.f7308l;
                int min = this.f7573b > 0 ? Math.min(this.f7309m, i10 - ((int) (m10 - j13))) : this.f7309m;
                long j15 = this.f7309m + m10;
                F5.c cVar = Q.f7310a;
                if (min > 0) {
                    Continuation[] continuationArr3 = new Continuation[min];
                    j11 = 1;
                    Object[] objArr = this.f7306h;
                    Intrinsics.checkNotNull(objArr);
                    i3 = i10;
                    long j16 = m10;
                    while (true) {
                        if (m10 >= j15) {
                            j3 = m4;
                            j10 = j13;
                            break;
                        }
                        j3 = m4;
                        Object b2 = Q.b(objArr, m10);
                        if (b2 != cVar) {
                            Intrinsics.checkNotNull(b2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            N n10 = (N) b2;
                            int i12 = i11 + 1;
                            j10 = j13;
                            continuationArr3[i11] = n10.f7295d;
                            Q.c(objArr, m10, cVar);
                            Q.c(objArr, j16, n10.f7294c);
                            j16++;
                            if (i12 >= min) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            j10 = j13;
                        }
                        m10++;
                        m4 = j3;
                        j13 = j10;
                    }
                    m10 = j16;
                    continuationArr = continuationArr3;
                } else {
                    j3 = m4;
                    j10 = j13;
                    j11 = 1;
                    i3 = i10;
                    continuationArr = continuationArr2;
                }
                int i13 = (int) (m10 - j3);
                long j17 = this.f7573b == 0 ? m10 : j10;
                long max = Math.max(this.j, m10 - Math.min(this.f7303e, i13));
                if (i3 == 0 && max < j15) {
                    Object[] objArr2 = this.f7306h;
                    Intrinsics.checkNotNull(objArr2);
                    if (Intrinsics.areEqual(Q.b(objArr2, max), cVar)) {
                        m10 += j11;
                        max += j11;
                    }
                }
                u(max, j17, m10, j15);
                h();
                return continuationArr.length == 0 ? continuationArr : l(continuationArr);
            }
        }
        return continuationArr2;
    }
}
