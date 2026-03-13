package x9;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final Ec.d f22966a;

    /* renamed from: b, reason: collision with root package name */
    public final C1924c f22967b;

    public K(Ec.d provider, C1924c applier) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(applier, "applier");
        this.f22966a = provider;
        this.f22967b = applier;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.CoroutineContext r7, com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof x9.J
            if (r0 == 0) goto L13
            r0 = r9
            x9.J r0 = (x9.J) r0
            int r1 = r0.f22965d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22965d = r1
            goto L18
        L13:
            x9.J r0 = new x9.J
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f22963b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f22965d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2b
            x9.K r7 = r0.f22962a
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L5d
            goto L49
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r8 = 275(0x113, float:3.85E-43)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.ResultKt.throwOnFailure(r9)
            Ec.d r9 = r6.f22966a     // Catch: java.lang.Throwable -> L5d
            r0.f22962a = r6     // Catch: java.lang.Throwable -> L5d
            r0.f22965d = r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r9 = r9.y(r7, r8, r0)     // Catch: java.lang.Throwable -> L5d
            if (r9 != r1) goto L48
            return r1
        L48:
            r7 = r6
        L49:
            r3 = r9
            com.mapbox.maps.StylePropertyValue r3 = (com.mapbox.maps.StylePropertyValue) r3     // Catch: java.lang.Throwable -> L5d
            x9.c r7 = r7.f22967b     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = "24203"
            java.lang.String r1 = com.stub.StubApp.getString2(r1)     // Catch: java.lang.Throwable -> L5d
            com.mapbox.navigation.ui.maps.internal.route.line.RouteLineProviderBasedExpressionEventData r0 = new com.mapbox.navigation.ui.maps.internal.route.line.RouteLineProviderBasedExpressionEventData     // Catch: java.lang.Throwable -> L5d
            r5 = 0
            r2 = 0
            r4 = 2
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L5d
            return r0
        L5d:
            com.mapbox.navigation.ui.maps.internal.route.line.RouteLineNoOpExpressionEventData r7 = new com.mapbox.navigation.ui.maps.internal.route.line.RouteLineNoOpExpressionEventData
            r7.<init>()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.K.a(kotlin.coroutines.CoroutineContext, com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
