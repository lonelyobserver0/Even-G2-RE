package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CameraAnimationHintStage implements Serializable {
    private final CameraOptions camera;
    private final long progress;

    /* renamed from: com.mapbox.maps.CameraAnimationHintStage$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private CameraOptions camera;
        private long progress;

        public CameraAnimationHintStage build() {
            if (this.camera != null) {
                return new CameraAnimationHintStage(this.progress, this.camera, null);
            }
            throw new NullPointerException(StubApp.getString2(13888));
        }

        public Builder camera(CameraOptions cameraOptions) {
            this.camera = cameraOptions;
            return this;
        }

        public Builder progress(long j) {
            this.progress = j;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ CameraAnimationHintStage(long j, CameraOptions cameraOptions, AnonymousClass1 anonymousClass1) {
        this(j, cameraOptions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraAnimationHintStage.class != obj.getClass()) {
            return false;
        }
        CameraAnimationHintStage cameraAnimationHintStage = (CameraAnimationHintStage) obj;
        return this.progress == cameraAnimationHintStage.progress && Objects.equals(this.camera, cameraAnimationHintStage.camera);
    }

    public CameraOptions getCamera() {
        return this.camera;
    }

    public long getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.progress), this.camera);
    }

    public Builder toBuilder() {
        return new Builder().progress(this.progress).camera(this.camera);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[progress: ");
        com.mapbox.common.b.p(this.progress, sb2, ", camera: ");
        sb2.append(RecordUtils.fieldToString(this.camera));
        sb2.append("]");
        return sb2.toString();
    }

    private CameraAnimationHintStage(long j, CameraOptions cameraOptions) {
        this.progress = j;
        this.camera = cameraOptions;
    }
}
