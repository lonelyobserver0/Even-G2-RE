package n;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: n.B0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class ViewOnTouchListenerC1297B0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1299C0 f17364a;

    public ViewOnTouchListenerC1297B0(AbstractC1299C0 abstractC1299C0) {
        this.f17364a = abstractC1299C0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1294A c1294a;
        int action = motionEvent.getAction();
        int x7 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        AbstractC1299C0 abstractC1299C0 = this.f17364a;
        if (action == 0 && (c1294a = abstractC1299C0.f17372B) != null && c1294a.isShowing() && x7 >= 0 && x7 < abstractC1299C0.f17372B.getWidth() && y10 >= 0 && y10 < abstractC1299C0.f17372B.getHeight()) {
            abstractC1299C0.f17392x.postDelayed(abstractC1299C0.f17388s, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        abstractC1299C0.f17392x.removeCallbacks(abstractC1299C0.f17388s);
        return false;
    }
}
