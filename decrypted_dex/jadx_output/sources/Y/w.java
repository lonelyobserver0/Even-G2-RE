package Y;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class w implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8706a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f8707b;

    public w(Spannable spannable) {
        this.f8707b = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i3) {
        return this.f8707b.charAt(i3);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f8707b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f8707b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f8707b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f8707b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f8707b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i3, int i10, Class cls) {
        return this.f8707b.getSpans(i3, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f8707b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i3, int i10, Class cls) {
        return this.f8707b.nextSpanTransition(i3, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.f8707b;
        if (!this.f8706a && (spannable instanceof PrecomputedText)) {
            this.f8707b = new SpannableString(spannable);
        }
        this.f8706a = true;
        this.f8707b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i3, int i10, int i11) {
        Spannable spannable = this.f8707b;
        if (!this.f8706a && (spannable instanceof PrecomputedText)) {
            this.f8707b = new SpannableString(spannable);
        }
        this.f8706a = true;
        this.f8707b.setSpan(obj, i3, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i3, int i10) {
        return this.f8707b.subSequence(i3, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f8707b.toString();
    }
}
