package x9;

import com.mapbox.bindgen.Value;
import com.mapbox.common.ValueUtilsKt;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Style f22904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(Style style, String str, int i3) {
        super(0);
        this.f22903a = i3;
        this.f22904b = style;
        this.f22905c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22903a) {
            case 0:
                Value value = ValueUtilsKt.toValue(this.f22905c);
                this.f22904b.setStyleLayerProperty(StubApp.getString2(22786), StubApp.getString2(376), value);
                break;
            case 1:
                Value value2 = ValueUtilsKt.toValue(this.f22905c);
                this.f22904b.setStyleLayerProperty(StubApp.getString2(22783), StubApp.getString2(376), value2);
                break;
            case 2:
                Value value3 = ValueUtilsKt.toValue(this.f22905c);
                this.f22904b.setStyleLayerProperty(StubApp.getString2(22782), StubApp.getString2(376), value3);
                break;
            case 3:
                Value value4 = ValueUtilsKt.toValue(this.f22905c);
                this.f22904b.setStyleLayerProperty(StubApp.getString2(22785), StubApp.getString2(376), value4);
                break;
            default:
                Value value5 = ValueUtilsKt.toValue(this.f22905c);
                this.f22904b.setStyleLayerProperty(StubApp.getString2(22784), StubApp.getString2(376), value5);
                break;
        }
        return Unit.INSTANCE;
    }
}
