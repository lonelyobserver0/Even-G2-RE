package A9;

import com.mapbox.common.Cancelable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l implements Cancelable {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f238a = new AtomicBoolean(false);

    @Override // com.mapbox.common.Cancelable
    public final void cancel() {
        this.f238a.set(true);
    }
}
