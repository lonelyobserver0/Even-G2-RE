package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DeferredDeliveryServiceOptions implements Serializable {
    private final long batchFlushTimeout;
    private final long batchLengthToFlush;
    private final String dataStoragePath;
    private final Long maxStorageUsage;
    private final long memoryQueueFlushTimeout;
    private final long memoryQueueLengthToFlush;
    private final Long memoryQueueMaxLength;
    private final DeferredDeliveryOverflowPolicy memoryQueueOverflowPolicy;
    private final long persistentQueueFlushTimeout;
    private final long persistentQueueLengthToFlush;
    private final Long persistentQueueMaxLength;
    private final DeferredDeliveryOverflowPolicy persistentQueueOverflowPolicy;
    private final DeferredDeliveryOverflowPolicy storageOverflowPolicy;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public DeferredDeliveryServiceOptions(long j, long j3, Long l9, long j10, long j11, DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy, Long l10, long j12, long j13, DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy2, String str, Long l11, DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy3) {
        this.batchLengthToFlush = j;
        this.batchFlushTimeout = j3;
        this.memoryQueueMaxLength = l9;
        this.memoryQueueLengthToFlush = j10;
        this.memoryQueueFlushTimeout = j11;
        this.memoryQueueOverflowPolicy = deferredDeliveryOverflowPolicy;
        this.persistentQueueMaxLength = l10;
        this.persistentQueueLengthToFlush = j12;
        this.persistentQueueFlushTimeout = j13;
        this.persistentQueueOverflowPolicy = deferredDeliveryOverflowPolicy2;
        this.dataStoragePath = str;
        this.maxStorageUsage = l11;
        this.storageOverflowPolicy = deferredDeliveryOverflowPolicy3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeferredDeliveryServiceOptions deferredDeliveryServiceOptions = (DeferredDeliveryServiceOptions) obj;
        return this.batchLengthToFlush == deferredDeliveryServiceOptions.batchLengthToFlush && this.batchFlushTimeout == deferredDeliveryServiceOptions.batchFlushTimeout && Objects.equals(this.memoryQueueMaxLength, deferredDeliveryServiceOptions.memoryQueueMaxLength) && this.memoryQueueLengthToFlush == deferredDeliveryServiceOptions.memoryQueueLengthToFlush && this.memoryQueueFlushTimeout == deferredDeliveryServiceOptions.memoryQueueFlushTimeout && Objects.equals(this.memoryQueueOverflowPolicy, deferredDeliveryServiceOptions.memoryQueueOverflowPolicy) && Objects.equals(this.persistentQueueMaxLength, deferredDeliveryServiceOptions.persistentQueueMaxLength) && this.persistentQueueLengthToFlush == deferredDeliveryServiceOptions.persistentQueueLengthToFlush && this.persistentQueueFlushTimeout == deferredDeliveryServiceOptions.persistentQueueFlushTimeout && Objects.equals(this.persistentQueueOverflowPolicy, deferredDeliveryServiceOptions.persistentQueueOverflowPolicy) && Objects.equals(this.dataStoragePath, deferredDeliveryServiceOptions.dataStoragePath) && Objects.equals(this.maxStorageUsage, deferredDeliveryServiceOptions.maxStorageUsage) && Objects.equals(this.storageOverflowPolicy, deferredDeliveryServiceOptions.storageOverflowPolicy);
    }

    public long getBatchFlushTimeout() {
        return this.batchFlushTimeout;
    }

    public long getBatchLengthToFlush() {
        return this.batchLengthToFlush;
    }

    public String getDataStoragePath() {
        return this.dataStoragePath;
    }

    public Long getMaxStorageUsage() {
        return this.maxStorageUsage;
    }

    public long getMemoryQueueFlushTimeout() {
        return this.memoryQueueFlushTimeout;
    }

    public long getMemoryQueueLengthToFlush() {
        return this.memoryQueueLengthToFlush;
    }

    public Long getMemoryQueueMaxLength() {
        return this.memoryQueueMaxLength;
    }

    public DeferredDeliveryOverflowPolicy getMemoryQueueOverflowPolicy() {
        return this.memoryQueueOverflowPolicy;
    }

    public long getPersistentQueueFlushTimeout() {
        return this.persistentQueueFlushTimeout;
    }

    public long getPersistentQueueLengthToFlush() {
        return this.persistentQueueLengthToFlush;
    }

    public Long getPersistentQueueMaxLength() {
        return this.persistentQueueMaxLength;
    }

    public DeferredDeliveryOverflowPolicy getPersistentQueueOverflowPolicy() {
        return this.persistentQueueOverflowPolicy;
    }

    public DeferredDeliveryOverflowPolicy getStorageOverflowPolicy() {
        return this.storageOverflowPolicy;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.batchLengthToFlush), Long.valueOf(this.batchFlushTimeout), this.memoryQueueMaxLength, Long.valueOf(this.memoryQueueLengthToFlush), Long.valueOf(this.memoryQueueFlushTimeout), this.memoryQueueOverflowPolicy, this.persistentQueueMaxLength, Long.valueOf(this.persistentQueueLengthToFlush), Long.valueOf(this.persistentQueueFlushTimeout), this.persistentQueueOverflowPolicy, this.dataStoragePath, this.maxStorageUsage, this.storageOverflowPolicy);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[batchLengthToFlush: ");
        b.p(this.batchLengthToFlush, sb2, ", batchFlushTimeout: ");
        b.p(this.batchFlushTimeout, sb2, ", memoryQueueMaxLength: ");
        b.u(this.memoryQueueMaxLength, sb2, ", memoryQueueLengthToFlush: ");
        b.p(this.memoryQueueLengthToFlush, sb2, ", memoryQueueFlushTimeout: ");
        b.p(this.memoryQueueFlushTimeout, sb2, ", memoryQueueOverflowPolicy: ");
        sb2.append(RecordUtils.fieldToString(this.memoryQueueOverflowPolicy));
        sb2.append(", persistentQueueMaxLength: ");
        b.u(this.persistentQueueMaxLength, sb2, ", persistentQueueLengthToFlush: ");
        b.p(this.persistentQueueLengthToFlush, sb2, ", persistentQueueFlushTimeout: ");
        b.p(this.persistentQueueFlushTimeout, sb2, ", persistentQueueOverflowPolicy: ");
        sb2.append(RecordUtils.fieldToString(this.persistentQueueOverflowPolicy));
        sb2.append(", dataStoragePath: ");
        h.z(sb2, this.dataStoragePath, ", maxStorageUsage: ");
        b.u(this.maxStorageUsage, sb2, ", storageOverflowPolicy: ");
        sb2.append(RecordUtils.fieldToString(this.storageOverflowPolicy));
        sb2.append("]");
        return sb2.toString();
    }

    public DeferredDeliveryServiceOptions(Long l9, Long l10, String str, Long l11) {
        this.memoryQueueMaxLength = l9;
        this.persistentQueueMaxLength = l10;
        this.dataStoragePath = str;
        this.maxStorageUsage = l11;
        this.batchLengthToFlush = 180L;
        this.batchFlushTimeout = 180000L;
        this.memoryQueueLengthToFlush = 180L;
        this.memoryQueueFlushTimeout = 180000L;
        DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy = DeferredDeliveryOverflowPolicy.RETIRE_OLDEST;
        this.memoryQueueOverflowPolicy = deferredDeliveryOverflowPolicy;
        this.persistentQueueLengthToFlush = 180L;
        this.persistentQueueFlushTimeout = 180000L;
        this.persistentQueueOverflowPolicy = deferredDeliveryOverflowPolicy;
        this.storageOverflowPolicy = DeferredDeliveryOverflowPolicy.DISCARD_INCOMING;
    }
}
