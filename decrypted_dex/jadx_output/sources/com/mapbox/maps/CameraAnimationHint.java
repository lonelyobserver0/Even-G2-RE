package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CameraAnimationHint implements Serializable {
    private final List<CameraAnimationHintStage> stages;

    /* renamed from: com.mapbox.maps.CameraAnimationHint$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private List<CameraAnimationHintStage> stages;

        public CameraAnimationHint build() {
            if (this.stages != null) {
                return new CameraAnimationHint(this.stages, null);
            }
            throw new NullPointerException(StubApp.getString2(13887));
        }

        public Builder stages(List<CameraAnimationHintStage> list) {
            this.stages = list;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ CameraAnimationHint(List list, AnonymousClass1 anonymousClass1) {
        this(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && CameraAnimationHint.class == obj.getClass() && Objects.equals(this.stages, ((CameraAnimationHint) obj).stages);
    }

    public List<CameraAnimationHintStage> getStages() {
        return this.stages;
    }

    public int hashCode() {
        return Objects.hash(this.stages);
    }

    public Builder toBuilder() {
        return new Builder().stages(this.stages);
    }

    public String toString() {
        return com.mapbox.common.b.i("]", new StringBuilder("[stages: "), this.stages);
    }

    private CameraAnimationHint(List<CameraAnimationHintStage> list) {
        this.stages = list;
    }
}
