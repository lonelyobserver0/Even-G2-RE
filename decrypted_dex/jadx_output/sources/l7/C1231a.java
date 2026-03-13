package l7;

import android.content.Context;
import com.mapbox.common.location.DeviceLocationProvider;
import i5.C1059c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: l7.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1231a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public long f16731a;

    /* renamed from: b, reason: collision with root package name */
    public int f16732b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16733c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f16734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DeviceLocationProvider f16735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1059c f16736f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1231a(Context context, DeviceLocationProvider deviceLocationProvider, C1059c c1059c, Continuation continuation) {
        super(2, continuation);
        this.f16734d = context;
        this.f16735e = deviceLocationProvider;
        this.f16736f = c1059c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1231a c1231a = new C1231a(this.f16734d, this.f16735e, this.f16736f, continuation);
        c1231a.f16733c = obj;
        return c1231a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1231a) create((Sb.v) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        if (Qb.S.a(r4, r8) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (Sb.t.a(r1, r9, r8) != r0) goto L19;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a6 -> B:12:0x00a9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f16732b
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2a
            if (r1 == r2) goto L1f
            if (r1 != r3) goto L12
            kotlin.ResultKt.throwOnFailure(r9)
            goto L88
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r9.<init>(r0)
            throw r9
        L1f:
            long r4 = r8.f16731a
            java.lang.Object r1 = r8.f16733c
            Sb.v r1 = (Sb.v) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto La9
        L2a:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.f16733c
            Sb.v r9 = (Sb.v) r9
            r4 = 500(0x1f4, double:2.47E-321)
            r1 = r9
        L34:
            android.content.Context r9 = r8.f16734d
            java.lang.String r6 = "applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
            java.lang.String r6 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r6)
            r6 = 141(0x8d, float:1.98E-43)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            int r6 = D.a.a(r9, r6)
            if (r6 != 0) goto L4e
            goto L5b
        L4e:
            r6 = 140(0x8c, float:1.96E-43)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            int r9 = D.a.a(r9, r6)
            if (r9 != 0) goto L8b
        L5b:
            c5.B r9 = new c5.B
            r2 = 19
            r9.<init>(r1, r2)
            com.mapbox.common.location.DeviceLocationProvider r2 = r8.f16735e
            com.mapbox.common.Cancelable r9 = r2.getLastLocation(r9)
            i5.c r4 = r8.f16736f
            r4.getClass()
            l7.m r4 = new l7.m
            r4.<init>(r9, r1)
            r2.addLocationObserver(r4)
            A9.m r9 = new A9.m
            r5 = 8
            r9.<init>(r5, r2, r4)
            r2 = 0
            r8.f16733c = r2
            r8.f16732b = r3
            java.lang.Object r9 = Sb.t.a(r1, r9, r8)
            if (r9 != r0) goto L88
            goto La8
        L88:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L8b:
            r9 = 18561(0x4881, float:2.601E-41)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            r6 = 20930(0x51c2, float:2.9329E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            com.mapbox.maps.MapboxLogger.logW(r9, r6)
            r8.f16733c = r1
            r8.f16731a = r4
            r8.f16732b = r2
            java.lang.Object r9 = Qb.S.a(r4, r8)
            if (r9 != r0) goto La9
        La8:
            return r0
        La9:
            long r6 = (long) r3
            long r4 = r4 * r6
            r6 = 5000(0x1388, double:2.4703E-320)
            long r4 = kotlin.ranges.RangesKt.coerceAtMost(r4, r6)
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.C1231a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
