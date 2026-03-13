package a0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: a0.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0388j implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f9251a;

    /* renamed from: b, reason: collision with root package name */
    public C0387i f9252b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9253c = true;

    public C0388j(EditText editText) {
        this.f9251a = editText;
    }

    public static void a(EditText editText, int i3) {
        int length;
        if (i3 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            Y.h a3 = Y.h.a();
            if (editableText == null) {
                length = 0;
            } else {
                a3.getClass();
                length = editableText.length();
            }
            a3.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        EditText editText = this.f9251a;
        if (editText.isInEditMode() || !this.f9253c || Y.h.f8658k == null || i10 > i11 || !(charSequence instanceof Spannable)) {
            return;
        }
        int b2 = Y.h.a().b();
        if (b2 != 0) {
            if (b2 == 1) {
                Y.h.a().e((Spannable) charSequence, i3, i11 + i3);
                return;
            } else if (b2 != 3) {
                return;
            }
        }
        Y.h a3 = Y.h.a();
        if (this.f9252b == null) {
            this.f9252b = new C0387i(editText);
        }
        a3.f(this.f9252b);
    }
}
