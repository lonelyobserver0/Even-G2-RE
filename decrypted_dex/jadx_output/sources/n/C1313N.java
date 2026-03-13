package n;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import m.ViewTreeObserverOnGlobalLayoutListenerC1261d;

/* renamed from: n.N, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1313N extends AbstractC1299C0 implements InterfaceC1315P {

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f17435E;

    /* renamed from: F, reason: collision with root package name */
    public C1310K f17436F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f17437G;

    /* renamed from: H, reason: collision with root package name */
    public int f17438H;

    /* renamed from: I, reason: collision with root package name */
    public final /* synthetic */ C1316Q f17439I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1313N(C1316Q c1316q, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903836);
        this.f17439I = c1316q;
        this.f17437G = new Rect();
        this.f17386q = c1316q;
        this.f17371A = true;
        this.f17372B.setFocusable(true);
        this.f17387r = new C1311L(this);
    }

    @Override // n.InterfaceC1315P
    public final CharSequence d() {
        return this.f17435E;
    }

    @Override // n.InterfaceC1315P
    public final void h(CharSequence charSequence) {
        this.f17435E = charSequence;
    }

    @Override // n.InterfaceC1315P
    public final void k(int i3) {
        this.f17438H = i3;
    }

    @Override // n.InterfaceC1315P
    public final void l(int i3, int i10) {
        ViewTreeObserver viewTreeObserver;
        C1294A c1294a = this.f17372B;
        boolean isShowing = c1294a.isShowing();
        q();
        this.f17372B.setInputMethodMode(2);
        show();
        C1358q0 c1358q0 = this.f17375c;
        c1358q0.setChoiceMode(1);
        c1358q0.setTextDirection(i3);
        c1358q0.setTextAlignment(i10);
        C1316Q c1316q = this.f17439I;
        int selectedItemPosition = c1316q.getSelectedItemPosition();
        C1358q0 c1358q02 = this.f17375c;
        if (c1294a.isShowing() && c1358q02 != null) {
            c1358q02.setListSelectionHidden(false);
            c1358q02.setSelection(selectedItemPosition);
            if (c1358q02.getChoiceMode() != 0) {
                c1358q02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c1316q.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1261d viewTreeObserverOnGlobalLayoutListenerC1261d = new ViewTreeObserverOnGlobalLayoutListenerC1261d(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1261d);
        this.f17372B.setOnDismissListener(new C1312M(this, viewTreeObserverOnGlobalLayoutListenerC1261d));
    }

    @Override // n.AbstractC1299C0, n.InterfaceC1315P
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f17436F = (C1310K) listAdapter;
    }

    public final void q() {
        int i3;
        C1294A c1294a = this.f17372B;
        Drawable background = c1294a.getBackground();
        C1316Q c1316q = this.f17439I;
        if (background != null) {
            background.getPadding(c1316q.f17456h);
            int layoutDirection = c1316q.getLayoutDirection();
            Rect rect = c1316q.f17456h;
            i3 = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c1316q.f17456h;
            rect2.right = 0;
            rect2.left = 0;
            i3 = 0;
        }
        int paddingLeft = c1316q.getPaddingLeft();
        int paddingRight = c1316q.getPaddingRight();
        int width = c1316q.getWidth();
        int i10 = c1316q.f17455g;
        if (i10 == -2) {
            int a3 = c1316q.a(this.f17436F, c1294a.getBackground());
            int i11 = c1316q.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c1316q.f17456h;
            int i12 = (i11 - rect3.left) - rect3.right;
            if (a3 > i12) {
                a3 = i12;
            }
            p(Math.max(a3, (width - paddingLeft) - paddingRight));
        } else if (i10 == -1) {
            p((width - paddingLeft) - paddingRight);
        } else {
            p(i10);
        }
        this.f17378f = c1316q.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f17377e) - this.f17438H) + i3 : paddingLeft + this.f17438H + i3;
    }
}
