package T1;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class u extends Y3.a {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f7151f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f7152g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f7153h = true;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f7154i = true;

    public void G(View view, int i3, int i10, int i11, int i12) {
        if (f7153h) {
            try {
                view.setLeftTopRightBottom(i3, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f7153h = false;
            }
        }
    }

    public void H(View view, Matrix matrix) {
        if (f7151f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f7151f = false;
            }
        }
    }

    public void I(View view, Matrix matrix) {
        if (f7152g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f7152g = false;
            }
        }
    }

    @Override // Y3.a
    public void z(View view, int i3) {
        if (Build.VERSION.SDK_INT == 28) {
            super.z(view, i3);
        } else if (f7154i) {
            try {
                view.setTransitionVisibility(i3);
            } catch (NoSuchMethodError unused) {
                f7154i = false;
            }
        }
    }
}
