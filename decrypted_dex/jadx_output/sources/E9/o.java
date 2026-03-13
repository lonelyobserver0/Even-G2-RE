package E9;

import android.media.MediaPlayer;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class o implements MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2093b;

    public /* synthetic */ o(Object obj, int i3) {
        this.f2092a = i3;
        this.f2093b = obj;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        switch (this.f2092a) {
            case 0:
                String string2 = StubApp.getString2(392);
                p pVar = (p) this.f2093b;
                Intrinsics.checkNotNullParameter(pVar, string2);
                pVar.a(mediaPlayer);
                break;
            default:
                Vc.b bVar = ((Vc.g) this.f2093b).f8009e;
                bVar.f7986f.f(2, StubApp.getString2(1961));
                Wc.b bVar2 = bVar.f7986f;
                bVar2.d(bVar2.h(), StubApp.getString2(1962));
                break;
        }
    }
}
