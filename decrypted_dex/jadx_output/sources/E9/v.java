package E9;

import android.speech.tts.UtteranceProgressListener;
import com.mapbox.common.LoggingLevel;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class v extends UtteranceProgressListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f2108a;

    public v(w wVar) {
        this.f2108a = wVar;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        this.f2108a.a();
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        if (D9.l.a(D9.l.g(), LoggingLevel.ERROR)) {
            D9.l.e(StubApp.getString2(1970), StubApp.getString2(1948));
        }
        this.f2108a.a();
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStop(String str, boolean z2) {
        this.f2108a.a();
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str, int i3) {
        if (D9.l.a(D9.l.g(), LoggingLevel.ERROR)) {
            D9.l.e(StubApp.getString2(1971) + i3, StubApp.getString2(1948));
        }
        this.f2108a.a();
    }
}
