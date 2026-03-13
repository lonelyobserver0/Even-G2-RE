package org.bouncycastle.cms;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface CMSProcessable {
    Object getContent();

    void write(OutputStream outputStream) throws IOException, CMSException;
}
