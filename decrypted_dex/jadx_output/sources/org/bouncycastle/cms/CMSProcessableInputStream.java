package org.bouncycastle.cms;

import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class CMSProcessableInputStream implements CMSProcessable, CMSReadable {
    private InputStream input;
    private boolean used = false;

    public CMSProcessableInputStream(InputStream inputStream) {
        this.input = inputStream;
    }

    private synchronized void checkSingleUsage() {
        if (this.used) {
            throw new IllegalStateException(StubApp.getString2("28156"));
        }
        this.used = true;
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public Object getContent() {
        return getInputStream();
    }

    @Override // org.bouncycastle.cms.CMSReadable
    public InputStream getInputStream() {
        checkSingleUsage();
        return this.input;
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public void write(OutputStream outputStream) throws IOException, CMSException {
        checkSingleUsage();
        Streams.pipeAll(this.input, outputStream);
        this.input.close();
    }
}
