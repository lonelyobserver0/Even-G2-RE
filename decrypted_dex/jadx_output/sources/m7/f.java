package m7;

import b3.C0506h;
import kotlin.jvm.internal.Intrinsics;
import l7.t;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f extends e {

    /* renamed from: f, reason: collision with root package name */
    public final C0506h f17140f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17141g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C0506h indicatorBearingChangedListener) {
        super(AbstractC1276b.f17129b);
        Intrinsics.checkNotNullParameter(indicatorBearingChangedListener, "indicatorBearingChangedListener");
        this.f17140f = indicatorBearingChangedListener;
        this.f17141g = true;
    }

    @Override // m7.e
    public final void c(Object obj, float f10) {
        double doubleValue = ((Number) obj).doubleValue();
        if (this.f17141g) {
            t tVar = this.f17138c;
            if (tVar != null) {
                tVar.f(doubleValue);
            }
            this.f17140f.a(doubleValue);
        }
    }
}
