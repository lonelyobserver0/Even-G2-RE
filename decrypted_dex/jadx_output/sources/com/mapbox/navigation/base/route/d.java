package com.mapbox.navigation.base.route;

import Qb.I;
import android.os.SystemClock;
import com.mapbox.api.directions.v5.models.DirectionsResponse;
import com.mapbox.bindgen.DataRef;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.TimeSource;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f12487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataRef f12488b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j, DataRef dataRef, Continuation continuation) {
        super(2, continuation);
        this.f12487a = j;
        this.f12488b = dataRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f12487a, this.f12488b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [T, com.mapbox.navigation.base.route.b] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.f12487a;
        E7.a aVar = E7.a.f1927a;
        boolean a3 = E7.a.a();
        String string2 = StubApp.getString2(14634);
        String string22 = StubApp.getString2(9621);
        String string23 = StubApp.getString2(6642);
        String string24 = StubApp.getString2(14631);
        String string25 = StubApp.getString2(14635);
        DataRef dataRef = this.f12488b;
        if (!a3) {
            DirectionsResponse b2 = i.b(dataRef);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            String name = Thread.currentThread().getName();
            D9.l.d(string25 + b2.uuid() + string24 + elapsedRealtime2 + string23, string22);
            Intrinsics.checkNotNullExpressionValue(name, string2);
            return new b(b2, j, elapsedRealtime2, name);
        }
        String string26 = StubApp.getString2(14636);
        E7.a.c(string26);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            long m1480markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
            DirectionsResponse b10 = i.b(dataRef);
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
            String name2 = Thread.currentThread().getName();
            D9.l.d(string25 + b10.uuid() + string24 + elapsedRealtime3 + string23, string22);
            Intrinsics.checkNotNullExpressionValue(name2, string2);
            objectRef.element = new b(b10, j, elapsedRealtime3, name2);
            Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto));
            E7.a.b(string26);
            return objectRef.element;
        } catch (Throwable th) {
            E7.a.b(string26);
            throw th;
        }
    }
}
