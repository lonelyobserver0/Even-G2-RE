package a7;

import com.mapbox.maps.ClickInteraction;
import com.mapbox.maps.DragInteraction;
import com.mapbox.maps.LongClickInteraction;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9297b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, int i3) {
        super(2);
        this.f9296a = i3;
        this.f9297b = fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9296a) {
            case 0:
                String layerId = (String) obj;
                Map map = (Map) obj2;
                Intrinsics.checkNotNullParameter(layerId, "layerId");
                Intrinsics.checkNotNullParameter(map, "map");
                return ClickInteraction.Companion.layer$default(ClickInteraction.INSTANCE, layerId, null, null, new c(this.f9297b, map, 0), 6, null);
            case 1:
                String layerId2 = (String) obj;
                Map map2 = (Map) obj2;
                Intrinsics.checkNotNullParameter(layerId2, "layerId");
                Intrinsics.checkNotNullParameter(map2, "map");
                DragInteraction.Companion companion = DragInteraction.INSTANCE;
                f fVar = this.f9297b;
                return DragInteraction.Companion.layer$default(companion, layerId2, null, new c(fVar, map2, 1), new e(fVar, 0), new e(fVar, 1), 2, null);
            default:
                String layerId3 = (String) obj;
                Map map3 = (Map) obj2;
                Intrinsics.checkNotNullParameter(layerId3, "layerId");
                Intrinsics.checkNotNullParameter(map3, "map");
                return LongClickInteraction.Companion.layer$default(LongClickInteraction.INSTANCE, layerId3, null, null, new c(this.f9297b, map3, 2), 6, null);
        }
    }
}
