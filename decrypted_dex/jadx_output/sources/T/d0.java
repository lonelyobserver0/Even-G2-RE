package T;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Zb.e f6842a;

    /* renamed from: b, reason: collision with root package name */
    public final F5.c f6843b;

    /* renamed from: c, reason: collision with root package name */
    public final Z9.q f6844c;

    public d0(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f6842a = Zb.f.a();
        this.f6843b = new F5.c(20);
        this.f6844c = new Z9.q(new c0(2, null));
    }

    public final Integer a() {
        return Boxing.boxInt(((AtomicInteger) this.f6843b.f2238b).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r9.e(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.jvm.functions.Function1 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof T.a0
            if (r0 == 0) goto L13
            r0 = r9
            T.a0 r0 = (T.a0) r0
            int r1 = r0.f6834e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6834e = r1
            goto L18
        L13:
            T.a0 r0 = new T.a0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f6832c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6834e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f6830a
            Zb.a r8 = (Zb.a) r8
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L31
            goto L6e
        L31:
            r9 = move-exception
            goto L78
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r9 = 275(0x113, float:3.85E-43)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            r8.<init>(r9)
            throw r8
        L40:
            Zb.e r8 = r0.f6831b
            java.lang.Object r2 = r0.f6830a
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r8
            r8 = r2
            goto L5e
        L4c:
            kotlin.ResultKt.throwOnFailure(r9)
            r0.f6830a = r8
            Zb.e r9 = r7.f6842a
            r0.f6831b = r9
            r0.f6834e = r4
            java.lang.Object r2 = r9.e(r0)
            if (r2 != r1) goto L5e
            goto L6a
        L5e:
            r0.f6830a = r9     // Catch: java.lang.Throwable -> L74
            r0.f6831b = r5     // Catch: java.lang.Throwable -> L74
            r0.f6834e = r3     // Catch: java.lang.Throwable -> L74
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L74
            if (r8 != r1) goto L6b
        L6a:
            return r1
        L6b:
            r6 = r9
            r9 = r8
            r8 = r6
        L6e:
            Zb.e r8 = (Zb.e) r8
            r8.g(r5)
            return r9
        L74:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L78:
            Zb.e r8 = (Zb.e) r8
            r8.g(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: T.d0.b(kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.jvm.functions.Function2 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof T.b0
            if (r0 == 0) goto L13
            r0 = r8
            T.b0 r0 = (T.b0) r0
            int r1 = r0.f6839e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6839e = r1
            goto L18
        L13:
            T.b0 r0 = new T.b0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f6837c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6839e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L30
            boolean r7 = r0.f6836b
            Zb.e r0 = r0.f6835a
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L2e
            goto L5a
        L2e:
            r8 = move-exception
            goto L64
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r8 = 275(0x113, float:3.85E-43)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.ResultKt.throwOnFailure(r8)
            Zb.e r8 = r6.f6842a
            boolean r2 = r8.f()
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)     // Catch: java.lang.Throwable -> L60
            r0.f6835a = r8     // Catch: java.lang.Throwable -> L60
            r0.f6836b = r2     // Catch: java.lang.Throwable -> L60
            r0.f6839e = r3     // Catch: java.lang.Throwable -> L60
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L60
            if (r7 != r1) goto L57
            return r1
        L57:
            r0 = r8
            r8 = r7
            r7 = r2
        L5a:
            if (r7 == 0) goto L5f
            r0.g(r4)
        L5f:
            return r8
        L60:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L64:
            if (r7 == 0) goto L69
            r0.g(r4)
        L69:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: T.d0.c(kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
