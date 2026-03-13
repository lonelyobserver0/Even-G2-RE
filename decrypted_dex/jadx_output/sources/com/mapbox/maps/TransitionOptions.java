package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class TransitionOptions implements Serializable {
    private final Long delay;
    private final Long duration;
    private final Boolean enablePlacementTransitions;

    /* renamed from: com.mapbox.maps.TransitionOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private Long delay;
        private Long duration;
        private Boolean enablePlacementTransitions;

        public TransitionOptions build() {
            return new TransitionOptions(this.duration, this.delay, this.enablePlacementTransitions, null);
        }

        public Builder delay(Long l9) {
            this.delay = l9;
            return this;
        }

        public Builder duration(Long l9) {
            this.duration = l9;
            return this;
        }

        public Builder enablePlacementTransitions(Boolean bool) {
            this.enablePlacementTransitions = bool;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ TransitionOptions(Long l9, Long l10, Boolean bool, AnonymousClass1 anonymousClass1) {
        this(l9, l10, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransitionOptions.class != obj.getClass()) {
            return false;
        }
        TransitionOptions transitionOptions = (TransitionOptions) obj;
        return Objects.equals(this.duration, transitionOptions.duration) && Objects.equals(this.delay, transitionOptions.delay) && Objects.equals(this.enablePlacementTransitions, transitionOptions.enablePlacementTransitions);
    }

    public Long getDelay() {
        return this.delay;
    }

    public Long getDuration() {
        return this.duration;
    }

    public Boolean getEnablePlacementTransitions() {
        return this.enablePlacementTransitions;
    }

    public int hashCode() {
        return Objects.hash(this.duration, this.delay, this.enablePlacementTransitions);
    }

    public Builder toBuilder() {
        return new Builder().duration(this.duration).delay(this.delay).enablePlacementTransitions(this.enablePlacementTransitions);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[duration: ");
        com.mapbox.common.b.u(this.duration, sb2, ", delay: ");
        com.mapbox.common.b.u(this.delay, sb2, ", enablePlacementTransitions: ");
        sb2.append(RecordUtils.fieldToString(this.enablePlacementTransitions));
        sb2.append("]");
        return sb2.toString();
    }

    private TransitionOptions(Long l9, Long l10, Boolean bool) {
        this.duration = l9;
        this.delay = l10;
        this.enablePlacementTransitions = bool;
    }
}
