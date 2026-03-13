package E9;

import android.media.AudioManager;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2079b;

    public /* synthetic */ j(Object obj, int i3) {
        this.f2078a = i3;
        this.f2079b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f2078a) {
            case 0:
                k kVar = (k) this.f2079b;
                A1.a callback = new A1.a(9);
                Q2.g gVar = (Q2.g) kVar.f2082c;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(callback, "callback");
                ((AudioManager) gVar.f5711b).abandonAudioFocusRequest(Q2.g.v((F9.a) gVar.f5713d, (r) gVar.f5712c));
                break;
            case 1:
                ((Vc.b) this.f2079b).f7984d.post(new L9.n(this, 20));
                break;
            default:
                ((Runnable) this.f2079b).run();
                break;
        }
    }
}
