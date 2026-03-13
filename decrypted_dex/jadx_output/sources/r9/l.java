package r9;

import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ double f20447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f20448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f20449c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List list, double d8, double d10) {
        super(1);
        this.f20447a = d8;
        this.f20448b = list;
        this.f20449c = d10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RouteLineViewOptionsData options = (RouteLineViewOptionsData) obj;
        Intrinsics.checkNotNullParameter(options, "options");
        r rVar = r.f20461a;
        return AbstractC1526a.M(r.p(options, this.f20447a, y9.u.f23614f, this.f20448b, this.f20449c));
    }
}
