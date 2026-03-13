package com.mapbox.maps.interactions;

import com.mapbox.maps.interactions.FeatureState;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000e*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u000eB\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/interactions/FeatureStateKey;", "FS", "Lcom/mapbox/maps/interactions/FeatureState;", "", "key", "", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class FeatureStateKey<FS extends FeatureState> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String key;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/mapbox/maps/interactions/FeatureStateKey$Companion;", "", "()V", "create", "Lcom/mapbox/maps/interactions/FeatureStateKey;", "Lcom/mapbox/maps/interactions/FeatureState;", "key", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final FeatureStateKey<FeatureState> create(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new FeatureStateKey<>(key);
        }

        private Companion() {
        }
    }

    public FeatureStateKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
    }

    @JvmStatic
    public static final FeatureStateKey<FeatureState> create(String str) {
        return INSTANCE.create(str);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.maps.interactions.FeatureStateKey<*>");
        return Intrinsics.areEqual(this.key, ((FeatureStateKey) other).key);
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return Objects.hash(this.key);
    }
}
