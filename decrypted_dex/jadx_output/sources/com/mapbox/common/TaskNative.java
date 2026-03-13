package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class TaskNative implements Task {
    private long peer;

    public static class TaskPeerCleaner implements Runnable {
        private long peer;

        public TaskPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TaskNative.cleanNativePeer(this.peer);
        }
    }

    private TaskNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TaskPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.Task
    public native void run();
}
