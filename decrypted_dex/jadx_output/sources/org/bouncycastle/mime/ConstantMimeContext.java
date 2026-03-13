package org.bouncycastle.mime;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ConstantMimeContext implements MimeContext, MimeMultipartContext {
    public static final ConstantMimeContext Instance = new ConstantMimeContext();

    @Override // org.bouncycastle.mime.MimeContext
    public InputStream applyContext(Headers headers, InputStream inputStream) throws IOException {
        return inputStream;
    }

    @Override // org.bouncycastle.mime.MimeMultipartContext
    public MimeContext createContext(int i3) throws IOException {
        return this;
    }
}
