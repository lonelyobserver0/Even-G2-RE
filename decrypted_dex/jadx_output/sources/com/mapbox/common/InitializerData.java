package com.mapbox.common;

import android.os.SystemClock;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/mapbox/common/InitializerData;", "", "firstInitElapsedTimeMs", "", "state", "Lcom/mapbox/common/InitializerState;", "currentInitAttempt", "", "(JLcom/mapbox/common/InitializerState;I)V", "getCurrentInitAttempt", "()I", "getFirstInitElapsedTimeMs", "()J", "getState", "()Lcom/mapbox/common/InitializerState;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class InitializerData {
    private final int currentInitAttempt;
    private final long firstInitElapsedTimeMs;
    private final InitializerState state;

    public InitializerData() {
        this(0L, null, 0, 7, null);
    }

    public static /* synthetic */ InitializerData copy$default(InitializerData initializerData, long j, InitializerState initializerState, int i3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j = initializerData.firstInitElapsedTimeMs;
        }
        if ((i10 & 2) != 0) {
            initializerState = initializerData.state;
        }
        if ((i10 & 4) != 0) {
            i3 = initializerData.currentInitAttempt;
        }
        return initializerData.copy(j, initializerState, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getFirstInitElapsedTimeMs() {
        return this.firstInitElapsedTimeMs;
    }

    /* renamed from: component2, reason: from getter */
    public final InitializerState getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCurrentInitAttempt() {
        return this.currentInitAttempt;
    }

    public final InitializerData copy(long firstInitElapsedTimeMs, InitializerState state, int currentInitAttempt) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new InitializerData(firstInitElapsedTimeMs, state, currentInitAttempt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializerData)) {
            return false;
        }
        InitializerData initializerData = (InitializerData) other;
        return this.firstInitElapsedTimeMs == initializerData.firstInitElapsedTimeMs && this.state == initializerData.state && this.currentInitAttempt == initializerData.currentInitAttempt;
    }

    public final int getCurrentInitAttempt() {
        return this.currentInitAttempt;
    }

    public final long getFirstInitElapsedTimeMs() {
        return this.firstInitElapsedTimeMs;
    }

    public final InitializerState getState() {
        return this.state;
    }

    public int hashCode() {
        return Integer.hashCode(this.currentInitAttempt) + ((this.state.hashCode() + (Long.hashCode(this.firstInitElapsedTimeMs) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(13334));
        sb2.append(this.firstInitElapsedTimeMs);
        sb2.append(StubApp.getString2(9384));
        sb2.append(this.state);
        sb2.append(StubApp.getString2(13335));
        return b.j(sb2, this.currentInitAttempt, ')');
    }

    public InitializerData(long j, InitializerState state, int i3) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.firstInitElapsedTimeMs = j;
        this.state = state;
        this.currentInitAttempt = i3;
    }

    public /* synthetic */ InitializerData(long j, InitializerState initializerState, int i3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? SystemClock.elapsedRealtime() : j, (i10 & 2) != 0 ? InitializerState.IN_PROGRESS : initializerState, (i10 & 4) != 0 ? 0 : i3);
    }
}
