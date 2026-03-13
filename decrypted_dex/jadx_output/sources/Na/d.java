package Na;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends StateListDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final int f4969a;

    public d(Drawable drawable, int i3) {
        this.f4969a = i3;
        addState(new int[]{R.attr.state_selected}, drawable);
        addState(new int[0], drawable);
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2 = false;
        for (int i3 : iArr) {
            if (i3 == 16842913) {
                z2 = true;
            }
        }
        if (z2) {
            setColorFilter(this.f4969a, PorterDuff.Mode.SRC_ATOP);
        } else {
            clearColorFilter();
        }
        return super.onStateChange(iArr);
    }
}
