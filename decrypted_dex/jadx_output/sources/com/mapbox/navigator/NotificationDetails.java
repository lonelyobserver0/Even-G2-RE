package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class NotificationDetails implements Serializable {
    private final String actualValue;
    private final String message;
    private final String requestedValue;
    private final String unit;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public NotificationDetails(String str, String str2, String str3, String str4) {
        this.requestedValue = str;
        this.actualValue = str2;
        this.unit = str3;
        this.message = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotificationDetails notificationDetails = (NotificationDetails) obj;
        return Objects.equals(this.requestedValue, notificationDetails.requestedValue) && Objects.equals(this.actualValue, notificationDetails.actualValue) && Objects.equals(this.unit, notificationDetails.unit) && Objects.equals(this.message, notificationDetails.message);
    }

    public String getActualValue() {
        return this.actualValue;
    }

    public String getMessage() {
        return this.message;
    }

    public String getRequestedValue() {
        return this.requestedValue;
    }

    public String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        return Objects.hash(this.requestedValue, this.actualValue, this.unit, this.message);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[requestedValue: ");
        h.z(sb2, this.requestedValue, ", actualValue: ");
        h.z(sb2, this.actualValue, ", unit: ");
        h.z(sb2, this.unit, ", message: ");
        return h.t(sb2, this.message, "]");
    }
}
