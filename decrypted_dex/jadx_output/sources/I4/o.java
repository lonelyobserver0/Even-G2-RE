package I4;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o extends q {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f3200h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f3201b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3202c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3203d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3204e;

    /* renamed from: f, reason: collision with root package name */
    public float f3205f;

    /* renamed from: g, reason: collision with root package name */
    public float f3206g;

    public o(float f10, float f11, float f12, float f13) {
        this.f3201b = f10;
        this.f3202c = f11;
        this.f3203d = f12;
        this.f3204e = f13;
    }

    @Override // I4.q
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3209a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f3200h;
        rectF.set(this.f3201b, this.f3202c, this.f3203d, this.f3204e);
        path.arcTo(rectF, this.f3205f, this.f3206g, false);
        path.transform(matrix);
    }
}
