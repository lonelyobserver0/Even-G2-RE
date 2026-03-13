package F8;

import D9.l;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.common.EventsServiceError;
import com.mapbox.common.EventsServiceResponseCallback;
import com.mapbox.common.LoggingLevel;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class c implements EventsServiceResponseCallback, Expected.Action {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f2330b;

    public /* synthetic */ c(a aVar, int i3) {
        this.f2329a = i3;
        this.f2330b = aVar;
    }

    @Override // com.mapbox.common.EventsServiceResponseCallback
    public void run(Expected result) {
        a event = this.f2330b;
        Intrinsics.checkNotNullParameter(event, "$event");
        Intrinsics.checkNotNullParameter(result, "result");
        result.onValue(new c(event, 1)).onError(new c(event, 2));
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        switch (this.f2329a) {
            case 1:
                None it = (None) obj;
                a event = this.f2330b;
                Intrinsics.checkNotNullParameter(event, "$event");
                Intrinsics.checkNotNullParameter(it, "it");
                if (l.a(l.g(), LoggingLevel.DEBUG)) {
                    l.d(StubApp.getString2(2182) + event.f2326b, StubApp.getString2(2181));
                    break;
                }
                break;
            default:
                EventsServiceError error = (EventsServiceError) obj;
                a event2 = this.f2330b;
                Intrinsics.checkNotNullParameter(event2, "$event");
                Intrinsics.checkNotNullParameter(error, "error");
                if (l.a(l.g(), LoggingLevel.ERROR)) {
                    l.e(StubApp.getString2(2179) + error + StubApp.getString2(2180) + event2.f2326b, StubApp.getString2(2181));
                    break;
                }
                break;
        }
    }
}
