package O6;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.maps.Image;
import com.mapbox.maps.ImageStretches;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.MapboxStyleManager;
import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f5219a;

    public b(a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f5219a = builder;
    }

    public final void a(MapboxStyleManager delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        a aVar = this.f5219a;
        String str = aVar.f5215a;
        aVar.getClass();
        float pixelRatio = delegate.getPixelRatio();
        Image image = aVar.f5216b;
        if (image == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImage");
            image = null;
        }
        Image image2 = image;
        aVar.getClass();
        List<ImageStretches> list = aVar.f5217c;
        List<ImageStretches> list2 = aVar.f5218d;
        aVar.getClass();
        Expected<String, None> addStyleImage = delegate.addStyleImage(str, pixelRatio, image2, false, list, list2, null);
        if (addStyleImage == null) {
            throw new MapboxStyleException(StubApp.getString2(4403));
        }
        String error = addStyleImage.getError();
        if (error != null) {
            throw new MapboxStyleException(error);
        }
    }
}
