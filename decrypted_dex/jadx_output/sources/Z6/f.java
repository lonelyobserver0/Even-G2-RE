package Z6;

import Y6.m;
import Y6.n;
import android.animation.TypeEvaluator;
import com.mapbox.geojson.Point;
import com.mapbox.maps.EdgeInsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends d {

    /* renamed from: p, reason: collision with root package name */
    public final boolean f9006p;

    /* renamed from: q, reason: collision with root package name */
    public final n f9007q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(m mVar, boolean z2, Function1 function1) {
        this(k.f9013d, mVar, z2, function1);
        EdgeInsets edgeInsets = l.f9016a;
    }

    @Override // Z6.d
    public final n l() {
        return this.f9007q;
    }

    @Override // Z6.d
    public final Object[] o(Object startValue) {
        List plus;
        Intrinsics.checkNotNullParameter(startValue, "startValue");
        if (!this.f9006p) {
            return super.o(startValue);
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt.listOf((Point) startValue), this.f8996d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(plus));
        Iterator it = plus.iterator();
        while (it.hasNext()) {
            arrayList2.add(Y6.k.i((Point) it.next()));
        }
        for (Point point : CollectionsKt.asReversed(arrayList2)) {
            if (arrayList.isEmpty()) {
                arrayList.add(point);
            } else {
                arrayList.add(Y6.k.g(point, (Point) CollectionsKt.last((List) arrayList)));
            }
        }
        Object[] array = CollectionsKt.asReversedMutable(arrayList).toArray(new Point[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return array;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TypeEvaluator evaluator, m options, boolean z2, Function1 function1) {
        super(evaluator, options);
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f9006p = z2;
        if (function1 != null) {
            function1.invoke(this);
        }
        this.f9007q = n.f8789a;
    }
}
