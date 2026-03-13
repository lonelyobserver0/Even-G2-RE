package E9;

import android.media.MediaPlayer;
import android.util.Log;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class m implements MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2091a;

    public /* synthetic */ m(int i3) {
        this.f2091a = i3;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i3, int i10) {
        switch (this.f2091a) {
            case 0:
                D9.l.e(StubApp.getString2(1959) + i3 + StubApp.getString2(1960) + i10, StubApp.getString2(1952));
                return false;
            default:
                Log.w(StubApp.getString2(1958), StubApp.getString2(1957) + i3 + StubApp.getString2(81) + i10);
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer.release();
                return true;
        }
    }
}
