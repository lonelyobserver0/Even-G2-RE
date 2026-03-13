package org.bouncycastle.tsp;

import com.stub.StubApp;
import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.tsp.MessageImprint;
import org.bouncycastle.asn1.tsp.TimeStampReq;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TimeStampRequestGenerator {
    private static final DefaultDigestAlgorithmIdentifierFinder dgstAlgFinder = new DefaultDigestAlgorithmIdentifierFinder();
    private ASN1Boolean certReq;
    private ExtensionsGenerator extGenerator = new ExtensionsGenerator();
    private ASN1ObjectIdentifier reqPolicy;

    public void addExtension(String str, boolean z2, ASN1Encodable aSN1Encodable) throws IOException {
        addExtension(str, z2, aSN1Encodable.toASN1Primitive().getEncoded());
    }

    public TimeStampRequest generate(String str, byte[] bArr) {
        return generate(str, bArr, (BigInteger) null);
    }

    public void setCertReq(boolean z2) {
        this.certReq = ASN1Boolean.getInstance(z2);
    }

    public void setReqPolicy(String str) {
        this.reqPolicy = new ASN1ObjectIdentifier(str);
    }

    public void addExtension(String str, boolean z2, byte[] bArr) {
        this.extGenerator.addExtension(new ASN1ObjectIdentifier(str), z2, bArr);
    }

    public TimeStampRequest generate(String str, byte[] bArr, BigInteger bigInteger) {
        if (str == null) {
            throw new IllegalArgumentException(StubApp.getString2(34899));
        }
        MessageImprint messageImprint = new MessageImprint(dgstAlgFinder.find(new ASN1ObjectIdentifier(str)), bArr);
        Extensions generate = !this.extGenerator.isEmpty() ? this.extGenerator.generate() : null;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.reqPolicy;
        return bigInteger != null ? new TimeStampRequest(new TimeStampReq(messageImprint, aSN1ObjectIdentifier, new ASN1Integer(bigInteger), this.certReq, generate)) : new TimeStampRequest(new TimeStampReq(messageImprint, aSN1ObjectIdentifier, null, this.certReq, generate));
    }

    public void setReqPolicy(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.reqPolicy = aSN1ObjectIdentifier;
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, ASN1Encodable aSN1Encodable) throws TSPIOException {
        TSPUtil.addExtension(this.extGenerator, aSN1ObjectIdentifier, z2, aSN1Encodable);
    }

    public TimeStampRequest generate(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        return generate(dgstAlgFinder.find(aSN1ObjectIdentifier), bArr);
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, byte[] bArr) {
        this.extGenerator.addExtension(aSN1ObjectIdentifier, z2, bArr);
    }

    public TimeStampRequest generate(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr, BigInteger bigInteger) {
        return generate(dgstAlgFinder.find(aSN1ObjectIdentifier), bArr, bigInteger);
    }

    public TimeStampRequest generate(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        return generate(algorithmIdentifier, bArr, (BigInteger) null);
    }

    public TimeStampRequest generate(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, BigInteger bigInteger) {
        if (algorithmIdentifier == null) {
            throw new IllegalArgumentException(StubApp.getString2(34900));
        }
        MessageImprint messageImprint = new MessageImprint(algorithmIdentifier, bArr);
        Extensions generate = !this.extGenerator.isEmpty() ? this.extGenerator.generate() : null;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.reqPolicy;
        return bigInteger != null ? new TimeStampRequest(new TimeStampReq(messageImprint, aSN1ObjectIdentifier, new ASN1Integer(bigInteger), this.certReq, generate)) : new TimeStampRequest(new TimeStampReq(messageImprint, aSN1ObjectIdentifier, null, this.certReq, generate));
    }
}
