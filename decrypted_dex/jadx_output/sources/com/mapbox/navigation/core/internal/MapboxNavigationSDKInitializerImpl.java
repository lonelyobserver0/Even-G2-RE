package com.mapbox.navigation.core.internal;

import R1.b;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.SdkInfoRegistry;
import com.mapbox.common.SdkInfoRegistryFactory;
import com.mapbox.common.SdkInformation;
import com.stub.StubApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import u8.f;
import u8.j;
import u8.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/mapbox/navigation/core/internal/MapboxNavigationSDKInitializerImpl;", "LR1/b;", "Lu8/f;", "<init>", "()V", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxNavigationSDKInitializerImpl implements b {
    @Override // R1.b
    public final Object create(Context context) {
        Pair pair;
        Intrinsics.checkNotNullParameter(context, "context");
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.g….GET_META_DATA,\n        )");
        Bundle bundle = applicationInfo.metaData;
        j jVar = Intrinsics.areEqual(bundle != null ? Boolean.valueOf(bundle.getBoolean(StubApp.getString2(14674))) : null, Boolean.TRUE) ? j.f21473b : j.f21472a;
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        k.f21475a = jVar;
        SdkInfoRegistry sdkInfoRegistryFactory = SdkInfoRegistryFactory.getInstance();
        int ordinal = k.f21475a.ordinal();
        if (ordinal == 0) {
            pair = TuplesKt.to(StubApp.getString2(2158), StubApp.getString2(2159));
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            pair = TuplesKt.to(StubApp.getString2(2156), StubApp.getString2(2157));
        }
        sdkInfoRegistryFactory.registerSdkInformation(new SdkInformation((String) pair.component1(), StubApp.getString2(2160), (String) pair.component2()));
        return f.f21465a;
    }

    @Override // R1.b
    public final List dependencies() {
        return CollectionsKt.mutableListOf(MapboxSDKCommonInitializerImpl.class);
    }
}
