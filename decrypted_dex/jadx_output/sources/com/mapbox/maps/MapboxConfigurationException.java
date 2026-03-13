package com.mapbox.maps;

import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/MapboxConfigurationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "message", "", "(Ljava/lang/String;)V", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxConfigurationException extends RuntimeException {
    public MapboxConfigurationException() {
        super(StubApp.getString2(13992));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxConfigurationException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
