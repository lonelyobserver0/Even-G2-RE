package C9;

import com.mapbox.common.ReachabilityInterface;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ReachabilityInterface f1148a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f1149b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f1150c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f1151d;

    public b(ReachabilityInterface reachability) {
        G7.a navigationTileStore = G7.a.f2450a;
        Intrinsics.checkNotNullParameter(navigationTileStore, "navigationTileStore");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        this.f1148a = reachability;
        this.f1149b = new AtomicLong(0L);
        this.f1150c = new ConcurrentHashMap();
        this.f1151d = new ConcurrentLinkedQueue();
    }
}
