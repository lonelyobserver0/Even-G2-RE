package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class TestingContext implements Serializable {
    private final String projectName;
    private final String vehicleName;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public TestingContext(String str, String str2) {
        this.vehicleName = str;
        this.projectName = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestingContext testingContext = (TestingContext) obj;
        return Objects.equals(this.vehicleName, testingContext.vehicleName) && Objects.equals(this.projectName, testingContext.projectName);
    }

    public String getProjectName() {
        return this.projectName;
    }

    public String getVehicleName() {
        return this.vehicleName;
    }

    public int hashCode() {
        return Objects.hash(this.vehicleName, this.projectName);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[vehicleName: ");
        h.z(sb2, this.vehicleName, ", projectName: ");
        return h.t(sb2, this.projectName, "]");
    }
}
