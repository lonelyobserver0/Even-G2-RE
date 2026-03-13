package Tb;

import com.stub.StubApp;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: Tb.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0322c extends Ub.g {

    /* renamed from: d, reason: collision with root package name */
    public final SuspendLambda f7347d;

    /* renamed from: e, reason: collision with root package name */
    public final SuspendLambda f7348e;

    /* JADX WARN: Multi-variable type inference failed */
    public C0322c(Function2 function2, CoroutineContext coroutineContext, int i3, int i10) {
        super(coroutineContext, i3, i10);
        SuspendLambda suspendLambda = (SuspendLambda) function2;
        this.f7347d = suspendLambda;
        this.f7348e = suspendLambda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r5v0, types: [Sb.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v8, types: [Sb.v] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // Ub.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Sb.v r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Tb.C0321b
            if (r0 == 0) goto L13
            r0 = r6
            Tb.b r0 = (Tb.C0321b) r0
            int r1 = r0.f7344d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7344d = r1
            goto L1a
        L13:
            Tb.b r0 = new Tb.b
            kotlin.coroutines.jvm.internal.ContinuationImpl r6 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.f7342b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7344d
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L2d
            Sb.v r5 = r0.f7341a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L53
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r6 = 275(0x113, float:3.85E-43)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f7341a = r5
            r0.f7344d = r3
            kotlin.coroutines.jvm.internal.SuspendLambda r6 = r4.f7347d
            java.lang.Object r6 = r6.invoke(r5, r0)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r0) goto L4e
            goto L50
        L4e:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L50:
            if (r6 != r1) goto L53
            return r1
        L53:
            Sb.j r5 = (Sb.j) r5
            Sb.e r5 = r5.f6713d
            boolean r5 = r5.w()
            if (r5 == 0) goto L60
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L60:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r6 = 25676(0x644c, float:3.598E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.C0322c.a(Sb.v, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // Ub.g
    public final Ub.g b(CoroutineContext coroutineContext, int i3, int i10) {
        return new C0322c(this.f7348e, coroutineContext, i3, i10);
    }

    @Override // Ub.g
    public final String toString() {
        return StubApp.getString2(25677) + this.f7347d + StubApp.getString2(25678) + super.toString();
    }
}
