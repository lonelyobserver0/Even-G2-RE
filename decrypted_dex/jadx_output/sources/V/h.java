package V;

import Kc.t;
import Kc.y;
import T.InterfaceC0285a;
import T.d0;
import Z9.q;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements InterfaceC0285a {

    /* renamed from: a, reason: collision with root package name */
    public final t f7661a;

    /* renamed from: b, reason: collision with root package name */
    public final y f7662b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f7663c;

    /* renamed from: d, reason: collision with root package name */
    public final d f7664d;

    /* renamed from: e, reason: collision with root package name */
    public final q f7665e;

    /* renamed from: f, reason: collision with root package name */
    public final Zb.e f7666f;

    public h(t fileSystem, y path, d0 coordinator, d onClose) {
        X.f serializer = X.f.f8229a;
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f7661a = fileSystem;
        this.f7662b = path;
        this.f7663c = coordinator;
        this.f7664d = onClose;
        this.f7665e = new q(22);
        this.f7666f = Zb.f.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|39|40|(1:42)(1:43))(2:53|54))|14|15|16|(2:(1:19)|20)(1:22)))|56|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085 A[Catch: all -> 0x0086, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0086, blocks: (B:22:0x0085, B:28:0x0096, B:31:0x0093, B:27:0x008e), top: B:7:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [V.h] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [V.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [V.h] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [T.s] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(T.C0302s r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof V.f
            if (r0 == 0) goto L13
            r0 = r9
            V.f r0 = (V.f) r0
            int r1 = r0.f7653f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7653f = r1
            goto L18
        L13:
            V.f r0 = new V.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f7651d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7653f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 != r4) goto L32
            boolean r8 = r0.f7650c
            V.b r1 = r0.f7649b
            V.h r0 = r0.f7648a
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L30
            goto L75
        L30:
            r9 = move-exception
            goto L8e
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r9 = 275(0x113, float:3.85E-43)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            r8.<init>(r9)
            throw r8
        L3f:
            kotlin.ResultKt.throwOnFailure(r9)
            Z9.q r9 = r7.f7665e
            java.lang.Object r9 = r9.f9143b
            java.util.concurrent.atomic.AtomicBoolean r9 = (java.util.concurrent.atomic.AtomicBoolean) r9
            boolean r9 = r9.get()
            if (r9 != 0) goto La6
            Zb.e r9 = r7.f7666f
            boolean r9 = r9.f()
            V.b r2 = new V.b     // Catch: java.lang.Throwable -> L9c
            Kc.t r5 = r7.f7661a     // Catch: java.lang.Throwable -> L9c
            Kc.y r6 = r7.f7662b     // Catch: java.lang.Throwable -> L9c
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L9c
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)     // Catch: java.lang.Throwable -> L88
            r0.f7648a = r7     // Catch: java.lang.Throwable -> L88
            r0.f7649b = r2     // Catch: java.lang.Throwable -> L88
            r0.f7650c = r9     // Catch: java.lang.Throwable -> L88
            r0.f7653f = r4     // Catch: java.lang.Throwable -> L88
            java.lang.Object r8 = r8.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L88
            if (r8 != r1) goto L70
            return r1
        L70:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L75:
            r1.close()     // Catch: java.lang.Throwable -> L7a
            r1 = r3
            goto L7b
        L7a:
            r1 = move-exception
        L7b:
            if (r1 != 0) goto L85
            if (r8 == 0) goto L84
            Zb.e r8 = r0.f7666f
            r8.g(r3)
        L84:
            return r9
        L85:
            throw r1     // Catch: java.lang.Throwable -> L86
        L86:
            r9 = move-exception
            goto L9e
        L88:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L8e:
            r1.close()     // Catch: java.lang.Throwable -> L92
            goto L96
        L92:
            r1 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r9, r1)     // Catch: java.lang.Throwable -> L86
        L96:
            throw r9     // Catch: java.lang.Throwable -> L86
        L97:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            goto L9e
        L9c:
            r8 = move-exception
            goto L97
        L9e:
            if (r8 == 0) goto La5
            Zb.e r8 = r0.f7666f
            r8.g(r3)
        La5:
            throw r9
        La6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r9 = 6463(0x193f, float:9.057E-42)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: V.h.a(T.s, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(7:(2:3|(13:5|6|7|(1:(1:(8:11|12|13|14|16|17|18|(5:20|(1:22)|23|24|25)(1:27))(2:37|38))(1:39))(2:62|(2:64|(8:66|(1:70)|72|(3:75|(1:86)(2:83|84)|73)|89|90|(1:92)|48)(2:94|95))(2:96|97))|40|41|42|43|44|45|46|(6:49|14|16|17|18|(0)(0))|48))|43|44|45|46|(0)|48)|105|6|7|(0)(0)|40|41|42|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0165, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0166, code lost:
    
        r7 = r0;
        r2 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0152 A[Catch: all -> 0x0162, IOException -> 0x0165, TRY_ENTER, TryCatch #2 {all -> 0x0162, blocks: (B:20:0x0152, B:22:0x015a, B:23:0x016a, B:27:0x0174, B:33:0x0183, B:36:0x0180), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0174 A[Catch: all -> 0x0162, IOException -> 0x0165, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0162, blocks: (B:20:0x0152, B:22:0x015a, B:23:0x016a, B:27:0x0174, B:33:0x0183, B:36:0x0180), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [V.g, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r0v3, types: [Kc.o, Kc.t] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Kc.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v16, types: [Zb.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [Kc.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [Kc.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v6, types: [Kc.t, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(T.P r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V.h.b(T.P, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // T.InterfaceC0285a
    public final void close() {
        ((AtomicBoolean) this.f7665e.f9143b).set(true);
        this.f7664d.invoke();
    }
}
