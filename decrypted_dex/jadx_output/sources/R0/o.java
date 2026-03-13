package R0;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6026a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayManager f6027b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6028c;

    public /* synthetic */ o(Object obj, DisplayManager displayManager, int i3) {
        this.f6026a = i3;
        this.f6028c = obj;
        this.f6027b = displayManager;
    }

    private final void a(int i3) {
    }

    private final void b(int i3) {
    }

    private final void c(int i3) {
    }

    private final void d(int i3) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i3) {
        switch (this.f6026a) {
            case 0:
            case 1:
                break;
            default:
                Iterator it = ((ArrayList) this.f6028c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i3);
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i3) {
        switch (this.f6026a) {
            case 0:
                if (i3 == 0) {
                    q.a((q) this.f6028c, this.f6027b.getDisplay(0));
                    break;
                }
                break;
            case 1:
                if (i3 == 0) {
                    float refreshRate = this.f6027b.getDisplay(0).getRefreshRate();
                    Ac.q qVar = (Ac.q) this.f6028c;
                    qVar.f381b = (long) (1.0E9d / refreshRate);
                    ((FlutterJNI) qVar.f382c).setRefreshRateFPS(refreshRate);
                    break;
                }
                break;
            default:
                if (this.f6027b.getDisplay(i3) != null) {
                    Iterator it = ((ArrayList) this.f6028c).iterator();
                    while (it.hasNext()) {
                        ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i3);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i3) {
        switch (this.f6026a) {
            case 0:
            case 1:
                break;
            default:
                Iterator it = ((ArrayList) this.f6028c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i3);
                }
                break;
        }
    }
}
