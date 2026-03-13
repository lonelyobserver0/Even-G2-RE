package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TaskOptions implements Serializable {
    private final long delay;
    private final TaskPriority priority;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TaskOptions(long j, TaskPriority taskPriority) {
        this.delay = j;
        this.priority = taskPriority;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskOptions taskOptions = (TaskOptions) obj;
        return this.delay == taskOptions.delay && Objects.equals(this.priority, taskOptions.priority);
    }

    public long getDelay() {
        return this.delay;
    }

    public TaskPriority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.delay), this.priority);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[delay: ");
        b.p(this.delay, sb2, ", priority: ");
        sb2.append(RecordUtils.fieldToString(this.priority));
        sb2.append("]");
        return sb2.toString();
    }

    public TaskOptions(long j) {
        this.delay = j;
        this.priority = TaskPriority.DEFAULT;
    }
}
