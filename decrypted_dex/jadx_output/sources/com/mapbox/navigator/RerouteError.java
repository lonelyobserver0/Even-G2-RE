package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RerouteError implements Serializable {
    private final String message;
    private final List<RouterError> routerErrors;
    private final RerouteErrorType type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RerouteError(String str, RerouteErrorType rerouteErrorType, List<RouterError> list) {
        this.message = str;
        this.type = rerouteErrorType;
        this.routerErrors = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RerouteError rerouteError = (RerouteError) obj;
        return Objects.equals(this.message, rerouteError.message) && Objects.equals(this.type, rerouteError.type) && Objects.equals(this.routerErrors, rerouteError.routerErrors);
    }

    public String getMessage() {
        return this.message;
    }

    public List<RouterError> getRouterErrors() {
        return this.routerErrors;
    }

    public RerouteErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.message, this.type, this.routerErrors);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[message: ");
        h.z(sb2, this.message, ", type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", routerErrors: ");
        return b.i("]", sb2, this.routerErrors);
    }
}
