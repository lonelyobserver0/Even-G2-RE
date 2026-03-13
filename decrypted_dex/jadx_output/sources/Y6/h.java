package Y6;

import com.mapbox.geojson.Point;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.ScreenCoordinate;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends ObservableProperty {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f8758b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, int i3) {
        super(null);
        this.f8757a = i3;
        this.f8758b = jVar;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        switch (this.f8757a) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                Point point = (Point) obj2;
                Point point2 = (Point) obj;
                if (point == null || Intrinsics.areEqual(point2, point)) {
                    return;
                }
                Iterator it = this.f8758b.f8767d.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).a(point);
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(property, "property");
                Double d8 = (Double) obj2;
                Double d10 = (Double) obj;
                if (d8 != null) {
                    double doubleValue = d8.doubleValue();
                    if (Intrinsics.areEqual(d10, doubleValue)) {
                        return;
                    }
                    Iterator it2 = this.f8758b.f8768e.iterator();
                    while (it2.hasNext()) {
                        ((l) it2.next()).a(Double.valueOf(doubleValue));
                    }
                    return;
                }
                return;
            case 2:
                Intrinsics.checkNotNullParameter(property, "property");
                EdgeInsets edgeInsets = (EdgeInsets) obj2;
                EdgeInsets edgeInsets2 = (EdgeInsets) obj;
                if (edgeInsets == null || Intrinsics.areEqual(edgeInsets2, edgeInsets)) {
                    return;
                }
                Iterator it3 = this.f8758b.f8769f.iterator();
                while (it3.hasNext()) {
                    ((l) it3.next()).a(edgeInsets);
                }
                return;
            case 3:
                Intrinsics.checkNotNullParameter(property, "property");
                if (Intrinsics.areEqual((ScreenCoordinate) obj, (ScreenCoordinate) obj2)) {
                    return;
                }
                Iterator it4 = this.f8758b.f8770g.iterator();
                if (it4.hasNext()) {
                    throw com.mapbox.common.b.e(it4);
                }
                return;
            case 4:
                Intrinsics.checkNotNullParameter(property, "property");
                Double d11 = (Double) obj2;
                Double d12 = (Double) obj;
                if (d11 != null) {
                    double doubleValue2 = d11.doubleValue();
                    if (Intrinsics.areEqual(d12, doubleValue2)) {
                        return;
                    }
                    Iterator it5 = this.f8758b.f8771h.iterator();
                    while (it5.hasNext()) {
                        ((l) it5.next()).a(Double.valueOf(doubleValue2));
                    }
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(property, "property");
                Double d13 = (Double) obj2;
                Double d14 = (Double) obj;
                if (d13 != null) {
                    double doubleValue3 = d13.doubleValue();
                    if (Intrinsics.areEqual(d14, doubleValue3)) {
                        return;
                    }
                    Iterator it6 = this.f8758b.j.iterator();
                    while (it6.hasNext()) {
                        ((l) it6.next()).a(Double.valueOf(doubleValue3));
                    }
                    return;
                }
                return;
        }
    }
}
