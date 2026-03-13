package com.mapbox.maps.coroutine;

import com.mapbox.maps.CameraOptions;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public /* synthetic */ class MapboxMapExtKt$cameraForCoordinates$2$1 extends FunctionReferenceImpl implements Function1<CameraOptions, Unit> {
    public MapboxMapExtKt$cameraForCoordinates$2$1(Object obj) {
        super(1, obj, ContinuationKt.class, StubApp.getString2(11739), StubApp.getString2(11738), 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CameraOptions cameraOptions) {
        invoke2(cameraOptions);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CameraOptions p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((Continuation) this.receiver).resumeWith(Result.m40constructorimpl(p02));
    }
}
