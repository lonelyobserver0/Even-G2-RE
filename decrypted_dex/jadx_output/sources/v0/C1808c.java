package v0;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1808c implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f21703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1809d f21704b;

    public C1808c(C1809d c1809d, Handler handler) {
        this.f21704b = c1809d;
        this.f21703a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i3) {
        this.f21703a.post(new E.j(i3, 2, this));
    }
}
