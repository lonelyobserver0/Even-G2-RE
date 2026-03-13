package Xa;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import com.stub.StubApp;
import gb.C0975d;

/* renamed from: Xa.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0363c implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0364d f8525a;

    public C0363c(AbstractActivityC0364d abstractActivityC0364d) {
        this.f8525a = abstractActivityC0364d;
    }

    public final void onBackCancelled() {
        AbstractActivityC0364d abstractActivityC0364d = this.f8525a;
        String string2 = StubApp.getString2(7320);
        if (abstractActivityC0364d.l(string2)) {
            g gVar = abstractActivityC0364d.f8528b;
            gVar.c();
            Ya.c cVar = gVar.f8536b;
            if (cVar != null) {
                cVar.j.f14327a.invokeMethod(string2, null);
            } else {
                Log.w(StubApp.getString2(7321), StubApp.getString2(7322));
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC0364d abstractActivityC0364d = this.f8525a;
        String string2 = StubApp.getString2(7323);
        if (abstractActivityC0364d.l(string2)) {
            g gVar = abstractActivityC0364d.f8528b;
            gVar.c();
            Ya.c cVar = gVar.f8536b;
            if (cVar != null) {
                cVar.j.f14327a.invokeMethod(string2, null);
            } else {
                Log.w(StubApp.getString2(7321), StubApp.getString2(7324));
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0364d abstractActivityC0364d = this.f8525a;
        String string2 = StubApp.getString2(7325);
        if (abstractActivityC0364d.l(string2)) {
            g gVar = abstractActivityC0364d.f8528b;
            gVar.c();
            Ya.c cVar = gVar.f8536b;
            if (cVar == null) {
                Log.w(StubApp.getString2(7321), StubApp.getString2(7326));
                return;
            }
            C0975d c0975d = cVar.j;
            c0975d.getClass();
            c0975d.f14327a.invokeMethod(string2, C0975d.a(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0364d abstractActivityC0364d = this.f8525a;
        String string2 = StubApp.getString2(7327);
        if (abstractActivityC0364d.l(string2)) {
            g gVar = abstractActivityC0364d.f8528b;
            gVar.c();
            Ya.c cVar = gVar.f8536b;
            if (cVar == null) {
                Log.w(StubApp.getString2(7321), StubApp.getString2(7328));
                return;
            }
            C0975d c0975d = cVar.j;
            c0975d.getClass();
            c0975d.f14327a.invokeMethod(string2, C0975d.a(backEvent));
        }
    }
}
