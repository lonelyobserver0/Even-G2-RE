package C;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.ClipData;
import android.location.LocationRequest;
import android.view.ContentInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class n {
    public static /* bridge */ /* synthetic */ boolean B(Exception exc) {
        return exc instanceof ForegroundServiceStartNotAllowedException;
    }

    public static /* bridge */ /* synthetic */ LocationRequest c(Object obj) {
        return (LocationRequest) obj;
    }

    public static /* synthetic */ ContentInfo.Builder g(ClipData clipData, int i3) {
        return new ContentInfo.Builder(clipData, i3);
    }

    public static /* bridge */ /* synthetic */ ContentInfo i(Object obj) {
        return (ContentInfo) obj;
    }
}
