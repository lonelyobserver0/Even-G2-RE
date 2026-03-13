package com.mapbox.common.logger;

import com.stub.StubApp;
import i2.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/mapbox/common/logger/LogEntry;", "", "tag", "", "message", "throwable", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getTag", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "liblogger_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class LogEntry {
    private final String message;
    private final String tag;
    private final Throwable throwable;

    public LogEntry(String str, String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.tag = str;
        this.message = message;
        this.throwable = th;
    }

    public static /* synthetic */ LogEntry copy$default(LogEntry logEntry, String str, String str2, Throwable th, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = logEntry.tag;
        }
        if ((i3 & 2) != 0) {
            str2 = logEntry.message;
        }
        if ((i3 & 4) != 0) {
            th = logEntry.throwable;
        }
        return logEntry.copy(str, str2, th);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final LogEntry copy(String tag, String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new LogEntry(tag, message, throwable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogEntry)) {
            return false;
        }
        LogEntry logEntry = (LogEntry) other;
        return Intrinsics.areEqual(this.tag, logEntry.tag) && Intrinsics.areEqual(this.message, logEntry.message) && Intrinsics.areEqual(this.throwable, logEntry.throwable);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTag() {
        return this.tag;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        String str = this.tag;
        int d8 = u.d((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
        Throwable th = this.throwable;
        return d8 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return StubApp.getString2(13740) + this.tag + StubApp.getString2(2061) + this.message + StubApp.getString2(1888) + this.throwable + ')';
    }
}
