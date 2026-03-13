package org.bouncycastle.cms;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSAuthenticatedGenerator extends CMSEnvelopedGenerator {
    protected CMSAttributeTableGenerator authGen;
    protected CMSAttributeTableGenerator unauthGen;

    public Map getBaseParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(677), aSN1ObjectIdentifier);
        hashMap.put(StubApp.getString2(28142), algorithmIdentifier);
        hashMap.put(StubApp.getString2(13292), Arrays.clone(bArr));
        hashMap.put(StubApp.getString2(28143), algorithmIdentifier2);
        return hashMap;
    }

    public void setAuthenticatedAttributeGenerator(CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.authGen = cMSAttributeTableGenerator;
    }

    public void setUnauthenticatedAttributeGenerator(CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.unauthGen = cMSAttributeTableGenerator;
    }
}
