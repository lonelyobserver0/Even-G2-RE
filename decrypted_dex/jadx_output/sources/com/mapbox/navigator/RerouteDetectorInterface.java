package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RerouteDetectorInterface {
    void cancelReroute();

    void forceReroute(ForceRerouteReason forceRerouteReason);

    void forceReroute(ForceRerouteReason forceRerouteReason, ForceRerouteCallback forceRerouteCallback);

    boolean isReroute();
}
