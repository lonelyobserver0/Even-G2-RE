package m0;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1262a {
    public static AudioFocusRequest a(int i3, AudioAttributes audioAttributes, boolean z2, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        return new AudioFocusRequest.Builder(i3).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z2).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }
}
