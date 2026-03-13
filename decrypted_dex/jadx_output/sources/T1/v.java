package T1;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class v extends u {
    @Override // T1.u
    public final void G(View view, int i3, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i3, i10, i11, i12);
    }

    @Override // T1.u
    public final void H(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // T1.u
    public final void I(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // Y3.a
    public final float m(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // Y3.a
    public final void y(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // T1.u, Y3.a
    public final void z(View view, int i3) {
        view.setTransitionVisibility(i3);
    }
}
