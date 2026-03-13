package Xa;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import com.google.android.gms.internal.measurement.H1;
import com.stub.StubApp;
import i5.C1059c;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8563b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Handler handler, int i3) {
        super(handler);
        this.f8562a = i3;
        this.f8563b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f8562a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2, Uri uri) {
        switch (this.f8562a) {
            case 3:
                io.flutter.view.l lVar = (io.flutter.view.l) this.f8563b;
                if (!lVar.f15207u) {
                    if (Settings.Global.getFloat(lVar.f15193f, StubApp.getString2(7432), 1.0f) == 0.0f) {
                        lVar.f15198l |= 4;
                    } else {
                        lVar.f15198l &= -5;
                    }
                    lVar.f15189b.f14324b.setAccessibilityFeatures(lVar.f15198l);
                    break;
                }
                break;
            default:
                super.onChange(z2, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(H1 h12) {
        super(null);
        this.f8562a = 2;
        Objects.requireNonNull(h12);
        this.f8563b = h12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C1059c c1059c) {
        super(null);
        this.f8562a = 1;
        Objects.requireNonNull(c1059c);
        this.f8563b = c1059c;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        switch (this.f8562a) {
            case 0:
                super.onChange(z2);
                r rVar = (r) this.f8563b;
                if (rVar.f8575h == null) {
                    return;
                }
                rVar.d();
                return;
            case 1:
                ((AtomicBoolean) ((C1059c) this.f8563b).f14842a).set(true);
                return;
            case 2:
                H1 h12 = (H1) this.f8563b;
                synchronized (h12.f11283e) {
                    h12.f11284f = null;
                    h12.f11281c.run();
                }
                synchronized (h12) {
                    try {
                        Iterator it = h12.f11285g.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                onChange(z2, null);
                return;
        }
    }
}
