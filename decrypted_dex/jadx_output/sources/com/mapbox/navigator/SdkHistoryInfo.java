package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SdkHistoryInfo implements Serializable {
    private final String sdkName;
    private final String sdkVersion;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SdkHistoryInfo(String str, String str2) {
        this.sdkVersion = str;
        this.sdkName = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SdkHistoryInfo sdkHistoryInfo = (SdkHistoryInfo) obj;
        return Objects.equals(this.sdkVersion, sdkHistoryInfo.sdkVersion) && Objects.equals(this.sdkName, sdkHistoryInfo.sdkName);
    }

    public String getSdkName() {
        return this.sdkName;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        return Objects.hash(this.sdkVersion, this.sdkName);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[sdkVersion: ");
        h.z(sb2, this.sdkVersion, ", sdkName: ");
        return h.t(sb2, this.sdkName, "]");
    }
}
