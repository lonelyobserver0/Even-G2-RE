package org.bouncycastle.est.jcajce;

import java.io.IOException;
import javax.net.ssl.SSLSession;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface JsseHostnameAuthorizer {
    boolean verified(String str, SSLSession sSLSession) throws IOException;
}
