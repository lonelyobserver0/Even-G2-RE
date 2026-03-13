package com.mapbox.navigation.core.telemetry.events;

import D9.l;
import com.google.gson.Gson;
import com.mapbox.navigator.UserFeedbackMetadata;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/mapbox/navigation/core/telemetry/events/FeedbackMetadata;", "", "userFeedbackMetadata", "Lcom/mapbox/navigator/UserFeedbackMetadata;", "(Lcom/mapbox/navigator/UserFeedbackMetadata;)V", "getUserFeedbackMetadata$navigation_release", "()Lcom/mapbox/navigator/UserFeedbackMetadata;", "equals", "", "other", "hashCode", "", "toJson", "", "gson", "Lcom/google/gson/Gson;", "toString", "Companion", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FeedbackMetadata {
    private final UserFeedbackMetadata userFeedbackMetadata;
    private static final String LOG_CATEGORY = StubApp.getString2(14725);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/mapbox/navigation/core/telemetry/events/FeedbackMetadata$Companion;", "", "()V", "LOG_CATEGORY", "", "create", "Lcom/mapbox/navigation/core/telemetry/events/FeedbackMetadata;", "userFeedbackMetadata", "Lcom/mapbox/navigator/UserFeedbackMetadata;", "create$navigation_release", "fromJson", "json", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ FeedbackMetadata create$navigation_release(UserFeedbackMetadata userFeedbackMetadata) {
            Intrinsics.checkNotNullParameter(userFeedbackMetadata, "userFeedbackMetadata");
            return new FeedbackMetadata(userFeedbackMetadata, null);
        }

        @JvmStatic
        public final FeedbackMetadata fromJson(String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                return (FeedbackMetadata) new Gson().fromJson(json, FeedbackMetadata.class);
            } catch (Exception e10) {
                l.e(StubApp.getString2(14724) + e10, StubApp.getString2(14725));
                return null;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ FeedbackMetadata(UserFeedbackMetadata userFeedbackMetadata, DefaultConstructorMarker defaultConstructorMarker) {
        this(userFeedbackMetadata);
    }

    @JvmStatic
    public static final FeedbackMetadata fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(FeedbackMetadata.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.navigation.core.telemetry.events.FeedbackMetadata");
        return Intrinsics.areEqual(this.userFeedbackMetadata, ((FeedbackMetadata) other).userFeedbackMetadata);
    }

    /* renamed from: getUserFeedbackMetadata$navigation_release, reason: from getter */
    public final UserFeedbackMetadata getUserFeedbackMetadata() {
        return this.userFeedbackMetadata;
    }

    public int hashCode() {
        return this.userFeedbackMetadata.hashCode();
    }

    public final String toJson(Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        String json = gson.toJson(this);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(this)");
        return json;
    }

    public String toString() {
        return StubApp.getString2(14726) + this.userFeedbackMetadata + ')';
    }

    private FeedbackMetadata(UserFeedbackMetadata userFeedbackMetadata) {
        this.userFeedbackMetadata = userFeedbackMetadata;
    }
}
