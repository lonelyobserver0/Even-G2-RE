package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class TileRegionApplyUpdateOptions implements Serializable {
    private final Value extraOptions;
    private final NetworkRestriction networkRestriction;

    /* renamed from: com.mapbox.common.TileRegionApplyUpdateOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private Value extraOptions;
        private NetworkRestriction networkRestriction = NetworkRestriction.DISALLOW_EXPENSIVE;

        public TileRegionApplyUpdateOptions build() {
            if (this.networkRestriction != null) {
                return new TileRegionApplyUpdateOptions(this.networkRestriction, this.extraOptions, null);
            }
            throw new NullPointerException(StubApp.getString2(13316));
        }

        public Builder extraOptions(Value value) {
            this.extraOptions = value;
            return this;
        }

        public Builder networkRestriction(NetworkRestriction networkRestriction) {
            this.networkRestriction = networkRestriction;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public /* synthetic */ TileRegionApplyUpdateOptions(NetworkRestriction networkRestriction, Value value, AnonymousClass1 anonymousClass1) {
        this(networkRestriction, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TileRegionApplyUpdateOptions.class != obj.getClass()) {
            return false;
        }
        TileRegionApplyUpdateOptions tileRegionApplyUpdateOptions = (TileRegionApplyUpdateOptions) obj;
        return Objects.equals(this.networkRestriction, tileRegionApplyUpdateOptions.networkRestriction) && Objects.equals(this.extraOptions, tileRegionApplyUpdateOptions.extraOptions);
    }

    public Value getExtraOptions() {
        return this.extraOptions;
    }

    public NetworkRestriction getNetworkRestriction() {
        return this.networkRestriction;
    }

    public int hashCode() {
        return Objects.hash(this.networkRestriction, this.extraOptions);
    }

    public Builder toBuilder() {
        return new Builder().networkRestriction(this.networkRestriction).extraOptions(this.extraOptions);
    }

    public String toString() {
        return "[networkRestriction: " + RecordUtils.fieldToString(this.networkRestriction) + ", extraOptions: " + RecordUtils.fieldToString(this.extraOptions) + "]";
    }

    private TileRegionApplyUpdateOptions(NetworkRestriction networkRestriction, Value value) {
        this.networkRestriction = networkRestriction;
        this.extraOptions = value;
    }

    private TileRegionApplyUpdateOptions(Value value) {
        this.extraOptions = value;
        this.networkRestriction = NetworkRestriction.DISALLOW_EXPENSIVE;
    }
}
