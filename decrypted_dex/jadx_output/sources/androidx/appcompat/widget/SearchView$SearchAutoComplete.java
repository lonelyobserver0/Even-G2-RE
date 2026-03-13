package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import i.RunnableC1018B;
import n.C1353o;
import n.N0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class SearchView$SearchAutoComplete extends C1353o {

    /* renamed from: e, reason: collision with root package name */
    public int f9515e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9516f;

    /* renamed from: g, reason: collision with root package name */
    public final RunnableC1018B f9517g;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9517g = new RunnableC1018B(this, 13);
        this.f9515e = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i3 >= 960 && i10 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i3 < 600) {
            return (i3 < 640 || i10 < 480) ? 160 : 192;
        }
        return 192;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f9515e <= 0 || super.enoughToFilter();
    }

    @Override // n.C1353o, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f9516f) {
            RunnableC1018B runnableC1018B = this.f9517g;
            removeCallbacks(runnableC1018B);
            post(runnableC1018B);
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i3, Rect rect) {
        super.onFocusChanged(z2, i3, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i3, KeyEvent keyEvent) {
        if (i3 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i3, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z2) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        RunnableC1018B runnableC1018B = this.f9517g;
        if (!z2) {
            this.f9516f = false;
            removeCallbacks(runnableC1018B);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.f9516f = true;
                return;
            }
            this.f9516f = false;
            removeCallbacks(runnableC1018B);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    public void setSearchView(N0 n02) {
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i3) {
        super.setThreshold(i3);
        this.f9515e = i3;
    }
}
