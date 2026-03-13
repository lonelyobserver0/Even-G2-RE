package org.bouncycastle.est.jcajce;

import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.est.LimitedSource;
import org.bouncycastle.est.Source;
import org.bouncycastle.est.TLSUniqueProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class LimitedSSLSocketSource implements Source<SSLSession>, TLSUniqueProvider, LimitedSource {
    private final Long absoluteReadLimit;
    private final ChannelBindingProvider bindingProvider;
    protected final SSLSocket socket;

    public LimitedSSLSocketSource(SSLSocket sSLSocket, ChannelBindingProvider channelBindingProvider, Long l9) {
        this.socket = sSLSocket;
        this.bindingProvider = channelBindingProvider;
        this.absoluteReadLimit = l9;
    }

    @Override // org.bouncycastle.est.Source
    public void close() throws IOException {
        this.socket.close();
    }

    @Override // org.bouncycastle.est.LimitedSource
    public Long getAbsoluteReadLimit() {
        return this.absoluteReadLimit;
    }

    @Override // org.bouncycastle.est.Source
    public InputStream getInputStream() throws IOException {
        return this.socket.getInputStream();
    }

    @Override // org.bouncycastle.est.Source
    public OutputStream getOutputStream() throws IOException {
        return this.socket.getOutputStream();
    }

    @Override // org.bouncycastle.est.TLSUniqueProvider
    public byte[] getTLSUnique() {
        if (isTLSUniqueAvailable()) {
            return this.bindingProvider.getChannelBinding(this.socket, StubApp.getString2(29565));
        }
        throw new IllegalStateException(StubApp.getString2(29566));
    }

    @Override // org.bouncycastle.est.TLSUniqueProvider
    public boolean isTLSUniqueAvailable() {
        return this.bindingProvider.canAccessChannelBinding(this.socket);
    }

    @Override // org.bouncycastle.est.Source
    public SSLSession getSession() {
        return this.socket.getSession();
    }
}
