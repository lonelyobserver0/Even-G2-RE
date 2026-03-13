package i;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import com.google.android.gms.internal.measurement.D1;
import l.C1132c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class t extends ContentFrameLayout {
    public final /* synthetic */ v j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, C1132c c1132c) {
        super(c1132c, null);
        this.j = vVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.j.u(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x7 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (x7 < -5 || y10 < -5 || x7 > getWidth() + 5 || y10 > getHeight() + 5) {
                v vVar = this.j;
                vVar.s(vVar.z(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i3) {
        setBackgroundDrawable(D1.m(getContext(), i3));
    }
}
