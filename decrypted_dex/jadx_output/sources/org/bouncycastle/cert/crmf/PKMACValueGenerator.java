package org.bouncycastle.cert.crmf;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.crmf.PKMACValue;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.operator.MacCalculator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class PKMACValueGenerator {
    private PKMACBuilder builder;

    public PKMACValueGenerator(PKMACBuilder pKMACBuilder) {
        this.builder = pKMACBuilder;
    }

    public PKMACValue generate(char[] cArr, SubjectPublicKeyInfo subjectPublicKeyInfo) throws CRMFException {
        MacCalculator build = this.builder.build(cArr);
        OutputStream outputStream = build.getOutputStream();
        try {
            outputStream.write(subjectPublicKeyInfo.getEncoded(StubApp.getString2("26791")));
            outputStream.close();
            return new PKMACValue(build.getAlgorithmIdentifier(), new DERBitString(build.getMac()));
        } catch (IOException e10) {
            throw new CRMFException(u.q(e10, new StringBuilder(StubApp.getString2(28047))), e10);
        }
    }
}
