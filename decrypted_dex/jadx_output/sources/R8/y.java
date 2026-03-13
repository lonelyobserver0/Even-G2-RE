package R8;

import Qb.C0208m0;
import Z9.C0366a;
import f4.C0879c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final C0879c f6343a;

    /* renamed from: b, reason: collision with root package name */
    public final C0366a f6344b;

    /* renamed from: c, reason: collision with root package name */
    public final C2.i f6345c;

    /* renamed from: d, reason: collision with root package name */
    public final q8.d f6346d;

    public y(C0879c routesRefreshDataProvider, C0366a evRefreshDataProvider, C2.i routeDiffProvider, q8.d routeRefresh) {
        C0208m0 globalScope = C0208m0.f5881a;
        Intrinsics.checkNotNullParameter(routesRefreshDataProvider, "routesRefreshDataProvider");
        Intrinsics.checkNotNullParameter(evRefreshDataProvider, "evRefreshDataProvider");
        Intrinsics.checkNotNullParameter(routeDiffProvider, "routeDiffProvider");
        Intrinsics.checkNotNullParameter(routeRefresh, "routeRefresh");
        Intrinsics.checkNotNullParameter(globalScope, "globalScope");
        this.f6343a = routesRefreshDataProvider;
        this.f6344b = evRefreshDataProvider;
        this.f6345c = routeDiffProvider;
        this.f6346d = routeRefresh;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /* JADX WARN: Type inference failed for: r1v31, types: [T, java.lang.Long, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(R8.y r29, com.mapbox.navigation.base.route.g r30, u8.h r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instructions count: 1462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R8.y.a(R8.y, com.mapbox.navigation.base.route.g, u8.h, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r10, long r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R8.y.b(java.util.List, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r15 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(m8.w r12, long r13, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof R8.s
            if (r0 == 0) goto L13
            r0 = r15
            R8.s r0 = (R8.s) r0
            int r1 = r0.f6324c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6324c = r1
            goto L18
        L13:
            R8.s r0 = new R8.s
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f6322a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6324c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r15)
            return r15
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r13 = 275(0x113, float:3.85E-43)
            java.lang.String r13 = com.stub.StubApp.getString2(r13)
            r12.<init>(r13)
            throw r12
        L39:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L52
        L3d:
            kotlin.ResultKt.throwOnFailure(r15)
            R8.v r5 = new R8.v
            r10 = 0
            r9 = r11
            r6 = r12
            r7 = r13
            r5.<init>(r6, r7, r9, r10)
            r0.f6324c = r4
            java.lang.Object r15 = Qb.J.c(r5, r0)
            if (r15 != r1) goto L52
            goto L5c
        L52:
            java.util.Collection r15 = (java.util.Collection) r15
            r0.f6324c = r3
            java.lang.Object r12 = Qb.L.d(r15, r0)
            if (r12 != r1) goto L5d
        L5c:
            return r1
        L5d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: R8.y.c(m8.w, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
