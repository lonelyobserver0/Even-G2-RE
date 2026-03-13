package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MemoryMonitorStatus implements Serializable {
    private final MemoryMonitorState state;
    private final long totalMemory;
    private final long usedMemory;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MemoryMonitorStatus(MemoryMonitorState memoryMonitorState, long j, long j3) {
        this.state = memoryMonitorState;
        this.totalMemory = j;
        this.usedMemory = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MemoryMonitorStatus.class != obj.getClass()) {
            return false;
        }
        MemoryMonitorStatus memoryMonitorStatus = (MemoryMonitorStatus) obj;
        return Objects.equals(this.state, memoryMonitorStatus.state) && this.totalMemory == memoryMonitorStatus.totalMemory && this.usedMemory == memoryMonitorStatus.usedMemory;
    }

    public MemoryMonitorState getState() {
        return this.state;
    }

    public long getTotalMemory() {
        return this.totalMemory;
    }

    public long getUsedMemory() {
        return this.usedMemory;
    }

    public int hashCode() {
        return Objects.hash(this.state, Long.valueOf(this.totalMemory), Long.valueOf(this.usedMemory));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[state: ");
        sb2.append(RecordUtils.fieldToString(this.state));
        sb2.append(", totalMemory: ");
        b.p(this.totalMemory, sb2, ", usedMemory: ");
        return h.i(this.usedMemory, sb2, "]");
    }
}
