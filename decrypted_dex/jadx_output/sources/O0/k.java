package O0;

import M4.Y;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f5141a;

    public k(q qVar) {
        this.f5141a = qVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z2) {
        q qVar = this.f5141a;
        Y y10 = q.f5172i;
        qVar.c();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z2) {
        q qVar = this.f5141a;
        Y y10 = q.f5172i;
        qVar.c();
    }
}
