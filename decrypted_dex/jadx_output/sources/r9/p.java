package r9;

import com.mapbox.navigation.ui.maps.route.line.model.NavigationRouteLine;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f20457b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i3, List list) {
        super(0);
        this.f20456a = i3;
        this.f20457b = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List<NavigationRouteLine> list = this.f20457b;
        switch (this.f20456a) {
            case 0:
                r rVar = r.f20461a;
                ArrayList arrayList = new ArrayList(CollectionsKt.f(list));
                for (NavigationRouteLine navigationRouteLine : list) {
                    arrayList.add((y9.h) r.f20476q.invoke(navigationRouteLine.getRoute(), navigationRouteLine.getIdentifier()));
                }
                return arrayList;
            default:
                return list;
        }
    }
}
