package com.mapbox.maps;

import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/MapboxConcurrentGeometryModificationException;", "Ljava/util/ConcurrentModificationException;", "Lkotlin/ConcurrentModificationException;", "exceptionText", "", "sourceId", "(Ljava/lang/String;Ljava/lang/String;)V", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxConcurrentGeometryModificationException extends ConcurrentModificationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxConcurrentGeometryModificationException(String exceptionText, String sourceId) {
        super(exceptionText);
        Intrinsics.checkNotNullParameter(exceptionText, "exceptionText");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
    }
}
