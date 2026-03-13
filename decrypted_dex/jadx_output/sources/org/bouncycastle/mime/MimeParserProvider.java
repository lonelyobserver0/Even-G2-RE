package org.bouncycastle.mime;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface MimeParserProvider {
    MimeParser createParser(InputStream inputStream) throws IOException;

    MimeParser createParser(Headers headers, InputStream inputStream) throws IOException;
}
