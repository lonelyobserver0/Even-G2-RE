package m7;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import l7.q;
import l7.t;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c extends e {

    /* renamed from: f, reason: collision with root package name */
    public final q f17130f;

    /* renamed from: g, reason: collision with root package name */
    public int f17131g;

    /* renamed from: h, reason: collision with root package name */
    public int f17132h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q accuracyRadiusChangedListener) {
        super(AbstractC1276b.f17129b);
        Intrinsics.checkNotNullParameter(accuracyRadiusChangedListener, "accuracyRadiusChangedListener");
        this.f17130f = accuracyRadiusChangedListener;
        this.f17131g = -16776961;
        this.f17132h = -16776961;
    }

    @Override // m7.e
    public final void c(Object obj, float f10) {
        double doubleValue = ((Number) obj).doubleValue();
        if (!this.f17139d) {
            t tVar = this.f17138c;
            if (tVar != null) {
                tVar.q(0.0f);
                return;
            }
            return;
        }
        float coerceAtLeast = RangesKt.coerceAtLeast(0.0f, (float) doubleValue);
        t tVar2 = this.f17138c;
        if (tVar2 != null) {
            tVar2.q(coerceAtLeast);
        }
        t tVar3 = this.f17138c;
        if (tVar3 != null) {
            tVar3.a(this.f17131g, this.f17132h);
        }
        this.f17130f.a();
    }
}
