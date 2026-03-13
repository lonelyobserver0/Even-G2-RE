package com.mapbox.maps;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "com.mapbox.maps.UtilsKt", f = "Utils.kt", i = {0, 0, 0}, l = {63}, m = "safeSystemCall", n = {"fallback", "logTag", "timeoutMs"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class UtilsKt$safeSystemCall$1<T> extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public UtilsKt$safeSystemCall$1(Continuation<? super UtilsKt$safeSystemCall$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UtilsKt.safeSystemCall(0L, null, null, null, null, this);
    }
}
