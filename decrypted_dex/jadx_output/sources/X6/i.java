package X6;

import com.mapbox.maps.MapController;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class i implements Style.OnStyleLoaded {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8456b;

    public /* synthetic */ i(Object obj, int i3) {
        this.f8455a = i3;
        this.f8456b = obj;
    }

    @Override // com.mapbox.maps.Style.OnStyleLoaded
    public final void onStyleLoaded(Style style) {
        switch (this.f8455a) {
            case 0:
                i7.n callback = (i7.n) this.f8456b;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Intrinsics.checkNotNullParameter(style, "style");
                callback.invoke(style);
                break;
            case 1:
                MapController._init_$lambda$2$lambda$1((MapController) this.f8456b, style);
                break;
            default:
                MapboxMap._init_$lambda$3((MapboxMap) this.f8456b, style);
                break;
        }
    }
}
