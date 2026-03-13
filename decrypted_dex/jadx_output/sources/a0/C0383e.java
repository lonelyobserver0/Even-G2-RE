package a0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* renamed from: a0.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0383e implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f9241a;

    /* renamed from: b, reason: collision with root package name */
    public C0382d f9242b;

    public C0383e(TextView textView) {
        this.f9241a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i3, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f9241a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b2 = Y.h.a().b();
        if (b2 != 0) {
            if (b2 == 1) {
                if ((i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i3 != 0 || i10 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i3, i10);
                }
                return Y.h.a().e(charSequence, 0, charSequence.length());
            }
            if (b2 != 3) {
                return charSequence;
            }
        }
        Y.h a3 = Y.h.a();
        if (this.f9242b == null) {
            this.f9242b = new C0382d(textView, this);
        }
        a3.f(this.f9242b);
        return charSequence;
    }
}
