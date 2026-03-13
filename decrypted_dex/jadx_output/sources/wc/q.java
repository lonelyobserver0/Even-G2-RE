package wc;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public abstract class q {
    public static final o Companion = new o();

    @JvmField
    public static final q NONE = new n();

    public void cacheConditionalHit(InterfaceC1887d call, C1881F cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    public void cacheHit(InterfaceC1887d call, C1881F response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void cacheMiss(InterfaceC1887d call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void callEnd(InterfaceC1887d call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void callFailed(InterfaceC1887d call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void callStart(InterfaceC1887d call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void canceled(InterfaceC1887d call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void connectEnd(InterfaceC1887d call, InetSocketAddress inetSocketAddress, Proxy proxy, y yVar) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectFailed(InterfaceC1887d call, InetSocketAddress inetSocketAddress, Proxy proxy, y yVar, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void connectStart(InterfaceC1887d call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectionAcquired(InterfaceC1887d call, InterfaceC1892i connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void connectionReleased(InterfaceC1887d call, InterfaceC1892i connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void dnsEnd(InterfaceC1887d call, String domainName, List<InetAddress> inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    public void dnsStart(InterfaceC1887d call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    public void proxySelectEnd(InterfaceC1887d call, t url, List<Proxy> proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public void proxySelectStart(InterfaceC1887d call, t url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public void requestBodyEnd(InterfaceC1887d call, long j) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void requestBodyStart(InterfaceC1887d call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void requestFailed(InterfaceC1887d call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void requestHeadersEnd(InterfaceC1887d call, z request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void requestHeadersStart(InterfaceC1887d call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseBodyEnd(InterfaceC1887d call, long j) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseBodyStart(InterfaceC1887d call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseFailed(InterfaceC1887d call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void responseHeadersEnd(InterfaceC1887d call, C1881F response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void responseHeadersStart(InterfaceC1887d call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void satisfactionFailure(InterfaceC1887d call, C1881F response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void secureConnectEnd(InterfaceC1887d call, r rVar) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void secureConnectStart(InterfaceC1887d call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }
}
