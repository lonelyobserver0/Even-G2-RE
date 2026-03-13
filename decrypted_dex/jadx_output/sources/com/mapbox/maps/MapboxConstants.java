package com.mapbox.maps;

import com.stub.StubApp;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"CORE_SHARED_LIBRARY_NAME", "", "MAPBOX_LOCALE", "Ljava/util/Locale;", "getMAPBOX_LOCALE", "()Ljava/util/Locale;", "MAP_SHARED_LIBRARY_NAME", "MAXIMUM_BEARING", "", "MAXIMUM_ZOOM", "", "MINIMUM_BEARING", "MINIMUM_ZOOM", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@JvmName(name = "MapboxConstants")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxConstants {
    private static final Locale MAPBOX_LOCALE;
    public static final double MAXIMUM_BEARING = 360.0d;
    public static final float MAXIMUM_ZOOM = 25.5f;
    public static final double MINIMUM_BEARING = 0.0d;
    public static final float MINIMUM_ZOOM = 0.0f;
    public static final String CORE_SHARED_LIBRARY_NAME = StubApp.getString2(13260);
    public static final String MAP_SHARED_LIBRARY_NAME = StubApp.getString2(13993);

    static {
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        MAPBOX_LOCALE = US;
    }

    public static final Locale getMAPBOX_LOCALE() {
        return MAPBOX_LOCALE;
    }
}
