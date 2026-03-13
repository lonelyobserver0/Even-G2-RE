package n;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import h.AbstractC0997a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Z0 implements InterfaceC1340h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f17488a;

    /* renamed from: b, reason: collision with root package name */
    public int f17489b;

    /* renamed from: c, reason: collision with root package name */
    public final View f17490c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f17491d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f17492e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f17493f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17494g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f17495h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f17496i;
    public final CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f17497k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17498l;

    /* renamed from: m, reason: collision with root package name */
    public C1345k f17499m;

    /* renamed from: n, reason: collision with root package name */
    public final int f17500n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f17501o;

    public Z0(Toolbar toolbar, boolean z2) {
        Drawable drawable;
        this.f17500n = 0;
        this.f17488a = toolbar;
        this.f17495h = toolbar.getTitle();
        this.f17496i = toolbar.getSubtitle();
        this.f17494g = this.f17495h != null;
        this.f17493f = toolbar.getNavigationIcon();
        a5.c E10 = a5.c.E(toolbar.getContext(), null, AbstractC0997a.f14394a, 2130903045);
        int i3 = 15;
        this.f17501o = E10.r(15);
        if (z2) {
            TypedArray typedArray = (TypedArray) E10.f9283c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f17494g = true;
                this.f17495h = text;
                if ((this.f17489b & 8) != 0) {
                    Toolbar toolbar2 = this.f17488a;
                    toolbar2.setTitle(text);
                    if (this.f17494g) {
                        N.I.j(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f17496i = text2;
                if ((this.f17489b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable r8 = E10.r(20);
            if (r8 != null) {
                this.f17492e = r8;
                c();
            }
            Drawable r10 = E10.r(17);
            if (r10 != null) {
                this.f17491d = r10;
                c();
            }
            if (this.f17493f == null && (drawable = this.f17501o) != null) {
                this.f17493f = drawable;
                int i10 = this.f17489b & 4;
                Toolbar toolbar3 = this.f17488a;
                if (i10 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f17490c;
                if (view != null && (this.f17489b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f17490c = inflate;
                if (inflate != null && (this.f17489b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                a(this.f17489b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.f9601w.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f9588m = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.f9577b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f9590n = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.f9578c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f17501o = toolbar.getNavigationIcon();
            } else {
                i3 = 11;
            }
            this.f17489b = i3;
        }
        E10.I();
        if (2131755010 != this.f17500n) {
            this.f17500n = 2131755010;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i11 = this.f17500n;
                this.j = i11 != 0 ? toolbar.getContext().getString(i11) : null;
                b();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new Y0(this));
    }

    public final void a(int i3) {
        View view;
        int i10 = this.f17489b ^ i3;
        this.f17489b = i3;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i3 & 4) != 0) {
                    b();
                }
                int i11 = this.f17489b & 4;
                Toolbar toolbar = this.f17488a;
                if (i11 != 0) {
                    Drawable drawable = this.f17493f;
                    if (drawable == null) {
                        drawable = this.f17501o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                c();
            }
            int i12 = i10 & 8;
            Toolbar toolbar2 = this.f17488a;
            if (i12 != 0) {
                if ((i3 & 8) != 0) {
                    toolbar2.setTitle(this.f17495h);
                    toolbar2.setSubtitle(this.f17496i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) == 0 || (view = this.f17490c) == null) {
                return;
            }
            if ((i3 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f17489b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f17488a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f17500n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i3 = this.f17489b;
        if ((i3 & 2) == 0) {
            drawable = null;
        } else if ((i3 & 1) != 0) {
            drawable = this.f17492e;
            if (drawable == null) {
                drawable = this.f17491d;
            }
        } else {
            drawable = this.f17491d;
        }
        this.f17488a.setLogo(drawable);
    }
}
