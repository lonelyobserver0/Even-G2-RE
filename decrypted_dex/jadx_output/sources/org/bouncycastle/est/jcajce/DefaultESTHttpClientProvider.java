package org.bouncycastle.est.jcajce;

import java.util.Set;
import org.bouncycastle.est.ESTClient;
import org.bouncycastle.est.ESTClientProvider;
import org.bouncycastle.est.ESTException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DefaultESTHttpClientProvider implements ESTClientProvider {
    private final Long absoluteLimit;
    private final ChannelBindingProvider bindingProvider;
    private final Set<String> cipherSuites;
    private final boolean filterCipherSuites;
    private final JsseHostnameAuthorizer hostNameAuthorizer;
    private final SSLSocketFactoryCreator socketFactoryCreator;
    private final int timeout;

    public DefaultESTHttpClientProvider(JsseHostnameAuthorizer jsseHostnameAuthorizer, SSLSocketFactoryCreator sSLSocketFactoryCreator, int i3, ChannelBindingProvider channelBindingProvider, Set<String> set, Long l9, boolean z2) {
        this.hostNameAuthorizer = jsseHostnameAuthorizer;
        this.socketFactoryCreator = sSLSocketFactoryCreator;
        this.timeout = i3;
        this.bindingProvider = channelBindingProvider;
        this.cipherSuites = set;
        this.absoluteLimit = l9;
        this.filterCipherSuites = z2;
    }

    @Override // org.bouncycastle.est.ESTClientProvider
    public boolean isTrusted() {
        return this.socketFactoryCreator.isTrusted();
    }

    @Override // org.bouncycastle.est.ESTClientProvider
    public ESTClient makeClient() throws ESTException {
        try {
            return new DefaultESTClient(new DefaultESTClientSourceProvider(this.socketFactoryCreator.createFactory(), this.hostNameAuthorizer, this.timeout, this.bindingProvider, this.cipherSuites, this.absoluteLimit, this.filterCipherSuites));
        } catch (Exception e10) {
            throw new ESTException(e10.getMessage(), e10.getCause());
        }
    }
}
