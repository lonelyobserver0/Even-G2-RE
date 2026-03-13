package org.bouncycastle.cms;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
interface CMSReadable {
    InputStream getInputStream() throws IOException, CMSException;
}
