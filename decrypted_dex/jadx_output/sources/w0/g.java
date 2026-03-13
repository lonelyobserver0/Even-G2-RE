package w0;

import android.content.Context;
import android.media.AudioProfile;
import android.media.MediaRecorder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract /* synthetic */ class g {
    public static /* bridge */ /* synthetic */ AudioProfile c(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ MediaRecorder d(Context context) {
        return new MediaRecorder(context);
    }
}
