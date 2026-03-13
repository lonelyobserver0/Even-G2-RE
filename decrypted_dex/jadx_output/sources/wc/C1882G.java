package wc;

import com.stub.StubApp;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wc.G, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1882G {

    /* renamed from: a, reason: collision with root package name */
    public final C1884a f22337a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f22338b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f22339c;

    public C1882G(C1884a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f22337a = address;
        this.f22338b = proxy;
        this.f22339c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1882G)) {
            return false;
        }
        C1882G c1882g = (C1882G) obj;
        return Intrinsics.areEqual(c1882g.f22337a, this.f22337a) && Intrinsics.areEqual(c1882g.f22338b, this.f22338b) && Intrinsics.areEqual(c1882g.f22339c, this.f22339c);
    }

    public final int hashCode() {
        return this.f22339c.hashCode() + ((this.f22338b.hashCode() + ((this.f22337a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(35410) + this.f22339c + '}';
    }
}
