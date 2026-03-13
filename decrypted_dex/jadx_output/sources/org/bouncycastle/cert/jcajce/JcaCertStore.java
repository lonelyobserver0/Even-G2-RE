package org.bouncycastle.cert.jcajce;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.util.CollectionStore;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaCertStore extends CollectionStore {
    public JcaCertStore(Collection collection) throws CertificateEncodingException {
        super(convertCerts(collection));
    }

    private static Collection convertCerts(Collection collection) throws CertificateEncodingException {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj instanceof X509Certificate) {
                try {
                    arrayList.add(new X509CertificateHolder(((X509Certificate) obj).getEncoded()));
                } catch (IOException e10) {
                    throw new CertificateEncodingException(u.q(e10, new StringBuilder(StubApp.getString2(28091))));
                }
            } else {
                arrayList.add((X509CertificateHolder) obj);
            }
        }
        return arrayList;
    }
}
