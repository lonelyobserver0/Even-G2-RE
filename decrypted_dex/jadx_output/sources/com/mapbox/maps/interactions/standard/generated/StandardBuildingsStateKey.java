package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.interactions.FeatureStateKey;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsStateKey;", "Lcom/mapbox/maps/interactions/FeatureStateKey;", "Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsState;", "key", "", "(Ljava/lang/String;)V", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StandardBuildingsStateKey extends FeatureStateKey<StandardBuildingsState> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final StandardBuildingsStateKey HIGHLIGHT = new StandardBuildingsStateKey(StubApp.getString2(14382));
    private static final StandardBuildingsStateKey SELECT = new StandardBuildingsStateKey(StubApp.getString2(14383));

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsStateKey$Companion;", "", "()V", "HIGHLIGHT", "Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsStateKey;", "getHIGHLIGHT", "()Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsStateKey;", "SELECT", "getSELECT", "create", "key", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @MapboxDelicateApi
        public final StandardBuildingsStateKey create(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new StandardBuildingsStateKey(key, null);
        }

        public final StandardBuildingsStateKey getHIGHLIGHT() {
            return StandardBuildingsStateKey.HIGHLIGHT;
        }

        public final StandardBuildingsStateKey getSELECT() {
            return StandardBuildingsStateKey.SELECT;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StandardBuildingsStateKey(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private StandardBuildingsStateKey(String str) {
        super(str);
    }
}
