package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class N extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public e0 f10052a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f10053b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10054c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10055d;

    public N(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10053b = new Rect();
        this.f10054c = true;
        this.f10055d = false;
    }

    public N(int i3, int i10) {
        super(i3, i10);
        this.f10053b = new Rect();
        this.f10054c = true;
        this.f10055d = false;
    }

    public N(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f10053b = new Rect();
        this.f10054c = true;
        this.f10055d = false;
    }

    public N(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f10053b = new Rect();
        this.f10054c = true;
        this.f10055d = false;
    }

    public N(N n10) {
        super((ViewGroup.LayoutParams) n10);
        this.f10053b = new Rect();
        this.f10054c = true;
        this.f10055d = false;
    }
}
