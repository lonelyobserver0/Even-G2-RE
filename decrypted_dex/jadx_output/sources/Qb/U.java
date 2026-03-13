package Qb;

import com.stub.StubApp;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class U extends Xb.h {

    /* renamed from: c, reason: collision with root package name */
    public int f5836c;

    public U(int i3) {
        super(0L, Xb.j.f8642g);
        this.f5836c = i3;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract Continuation d();

    public Throwable e(Object obj) {
        C0220t c0220t = obj instanceof C0220t ? (C0220t) obj : null;
        if (c0220t != null) {
            return c0220t.f5894a;
        }
        return null;
    }

    public Object f(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            ExceptionsKt.addSuppressed(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        String str = StubApp.getString2(25493) + this + StubApp.getString2(25494);
        Intrinsics.checkNotNull(th);
        F.a(d().get$context(), new K(str, th));
    }

    public abstract Object h();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r6 = (Qb.InterfaceC0221t0) r6.get(Qb.C0219s0.f5892a);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r12 = this;
            i2.o r0 = r12.f8634b
            kotlin.coroutines.Continuation r1 = r12.d()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L23
            Vb.i r1 = (Vb.i) r1     // Catch: java.lang.Throwable -> L23
            kotlin.coroutines.Continuation r2 = r1.f7946e     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.f7948g     // Catch: java.lang.Throwable -> L23
            kotlin.coroutines.CoroutineContext r3 = r2.get$context()     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = Vb.B.c(r3, r1)     // Catch: java.lang.Throwable -> L23
            F5.c r4 = Vb.B.f7923a     // Catch: java.lang.Throwable -> L23
            r5 = 0
            if (r1 == r4) goto L26
            Qb.T0 r4 = Qb.AbstractC0231z.c(r2, r3, r1)     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r1 = move-exception
            goto Lbf
        L26:
            r4 = r5
        L27:
            kotlin.coroutines.CoroutineContext r6 = r2.get$context()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r7 = r12.h()     // Catch: java.lang.Throwable -> L4a
            java.lang.Throwable r8 = r12.e(r7)     // Catch: java.lang.Throwable -> L4a
            if (r8 != 0) goto L4c
            int r9 = r12.f5836c     // Catch: java.lang.Throwable -> L4a
            r10 = 1
            if (r9 == r10) goto L3f
            r11 = 2
            if (r9 != r11) goto L3e
            goto L3f
        L3e:
            r10 = 0
        L3f:
            if (r10 == 0) goto L4c
            Qb.s0 r9 = Qb.C0219s0.f5892a     // Catch: java.lang.Throwable -> L4a
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r9)     // Catch: java.lang.Throwable -> L4a
            Qb.t0 r6 = (Qb.InterfaceC0221t0) r6     // Catch: java.lang.Throwable -> L4a
            goto L4d
        L4a:
            r2 = move-exception
            goto Lb3
        L4c:
            r6 = r5
        L4d:
            if (r6 == 0) goto L6c
            boolean r9 = r6.a()     // Catch: java.lang.Throwable -> L4a
            if (r9 != 0) goto L6c
            Qb.D0 r6 = (Qb.D0) r6     // Catch: java.lang.Throwable -> L4a
            java.util.concurrent.CancellationException r6 = r6.z()     // Catch: java.lang.Throwable -> L4a
            r12.b(r7, r6)     // Catch: java.lang.Throwable -> L4a
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r6 = kotlin.Result.m40constructorimpl(r6)     // Catch: java.lang.Throwable -> L4a
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L4a
            goto L89
        L6c:
            if (r8 == 0) goto L7c
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r8)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r6 = kotlin.Result.m40constructorimpl(r6)     // Catch: java.lang.Throwable -> L4a
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L4a
            goto L89
        L7c:
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r6 = r12.f(r7)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r6 = kotlin.Result.m40constructorimpl(r6)     // Catch: java.lang.Throwable -> L4a
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L4a
        L89:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L93
            boolean r2 = r4.Z()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L96
        L93:
            Vb.B.a(r3, r1)     // Catch: java.lang.Throwable -> L23
        L96:
            r0.getClass()     // Catch: java.lang.Throwable -> La0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = kotlin.Result.m40constructorimpl(r0)     // Catch: java.lang.Throwable -> La0
            goto Lab
        La0:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m40constructorimpl(r0)
        Lab:
            java.lang.Throwable r0 = kotlin.Result.m43exceptionOrNullimpl(r0)
            r12.g(r5, r0)
            goto Ldd
        Lb3:
            if (r4 == 0) goto Lbb
            boolean r4 = r4.Z()     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto Lbe
        Lbb:
            Vb.B.a(r3, r1)     // Catch: java.lang.Throwable -> L23
        Lbe:
            throw r2     // Catch: java.lang.Throwable -> L23
        Lbf:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> Lcb
            r0.getClass()     // Catch: java.lang.Throwable -> Lcb
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r0 = kotlin.Result.m40constructorimpl(r0)     // Catch: java.lang.Throwable -> Lcb
            goto Ld6
        Lcb:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m40constructorimpl(r0)
        Ld6:
            java.lang.Throwable r0 = kotlin.Result.m43exceptionOrNullimpl(r0)
            r12.g(r1, r0)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Qb.U.run():void");
    }
}
