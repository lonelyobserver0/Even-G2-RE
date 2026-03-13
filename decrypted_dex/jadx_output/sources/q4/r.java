package q4;

import R3.AbstractC0239h;
import R3.InterfaceC0240i;
import android.app.Activity;
import com.stub.StubApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r extends AbstractC0239h {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20071b;

    public r(InterfaceC0240i interfaceC0240i) {
        super(interfaceC0240i);
        this.f20071b = new ArrayList();
        interfaceC0240i.g(StubApp.getString2(22225), this);
    }

    public static r j(Activity activity) {
        r rVar;
        InterfaceC0240i b2 = AbstractC0239h.b(activity);
        synchronized (b2) {
            try {
                rVar = (r) b2.b(r.class, StubApp.getString2("22225"));
                if (rVar == null) {
                    rVar = new r(b2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    @Override // R3.AbstractC0239h
    public final void i() {
        synchronized (this.f20071b) {
            try {
                Iterator it = this.f20071b.iterator();
                while (it.hasNext()) {
                    q qVar = (q) ((WeakReference) it.next()).get();
                    if (qVar != null) {
                        qVar.b();
                    }
                }
                this.f20071b.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(q qVar) {
        synchronized (this.f20071b) {
            this.f20071b.add(new WeakReference(qVar));
        }
    }
}
