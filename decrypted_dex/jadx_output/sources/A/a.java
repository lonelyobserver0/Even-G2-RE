package A;

import android.media.MediaCodecInfo;
import android.view.WindowInsets;
import io.flutter.plugin.platform.PlatformPlugin;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint b() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(PlatformPlugin.DEFAULT_SYSTEM_UI, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint c(int i3, int i10, int i11) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i3, i10, i11);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ WindowInsets.Builder e() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder f(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ void m() {
    }
}
