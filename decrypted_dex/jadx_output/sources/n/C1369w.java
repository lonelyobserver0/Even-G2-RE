package n;

import N.C0158d;
import N.C0160f;
import N.InterfaceC0157c;
import N.InterfaceC0168n;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.google.android.gms.internal.measurement.D1;
import com.stub.StubApp;

/* renamed from: n.w, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1369w extends EditText implements InterfaceC0168n {

    /* renamed from: a, reason: collision with root package name */
    public final C1355p f17623a;

    /* renamed from: b, reason: collision with root package name */
    public final C1322X f17624b;

    /* renamed from: c, reason: collision with root package name */
    public final Q.h f17625c;

    /* renamed from: d, reason: collision with root package name */
    public final C1296B f17626d;

    /* renamed from: e, reason: collision with root package name */
    public C1367v f17627e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1369w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903329);
        P0.a(context);
        O0.a(this, getContext());
        C1355p c1355p = new C1355p(this);
        this.f17623a = c1355p;
        c1355p.d(attributeSet, 2130903329);
        C1322X c1322x = new C1322X(this);
        this.f17624b = c1322x;
        c1322x.f(attributeSet, 2130903329);
        c1322x.b();
        this.f17625c = new Q.h();
        C1296B c1296b = new C1296B(this);
        this.f17626d = c1296b;
        c1296b.e(attributeSet, 2130903329);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener d8 = c1296b.d(keyListener);
        if (d8 == keyListener) {
            return;
        }
        super.setKeyListener(d8);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C1367v getSuperCaller() {
        if (this.f17627e == null) {
            this.f17627e = new C1367v(this);
        }
        return this.f17627e;
    }

    @Override // N.InterfaceC0168n
    public final C0160f a(C0160f c0160f) {
        this.f17625c.getClass();
        return Q.h.a(this, c0160f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1355p c1355p = this.f17623a;
        if (c1355p != null) {
            c1355p.a();
        }
        C1322X c1322x = this.f17624b;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1355p c1355p = this.f17623a;
        if (c1355p != null) {
            return c1355p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1355p c1355p = this.f17623a;
        if (c1355p != null) {
            return c1355p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f17624b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f17624b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] d8;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f17624b.getClass();
        C1322X.h(editorInfo, onCreateInputConnection, this);
        D1.p(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (d8 = N.I.d(this)) != null) {
            editorInfo.contentMimeTypes = d8;
            onCreateInputConnection = new P.b(onCreateInputConnection, new C2.d(this, 20));
        }
        return this.f17626d.f(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || i3 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService(StubApp.getString2(18353))).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && N.I.d(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i(StubApp.getString2(5046), StubApp.getString2(21258) + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z2 = AbstractC1302E.a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i3) {
        InterfaceC0157c interfaceC0157c;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || N.I.d(this) == null || !(i3 == 16908322 || i3 == 16908337)) {
            return super.onTextContextMenuItem(i3);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService(StubApp.getString2(18687));
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i10 >= 31) {
                interfaceC0157c = new Z9.q(primaryClip, 1);
            } else {
                C0158d c0158d = new C0158d();
                c0158d.f4773b = primaryClip;
                c0158d.f4774c = 1;
                interfaceC0157c = c0158d;
            }
            interfaceC0157c.d(i3 == 16908322 ? 0 : 1);
            N.I.f(this, interfaceC0157c.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1355p c1355p = this.f17623a;
        if (c1355p != null) {
            c1355p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C1355p c1355p = this.f17623a;
        if (c1355p != null) {
            c1355p.f(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1322X c1322x = this.f17624b;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1322X c1322x = this.f17624b;
        if (c1322x != null) {
            c1322x.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f17626d.g(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f17626d.d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1355p c1355p = this.f17623a;
        if (c1355p != null) {
            c1355p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1355p c1355p = this.f17623a;
        if (c1355p != null) {
            c1355p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1322X c1322x = this.f17624b;
        c1322x.i(colorStateList);
        c1322x.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1322X c1322x = this.f17624b;
        c1322x.j(mode);
        c1322x.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C1322X c1322x = this.f17624b;
        if (c1322x != null) {
            c1322x.g(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
