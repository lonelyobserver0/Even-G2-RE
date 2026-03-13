package com.mapbox.maps;

import com.mapbox.maps.MapPlayerOptions;
import com.mapbox.maps.MapRecorderOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a%\u0010\u0007\u001a\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"mapPlayerOptions", "Lcom/mapbox/maps/MapPlayerOptions;", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/MapPlayerOptions$Builder;", "", "Lkotlin/ExtensionFunctionType;", "mapRecorderOptions", "Lcom/mapbox/maps/MapRecorderOptions;", "Lcom/mapbox/maps/MapRecorderOptions$Builder;", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxMapRecorderKt {
    public static final MapPlayerOptions mapPlayerOptions(Function1<? super MapPlayerOptions.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MapPlayerOptions.Builder builder = new MapPlayerOptions.Builder();
        block.invoke(builder);
        MapPlayerOptions mapPlayerOptions = builder.build();
        Intrinsics.checkNotNullExpressionValue(mapPlayerOptions, "mapPlayerOptions");
        return mapPlayerOptions;
    }

    public static final MapRecorderOptions mapRecorderOptions(Function1<? super MapRecorderOptions.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MapRecorderOptions.Builder builder = new MapRecorderOptions.Builder();
        block.invoke(builder);
        MapRecorderOptions build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().apply(block).build()");
        return build;
    }
}
