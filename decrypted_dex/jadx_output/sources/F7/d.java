package F7;

import com.mapbox.api.directions.v5.models.Closure;
import com.mapbox.api.directions.v5.models.Incident;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends Lambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f2283b = new d(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f2284c = new d(2, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f2285d = new d(2, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f2286e = new d(2, 3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2287a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, int i10) {
        super(i3);
        this.f2287a = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2287a) {
            case 0:
                Closure.Builder builder = (Closure.Builder) obj;
                int intValue = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(builder, "$this$null");
                Closure.Builder geometryIndexStart = builder.geometryIndexStart(Integer.valueOf(intValue));
                Intrinsics.checkNotNullExpressionValue(geometryIndexStart, "this.geometryIndexStart(it)");
                return geometryIndexStart;
            case 1:
                Closure.Builder builder2 = (Closure.Builder) obj;
                int intValue2 = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(builder2, "$this$null");
                Closure.Builder geometryIndexEnd = builder2.geometryIndexEnd(Integer.valueOf(intValue2));
                Intrinsics.checkNotNullExpressionValue(geometryIndexEnd, "this.geometryIndexEnd(it)");
                return geometryIndexEnd;
            case 2:
                Incident.Builder builder3 = (Incident.Builder) obj;
                int intValue3 = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(builder3, "$this$null");
                Incident.Builder geometryIndexStart2 = builder3.geometryIndexStart(Integer.valueOf(intValue3));
                Intrinsics.checkNotNullExpressionValue(geometryIndexStart2, "this.geometryIndexStart(it)");
                return geometryIndexStart2;
            default:
                Incident.Builder builder4 = (Incident.Builder) obj;
                int intValue4 = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(builder4, "$this$null");
                Incident.Builder geometryIndexEnd2 = builder4.geometryIndexEnd(Integer.valueOf(intValue4));
                Intrinsics.checkNotNullExpressionValue(geometryIndexEnd2, "this.geometryIndexEnd(it)");
                return geometryIndexEnd2;
        }
    }
}
