package com.mapbox.common;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/common/MapboxOptions;", "", "()V", "value", "", "accessToken", "getAccessToken$annotations", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxOptions {
    public static final MapboxOptions INSTANCE = new MapboxOptions();

    private MapboxOptions() {
    }

    public static final String getAccessToken() {
        String accessToken = MapboxOptionsImpl.getAccessToken();
        Intrinsics.checkNotNullExpressionValue(accessToken, "getAccessToken()");
        return accessToken;
    }

    @JvmStatic
    public static /* synthetic */ void getAccessToken$annotations() {
    }

    public static final void setAccessToken(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        MapboxOptionsImpl.setAccessToken(value);
    }
}
