package org.bouncycastle.est.jcajce;

import E1.a;
import com.stub.StubApp;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.est.ESTClientSourceProvider;
import org.bouncycastle.est.Source;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DefaultESTClientSourceProvider implements ESTClientSourceProvider {
    private final Long absoluteLimit;
    private final ChannelBindingProvider bindingProvider;
    private final Set<String> cipherSuites;
    private final boolean filterSupportedSuites;
    private final JsseHostnameAuthorizer hostNameAuthorizer;
    private final SSLSocketFactory sslSocketFactory;
    private final int timeout;

    public DefaultESTClientSourceProvider(SSLSocketFactory sSLSocketFactory, JsseHostnameAuthorizer jsseHostnameAuthorizer, int i3, ChannelBindingProvider channelBindingProvider, Set<String> set, Long l9, boolean z2) throws GeneralSecurityException {
        this.sslSocketFactory = sSLSocketFactory;
        this.hostNameAuthorizer = jsseHostnameAuthorizer;
        this.timeout = i3;
        this.bindingProvider = channelBindingProvider;
        this.cipherSuites = set;
        this.absoluteLimit = l9;
        this.filterSupportedSuites = z2;
    }

    @Override // org.bouncycastle.est.ESTClientSourceProvider
    public Source makeSource(String str, int i3) throws IOException {
        SSLSocket sSLSocket = (SSLSocket) this.sslSocketFactory.createSocket(str, i3);
        sSLSocket.setSoTimeout(this.timeout);
        Set<String> set = this.cipherSuites;
        if (set != null && !set.isEmpty()) {
            if (this.filterSupportedSuites) {
                HashSet hashSet = new HashSet();
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                for (int i10 = 0; i10 != supportedCipherSuites.length; i10++) {
                    hashSet.add(supportedCipherSuites[i10]);
                }
                ArrayList arrayList = new ArrayList();
                for (String str2 : this.cipherSuites) {
                    if (hashSet.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException(StubApp.getString2(29540));
                }
                sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
            } else {
                Set<String> set2 = this.cipherSuites;
                sSLSocket.setEnabledCipherSuites((String[]) set2.toArray(new String[set2.size()]));
            }
        }
        sSLSocket.startHandshake();
        JsseHostnameAuthorizer jsseHostnameAuthorizer = this.hostNameAuthorizer;
        if (jsseHostnameAuthorizer != null && !jsseHostnameAuthorizer.verified(str, sSLSocket.getSession())) {
            throw new IOException(StubApp.getString2(29541));
        }
        String lowerCase = Strings.toLowerCase(sSLSocket.getSession().getCipherSuite());
        if (lowerCase.contains(StubApp.getString2(29542)) || lowerCase.contains(StubApp.getString2(29543)) || lowerCase.contains(StubApp.getString2(29544))) {
            throw new IOException(StubApp.getString2(29553));
        }
        if (Strings.toLowerCase(sSLSocket.getSession().getCipherSuite()).contains(StubApp.getString2(1116))) {
            throw new IOException(StubApp.getString2(29552));
        }
        if (Strings.toLowerCase(sSLSocket.getSession().getCipherSuite()).contains(StubApp.getString2(29545))) {
            throw new IOException(StubApp.getString2(29551));
        }
        if (Strings.toLowerCase(sSLSocket.getSession().getCipherSuite()).contains(StubApp.getString2(29546))) {
            throw new IOException(StubApp.getString2(29550));
        }
        if (sSLSocket.getSession().getProtocol().equalsIgnoreCase(StubApp.getString2(29547))) {
            try {
                sSLSocket.close();
            } catch (Exception unused) {
            }
            throw new IOException(StubApp.getString2(29549));
        }
        JsseHostnameAuthorizer jsseHostnameAuthorizer2 = this.hostNameAuthorizer;
        if (jsseHostnameAuthorizer2 == null || jsseHostnameAuthorizer2.verified(str, sSLSocket.getSession())) {
            return new LimitedSSLSocketSource(sSLSocket, this.bindingProvider, this.absoluteLimit);
        }
        throw new IOException(a.j(StubApp.getString2(29548), str));
    }
}
