package n;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: n.F, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1304F extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C1306G f17396a;

    public C1304F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903801);
        O0.a(this, getContext());
        C1306G c1306g = new C1306G(this);
        this.f17396a = c1306g;
        c1306g.e(attributeSet, 2130903801);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1306G c1306g = this.f17396a;
        Drawable drawable = c1306g.f17398f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C1304F c1304f = c1306g.f17397e;
        if (drawable.setState(c1304f.getDrawableState())) {
            c1304f.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f17396a.f17398f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f17396a.j(canvas);
    }
}
