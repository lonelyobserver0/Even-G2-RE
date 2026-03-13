package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class VoiceInstruction implements Serializable {
    private final String announcement;
    private final int index;
    private final float remainingStepDistance;
    private final String ssmlAnnouncement;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public VoiceInstruction(String str, String str2, float f10, int i3) {
        this.ssmlAnnouncement = str;
        this.announcement = str2;
        this.remainingStepDistance = f10;
        this.index = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VoiceInstruction voiceInstruction = (VoiceInstruction) obj;
        return Objects.equals(this.ssmlAnnouncement, voiceInstruction.ssmlAnnouncement) && Objects.equals(this.announcement, voiceInstruction.announcement) && PartialEq.compare(this.remainingStepDistance, voiceInstruction.remainingStepDistance) && this.index == voiceInstruction.index;
    }

    public String getAnnouncement() {
        return this.announcement;
    }

    public int getIndex() {
        return this.index;
    }

    public float getRemainingStepDistance() {
        return this.remainingStepDistance;
    }

    public String getSsmlAnnouncement() {
        return this.ssmlAnnouncement;
    }

    public int hashCode() {
        return Objects.hash(this.ssmlAnnouncement, this.announcement, Float.valueOf(this.remainingStepDistance), Integer.valueOf(this.index));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ssmlAnnouncement: ");
        h.z(sb2, this.ssmlAnnouncement, ", announcement: ");
        h.z(sb2, this.announcement, ", remainingStepDistance: ");
        b.n(this.remainingStepDistance, sb2, ", index: ");
        return b.g(this.index, "]", sb2);
    }
}
