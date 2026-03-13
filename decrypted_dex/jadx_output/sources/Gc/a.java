package Gc;

import com.stub.StubApp;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a extends ProxySelector {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2462a = new a();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return CollectionsKt.listOf(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException(StubApp.getString2(25288));
    }
}
