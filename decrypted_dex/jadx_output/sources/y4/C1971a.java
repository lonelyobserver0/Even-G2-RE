package y4;

import Ec.l;
import android.R;
import android.content.res.ColorStateList;
import n.C1359r;

/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1971a extends C1359r {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f23510g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f23511e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23512f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f23511e == null) {
            int m4 = l.m(this, 2130903232);
            int m10 = l.m(this, 2130903249);
            int m11 = l.m(this, 2130903241);
            this.f23511e = new ColorStateList(f23510g, new int[]{l.q(1.0f, m10, m4), l.q(0.54f, m10, m11), l.q(0.38f, m10, m11), l.q(0.38f, m10, m11)});
        }
        return this.f23511e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23512f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f23512f = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
