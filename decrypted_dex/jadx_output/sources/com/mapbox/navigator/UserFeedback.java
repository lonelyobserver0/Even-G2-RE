package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class UserFeedback implements Serializable {
    private final String description;
    private final List<String> feedbackSubType;
    private final String feedbackType;
    private final ScreenshotFormat screenshot;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public UserFeedback(String str, List<String> list, String str2, ScreenshotFormat screenshotFormat) {
        this.feedbackType = str;
        this.feedbackSubType = list;
        this.description = str2;
        this.screenshot = screenshotFormat;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserFeedback userFeedback = (UserFeedback) obj;
        return Objects.equals(this.feedbackType, userFeedback.feedbackType) && Objects.equals(this.feedbackSubType, userFeedback.feedbackSubType) && Objects.equals(this.description, userFeedback.description) && Objects.equals(this.screenshot, userFeedback.screenshot);
    }

    public String getDescription() {
        return this.description;
    }

    public List<String> getFeedbackSubType() {
        return this.feedbackSubType;
    }

    public String getFeedbackType() {
        return this.feedbackType;
    }

    public ScreenshotFormat getScreenshot() {
        return this.screenshot;
    }

    public int hashCode() {
        return Objects.hash(this.feedbackType, this.feedbackSubType, this.description, this.screenshot);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[feedbackType: ");
        h.z(sb2, this.feedbackType, ", feedbackSubType: ");
        b.v(", description: ", sb2, this.feedbackSubType);
        h.z(sb2, this.description, ", screenshot: ");
        sb2.append(RecordUtils.fieldToString(this.screenshot));
        sb2.append("]");
        return sb2.toString();
    }
}
