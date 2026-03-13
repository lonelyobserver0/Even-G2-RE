package com.mapbox.navigation.base.route;

import Qb.I;
import android.os.SystemClock;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.common.LoggingLevel;
import com.stub.StubApp;
import java.net.URL;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f12489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12490b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j, String str, Continuation continuation) {
        super(2, continuation);
        this.f12489a = j;
        this.f12490b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f12489a, this.f12490b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.f12489a;
        RouteOptions fromUrl = RouteOptions.fromUrl(new URL(this.f12490b));
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
            D9.l.d(StubApp.getString2(14637) + fromUrl.toUrl(StubApp.getString2(4446)) + StubApp.getString2(14631) + elapsedRealtime2 + StubApp.getString2(6642), StubApp.getString2(9621));
        }
        return new b(fromUrl, j, elapsedRealtime2);
    }
}
