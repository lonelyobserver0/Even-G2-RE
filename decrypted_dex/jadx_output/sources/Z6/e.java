package Z6;

import Y6.m;
import Y6.n;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.util.MathUtils;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends d {

    /* renamed from: p, reason: collision with root package name */
    public final boolean f9004p;

    /* renamed from: q, reason: collision with root package name */
    public final n f9005q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m options, Function1 function1) {
        super(k.f9011b, options);
        Intrinsics.checkNotNullParameter(options, "options");
        EdgeInsets edgeInsets = l.f9016a;
        this.f9004p = true;
        if (function1 != null) {
            function1.invoke(this);
        }
        this.f9005q = n.f8791c;
    }

    @Override // Z6.d
    public final n l() {
        return this.f9005q;
    }

    @Override // Z6.d
    public final Object[] o(Object startValue) {
        Intrinsics.checkNotNullParameter(startValue, "startValue");
        if (!this.f9004p) {
            return super.o(startValue);
        }
        MathUtils mathUtils = MathUtils.INSTANCE;
        Object[] objArr = this.f8996d;
        int length = objArr.length + 1;
        double[] dArr = new double[length];
        int i3 = 0;
        while (i3 < length) {
            dArr[i3] = i3 == 0 ? ((Double) startValue).doubleValue() : ((Double[]) objArr)[i3 - 1].doubleValue();
            i3++;
        }
        return ArraysKt.toTypedArray(mathUtils.prepareOptimalBearingPath(dArr));
    }
}
