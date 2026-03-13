package R4;

import R3.InterfaceC0234c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements InterfaceC0234c {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f6188a = new AtomicReference();

    @Override // R3.InterfaceC0234c
    public final void a(boolean z2) {
        synchronized (h.f6191k) {
            try {
                Iterator it = new ArrayList(h.f6192l.values()).iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar.f6197e.get()) {
                        hVar.l(z2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
