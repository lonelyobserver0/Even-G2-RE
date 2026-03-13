package androidx.appcompat.view.menu;

import a5.c;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import h.AbstractC0997a;
import m.n;
import m.y;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public n f9401a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f9402b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f9403c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f9404d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f9405e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f9406f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f9407g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f9408h;
    public LinearLayout j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f9409k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9410l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f9411m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9412n;

    /* renamed from: p, reason: collision with root package name */
    public final Drawable f9413p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f9414q;

    /* renamed from: r, reason: collision with root package name */
    public LayoutInflater f9415r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9416s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c E10 = c.E(getContext(), attributeSet, AbstractC0997a.f14410r, 2130903544);
        this.f9409k = E10.r(5);
        TypedArray typedArray = (TypedArray) E10.f9283c;
        this.f9410l = typedArray.getResourceId(1, -1);
        this.f9412n = typedArray.getBoolean(7, false);
        this.f9411m = context;
        this.f9413p = E10.r(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, 2130903323, 0);
        this.f9414q = obtainStyledAttributes.hasValue(0);
        E10.I();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f9415r == null) {
            this.f9415r = LayoutInflater.from(getContext());
        }
        return this.f9415r;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f9407g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // m.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(m.n r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.a(m.n):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f9408h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9408h.getLayoutParams();
        rect.top = this.f9408h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // m.y
    public n getItemData() {
        return this.f9401a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f9409k);
        TextView textView = (TextView) findViewById(2131231133);
        this.f9404d = textView;
        int i3 = this.f9410l;
        if (i3 != -1) {
            textView.setTextAppearance(this.f9411m, i3);
        }
        this.f9406f = (TextView) findViewById(2131231060);
        ImageView imageView = (ImageView) findViewById(2131231094);
        this.f9407g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f9413p);
        }
        this.f9408h = (ImageView) findViewById(2131230892);
        this.j = (LinearLayout) findViewById(2131230829);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        if (this.f9402b != null && this.f9412n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f9402b.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i3, i10);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f9403c == null && this.f9405e == null) {
            return;
        }
        if ((this.f9401a.f16973x & 4) != 0) {
            if (this.f9403c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(2131427345, (ViewGroup) this, false);
                this.f9403c = radioButton;
                LinearLayout linearLayout = this.j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f9403c;
            view = this.f9405e;
        } else {
            if (this.f9405e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(2131427342, (ViewGroup) this, false);
                this.f9405e = checkBox;
                LinearLayout linearLayout2 = this.j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f9405e;
            view = this.f9403c;
        }
        if (z2) {
            compoundButton.setChecked(this.f9401a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f9405e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f9403c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f9401a.f16973x & 4) != 0) {
            if (this.f9403c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(2131427345, (ViewGroup) this, false);
                this.f9403c = radioButton;
                LinearLayout linearLayout = this.j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f9403c;
        } else {
            if (this.f9405e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(2131427342, (ViewGroup) this, false);
                this.f9405e = checkBox;
                LinearLayout linearLayout2 = this.j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f9405e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f9416s = z2;
        this.f9412n = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f9408h;
        if (imageView != null) {
            imageView.setVisibility((this.f9414q || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f9401a.f16963n.getClass();
        boolean z2 = this.f9416s;
        if (z2 || this.f9412n) {
            ImageView imageView = this.f9402b;
            if (imageView == null && drawable == null && !this.f9412n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(2131427343, (ViewGroup) this, false);
                this.f9402b = imageView2;
                LinearLayout linearLayout = this.j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f9412n) {
                this.f9402b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f9402b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f9402b.getVisibility() != 0) {
                this.f9402b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f9404d.getVisibility() != 8) {
                this.f9404d.setVisibility(8);
            }
        } else {
            this.f9404d.setText(charSequence);
            if (this.f9404d.getVisibility() != 0) {
                this.f9404d.setVisibility(0);
            }
        }
    }
}
