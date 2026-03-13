package K4;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f3664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f3665b;

    public j(o oVar, AutoCompleteTextView autoCompleteTextView) {
        this.f3665b = oVar;
        this.f3664a = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            o oVar = this.f3665b;
            oVar.getClass();
            long currentTimeMillis = System.currentTimeMillis() - oVar.f3677i;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                oVar.f3675g = false;
            }
            o.d(oVar, this.f3664a);
            view.performClick();
        }
        return false;
    }
}
