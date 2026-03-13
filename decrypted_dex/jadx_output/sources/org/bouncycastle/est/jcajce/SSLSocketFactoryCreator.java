package org.bouncycastle.est.jcajce;

import javax.net.ssl.SSLSocketFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface SSLSocketFactoryCreator {
    SSLSocketFactory createFactory() throws Exception;

    boolean isTrusted();
}
