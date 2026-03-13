package com.mapbox.common;

import com.mapbox.common.Reachability;
import kotlin.jvm.functions.Function1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12391c;

    public /* synthetic */ f(int i3, Object obj, boolean z2) {
        this.f12389a = i3;
        this.f12391c = obj;
        this.f12390b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12389a) {
            case 0:
                ((Reachability.ReachabilityOfflineSwitchObserver) this.f12391c).lambda$statusChanged$0(this.f12390b);
                break;
            default:
                LifecycleUtils.hasServiceRunningInForeground$lambda$15$lambda$14$lambda$13((Function1) this.f12391c, this.f12390b);
                break;
        }
    }
}
