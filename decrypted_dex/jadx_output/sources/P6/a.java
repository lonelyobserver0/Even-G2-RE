package P6;

import I4.e;
import S6.f;
import Xa.h;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends c {

    /* renamed from: e, reason: collision with root package name */
    public final String f5546e;

    /* renamed from: f, reason: collision with root package name */
    public final e f5547f;

    public a(String layerId, e host) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(host, "host");
        this.f5546e = layerId;
        this.f5547f = host;
    }

    @Override // P6.c
    public final Expected b(Style delegate, Value propertiesValue, LayerPosition layerPosition) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(propertiesValue, "propertiesValue");
        String str = this.f5546e;
        Expected<String, None> addStyleCustomLayer = delegate.addStyleCustomLayer(str, this.f5547f, layerPosition);
        delegate.setStyleLayerProperties(str, propertiesValue);
        return addStyleCustomLayer;
    }

    @Override // P6.c
    public final Expected c(MapboxStyleManager delegate, LayerPosition layerPosition) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        String str = this.f5546e;
        Expected<String, None> addPersistentStyleCustomLayer = delegate.addPersistentStyleCustomLayer(str, this.f5547f, layerPosition);
        delegate.setStyleLayerProperties(str, e());
        return addPersistentStyleCustomLayer;
    }

    @Override // P6.c
    public final String f() {
        return this.f5546e;
    }

    @Override // P6.c
    public final String g() {
        return StubApp.getString2(4485);
    }

    @Override // P6.c
    public final f h() {
        String value;
        String str = (String) c.a(this);
        if (str == null) {
            return null;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = str.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        value = StringsKt__StringsJVMKt.replace$default(upperCase, '-', '_', false, 4, (Object) null);
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, "VISIBLE")) {
            return f.f6597b;
        }
        if (Intrinsics.areEqual(value, "NONE")) {
            return f.f6598c;
        }
        throw new RuntimeException(h.n(StubApp.getString2(4977), ']', value));
    }

    @Override // P6.c
    public final c j(f visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        i(new R6.a("visibility", visibility));
        return this;
    }
}
