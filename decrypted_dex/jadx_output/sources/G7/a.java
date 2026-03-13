package G7;

import D9.l;
import com.mapbox.common.TileStore;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2450a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static TileStore f2451b;

    public final TileStore a() {
        TileStore tileStore;
        synchronized (this) {
            tileStore = f2451b;
            if (tileStore == null) {
                l.d(StubApp.getString2("2327"), StubApp.getString2("2328"));
                tileStore = TileStore.create();
                Intrinsics.checkNotNullExpressionValue(tileStore, "create()");
                f2451b = tileStore;
            }
        }
        return tileStore;
    }
}
