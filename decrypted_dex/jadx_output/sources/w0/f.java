package w0;

import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ MediaMetricsManager b(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ PlaybackMetrics.Builder g() {
        return new PlaybackMetrics.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder k() {
        return new PlaybackStateEvent.Builder();
    }
}
