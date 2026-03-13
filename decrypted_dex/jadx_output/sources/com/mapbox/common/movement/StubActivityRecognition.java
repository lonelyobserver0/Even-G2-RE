package com.mapbox.common.movement;

import com.mapbox.common.movement.ActivityRecognitionClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/mapbox/common/movement/StubActivityRecognition;", "Lcom/mapbox/common/movement/ActivityRecognitionClient;", "()V", "addObserver", "", "observer", "Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;", "isPlatformActivityRecognitionAvailable", "", "removeObserver", "start", "stop", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StubActivityRecognition implements ActivityRecognitionClient {
    public static final StubActivityRecognition INSTANCE = new StubActivityRecognition();

    private StubActivityRecognition() {
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void addObserver(ActivityRecognitionClient.Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public boolean isPlatformActivityRecognitionAvailable() {
        return false;
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void removeObserver(ActivityRecognitionClient.Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void start() {
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void stop() {
    }
}
