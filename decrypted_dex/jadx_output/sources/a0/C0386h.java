package a0;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* renamed from: a0.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0386h extends Y3.a {

    /* renamed from: f, reason: collision with root package name */
    public final C0385g f9248f;

    public C0386h(TextView textView) {
        this.f9248f = new C0385g(textView);
    }

    @Override // Y3.a
    public final TransformationMethod D(TransformationMethod transformationMethod) {
        return !(Y.h.f8658k != null) ? transformationMethod : this.f9248f.D(transformationMethod);
    }

    @Override // Y3.a
    public final InputFilter[] l(InputFilter[] inputFilterArr) {
        return !(Y.h.f8658k != null) ? inputFilterArr : this.f9248f.l(inputFilterArr);
    }

    @Override // Y3.a
    public final boolean n() {
        return this.f9248f.f9247h;
    }

    @Override // Y3.a
    public final void u(boolean z2) {
        if (Y.h.f8658k != null) {
            this.f9248f.u(z2);
        }
    }

    @Override // Y3.a
    public final void x(boolean z2) {
        boolean z10 = Y.h.f8658k != null;
        C0385g c0385g = this.f9248f;
        if (z10) {
            c0385g.x(z2);
        } else {
            c0385g.f9247h = z2;
        }
    }
}
