package F8;

import android.os.Build;
import com.mapbox.common.SdkInformation;
import com.mapbox.common.TelemetrySystemUtils;
import com.mapbox.common.ValueUtilsKt;
import com.stub.StubApp;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import u8.k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final Map f2324c;

    /* renamed from: a, reason: collision with root package name */
    public final String f2325a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2326b;

    static {
        Pair pair;
        Pair pair2 = TuplesKt.to(StubApp.getString2(1420), ValueUtilsKt.toValue(StubApp.getString2(2153)));
        Pair pair3 = TuplesKt.to(StubApp.getString2(2155), ValueUtilsKt.toValue(StubApp.getString2(2154)));
        int ordinal = k.f21475a.ordinal();
        if (ordinal == 0) {
            pair = TuplesKt.to(StubApp.getString2(2158), StubApp.getString2(2159));
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            pair = TuplesKt.to(StubApp.getString2(2156), StubApp.getString2(2157));
        }
        Pair pair4 = TuplesKt.to(StubApp.getString2(2161), ValueUtilsKt.toValue(new SdkInformation((String) pair.component1(), StubApp.getString2(2160), (String) pair.component2()).getName()));
        Pair pair5 = TuplesKt.to(StubApp.getString2(2163), ValueUtilsKt.toValue(StubApp.getString2(2162) + Build.VERSION.RELEASE));
        String str = Build.MODEL;
        if (str == null) {
            str = StubApp.getString2(2164);
        }
        f2324c = MapsKt.mapOf(pair2, pair3, pair4, pair5, TuplesKt.to(StubApp.getString2(217), ValueUtilsKt.toValue(str)), TuplesKt.to(StubApp.getString2(2165), ValueUtilsKt.toValue((Integer) 0)), TuplesKt.to(StubApp.getString2(2167), ValueUtilsKt.toValue(StubApp.getString2(2166))), TuplesKt.to(StubApp.getString2(2169), ValueUtilsKt.toValue(StubApp.getString2(2168))), TuplesKt.to(StubApp.getString2(2171), ValueUtilsKt.toValue(StubApp.getString2(2170))), TuplesKt.to(StubApp.getString2(2172), ValueUtilsKt.toValue((Integer) 0)), TuplesKt.to(StubApp.getString2(2173), ValueUtilsKt.toValue((Integer) 0)), TuplesKt.to(StubApp.getString2(2174), ValueUtilsKt.toValue(Boolean.FALSE)), TuplesKt.to(StubApp.getString2(2175), ValueUtilsKt.toValue("")), TuplesKt.to(StubApp.getString2(2176), ValueUtilsKt.toValue$default(Double.valueOf(0.0d), false, 1, (Object) null)), TuplesKt.to(StubApp.getString2(2177), ValueUtilsKt.toValue$default(Double.valueOf(0.0d), false, 1, (Object) null)));
    }

    public a(String payload) {
        Intrinsics.checkNotNullParameter("copilot-error", StubApp.getString2(660));
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter("1.0", StubApp.getString2(2178));
        String obtainCurrentDate = TelemetrySystemUtils.obtainCurrentDate();
        Intrinsics.checkNotNullExpressionValue(obtainCurrentDate, "obtainCurrentDate()");
        this.f2325a = obtainCurrentDate;
        this.f2326b = StubApp.getString2(2153);
    }
}
