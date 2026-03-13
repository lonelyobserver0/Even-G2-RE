package a0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* renamed from: a0.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0389k implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f9254a;

    public C0389k(TransformationMethod transformationMethod) {
        this.f9254a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f9254a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || Y.h.a().b() != 1) {
            return charSequence;
        }
        Y.h a3 = Y.h.a();
        a3.getClass();
        return a3.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i3, Rect rect) {
        TransformationMethod transformationMethod = this.f9254a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i3, rect);
        }
    }
}
