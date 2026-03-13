package org.bouncycastle.est;

import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ESTSourceConnectionListener<T, I> {
    ESTRequest onConnection(Source<T> source, ESTRequest eSTRequest) throws IOException;
}
