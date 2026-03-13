package org.bouncycastle.cms.jcajce;

import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.cms.ecc.ECCCMSSharedInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class RFC5753KeyMaterialGenerator implements KeyMaterialGenerator {
    @Override // org.bouncycastle.cms.jcajce.KeyMaterialGenerator
    public byte[] generateKDFMaterial(AlgorithmIdentifier algorithmIdentifier, int i3, byte[] bArr) {
        try {
            return new ECCCMSSharedInfo(algorithmIdentifier, bArr, Pack.intToBigEndian(i3)).getEncoded(StubApp.getString2("26791"));
        } catch (IOException e10) {
            throw new IllegalStateException(b.h(StubApp.getString2(28289), e10));
        }
    }
}
