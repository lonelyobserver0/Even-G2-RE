package com.mapbox.common;

import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface SdkInfoRegistryInterface {
    List<SdkInformation> getSdkInformation();

    void registerSdkInformation(SdkInformation sdkInformation);
}
