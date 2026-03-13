package com.mapbox.navigator;

import R1.b;
import android.content.Context;
import android.util.Log;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.core.module.CommonSingletonModuleProvider;
import com.stub.StubApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/mapbox/navigator/MapboxNavigationNativeInitializerImpl;", "LR1/b;", "Lcom/mapbox/navigator/MapboxNavigationNative;", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)Lcom/mapbox/navigator/MapboxNavigationNative;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "dash-native_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxNavigationNativeInitializerImpl implements b {
    @Override // R1.b
    public List<Class<? extends b>> dependencies() {
        return CollectionsKt.listOf(MapboxSDKCommonInitializerImpl.class);
    }

    @Override // R1.b
    public MapboxNavigationNative create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MapboxNavigationNative mapboxNavigationNative = MapboxNavigationNative.INSTANCE;
        mapboxNavigationNative.initialize(context);
        CommonSingletonModuleProvider.INSTANCE.getLoaderInstance().load(StubApp.getString2(15095));
        Log.i(StubApp.getString2(15096), StubApp.getString2(15097));
        return mapboxNavigationNative;
    }
}
