package e7;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c extends AppCompatImageView implements InterfaceC0850a {

    /* renamed from: d, reason: collision with root package name */
    public e f13652d;

    public int getCompassGravity() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        return ((FrameLayout.LayoutParams) layoutParams).gravity;
    }

    public Drawable getCompassImage() {
        Drawable drawable = getDrawable();
        Intrinsics.checkNotNullExpressionValue(drawable, "drawable");
        return drawable;
    }

    public float getCompassRotation() {
        return getRotation();
    }

    public void setCompassAlpha(float f10) {
        setAlpha(f10);
    }

    public void setCompassEnabled(boolean z2) {
        if (isEnabled() != z2) {
            setEnabled(z2);
        }
    }

    public void setCompassGravity(int i3) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).gravity = i3;
    }

    public void setCompassImage(Drawable compass) {
        Intrinsics.checkNotNullParameter(compass, "compass");
        setImageDrawable(compass);
    }

    public void setCompassRotation(float f10) {
        setRotation(f10);
    }

    public void setCompassVisible(boolean z2) {
        setVisibility(z2 ? 0 : 8);
    }
}
