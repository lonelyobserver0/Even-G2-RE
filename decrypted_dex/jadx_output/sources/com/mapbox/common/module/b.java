package com.mapbox.common.module;

import com.mapbox.bindgen.Expected;
import com.mapbox.common.GetLifecycleStateCallback;
import com.mapbox.navigation.core.telemetry.events.LifecycleStateProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class b implements GetLifecycleStateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12407b;

    public /* synthetic */ b(Object obj, int i3) {
        this.f12406a = i3;
        this.f12407b = obj;
    }

    @Override // com.mapbox.common.GetLifecycleStateCallback
    public final void run(Expected expected) {
        switch (this.f12406a) {
            case 0:
                MapboxHttpClient.getLifeCycleStateCallback$lambda$4((MapboxHttpClient) this.f12407b, expected);
                break;
            default:
                LifecycleStateProvider.init$lambda$1((LifecycleStateProvider) this.f12407b, expected);
                break;
        }
    }
}
