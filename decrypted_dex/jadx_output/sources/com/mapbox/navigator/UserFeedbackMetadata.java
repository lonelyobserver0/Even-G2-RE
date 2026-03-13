package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class UserFeedbackMetadata implements Serializable {
    private final String feedbackId;
    private final List<FixLocation> locationsAfter;
    private final List<FixLocation> locationsBefore;
    private final Step step;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public UserFeedbackMetadata(String str, List<FixLocation> list, List<FixLocation> list2, Step step) {
        this.feedbackId = str;
        this.locationsBefore = list;
        this.locationsAfter = list2;
        this.step = step;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserFeedbackMetadata userFeedbackMetadata = (UserFeedbackMetadata) obj;
        return Objects.equals(this.feedbackId, userFeedbackMetadata.feedbackId) && Objects.equals(this.locationsBefore, userFeedbackMetadata.locationsBefore) && Objects.equals(this.locationsAfter, userFeedbackMetadata.locationsAfter) && Objects.equals(this.step, userFeedbackMetadata.step);
    }

    public String getFeedbackId() {
        return this.feedbackId;
    }

    public List<FixLocation> getLocationsAfter() {
        return this.locationsAfter;
    }

    public List<FixLocation> getLocationsBefore() {
        return this.locationsBefore;
    }

    public Step getStep() {
        return this.step;
    }

    public int hashCode() {
        return Objects.hash(this.feedbackId, this.locationsBefore, this.locationsAfter, this.step);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[feedbackId: ");
        h.z(sb2, this.feedbackId, ", locationsBefore: ");
        b.v(", locationsAfter: ", sb2, this.locationsBefore);
        b.v(", step: ", sb2, this.locationsAfter);
        sb2.append(RecordUtils.fieldToString(this.step));
        sb2.append("]");
        return sb2.toString();
    }
}
