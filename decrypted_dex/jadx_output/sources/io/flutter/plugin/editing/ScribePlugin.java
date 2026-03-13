package io.flutter.plugin.editing;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import gb.V;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ScribePlugin {
    private final InputMethodManager mInputMethodManager;
    private final V mScribeChannel;
    private View mView;

    public ScribePlugin(View view, InputMethodManager inputMethodManager, V v2) {
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.mView = view;
        this.mInputMethodManager = inputMethodManager;
        this.mScribeChannel = v2;
        v2.f14310a = this;
    }

    public void destroy() {
        this.mScribeChannel.f14310a = null;
    }

    public boolean isFeatureAvailable() {
        return Build.VERSION.SDK_INT >= 34 && isStylusHandwritingAvailable();
    }

    @TargetApi(34)
    public boolean isStylusHandwritingAvailable() {
        boolean isStylusHandwritingAvailable;
        isStylusHandwritingAvailable = this.mInputMethodManager.isStylusHandwritingAvailable();
        return isStylusHandwritingAvailable;
    }

    public void setView(View view) {
        if (view == this.mView) {
            return;
        }
        this.mView = view;
    }

    @TargetApi(33)
    public void startStylusHandwriting() {
        this.mInputMethodManager.startStylusHandwriting(this.mView);
    }
}
