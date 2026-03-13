package com.mapbox.maps;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/mapbox/maps/SnapshotStyleListener;", "", "onDidFailLoadingStyle", "", "message", "", "onDidFinishLoadingStyle", "style", "Lcom/mapbox/maps/Style;", "onDidFullyLoadStyle", "onStyleImageMissing", "imageId", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface SnapshotStyleListener {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void onDidFailLoadingStyle(SnapshotStyleListener snapshotStyleListener, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
        }

        public static void onDidFullyLoadStyle(SnapshotStyleListener snapshotStyleListener, Style style) {
            Intrinsics.checkNotNullParameter(style, "style");
        }

        public static void onStyleImageMissing(SnapshotStyleListener snapshotStyleListener, String imageId) {
            Intrinsics.checkNotNullParameter(imageId, "imageId");
        }
    }

    void onDidFailLoadingStyle(String message);

    void onDidFinishLoadingStyle(Style style);

    void onDidFullyLoadStyle(Style style);

    void onStyleImageMissing(String imageId);
}
