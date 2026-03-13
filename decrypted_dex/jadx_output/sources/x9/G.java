package x9;

import com.mapbox.geojson.FeatureCollection;
import com.mapbox.maps.Style;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class G extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f22923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Style f22924b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f22925c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FeatureCollection f22926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f22928f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(I i3, Style style, Map.Entry entry, FeatureCollection featureCollection, int i10, String str) {
        super(0);
        this.f22923a = i3;
        this.f22924b = style;
        this.f22925c = entry;
        this.f22926d = featureCollection;
        this.f22927e = i10;
        this.f22928f = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map.Entry entry = this.f22925c;
        String str = ((y9.r) entry.getKey()).f23600a;
        Integer valueOf = Integer.valueOf(this.f22927e);
        Style style = this.f22924b;
        I i3 = this.f22923a;
        i3.getClass();
        I.k(style, str, this.f22926d, valueOf);
        i3.f22958n.put(entry.getKey(), new y9.o(this.f22928f));
        return Unit.INSTANCE;
    }
}
