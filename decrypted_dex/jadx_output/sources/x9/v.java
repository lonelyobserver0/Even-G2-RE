package x9;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.Style;
import com.mapbox.maps.StylePropertyValue;
import com.stub.StubApp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class v extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23084a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Style f23085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23086c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23088e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(I i3, String str, N6.d dVar, Style style) {
        super(0);
        this.f23087d = i3;
        this.f23086c = str;
        this.f23088e = dVar;
        this.f23085b = style;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f23084a) {
            case 0:
                ((I) this.f23087d).getClass();
                new E1.b(9, (N6.d) this.f23088e, this.f23086c).invoke(this.f23085b);
                break;
            default:
                ((K) this.f23087d).f22967b.getClass();
                Style style = this.f23085b;
                Intrinsics.checkNotNullParameter(style, "style");
                String layerId = this.f23086c;
                Intrinsics.checkNotNullParameter(layerId, "layerId");
                StylePropertyValue command = (StylePropertyValue) this.f23088e;
                Intrinsics.checkNotNullParameter(command, "command");
                Value value = command.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "command.value");
                style.setStyleLayerProperty(layerId, StubApp.getString2(24203), value);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(K k3, Style style, String str, StylePropertyValue stylePropertyValue) {
        super(0);
        this.f23087d = k3;
        this.f23085b = style;
        this.f23086c = str;
        this.f23088e = stylePropertyValue;
    }
}
