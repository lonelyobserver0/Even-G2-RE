package x9;

import com.mapbox.maps.StylePropertyValue;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: x9.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1929h extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StylePropertyValue f23017b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1929h(StylePropertyValue stylePropertyValue, int i3) {
        super(1);
        this.f23016a = i3;
        this.f23017b = stylePropertyValue;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f23016a) {
            case 0:
                RouteLineViewOptionsData it = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                RouteLineViewOptionsData it2 = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 2:
                RouteLineViewOptionsData it3 = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                break;
            case 3:
                RouteLineViewOptionsData it4 = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                break;
            case 4:
                RouteLineViewOptionsData it5 = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                break;
            default:
                RouteLineViewOptionsData it6 = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                break;
        }
        return this.f23017b;
    }
}
