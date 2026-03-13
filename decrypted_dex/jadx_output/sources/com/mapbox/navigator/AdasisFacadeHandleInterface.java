package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface AdasisFacadeHandleInterface {
    void resetAdasisMessageCallback();

    void setAdasisMessageCallback(ADASISv2MessageCallback aDASISv2MessageCallback, AdasisConfig adasisConfig);

    void triggerResetOfEhProvider();
}
