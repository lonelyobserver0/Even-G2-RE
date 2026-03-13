package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class HistoryRecorderHandle implements HistoryRecorderHandleInterface {
    protected long peer;

    public static class HistoryRecorderHandlePeerCleaner implements Runnable {
        private long peer;

        public HistoryRecorderHandlePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            HistoryRecorderHandle.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public HistoryRecorderHandle(long j) {
        setPeer(j);
    }

    public static native HistoryRecorderHandle build(String str, SdkHistoryInfo sdkHistoryInfo, ConfigHandle configHandle);

    public static native HistoryRecorderHandle buildCompositeRecorder(List<HistoryRecorderHandle> list);

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new HistoryRecorderHandlePeerCleaner(j));
    }

    @Override // com.mapbox.navigator.HistoryRecorderHandleInterface
    public native void pushHistory(String str, String str2);

    @Override // com.mapbox.navigator.HistoryRecorderHandleInterface
    public native List<String> startRecording();

    @Override // com.mapbox.navigator.HistoryRecorderHandleInterface
    public native void stopRecording(DumpHistoryCallback dumpHistoryCallback);
}
