package com.mapbox.common;

import Xa.h;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MemoryMonitorObserverConfig implements Serializable {
    private final long maxUsedMemoryPercentThreshold;
    private final long maxUsedMemoryThreshold;
    private final boolean sendAppRunningInBackgroundNotification;
    private final long thresholdReachedNotificationTimeout;

    /* renamed from: com.mapbox.common.MemoryMonitorObserverConfig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private boolean sendAppRunningInBackgroundNotification = true;
        private long maxUsedMemoryPercentThreshold = 75;
        private long maxUsedMemoryThreshold = 0;
        private long thresholdReachedNotificationTimeout = 300000;

        public MemoryMonitorObserverConfig build() {
            return new MemoryMonitorObserverConfig(this.sendAppRunningInBackgroundNotification, this.maxUsedMemoryPercentThreshold, this.maxUsedMemoryThreshold, this.thresholdReachedNotificationTimeout, null);
        }

        public Builder maxUsedMemoryPercentThreshold(long j) {
            this.maxUsedMemoryPercentThreshold = j;
            return this;
        }

        public Builder maxUsedMemoryThreshold(long j) {
            this.maxUsedMemoryThreshold = j;
            return this;
        }

        public Builder sendAppRunningInBackgroundNotification(boolean z2) {
            this.sendAppRunningInBackgroundNotification = z2;
            return this;
        }

        public Builder thresholdReachedNotificationTimeout(long j) {
            this.thresholdReachedNotificationTimeout = j;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public /* synthetic */ MemoryMonitorObserverConfig(boolean z2, long j, long j3, long j10, AnonymousClass1 anonymousClass1) {
        this(z2, j, j3, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MemoryMonitorObserverConfig.class != obj.getClass()) {
            return false;
        }
        MemoryMonitorObserverConfig memoryMonitorObserverConfig = (MemoryMonitorObserverConfig) obj;
        return this.sendAppRunningInBackgroundNotification == memoryMonitorObserverConfig.sendAppRunningInBackgroundNotification && this.maxUsedMemoryPercentThreshold == memoryMonitorObserverConfig.maxUsedMemoryPercentThreshold && this.maxUsedMemoryThreshold == memoryMonitorObserverConfig.maxUsedMemoryThreshold && this.thresholdReachedNotificationTimeout == memoryMonitorObserverConfig.thresholdReachedNotificationTimeout;
    }

    public long getMaxUsedMemoryPercentThreshold() {
        return this.maxUsedMemoryPercentThreshold;
    }

    public long getMaxUsedMemoryThreshold() {
        return this.maxUsedMemoryThreshold;
    }

    public boolean getSendAppRunningInBackgroundNotification() {
        return this.sendAppRunningInBackgroundNotification;
    }

    public long getThresholdReachedNotificationTimeout() {
        return this.thresholdReachedNotificationTimeout;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.sendAppRunningInBackgroundNotification), Long.valueOf(this.maxUsedMemoryPercentThreshold), Long.valueOf(this.maxUsedMemoryThreshold), Long.valueOf(this.thresholdReachedNotificationTimeout));
    }

    public Builder toBuilder() {
        return new Builder().sendAppRunningInBackgroundNotification(this.sendAppRunningInBackgroundNotification).maxUsedMemoryPercentThreshold(this.maxUsedMemoryPercentThreshold).maxUsedMemoryThreshold(this.maxUsedMemoryThreshold).thresholdReachedNotificationTimeout(this.thresholdReachedNotificationTimeout);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[sendAppRunningInBackgroundNotification: ");
        h.A(this.sendAppRunningInBackgroundNotification, sb2, ", maxUsedMemoryPercentThreshold: ");
        b.p(this.maxUsedMemoryPercentThreshold, sb2, ", maxUsedMemoryThreshold: ");
        b.p(this.maxUsedMemoryThreshold, sb2, ", thresholdReachedNotificationTimeout: ");
        return h.i(this.thresholdReachedNotificationTimeout, sb2, "]");
    }

    private MemoryMonitorObserverConfig(boolean z2, long j, long j3, long j10) {
        this.sendAppRunningInBackgroundNotification = z2;
        this.maxUsedMemoryPercentThreshold = j;
        this.maxUsedMemoryThreshold = j3;
        this.thresholdReachedNotificationTimeout = j10;
    }

    private MemoryMonitorObserverConfig() {
        this.sendAppRunningInBackgroundNotification = true;
        this.maxUsedMemoryPercentThreshold = 75L;
        this.maxUsedMemoryThreshold = 0L;
        this.thresholdReachedNotificationTimeout = 300000L;
    }
}
