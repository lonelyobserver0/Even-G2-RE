package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CrashEvent implements Serializable {
    private final String appStartDate;
    private final HashMap<String, String> customData;
    private final boolean isSilent;
    private final String threadDetails;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public CrashEvent(boolean z2, String str, String str2, HashMap<String, String> hashMap) {
        this.isSilent = z2;
        this.threadDetails = str;
        this.appStartDate = str2;
        this.customData = hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CrashEvent crashEvent = (CrashEvent) obj;
        return this.isSilent == crashEvent.isSilent && Objects.equals(this.threadDetails, crashEvent.threadDetails) && Objects.equals(this.appStartDate, crashEvent.appStartDate) && Objects.equals(this.customData, crashEvent.customData);
    }

    public String getAppStartDate() {
        return this.appStartDate;
    }

    public HashMap<String, String> getCustomData() {
        return this.customData;
    }

    public boolean getIsSilent() {
        return this.isSilent;
    }

    public String getThreadDetails() {
        return this.threadDetails;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isSilent), this.threadDetails, this.appStartDate, this.customData);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[isSilent: ");
        h.A(this.isSilent, sb2, ", threadDetails: ");
        h.z(sb2, this.threadDetails, ", appStartDate: ");
        h.z(sb2, this.appStartDate, ", customData: ");
        sb2.append(RecordUtils.fieldToString(this.customData));
        sb2.append("]");
        return sb2.toString();
    }
}
