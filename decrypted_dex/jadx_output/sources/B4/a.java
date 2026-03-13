package B4;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f660a;

    /* renamed from: b, reason: collision with root package name */
    public final int f661b;

    /* renamed from: c, reason: collision with root package name */
    public final int f662c;

    public a(Dialog dialog, Rect rect) {
        this.f660a = dialog;
        this.f661b = rect.left;
        this.f662c = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f661b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f662c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(4);
        view.performClick();
        return this.f660a.onTouchEvent(obtain);
    }
}
