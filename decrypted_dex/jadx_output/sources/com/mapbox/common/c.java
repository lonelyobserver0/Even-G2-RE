package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f12380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Expected f12381c;

    public /* synthetic */ c(Map.Entry entry, Expected expected, int i3) {
        this.f12379a = i3;
        this.f12380b = entry;
        this.f12381c = expected;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12379a) {
            case 0:
                LifecycleMonitorAndroid.notifyPendingCallbacks$lambda$20$lambda$18$lambda$17(this.f12380b, this.f12381c);
                break;
            default:
                LifecycleMonitorAndroid.notifyPendingCallbacks$lambda$14$lambda$12$lambda$11(this.f12380b, this.f12381c);
                break;
        }
    }
}
