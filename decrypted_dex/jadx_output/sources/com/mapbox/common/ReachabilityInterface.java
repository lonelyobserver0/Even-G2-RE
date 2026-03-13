package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface ReachabilityInterface {
    long addListener(ReachabilityChanged reachabilityChanged);

    NetworkStatus currentNetworkStatus();

    boolean isReachable();

    boolean removeListener(long j);
}
