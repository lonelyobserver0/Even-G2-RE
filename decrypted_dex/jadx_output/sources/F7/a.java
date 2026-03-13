package F7;

import com.mapbox.api.directions.v5.models.Closure;
import com.mapbox.api.directions.v5.models.Incident;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f2263b = new a(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f2264c = new a(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f2265d = new a(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f2266e = new a(1, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f2267f = new a(1, 4);

    /* renamed from: g, reason: collision with root package name */
    public static final a f2268g = new a(1, 5);

    /* renamed from: h, reason: collision with root package name */
    public static final a f2269h = new a(1, 6);
    public static final a j = new a(1, 7);

    /* renamed from: k, reason: collision with root package name */
    public static final a f2270k = new a(1, 8);

    /* renamed from: l, reason: collision with root package name */
    public static final a f2271l = new a(1, 9);

    /* renamed from: m, reason: collision with root package name */
    public static final a f2272m = new a(1, 10);

    /* renamed from: n, reason: collision with root package name */
    public static final a f2273n = new a(1, 11);

    /* renamed from: p, reason: collision with root package name */
    public static final a f2274p = new a(1, 12);

    /* renamed from: q, reason: collision with root package name */
    public static final a f2275q = new a(1, 13);

    /* renamed from: r, reason: collision with root package name */
    public static final a f2276r = new a(1, 14);

    /* renamed from: s, reason: collision with root package name */
    public static final a f2277s = new a(1, 15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2278a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i3, int i10) {
        super(i3);
        this.f2278a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2278a) {
            case 0:
                LegAnnotation mergeAnnotationProperty = (LegAnnotation) obj;
                Intrinsics.checkNotNullParameter(mergeAnnotationProperty, "$this$mergeAnnotationProperty");
                return mergeAnnotationProperty.congestion();
            case 1:
                LegAnnotation mergeAnnotationProperty2 = (LegAnnotation) obj;
                Intrinsics.checkNotNullParameter(mergeAnnotationProperty2, "$this$mergeAnnotationProperty");
                return mergeAnnotationProperty2.congestionNumeric();
            case 2:
                LegAnnotation mergeAnnotationProperty3 = (LegAnnotation) obj;
                Intrinsics.checkNotNullParameter(mergeAnnotationProperty3, "$this$mergeAnnotationProperty");
                return mergeAnnotationProperty3.currentSpeed();
            case 3:
                LegAnnotation mergeAnnotationProperty4 = (LegAnnotation) obj;
                Intrinsics.checkNotNullParameter(mergeAnnotationProperty4, "$this$mergeAnnotationProperty");
                return mergeAnnotationProperty4.distance();
            case 4:
                LegAnnotation mergeAnnotationProperty5 = (LegAnnotation) obj;
                Intrinsics.checkNotNullParameter(mergeAnnotationProperty5, "$this$mergeAnnotationProperty");
                return mergeAnnotationProperty5.duration();
            case 5:
                LegAnnotation mergeAnnotationProperty6 = (LegAnnotation) obj;
                Intrinsics.checkNotNullParameter(mergeAnnotationProperty6, "$this$mergeAnnotationProperty");
                return mergeAnnotationProperty6.freeflowSpeed();
            case 6:
                LegAnnotation mergeAnnotationProperty7 = (LegAnnotation) obj;
                Intrinsics.checkNotNullParameter(mergeAnnotationProperty7, "$this$mergeAnnotationProperty");
                return mergeAnnotationProperty7.maxspeed();
            case 7:
                LegAnnotation mergeAnnotationProperty8 = (LegAnnotation) obj;
                Intrinsics.checkNotNullParameter(mergeAnnotationProperty8, "$this$mergeAnnotationProperty");
                return mergeAnnotationProperty8.speed();
            case 8:
                Closure closure = (Closure) obj;
                Intrinsics.checkNotNullParameter(closure, "$this$null");
                Closure.Builder builder = closure.toBuilder();
                Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
                return builder;
            case 9:
                Closure.Builder builder2 = (Closure.Builder) obj;
                Intrinsics.checkNotNullParameter(builder2, "$this$null");
                Closure build = builder2.build();
                Intrinsics.checkNotNullExpressionValue(build, "this.build()");
                return build;
            case 10:
                Closure closure2 = (Closure) obj;
                Intrinsics.checkNotNullParameter(closure2, "$this$null");
                return closure2.geometryIndexStart();
            case 11:
                Closure closure3 = (Closure) obj;
                Intrinsics.checkNotNullParameter(closure3, "$this$null");
                return closure3.geometryIndexEnd();
            case 12:
                Incident incident = (Incident) obj;
                Intrinsics.checkNotNullParameter(incident, "$this$null");
                Incident.Builder builder3 = incident.toBuilder();
                Intrinsics.checkNotNullExpressionValue(builder3, "this.toBuilder()");
                return builder3;
            case 13:
                Incident.Builder builder4 = (Incident.Builder) obj;
                Intrinsics.checkNotNullParameter(builder4, "$this$null");
                Incident build2 = builder4.build();
                Intrinsics.checkNotNullExpressionValue(build2, "this.build()");
                return build2;
            case 14:
                Incident incident2 = (Incident) obj;
                Intrinsics.checkNotNullParameter(incident2, "$this$null");
                return incident2.geometryIndexStart();
            default:
                Incident incident3 = (Incident) obj;
                Intrinsics.checkNotNullParameter(incident3, "$this$null");
                return incident3.geometryIndexEnd();
        }
    }
}
