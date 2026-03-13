package org.bouncycastle.cert.dane;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DANEEntryFactory {
    private final DANEEntrySelectorFactory selectorFactory;

    public DANEEntryFactory(DigestCalculator digestCalculator) {
        this.selectorFactory = new DANEEntrySelectorFactory(digestCalculator);
    }

    public DANEEntry createEntry(String str, int i3, X509CertificateHolder x509CertificateHolder) throws DANEException {
        if (i3 < 0 || i3 > 3) {
            throw new DANEException(u.p(i3, StubApp.getString2(28078)));
        }
        return new DANEEntry(this.selectorFactory.createSelector(str).getDomainName(), new byte[]{(byte) i3, 0, 0}, x509CertificateHolder);
    }

    public DANEEntry createEntry(String str, X509CertificateHolder x509CertificateHolder) throws DANEException {
        return createEntry(str, 3, x509CertificateHolder);
    }
}
