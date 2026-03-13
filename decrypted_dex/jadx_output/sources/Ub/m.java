package Ub;

import Qb.I;
import Tb.InterfaceC0328i;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class m implements InterfaceC0328i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f7601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f7602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f7603c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328i f7604d;

    public m(Ref.ObjectRef objectRef, I i3, o oVar, InterfaceC0328i interfaceC0328i) {
        this.f7601a = objectRef;
        this.f7602b = i3;
        this.f7603c = oVar;
        this.f7604d = interfaceC0328i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v3, types: [Qb.K0, T] */
    @Override // Tb.InterfaceC0328i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Ub.l
            if (r0 == 0) goto L13
            r0 = r8
            Ub.l r0 = (Ub.l) r0
            int r1 = r0.f7600e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7600e = r1
            goto L18
        L13:
            Ub.l r0 = new Ub.l
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f7598c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7600e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.f7597b
            Ub.m r0 = r0.f7596a
            kotlin.ResultKt.throwOnFailure(r8)
            goto Lb8
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r8 = 275(0x113, float:3.85E-43)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            r7.<init>(r8)
            throw r7
        L3b:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.jvm.internal.Ref$ObjectRef r8 = r6.f7601a
            T r8 = r8.element
            Qb.t0 r8 = (Qb.InterfaceC0221t0) r8
            if (r8 == 0) goto Lb7
            Ub.p r2 = new Ub.p
            r4 = 25691(0x645b, float:3.6001E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            r2.<init>(r4)
            r8.d(r2)
            r0.f7596a = r6
            r0.f7597b = r7
            r0.f7600e = r3
            Qb.D0 r8 = (Qb.D0) r8
        L5d:
            java.lang.Object r2 = r8.E()
            boolean r4 = r2 instanceof Qb.InterfaceC0212o0
            if (r4 != 0) goto L6f
            kotlin.coroutines.CoroutineContext r8 = r0.get$context()
            Qb.L.g(r8)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            goto Lb4
        L6f:
            int r2 = r8.T(r2)
            if (r2 < 0) goto L5d
            Qb.k r2 = new Qb.k
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r3, r4)
            r2.s()
            Qb.Z r4 = new Qb.Z
            r5 = 3
            r4.<init>(r2, r5)
            r5 = 0
            Qb.Y r8 = r8.J(r5, r3, r4)
            Qb.h r4 = new Qb.h
            r5 = 1
            r4.<init>(r8, r5)
            r2.u(r4)
            java.lang.Object r8 = r2.r()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r2) goto La2
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        La2:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r0) goto La9
            goto Lab
        La9:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        Lab:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r0) goto Lb2
            goto Lb4
        Lb2:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        Lb4:
            if (r8 != r1) goto Lb7
            return r1
        Lb7:
            r0 = r6
        Lb8:
            kotlin.jvm.internal.Ref$ObjectRef r8 = r0.f7601a
            Ub.k r1 = new Ub.k
            Tb.i r2 = r0.f7604d
            Ub.o r4 = r0.f7603c
            r5 = 0
            r1.<init>(r4, r2, r7, r5)
            Qb.I r7 = r0.f7602b
            Qb.K0 r7 = Qb.L.j(r7, r5, r1, r3)
            r8.element = r7
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ub.m.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
