package E4;

import Ec.l;
import android.R;
import android.content.res.ColorStateList;
import n.C1298C;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends C1298C {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f1900g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f1901e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1902f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1901e == null) {
            int m4 = l.m(this, 2130903232);
            int m10 = l.m(this, 2130903241);
            int m11 = l.m(this, 2130903249);
            this.f1901e = new ColorStateList(f1900g, new int[]{l.q(1.0f, m11, m4), l.q(0.54f, m11, m10), l.q(0.38f, m11, m10), l.q(0.38f, m11, m10)});
        }
        return this.f1901e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1902f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f1902f = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
