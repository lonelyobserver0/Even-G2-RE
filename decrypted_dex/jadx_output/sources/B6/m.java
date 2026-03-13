package B6;

import android.view.MotionEvent;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f726a;

    public m(o oVar) {
        this.f726a = oVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        o oVar = this.f726a;
        return oVar.b(10) && ((n) oVar.f682h).onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        o oVar = this.f726a;
        return oVar.b(11) && ((n) oVar.f682h).onDoubleTapEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        o oVar = this.f726a;
        return oVar.b(9) && ((n) oVar.f682h).onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        o oVar = this.f726a;
        return oVar.b(7) && ((n) oVar.f682h).onFling(motionEvent, motionEvent2, f10, f11);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        o oVar = this.f726a;
        if (oVar.b(6)) {
            ((n) oVar.f682h).onLongPress(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        o oVar = this.f726a;
        return oVar.b(0) && ((n) oVar.f682h).onScroll(motionEvent, motionEvent2, f10, f11);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        o oVar = this.f726a;
        if (oVar.b(8)) {
            ((n) oVar.f682h).onShowPress(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        o oVar = this.f726a;
        return oVar.b(12) && ((n) oVar.f682h).onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        o oVar = this.f726a;
        return oVar.b(5) && ((n) oVar.f682h).onSingleTapUp(motionEvent);
    }
}
