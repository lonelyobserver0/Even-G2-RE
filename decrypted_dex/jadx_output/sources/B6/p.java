package B6;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.yalantis.ucrop.view.GestureCropImageView;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f729b;

    public /* synthetic */ p(Object obj, int i3) {
        this.f728a = i3;
        this.f729b = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.f728a) {
            case 1:
                GestureCropImageView gestureCropImageView = (GestureCropImageView) this.f729b;
                float doubleTapTargetScale = gestureCropImageView.getDoubleTapTargetScale();
                float x7 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (doubleTapTargetScale > gestureCropImageView.getMaxScale()) {
                    doubleTapTargetScale = gestureCropImageView.getMaxScale();
                }
                float currentScale = gestureCropImageView.getCurrentScale();
                Oa.b bVar = new Oa.b(gestureCropImageView, currentScale, doubleTapTargetScale - currentScale, x7, y10);
                gestureCropImageView.f5347D = bVar;
                gestureCropImageView.post(bVar);
                break;
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        switch (this.f728a) {
            case 0:
                if (motionEvent.getActionMasked() == 0) {
                    q qVar = (q) this.f729b;
                    qVar.f739w = true;
                    qVar.f740x = new PointF(motionEvent.getX(), motionEvent.getY());
                }
                return true;
            default:
                return super.onDoubleTapEvent(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        switch (this.f728a) {
            case 1:
                ((GestureCropImageView) this.f729b).d(-f10, -f11);
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f10, f11);
        }
    }
}
