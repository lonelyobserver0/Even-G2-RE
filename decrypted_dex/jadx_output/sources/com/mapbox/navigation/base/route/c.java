package com.mapbox.navigation.base.route;

import Qb.I;
import android.os.SystemClock;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigator.RouteInterface;
import com.stub.StubApp;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import z7.C2013a;
import z7.C2015c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f12483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataRef f12484b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12485c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j, DataRef dataRef, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f12483a = j;
        this.f12484b = dataRef;
        this.f12485c = str;
        this.f12486d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f12483a, this.f12484b, this.f12485c, this.f12486d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [T, com.mapbox.navigation.base.route.b] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.f12483a;
        E7.a aVar = E7.a.f1927a;
        boolean a3 = E7.a.a();
        C2013a c2013a = C2015c.f24134a;
        String string2 = StubApp.getString2(9621);
        String string22 = StubApp.getString2(6642);
        String string23 = StubApp.getString2(14631);
        String string24 = StubApp.getString2(1061);
        String str = null;
        String string25 = StubApp.getString2(14632);
        DataRef dataRef = this.f12484b;
        String str2 = this.f12485c;
        String str3 = this.f12486d;
        if (!a3) {
            Expected a9 = c2013a.a(dataRef, str2, str3);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            StringBuilder sb2 = new StringBuilder(string25);
            List list = (List) a9.getValue();
            if (list != null) {
                Intrinsics.checkNotNullExpressionValue(list, string24);
                RouteInterface routeInterface = (RouteInterface) CollectionsKt.firstOrNull(list);
                if (routeInterface != null) {
                    str = routeInterface.getResponseUuid();
                }
            }
            sb2.append(str);
            sb2.append(string23);
            sb2.append(elapsedRealtime2);
            sb2.append(string22);
            D9.l.d(sb2.toString(), string2);
            return new b(a9, j, elapsedRealtime2);
        }
        String string26 = StubApp.getString2(14633);
        E7.a.c(string26);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            long m1480markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
            Expected a10 = c2013a.a(dataRef, str2, str3);
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
            StringBuilder sb3 = new StringBuilder(string25);
            List list2 = (List) a10.getValue();
            if (list2 != null) {
                Intrinsics.checkNotNullExpressionValue(list2, string24);
                RouteInterface routeInterface2 = (RouteInterface) CollectionsKt.firstOrNull(list2);
                if (routeInterface2 != null) {
                    str = routeInterface2.getResponseUuid();
                }
            }
            sb3.append(str);
            sb3.append(string23);
            sb3.append(elapsedRealtime3);
            sb3.append(string22);
            D9.l.d(sb3.toString(), string2);
            objectRef.element = new b(a10, j, elapsedRealtime3);
            Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto));
            E7.a.b(string26);
            return objectRef.element;
        } catch (Throwable th) {
            E7.a.b(string26);
            throw th;
        }
    }
}
