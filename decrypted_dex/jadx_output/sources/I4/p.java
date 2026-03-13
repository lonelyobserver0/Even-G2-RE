package I4;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p extends q {

    /* renamed from: b, reason: collision with root package name */
    public float f3207b;

    /* renamed from: c, reason: collision with root package name */
    public float f3208c;

    @Override // I4.q
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3209a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f3207b, this.f3208c);
        path.transform(matrix);
    }
}
