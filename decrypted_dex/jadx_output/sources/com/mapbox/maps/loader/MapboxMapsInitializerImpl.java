package com.mapbox.maps.loader;

import R1.b;
import android.content.Context;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.core.module.CommonSingletonModuleProvider;
import com.mapbox.maps.assets.AssetManagerProvider;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MapboxMapsInitializerImpl implements b {
    @Override // R1.b
    public List<Class<? extends b>> dependencies() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MapboxSDKCommonInitializerImpl.class);
        return arrayList;
    }

    @Override // R1.b
    public MapboxMaps create(Context context) {
        CommonSingletonModuleProvider.INSTANCE.getLoaderInstance().load(StubApp.getString2(13993));
        new AssetManagerProvider().initialize(context.getAssets());
        return MapboxMaps.INSTANCE;
    }
}
