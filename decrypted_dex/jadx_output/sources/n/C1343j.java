package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import m.C1259b;

/* renamed from: n.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1343j extends AppCompatImageView implements InterfaceC1347l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1345k f17531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343j(C1345k c1345k, Context context) {
        super(context, null, 2130903071);
        this.f17531d = c1345k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        a1.a(this, getContentDescription());
        setOnTouchListener(new C1259b(this, this));
    }

    @Override // n.InterfaceC1347l
    public final boolean b() {
        return false;
    }

    @Override // n.InterfaceC1347l
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f17531d.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i3, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i3, i10, i11, i12);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
