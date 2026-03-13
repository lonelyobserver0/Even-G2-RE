package Z8;

import D9.l;
import com.mapbox.bindgen.Expected;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements Expected.Action {

    /* renamed from: b, reason: collision with root package name */
    public static final d f9045b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f9046c = new d(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9047a;

    public /* synthetic */ d(int i3) {
        this.f9047a = i3;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public final void run(Object obj) {
        switch (this.f9047a) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                l.e(StubApp.getString2(7646) + it, StubApp.getString2(1029));
                break;
            default:
                String it2 = (String) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                l.e(StubApp.getString2(7645) + it2, StubApp.getString2(1029));
                break;
        }
    }
}
