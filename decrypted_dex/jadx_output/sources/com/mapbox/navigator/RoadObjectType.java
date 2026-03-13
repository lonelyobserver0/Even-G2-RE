package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum RoadObjectType {
    INCIDENT(StubApp.getString2(15393)),
    TOLL_COLLECTION_POINT(StubApp.getString2(15395)),
    BORDER_CROSSING(StubApp.getString2(15397)),
    TUNNEL(StubApp.getString2(15150)),
    RESTRICTED_AREA(StubApp.getString2(15399)),
    SERVICE_AREA(StubApp.getString2(15401)),
    BRIDGE(StubApp.getString2(15403)),
    RAILWAY_CROSSING(StubApp.getString2(15405)),
    JCT(StubApp.getString2(15407)),
    IC(StubApp.getString2(15408)),
    CUSTOM(StubApp.getString2(15164)),
    NOTIFICATION(StubApp.getString2(9326)),
    MERGING_AREA(StubApp.getString2(15411));

    private String str;

    RoadObjectType(String str) {
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
