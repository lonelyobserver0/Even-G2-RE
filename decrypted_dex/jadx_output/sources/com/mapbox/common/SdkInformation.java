package com.mapbox.common;

import Xa.h;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class SdkInformation implements Serializable {
    private final String name;
    private final String packageName;
    private final String version;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SdkInformation(String str, String str2, String str3) {
        this.name = str;
        this.version = str2;
        this.packageName = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SdkInformation sdkInformation = (SdkInformation) obj;
        return Objects.equals(this.name, sdkInformation.name) && Objects.equals(this.version, sdkInformation.version) && Objects.equals(this.packageName, sdkInformation.packageName);
    }

    public String getName() {
        return this.name;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.version, this.packageName);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[name: ");
        h.z(sb2, this.name, ", version: ");
        h.z(sb2, this.version, ", packageName: ");
        return h.t(sb2, this.packageName, "]");
    }
}
