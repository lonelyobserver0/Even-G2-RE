package x9;

import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: x9.B, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1921B extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Style f22902b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1921B(Style style, int i3) {
        super(0);
        this.f22901a = i3;
        this.f22902b = style;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22901a) {
            case 0:
                this.f22902b.moveStyleLayer(StubApp.getString2(22784), new LayerPosition(null, StubApp.getString2(22800), null));
                break;
            case 1:
                this.f22902b.moveStyleLayer(StubApp.getString2(22785), new LayerPosition(null, StubApp.getString2(22800), null));
                break;
            case 2:
                this.f22902b.moveStyleLayer(StubApp.getString2(22782), new LayerPosition(null, StubApp.getString2(22800), null));
                break;
            case 3:
                this.f22902b.moveStyleLayer(StubApp.getString2(22783), new LayerPosition(null, StubApp.getString2(22800), null));
                break;
            case 4:
                this.f22902b.moveStyleLayer(StubApp.getString2(22786), new LayerPosition(null, StubApp.getString2(22800), null));
                break;
            default:
                this.f22902b.moveStyleLayer(StubApp.getString2(22787), new LayerPosition(null, StubApp.getString2(22800), null));
                break;
        }
        return Unit.INSTANCE;
    }
}
