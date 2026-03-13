package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MovementInfo implements Serializable {
    private final HashMap<MovementMode, Integer> movementMode;
    private final MovementModeProvider movementProvider;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MovementInfo(HashMap<MovementMode, Integer> hashMap, MovementModeProvider movementModeProvider) {
        this.movementMode = hashMap;
        this.movementProvider = movementModeProvider;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MovementInfo movementInfo = (MovementInfo) obj;
        return Objects.equals(this.movementMode, movementInfo.movementMode) && Objects.equals(this.movementProvider, movementInfo.movementProvider);
    }

    public HashMap<MovementMode, Integer> getMovementMode() {
        return this.movementMode;
    }

    public MovementModeProvider getMovementProvider() {
        return this.movementProvider;
    }

    public int hashCode() {
        return Objects.hash(this.movementMode, this.movementProvider);
    }

    public String toString() {
        return "[movementMode: " + RecordUtils.fieldToString(this.movementMode) + ", movementProvider: " + RecordUtils.fieldToString(this.movementProvider) + "]";
    }
}
