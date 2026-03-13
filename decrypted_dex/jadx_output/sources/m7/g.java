package m7;

import com.mapbox.geojson.Point;
import kotlin.jvm.internal.Intrinsics;
import l7.p;
import l7.t;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g extends e {

    /* renamed from: f, reason: collision with root package name */
    public final p f17142f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p indicatorPositionChangedListener) {
        super(AbstractC1276b.f17128a);
        Intrinsics.checkNotNullParameter(indicatorPositionChangedListener, "indicatorPositionChangedListener");
        this.f17142f = indicatorPositionChangedListener;
    }

    @Override // m7.e
    public final void c(Object obj, float f10) {
        Point value = (Point) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        t tVar = this.f17138c;
        if (tVar != null) {
            tVar.i(value);
        }
        this.f17142f.a(value);
    }
}
