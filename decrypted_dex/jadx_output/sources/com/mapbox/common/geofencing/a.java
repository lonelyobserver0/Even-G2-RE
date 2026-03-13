package com.mapbox.common.geofencing;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12393b;

    public /* synthetic */ a(long j, int i3) {
        this.f12392a = i3;
        this.f12393b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12392a) {
            case 0:
                AddFeatureCallbackNative._init_$lambda$0(this.f12393b);
                break;
            case 1:
                AddObserverCallbackNative._init_$lambda$0(this.f12393b);
                break;
            case 2:
                ClearFeaturesCallbackNative._init_$lambda$0(this.f12393b);
                break;
            case 3:
                ConfigureCallbackNative._init_$lambda$0(this.f12393b);
                break;
            case 4:
                GeofencingUtilsUserConsentResponseCallbackNative._init_$lambda$0(this.f12393b);
                break;
            case 5:
                GetFeatureCallbackNative._init_$lambda$0(this.f12393b);
                break;
            case 6:
                GetOptionsCallbackNative._init_$lambda$0(this.f12393b);
                break;
            case 7:
                RemoveFeatureCallbackNative._init_$lambda$0(this.f12393b);
                break;
            case 8:
                RemoveObserverCallbackNative._init_$lambda$0(this.f12393b);
                break;
            case 9:
                GeofencingFactory.setPeer$lambda$0(this.f12393b);
                break;
            case 10:
                GeofencingObserverNative._init_$lambda$0(this.f12393b);
                break;
            case 11:
                GeofencingServiceNative._init_$lambda$0(this.f12393b);
                break;
            default:
                GeofencingUtils.setPeer$lambda$0(this.f12393b);
                break;
        }
    }
}
