package M8;

import com.mapbox.common.Cancelable;
import com.mapbox.common.location.GetLocationCallback;
import com.mapbox.maps.MapboxMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class b implements Cancelable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4684c;

    public /* synthetic */ b(int i3, Object obj, Object obj2) {
        this.f4682a = i3;
        this.f4683b = obj;
        this.f4684c = obj2;
    }

    @Override // com.mapbox.common.Cancelable
    public final void cancel() {
        switch (this.f4682a) {
            case 0:
                c this$0 = (c) this.f4683b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GetLocationCallback callback = (GetLocationCallback) this.f4684c;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                this$0.f4686b.remove(callback);
                break;
            default:
                MapboxMap.addInteraction$lambda$22((MapboxMap) this.f4683b, (Cancelable) this.f4684c);
                break;
        }
    }
}
