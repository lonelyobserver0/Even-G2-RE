package com.mapbox.common.location;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class IntervalSettings implements Serializable {
    private final Long interval;
    private final Long maximumInterval;
    private final Long minimumInterval;

    /* renamed from: com.mapbox.common.location.IntervalSettings$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private Long interval;
        private Long maximumInterval;
        private Long minimumInterval;

        public IntervalSettings build() {
            return new IntervalSettings(this.minimumInterval, this.maximumInterval, this.interval, null);
        }

        public Builder interval(Long l9) {
            this.interval = l9;
            return this;
        }

        public Builder maximumInterval(Long l9) {
            this.maximumInterval = l9;
            return this;
        }

        public Builder minimumInterval(Long l9) {
            this.minimumInterval = l9;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public /* synthetic */ IntervalSettings(Long l9, Long l10, Long l11, AnonymousClass1 anonymousClass1) {
        this(l9, l10, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntervalSettings intervalSettings = (IntervalSettings) obj;
        return Objects.equals(this.minimumInterval, intervalSettings.minimumInterval) && Objects.equals(this.maximumInterval, intervalSettings.maximumInterval) && Objects.equals(this.interval, intervalSettings.interval);
    }

    public Long getInterval() {
        return this.interval;
    }

    public Long getMaximumInterval() {
        return this.maximumInterval;
    }

    public Long getMinimumInterval() {
        return this.minimumInterval;
    }

    public int hashCode() {
        return Objects.hash(this.minimumInterval, this.maximumInterval, this.interval);
    }

    public Builder toBuilder() {
        return new Builder().minimumInterval(this.minimumInterval).maximumInterval(this.maximumInterval).interval(this.interval);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[minimumInterval: ");
        com.mapbox.common.b.u(this.minimumInterval, sb2, ", maximumInterval: ");
        com.mapbox.common.b.u(this.maximumInterval, sb2, ", interval: ");
        sb2.append(RecordUtils.fieldToString(this.interval));
        sb2.append("]");
        return sb2.toString();
    }

    private IntervalSettings(Long l9, Long l10, Long l11) {
        this.minimumInterval = l9;
        this.maximumInterval = l10;
        this.interval = l11;
    }
}
