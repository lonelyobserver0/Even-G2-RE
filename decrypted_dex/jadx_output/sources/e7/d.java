package e7;

import E.l;
import Y6.j;
import Y6.t;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapboxMap;
import com.stub.StubApp;
import f7.C0930a;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f13653b = new d(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f13654c = new d(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13655a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, int i10) {
        super(i3);
        this.f13655a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13655a) {
            case 0:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "it");
                Intrinsics.checkNotNullParameter(context, "context");
                final c cVar = new c(context, null, 0);
                Resources resources = cVar.getResources();
                ThreadLocal threadLocal = l.f1716a;
                Drawable drawable = resources.getDrawable(2131165352, null);
                if (drawable != null) {
                    cVar.setCompassImage(drawable);
                }
                int dimensionPixelSize = cVar.getResources().getDimensionPixelSize(2131099738);
                cVar.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                cVar.setOnClickListener(new View.OnClickListener() { // from class: e7.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        c this$0 = c.this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        e eVar = this$0.f13652d;
                        if (eVar == null || !eVar.f13663h.f14178l) {
                            return;
                        }
                        Y6.a aVar = eVar.f13661f;
                        MapboxMap mapboxMap = null;
                        String string2 = StubApp.getString2(17377);
                        if (aVar != null) {
                            CameraOptions build = new CameraOptions.Builder().bearing(Double.valueOf(0.0d)).build();
                            Intrinsics.checkNotNullExpressionValue(build, string2);
                            Intrinsics.checkNotNullParameter("Maps-Compass", StubApp.getString2(9619));
                            Unit unit = Unit.INSTANCE;
                            ((j) aVar).h(build, new t("Maps-Compass", 300L, null));
                        } else {
                            MapboxMap mapboxMap2 = eVar.f13659d;
                            if (mapboxMap2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mapCameraManager");
                            } else {
                                mapboxMap = mapboxMap2;
                            }
                            CameraOptions build2 = new CameraOptions.Builder().bearing(Double.valueOf(0.0d)).build();
                            Intrinsics.checkNotNullExpressionValue(build2, string2);
                            mapboxMap.setCamera(build2);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        Iterator it = eVar.j.iterator();
                        if (it.hasNext()) {
                            throw com.mapbox.common.b.e(it);
                        }
                    }
                });
                cVar.setContentDescription(context.getString(2131755154));
                return cVar;
            default:
                C0930a CompassSettings = (C0930a) obj;
                Intrinsics.checkNotNullParameter(CompassSettings, "$this$CompassSettings");
                return Unit.INSTANCE;
        }
    }
}
