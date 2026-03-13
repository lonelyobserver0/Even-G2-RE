package R5;

import android.media.MediaPlayer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class c implements MediaPlayer.OnCompletionListener {
    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }
}
