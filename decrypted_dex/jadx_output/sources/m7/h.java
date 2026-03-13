package m7;

import K4.m;
import android.view.animation.PathInterpolator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import l7.t;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h extends e {

    /* renamed from: k, reason: collision with root package name */
    public static final PathInterpolator f17143k;

    /* renamed from: f, reason: collision with root package name */
    public final float f17144f;

    /* renamed from: g, reason: collision with root package name */
    public double f17145g;

    /* renamed from: h, reason: collision with root package name */
    public int f17146h;
    public final boolean j;

    static {
        PathInterpolator pathInterpolator = new PathInterpolator(0.0f, 0.0f, 0.25f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(pathInterpolator, "create(\n      0.0f,\n    …  0.25f,\n      1.0f\n    )");
        f17143k = pathInterpolator;
    }

    public h(float f10) {
        super(AbstractC1276b.f17129b);
        this.f17144f = f10;
        this.f17145g = f10 * 10.0d;
        this.f17146h = -16776961;
        this.j = true;
        setDuration(3000L);
        setRepeatMode(1);
        setRepeatCount(-1);
        setInterpolator(f17143k);
    }

    @Override // m7.e
    public final void c(Object obj, float f10) {
        double doubleValue = ((Number) obj).doubleValue();
        float coerceIn = this.j ? RangesKt___RangesKt.coerceIn(1.0f - ((float) (doubleValue / this.f17145g)), 0.0f, 1.0f) : 1.0f;
        t tVar = this.f17138c;
        if (tVar != null) {
            int i3 = this.f17146h;
            float f11 = (float) doubleValue;
            if (f10 <= 0.1f) {
                coerceIn = 0.0f;
            }
            tVar.e(i3, f11, Float.valueOf(coerceIn));
        }
    }

    public final void d() {
        if (this.f17145g <= 0.0d) {
            this.f17145g = this.f17144f * 10.0d;
        }
        if (!isRunning()) {
            a(new Double[]{Double.valueOf(0.0d), Double.valueOf(this.f17145g)}, null);
        }
        addListener(new m(this, 5));
    }
}
