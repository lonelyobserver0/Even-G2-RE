package org.bouncycastle.cms.jcajce;

import com.stub.StubApp;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.OutputCompressor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ZlibCompressor implements OutputCompressor {
    private static final String ZLIB = StubApp.getString2(28147);

    @Override // org.bouncycastle.operator.OutputCompressor
    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return new AlgorithmIdentifier(new ASN1ObjectIdentifier(StubApp.getString2(28147)));
    }

    @Override // org.bouncycastle.operator.OutputCompressor
    public OutputStream getOutputStream(OutputStream outputStream) {
        return new DeflaterOutputStream(outputStream);
    }
}
