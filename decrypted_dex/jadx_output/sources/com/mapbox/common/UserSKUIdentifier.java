package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum UserSKUIdentifier {
    MAPS_MAUS(StubApp.getString2(13526)),
    VISION_MAUS(StubApp.getString2(13528)),
    VISION_FLEET_MAUS(StubApp.getString2(13530)),
    NAV2_SES_MAU(StubApp.getString2(13532)),
    NAV3_UX_MAU(StubApp.getString2(13534)),
    NAV3_CORE_MAU(StubApp.getString2(13536)),
    GEOFENCING_MAU(StubApp.getString2(13538)),
    UNITY_MAUS(StubApp.getString2(13540));

    private String str;

    UserSKUIdentifier(String str) {
        this.str = str;
    }

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
