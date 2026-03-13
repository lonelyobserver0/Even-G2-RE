package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.maps.interactions.standard.generated.StandardBuildingsState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"StandardBuildingsState", "Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsState;", "init", "Lkotlin/Function1;", "Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsState$Builder;", "", "Lkotlin/ExtensionFunctionType;", "sdk-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StandardBuildingsStateKt {
    public static final /* synthetic */ StandardBuildingsState StandardBuildingsState(Function1 init) {
        Intrinsics.checkNotNullParameter(init, "init");
        StandardBuildingsState.Builder builder = new StandardBuildingsState.Builder();
        init.invoke(builder);
        return builder.build();
    }
}
