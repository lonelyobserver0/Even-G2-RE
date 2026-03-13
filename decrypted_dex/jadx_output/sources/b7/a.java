package b7;

import a7.f;
import android.graphics.Bitmap;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.geojson.Point;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10709a;

    /* renamed from: b, reason: collision with root package name */
    public final JsonObject f10710b;

    /* renamed from: c, reason: collision with root package name */
    public final Point f10711c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10712d;

    /* renamed from: e, reason: collision with root package name */
    public final f f10713e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f10714f;

    public a(String id, f annotationManager, JsonObject jsonObject, Point geometry) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(annotationManager, "annotationManager");
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        this.f10709a = id;
        this.f10710b = jsonObject;
        this.f10711c = geometry;
        this.f10713e = annotationManager;
        jsonObject.addProperty(StubApp.getString2(8563), id);
    }

    public final String a() {
        JsonElement jsonElement = this.f10710b.get(StubApp.getString2(8521));
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }
}
