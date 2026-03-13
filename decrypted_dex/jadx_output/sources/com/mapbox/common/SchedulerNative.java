package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class SchedulerNative implements Scheduler {
    protected long peer;

    public static class SchedulerPeerCleaner implements Runnable {
        private long peer;

        public SchedulerPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            SchedulerNative.cleanNativePeer(this.peer);
        }
    }

    public SchedulerNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SchedulerPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.Scheduler
    public native SchedulerType getType();

    @Override // com.mapbox.common.Scheduler
    public native void schedule(Task task, TaskOptions taskOptions);
}
