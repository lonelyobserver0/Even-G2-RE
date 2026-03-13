package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AppMetadata implements Serializable {
    private final String name;
    private final String sessionId;
    private final String userId;
    private final String version;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AppMetadata(String str, String str2, String str3, String str4) {
        this.name = str;
        this.version = str2;
        this.userId = str3;
        this.sessionId = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppMetadata appMetadata = (AppMetadata) obj;
        return Objects.equals(this.name, appMetadata.name) && Objects.equals(this.version, appMetadata.version) && Objects.equals(this.userId, appMetadata.userId) && Objects.equals(this.sessionId, appMetadata.sessionId);
    }

    public String getName() {
        return this.name;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.version, this.userId, this.sessionId);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[name: ");
        h.z(sb2, this.name, ", version: ");
        h.z(sb2, this.version, ", userId: ");
        h.z(sb2, this.userId, ", sessionId: ");
        return h.t(sb2, this.sessionId, "]");
    }
}
