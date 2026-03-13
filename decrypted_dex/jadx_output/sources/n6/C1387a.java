package n6;

import B0.o;
import android.hardware.Camera;

/* renamed from: n6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1387a implements Camera.AutoFocusCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1388b f17805a;

    public C1387a(C1388b c1388b) {
        this.f17805a = c1388b;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z2, Camera camera) {
        this.f17805a.f17811e.post(new o(this, 28));
    }
}
