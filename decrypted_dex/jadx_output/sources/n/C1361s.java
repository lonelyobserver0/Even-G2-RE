package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.google.android.gms.internal.measurement.D1;

/* renamed from: n.s, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1361s extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final C1363t f17598a;

    /* renamed from: b, reason: collision with root package name */
    public final C1355p f17599b;

    /* renamed from: c, reason: collision with root package name */
    public final C1322X f17600c;

    /* renamed from: d, reason: collision with root package name */
    public C1371x f17601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0085 A[Catch: all -> 0x0064, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1361s(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            n.P0.a(r8)
            r6 = 2130903193(0x7f030099, float:1.7413197E38)
            r7.<init>(r8, r9, r6)
            android.content.Context r8 = r7.getContext()
            n.O0.a(r7, r8)
            n.X r8 = new n.X
            r8.<init>(r7)
            r7.f17600c = r8
            r8.f(r9, r6)
            r8.b()
            n.p r8 = new n.p
            r8.<init>(r7)
            r7.f17599b = r8
            r8.d(r9, r6)
            n.t r8 = new n.t
            r8.<init>(r7)
            r7.f17598a = r8
            android.content.Context r8 = r7.getContext()
            int[] r3 = h.AbstractC0997a.f14404l
            a5.c r8 = a5.c.E(r8, r9, r3, r6)
            java.lang.Object r0 = r8.f9283c
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r2 = r7.getContext()
            java.lang.Object r1 = r8.f9283c
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r1 = r7
            r4 = r9
            N.I.h(r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L64
            r3 = 0
            if (r2 == 0) goto L67
            int r9 = r0.getResourceId(r9, r3)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L67
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> L64 android.content.res.Resources.NotFoundException -> L67
            android.graphics.drawable.Drawable r9 = com.google.android.gms.internal.measurement.D1.m(r2, r9)     // Catch: java.lang.Throwable -> L64 android.content.res.Resources.NotFoundException -> L67
            r7.setCheckMarkDrawable(r9)     // Catch: java.lang.Throwable -> L64 android.content.res.Resources.NotFoundException -> L67
            goto L7e
        L64:
            r0 = move-exception
            r9 = r0
            goto Lab
        L67:
            boolean r9 = r0.hasValue(r3)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L7e
            int r9 = r0.getResourceId(r3, r3)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L7e
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> L64
            android.graphics.drawable.Drawable r9 = com.google.android.gms.internal.measurement.D1.m(r2, r9)     // Catch: java.lang.Throwable -> L64
            r7.setCheckMarkDrawable(r9)     // Catch: java.lang.Throwable -> L64
        L7e:
            r9 = 2
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L8c
            android.content.res.ColorStateList r9 = r8.p(r9)     // Catch: java.lang.Throwable -> L64
            r7.setCheckMarkTintList(r9)     // Catch: java.lang.Throwable -> L64
        L8c:
            r9 = 3
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto La0
            r2 = -1
            int r9 = r0.getInt(r9, r2)     // Catch: java.lang.Throwable -> L64
            r0 = 0
            android.graphics.PorterDuff$Mode r9 = n.AbstractC1346k0.c(r9, r0)     // Catch: java.lang.Throwable -> L64
            r7.setCheckMarkTintMode(r9)     // Catch: java.lang.Throwable -> L64
        La0:
            r8.I()
            n.x r8 = r7.getEmojiTextViewHelper()
            r8.b(r4, r6)
            return
        Lab:
            r8.I()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C1361s.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C1371x getEmojiTextViewHelper() {
        if (this.f17601d == null) {
            this.f17601d = new C1371x(this);
        }
        return this.f17601d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1322X c1322x = this.f17600c;
        if (c1322x != null) {
            c1322x.b();
        }
        C1355p c1355p = this.f17599b;
        if (c1355p != null) {
            c1355p.a();
        }
        C1363t c1363t = this.f17598a;
        if (c1363t != null) {
            c1363t.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1355p c1355p = this.f17599b;
        if (c1355p != null) {
            return c1355p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1355p c1355p = this.f17599b;
        if (c1355p != null) {
            return c1355p.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C1363t c1363t = this.f17598a;
        if (c1363t != null) {
            return c1363t.f17604a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C1363t c1363t = this.f17598a;
        if (c1363t != null) {
            return c1363t.f17605b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f17600c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f17600c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        D1.p(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1355p c1355p = this.f17599b;
        if (c1355p != null) {
            c1355p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C1355p c1355p = this.f17599b;
        if (c1355p != null) {
            c1355p.f(i3);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1363t c1363t = this.f17598a;
        if (c1363t != null) {
            if (c1363t.f17608e) {
                c1363t.f17608e = false;
            } else {
                c1363t.f17608e = true;
                c1363t.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1322X c1322x = this.f17600c;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1322X c1322x = this.f17600c;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1355p c1355p = this.f17599b;
        if (c1355p != null) {
            c1355p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1355p c1355p = this.f17599b;
        if (c1355p != null) {
            c1355p.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C1363t c1363t = this.f17598a;
        if (c1363t != null) {
            c1363t.f17604a = colorStateList;
            c1363t.f17606c = true;
            c1363t.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C1363t c1363t = this.f17598a;
        if (c1363t != null) {
            c1363t.f17605b = mode;
            c1363t.f17607d = true;
            c1363t.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1322X c1322x = this.f17600c;
        c1322x.i(colorStateList);
        c1322x.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1322X c1322x = this.f17600c;
        c1322x.j(mode);
        c1322x.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C1322X c1322x = this.f17600c;
        if (c1322x != null) {
            c1322x.g(context, i3);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i3) {
        setCheckMarkDrawable(D1.m(getContext(), i3));
    }
}
