package B6;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o extends b {

    /* renamed from: i, reason: collision with root package name */
    public final GestureDetector f727i;

    public o(Context context, a aVar) {
        super(context, aVar);
        this.f727i = new GestureDetector(context, new m(this));
    }

    @Override // B6.b
    public final boolean a(MotionEvent motionEvent) {
        return this.f727i.onTouchEvent(motionEvent);
    }
}
