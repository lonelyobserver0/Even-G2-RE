package a0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0382d extends Y.f {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f9239a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f9240b;

    public C0382d(TextView textView, C0383e c0383e) {
        this.f9239a = new WeakReference(textView);
        this.f9240b = new WeakReference(c0383e);
    }

    @Override // Y.f
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f9239a.get();
        InputFilter inputFilter = (InputFilter) this.f9240b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    Y.h a3 = Y.h.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a3.getClass();
                        length = text.length();
                    }
                    CharSequence e10 = a3.e(text, 0, length);
                    if (text == e10) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(e10);
                    int selectionEnd = Selection.getSelectionEnd(e10);
                    textView.setText(e10);
                    if (e10 instanceof Spannable) {
                        Spannable spannable = (Spannable) e10;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
