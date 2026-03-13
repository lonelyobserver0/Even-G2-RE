package com.mapbox.navigation.core.telemetry.events;

import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u0003H\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/mapbox/navigation/core/telemetry/events/BitmapEncodeOptions;", "", "width", "", "compressQuality", "(II)V", "getCompressQuality", "()I", "getWidth", "equals", "", "other", "hashCode", "toBuilder", "Lcom/mapbox/navigation/core/telemetry/events/BitmapEncodeOptions$Builder;", "toString", "", "Builder", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BitmapEncodeOptions {
    private final int compressQuality;
    private final int width;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0003\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/mapbox/navigation/core/telemetry/events/BitmapEncodeOptions$Builder;", "", "()V", "compressQuality", "", "width", "build", "Lcom/mapbox/navigation/core/telemetry/events/BitmapEncodeOptions;", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private int width = 250;
        private int compressQuality = 20;

        public final BitmapEncodeOptions build() {
            return new BitmapEncodeOptions(this.width, this.compressQuality, null);
        }

        public final Builder compressQuality(int compressQuality) {
            if (compressQuality < 0 || compressQuality >= 101) {
                throw new IllegalArgumentException(StubApp.getString2(14675));
            }
            this.compressQuality = compressQuality;
            return this;
        }

        public final Builder width(int width) {
            if (width < 1) {
                throw new IllegalArgumentException(StubApp.getString2(14676));
            }
            this.width = width;
            return this;
        }
    }

    public /* synthetic */ BitmapEncodeOptions(int i3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i3, i10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(BitmapEncodeOptions.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.navigation.core.telemetry.events.BitmapEncodeOptions");
        BitmapEncodeOptions bitmapEncodeOptions = (BitmapEncodeOptions) other;
        return this.width == bitmapEncodeOptions.width && this.compressQuality == bitmapEncodeOptions.compressQuality;
    }

    public final int getCompressQuality() {
        return this.compressQuality;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width * 31) + this.compressQuality;
    }

    public final Builder toBuilder() {
        return new Builder().compressQuality(this.compressQuality).width(this.width);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14677));
        sb2.append(this.width);
        sb2.append(StubApp.getString2(14678));
        return com.mapbox.common.b.j(sb2, this.compressQuality, ')');
    }

    private BitmapEncodeOptions(int i3, int i10) {
        this.width = i3;
        this.compressQuality = i10;
    }
}
