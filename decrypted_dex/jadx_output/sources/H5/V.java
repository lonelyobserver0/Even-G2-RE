package H5;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import x5.InterfaceC1913d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class V implements S {

    /* renamed from: f, reason: collision with root package name */
    public static final double f2806f = Math.random();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f2807g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final R4.h f2808a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1913d f2809b;

    /* renamed from: c, reason: collision with root package name */
    public final L5.j f2810c;

    /* renamed from: d, reason: collision with root package name */
    public final C0079l f2811d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f2812e;

    public V(R4.h firebaseApp, InterfaceC1913d firebaseInstallations, L5.j sessionSettings, C0079l eventGDTLogger, CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(sessionSettings, "sessionSettings");
        Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f2808a = firebaseApp;
        this.f2809b = firebaseInstallations;
        this.f2810c = sessionSettings;
        this.f2811d = eventGDTLogger;
        this.f2812e = backgroundDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(H5.V r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof H5.U
            if (r0 == 0) goto L13
            r0 = r6
            H5.U r0 = (H5.U) r0
            int r1 = r0.f2805d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2805d = r1
            goto L18
        L13:
            H5.U r0 = new H5.U
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f2803b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2805d
            r3 = 1
            r4 = 2579(0xa13, float:3.614E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L32
            H5.V r5 = r0.f2802a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L59
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r6 = 275(0x113, float:3.85E-43)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.ResultKt.throwOnFailure(r6)
            r6 = 2582(0xa16, float:3.618E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            android.util.Log.d(r4, r6)
            r0.f2802a = r5
            r0.f2805d = r3
            L5.j r6 = r5.f2810c
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            L5.j r6 = r5.f2810c
            L5.o r0 = r6.f4234a
            java.lang.Boolean r0 = r0.a()
            if (r0 == 0) goto L68
            boolean r6 = r0.booleanValue()
            goto L76
        L68:
            L5.o r6 = r6.f4235b
            java.lang.Boolean r6 = r6.a()
            if (r6 == 0) goto L75
            boolean r6 = r6.booleanValue()
            goto L76
        L75:
            r6 = r3
        L76:
            r0 = 0
            if (r6 != 0) goto L88
            r5 = 2583(0xa17, float:3.62E-42)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            android.util.Log.d(r4, r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r5
        L88:
            L5.j r5 = r5.f2810c
            double r5 = r5.a()
            double r1 = H5.V.f2806f
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 > 0) goto L99
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r5
        L99:
            r5 = 2584(0xa18, float:3.621E-42)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            android.util.Log.d(r4, r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.V.a(H5.V, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
