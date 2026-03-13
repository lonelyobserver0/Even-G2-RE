package io.flutter.view;

import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.TrackChangeEvent;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NetworkEvent.Builder d() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder h() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder j(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* synthetic */ TrackChangeEvent.Builder k(int i3) {
        return new TrackChangeEvent.Builder(i3);
    }
}
