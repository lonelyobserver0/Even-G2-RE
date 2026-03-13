package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class MapRecorder {
    protected long peer;

    public static class MapRecorderPeerCleaner implements Runnable {
        private long peer;

        public MapRecorderPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapRecorder.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MapRecorder(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native Expected<String, MapRecorder> createInstance(Map map);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MapRecorderPeerCleaner(j));
    }

    public native String getPlaybackState();

    public native void replay(DataRef dataRef, MapPlayerOptions mapPlayerOptions, PlaybackFinished playbackFinished);

    public native void startRecording(MapRecorderOptions mapRecorderOptions);

    public native DataRef stopRecording();

    public native void togglePauseReplay();
}
