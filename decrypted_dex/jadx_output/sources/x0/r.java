package x0;

import a0.C0379a;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import sa.C1608a;
import v0.C1798A;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1608a f22729a;

    public r(C1608a c1608a) {
        this.f22729a = c1608a;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i3) {
        s sVar;
        C0379a c0379a;
        C1798A c1798a;
        if (audioTrack.equals(((s) this.f22729a.f20822c).f22787v) && (c0379a = (sVar = (s) this.f22729a.f20822c).f22783r) != null && sVar.f22754V && (c1798a = ((v) c0379a.f9233b).f1812I) != null) {
            c1798a.a();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(((s) this.f22729a.f20822c).f22787v)) {
            ((s) this.f22729a.f20822c).f22753U = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        s sVar;
        C0379a c0379a;
        C1798A c1798a;
        if (audioTrack.equals(((s) this.f22729a.f20822c).f22787v) && (c0379a = (sVar = (s) this.f22729a.f20822c).f22783r) != null && sVar.f22754V && (c1798a = ((v) c0379a.f9233b).f1812I) != null) {
            c1798a.a();
        }
    }
}
