package n;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1327b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f17505a;

    public C1327b(ActionBarContainer actionBarContainer) {
        this.f17505a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f17505a;
        if (actionBarContainer.f9423g) {
            Drawable drawable = actionBarContainer.f9422f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f9420d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f9421e;
        if (drawable3 == null || !actionBarContainer.f9424h) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f17505a;
        if (actionBarContainer.f9423g) {
            if (actionBarContainer.f9422f != null) {
                actionBarContainer.f9420d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f9420d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
