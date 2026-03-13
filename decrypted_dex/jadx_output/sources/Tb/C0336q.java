package Tb;

import T.C0302s;

/* renamed from: Tb.q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0336q implements InterfaceC0327h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A0.c f7382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0302s f7383b;

    public C0336q(A0.c cVar, C0302s c0302s) {
        this.f7382a = cVar;
        this.f7383b = c0302s;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // Tb.InterfaceC0327h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(Tb.InterfaceC0328i r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof Tb.C0335p
            if (r0 == 0) goto L13
            r0 = r10
            Tb.p r0 = (Tb.C0335p) r0
            int r1 = r0.f7378b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7378b = r1
            goto L18
        L13:
            Tb.p r0 = new Tb.p
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f7377a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7378b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L57
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L43
            if (r2 != r3) goto L36
            java.lang.Object r9 = r0.f7380d
            Ub.v r9 = (Ub.v) r9
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L34
            goto L8b
        L34:
            r10 = move-exception
            goto L95
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r10 = 275(0x113, float:3.85E-43)
            java.lang.String r10 = com.stub.StubApp.getString2(r10)
            r9.<init>(r10)
            throw r9
        L43:
            java.lang.Object r9 = r0.f7380d
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto Laf
        L4b:
            Tb.i r9 = r0.f7381e
            java.lang.Object r2 = r0.f7380d
            Tb.q r2 = (Tb.C0336q) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L55
            goto L6a
        L55:
            r9 = move-exception
            goto L9b
        L57:
            kotlin.ResultKt.throwOnFailure(r10)
            A0.c r10 = r8.f7382a     // Catch: java.lang.Throwable -> L99
            r0.f7380d = r8     // Catch: java.lang.Throwable -> L99
            r0.f7381e = r9     // Catch: java.lang.Throwable -> L99
            r0.f7378b = r5     // Catch: java.lang.Throwable -> L99
            java.lang.Object r10 = r10.p(r9, r0)     // Catch: java.lang.Throwable -> L99
            if (r10 != r1) goto L69
            goto Lae
        L69:
            r2 = r8
        L6a:
            Ub.v r10 = new Ub.v
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            r10.<init>(r9, r4)
            T.s r9 = r2.f7383b     // Catch: java.lang.Throwable -> L91
            r0.f7380d = r10     // Catch: java.lang.Throwable -> L91
            r0.f7381e = r6     // Catch: java.lang.Throwable -> L91
            r0.f7378b = r3     // Catch: java.lang.Throwable -> L91
            r2 = 6
            kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch: java.lang.Throwable -> L91
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L91
            r0 = 7
            kotlin.jvm.internal.InlineMarker.mark(r0)     // Catch: java.lang.Throwable -> L91
            if (r9 != r1) goto L8a
            goto Lae
        L8a:
            r9 = r10
        L8b:
            r9.releaseIntercepted()
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L91:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L95:
            r9.releaseIntercepted()
            throw r10
        L99:
            r9 = move-exception
            r2 = r8
        L9b:
            Tb.d0 r10 = new Tb.d0
            r10.<init>(r9)
            T.s r2 = r2.f7383b
            r0.f7380d = r9
            r0.f7381e = r6
            r0.f7378b = r4
            java.lang.Object r10 = Tb.AbstractC0337s.a(r10, r2, r9, r0)
            if (r10 != r1) goto Laf
        Lae:
            return r1
        Laf:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.C0336q.p(Tb.i, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
