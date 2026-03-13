package T6;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.CustomGeometrySourceOptions;
import com.mapbox.maps.CustomRasterSourceOptions;
import com.mapbox.maps.MapboxStyleManager;
import com.stub.StubApp;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7213e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f7214f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String id, CustomGeometrySourceOptions options) {
        super(id);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f7214f = options;
    }

    @Override // T6.d
    public final Expected a(MapboxStyleManager style) {
        switch (this.f7213e) {
            case 0:
                Intrinsics.checkNotNullParameter(style, "style");
                return style.addStyleCustomGeometrySource(this.f7217a, (CustomGeometrySourceOptions) this.f7214f);
            default:
                Intrinsics.checkNotNullParameter(style, "style");
                return style.addStyleCustomRasterSource(this.f7217a, (CustomRasterSourceOptions) this.f7214f);
        }
    }

    @Override // T6.d
    public final String e() {
        switch (this.f7213e) {
            case 0:
                return StubApp.getString2(6217);
            default:
                return StubApp.getString2(6216);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String id, CustomRasterSourceOptions options) {
        super(id);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f7214f = options;
    }
}
