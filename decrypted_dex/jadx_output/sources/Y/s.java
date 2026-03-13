package Y;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s implements TextWatcher, SpanWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8693a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f8694b = new AtomicInteger(0);

    public s(Object obj) {
        this.f8693a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f8693a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        ((TextWatcher) this.f8693a).beforeTextChanged(charSequence, i3, i10, i11);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i3, int i10) {
        if (this.f8694b.get() <= 0 || !(obj instanceof v)) {
            ((SpanWatcher) this.f8693a).onSpanAdded(spannable, obj, i3, i10);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i3, int i10, int i11, int i12) {
        if (this.f8694b.get() <= 0 || !(obj instanceof v)) {
            ((SpanWatcher) this.f8693a).onSpanChanged(spannable, obj, i3, i10, i11, i12);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i3, int i10) {
        if (this.f8694b.get() <= 0 || !(obj instanceof v)) {
            ((SpanWatcher) this.f8693a).onSpanRemoved(spannable, obj, i3, i10);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        ((TextWatcher) this.f8693a).onTextChanged(charSequence, i3, i10, i11);
    }
}
