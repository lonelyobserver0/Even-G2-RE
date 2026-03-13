package R3;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class I extends AbstractC0239h implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f6102b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f6103c;

    /* renamed from: d, reason: collision with root package name */
    public final c4.h f6104d;

    /* renamed from: e, reason: collision with root package name */
    public final GoogleApiAvailability f6105e;

    public I(InterfaceC0240i interfaceC0240i, GoogleApiAvailability googleApiAvailability) {
        super(interfaceC0240i);
        this.f6103c = new AtomicReference(null);
        this.f6104d = new c4.h(Looper.getMainLooper(), 0);
        this.f6105e = googleApiAvailability;
    }

    @Override // R3.AbstractC0239h
    public final void c(int i3, int i10, Intent intent) {
        AtomicReference atomicReference = this.f6103c;
        G g10 = (G) atomicReference.get();
        if (i3 != 1) {
            if (i3 == 2) {
                int isGooglePlayServicesAvailable = this.f6105e.isGooglePlayServicesAvailable(a());
                if (isGooglePlayServicesAvailable == 0) {
                    atomicReference.set(null);
                    k();
                    return;
                } else {
                    if (g10 == null) {
                        return;
                    }
                    if (g10.f6099b.f11176b == 18 && isGooglePlayServicesAvailable == 18) {
                        return;
                    }
                }
            }
        } else if (i10 == -1) {
            atomicReference.set(null);
            k();
            return;
        } else if (i10 == 0) {
            if (g10 != null) {
                com.google.android.gms.common.b bVar = new com.google.android.gms.common.b(1, intent != null ? intent.getIntExtra(StubApp.getString2(5619), 13) : 13, null, g10.f6099b.toString());
                atomicReference.set(null);
                j(bVar, g10.f6098a);
                return;
            }
            return;
        }
        if (g10 != null) {
            atomicReference.set(null);
            j(g10.f6099b, g10.f6098a);
        }
    }

    @Override // R3.AbstractC0239h
    public final void d(Bundle bundle) {
        if (bundle != null) {
            this.f6103c.set(bundle.getBoolean(StubApp.getString2(5620), false) ? new G(new com.google.android.gms.common.b(bundle.getInt(StubApp.getString2(5621)), (PendingIntent) bundle.getParcelable(StubApp.getString2(5622))), bundle.getInt(StubApp.getString2(5623), -1)) : null);
        }
    }

    @Override // R3.AbstractC0239h
    public final void g(Bundle bundle) {
        G g10 = (G) this.f6103c.get();
        if (g10 == null) {
            return;
        }
        bundle.putBoolean(StubApp.getString2(5620), true);
        bundle.putInt(StubApp.getString2(5623), g10.f6098a);
        com.google.android.gms.common.b bVar = g10.f6099b;
        bundle.putInt(StubApp.getString2(5621), bVar.f11176b);
        bundle.putParcelable(StubApp.getString2(5622), bVar.f11177c);
    }

    @Override // R3.AbstractC0239h
    public void h() {
        this.f6102b = true;
    }

    @Override // R3.AbstractC0239h
    public void i() {
        this.f6102b = false;
    }

    public abstract void j(com.google.android.gms.common.b bVar, int i3);

    public abstract void k();

    public final void l(com.google.android.gms.common.b bVar, int i3) {
        AtomicReference atomicReference;
        G g10 = new G(bVar, i3);
        do {
            atomicReference = this.f6103c;
            while (!atomicReference.compareAndSet(null, g10)) {
                if (atomicReference.get() != null) {
                }
            }
            this.f6104d.post(new Q4.b(this, g10, 14, false));
            return;
        } while (atomicReference.get() == null);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        com.google.android.gms.common.b bVar = new com.google.android.gms.common.b(13, null);
        AtomicReference atomicReference = this.f6103c;
        G g10 = (G) atomicReference.get();
        int i3 = g10 == null ? -1 : g10.f6098a;
        atomicReference.set(null);
        j(bVar, i3);
    }
}
