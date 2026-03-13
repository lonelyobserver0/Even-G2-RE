package com.mapbox.navigation.core.telemetry.events;

import com.mapbox.navigation.core.telemetry.events.FeedbackMetadata;
import com.mapbox.navigator.UserFeedbackHandle;
import com.mapbox.navigator.UserFeedbackMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/mapbox/navigation/core/telemetry/events/FeedbackMetadataWrapper;", "", "userFeedbackHandle", "Lcom/mapbox/navigator/UserFeedbackHandle;", "(Lcom/mapbox/navigator/UserFeedbackHandle;)V", "get", "Lcom/mapbox/navigation/core/telemetry/events/FeedbackMetadata;", "Companion", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FeedbackMetadataWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final UserFeedbackHandle userFeedbackHandle;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/navigation/core/telemetry/events/FeedbackMetadataWrapper$Companion;", "", "()V", "create", "Lcom/mapbox/navigation/core/telemetry/events/FeedbackMetadataWrapper;", "userFeedbackHandle", "Lcom/mapbox/navigator/UserFeedbackHandle;", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ FeedbackMetadataWrapper create(UserFeedbackHandle userFeedbackHandle) {
            Intrinsics.checkNotNullParameter(userFeedbackHandle, "userFeedbackHandle");
            return new FeedbackMetadataWrapper(userFeedbackHandle, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ FeedbackMetadataWrapper(UserFeedbackHandle userFeedbackHandle, DefaultConstructorMarker defaultConstructorMarker) {
        this(userFeedbackHandle);
    }

    public final FeedbackMetadata get() {
        FeedbackMetadata.Companion companion = FeedbackMetadata.INSTANCE;
        UserFeedbackMetadata metadata = this.userFeedbackHandle.getMetadata();
        Intrinsics.checkNotNullExpressionValue(metadata, "userFeedbackHandle.metadata");
        return companion.create$navigation_release(metadata);
    }

    private FeedbackMetadataWrapper(UserFeedbackHandle userFeedbackHandle) {
        this.userFeedbackHandle = userFeedbackHandle;
    }
}
