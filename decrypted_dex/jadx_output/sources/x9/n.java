package x9;

import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f23033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f23034b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List list, double d8) {
        super(1);
        this.f23033a = list;
        this.f23034b = d8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RouteLineViewOptionsData it = (RouteLineViewOptionsData) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        r9.r rVar = r9.r.f20461a;
        return AbstractC1526a.M(r9.r.p(it, 0.0d, y9.u.f23614f, this.f23033a, this.f23034b));
    }
}
