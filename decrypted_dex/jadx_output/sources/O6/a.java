package O6;

import android.graphics.Bitmap;
import com.mapbox.maps.ExtensionUtils;
import com.mapbox.maps.Image;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5215a;

    /* renamed from: b, reason: collision with root package name */
    public final Image f5216b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5217c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5218d;

    public a(Bitmap bitmap, String imageId) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f5217c = CollectionsKt.emptyList();
        this.f5218d = CollectionsKt.emptyList();
        this.f5215a = imageId;
        Image mapboxImage = ExtensionUtils.toMapboxImage(bitmap);
        Intrinsics.checkNotNullParameter(mapboxImage, "<set-?>");
        this.f5216b = mapboxImage;
    }
}
