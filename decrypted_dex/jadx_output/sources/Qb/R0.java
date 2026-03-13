package Qb;

import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class R0 {
    public static final Object a(P0 p02, Function2 function2) {
        Object c0220t;
        Object M5;
        p02.J(false, true, new Z(S.b(p02.f7970d.getContext()).h(p02.f5828e, p02, p02.f5844c), 0));
        try {
            c0220t = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(p02, p02);
        } catch (Throwable th) {
            c0220t = new C0220t(th, false);
        }
        if (c0220t != IntrinsicsKt.getCOROUTINE_SUSPENDED() && (M5 = p02.M(c0220t)) != L.f5819e) {
            if (M5 instanceof C0220t) {
                Throwable th2 = ((C0220t) M5).f5894a;
                if (!(th2 instanceof O0)) {
                    throw th2;
                }
                if (((O0) th2).f5827a != p02) {
                    throw th2;
                }
                if (c0220t instanceof C0220t) {
                    throw ((C0220t) c0220t).f5894a;
                }
            } else {
                c0220t = L.m(M5);
            }
            return c0220t;
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v1, types: [Qb.P0, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(long r6, kotlin.jvm.functions.Function2 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof Qb.Q0
            if (r0 == 0) goto L13
            r0 = r9
            Qb.Q0 r0 = (Qb.Q0) r0
            int r1 = r0.f5832d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5832d = r1
            goto L18
        L13:
            Qb.Q0 r0 = new Qb.Q0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f5831c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5832d
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f5830b
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: Qb.O0 -> L2b
            return r9
        L2b:
            r7 = move-exception
            goto L6b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r7 = 275(0x113, float:3.85E-43)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.ResultKt.throwOnFailure(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L44
            goto L71
        L44:
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            r0.f5829a = r8     // Catch: Qb.O0 -> L64
            r0.f5830b = r9     // Catch: Qb.O0 -> L64
            r0.f5832d = r3     // Catch: Qb.O0 -> L64
            Qb.P0 r2 = new Qb.P0     // Catch: Qb.O0 -> L64
            r2.<init>(r6, r0)     // Catch: Qb.O0 -> L64
            r9.element = r2     // Catch: Qb.O0 -> L64
            java.lang.Object r6 = a(r2, r8)     // Catch: Qb.O0 -> L64
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: Qb.O0 -> L64
            if (r6 != r7) goto L67
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: Qb.O0 -> L64
            goto L67
        L64:
            r7 = move-exception
            r6 = r9
            goto L6b
        L67:
            if (r6 != r1) goto L6a
            return r1
        L6a:
            return r6
        L6b:
            Qb.P0 r8 = r7.f5827a
            T r6 = r6.element
            if (r8 != r6) goto L73
        L71:
            r6 = 0
            return r6
        L73:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Qb.R0.b(long, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
