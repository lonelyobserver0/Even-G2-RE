package com.mapbox.maps.coroutine;

import com.mapbox.maps.Style;
import com.stub.StubApp;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public /* synthetic */ class MapboxMapExtKt$awaitLoadStyle$2$1 implements Style.OnStyleLoaded, FunctionAdapter {
    final /* synthetic */ Continuation<Style> $tmp0;

    /* JADX WARN: Multi-variable type inference failed */
    public MapboxMapExtKt$awaitLoadStyle$2$1(Continuation<? super Style> continuation) {
        this.$tmp0 = continuation;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Style.OnStyleLoaded) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, ContinuationKt.class, StubApp.getString2(11739), StubApp.getString2(11738), 1);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.mapbox.maps.Style.OnStyleLoaded
    public final void onStyleLoaded(Style p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        this.$tmp0.resumeWith(Result.m40constructorimpl(p02));
    }
}
