package Y6;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q implements Z6.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ double f8812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f8813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f8814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f8816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f8817f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f8818g;

    public q(double d8, r rVar, double d10, boolean z2, double d11, double d12, double d13) {
        this.f8812a = d8;
        this.f8813b = rVar;
        this.f8814c = d10;
        this.f8815d = z2;
        this.f8816e = d11;
        this.f8817f = d12;
        this.f8818g = d13;
    }

    @Override // Z6.i
    public final boolean a(Serializable cameraCurrentValue, Object startValue, Object[] values) {
        Intrinsics.checkNotNullParameter(cameraCurrentValue, "cameraCurrentValue");
        Intrinsics.checkNotNullParameter(startValue, "startValue");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.f8812a == 0.0d;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        double cosh;
        ((Number) obj).doubleValue();
        ((Number) obj2).doubleValue();
        this.f8813b.getClass();
        if (Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        double d8 = f10 * this.f8812a;
        double d10 = 1;
        if (this.f8815d) {
            cosh = Math.exp((this.f8816e < this.f8817f ? -1 : 1) * 1.42d * d8);
        } else {
            double d11 = this.f8818g;
            cosh = Math.cosh(d11) / Math.cosh((1.42d * d8) + d11);
        }
        return Double.valueOf(MathKt.log2(d10 / cosh) + this.f8814c);
    }
}
