package org.bouncycastle.cms;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.BERSequenceGenerator;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.AuthenticatedData;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.OriginatorInfo;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.util.io.TeeOutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSAuthenticatedDataStreamGenerator extends CMSAuthenticatedGenerator {
    private boolean berEncodeRecipientSet;
    private int bufferSize;
    private MacCalculator macCalculator;

    public class CmsAuthenticatedDataOutputStream extends OutputStream {
        private BERSequenceGenerator cGen;
        private ASN1ObjectIdentifier contentType;
        private OutputStream dataStream;
        private DigestCalculator digestCalculator;
        private BERSequenceGenerator eiGen;
        private BERSequenceGenerator envGen;
        private MacCalculator macCalculator;

        public CmsAuthenticatedDataOutputStream(MacCalculator macCalculator, DigestCalculator digestCalculator, ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, BERSequenceGenerator bERSequenceGenerator, BERSequenceGenerator bERSequenceGenerator2, BERSequenceGenerator bERSequenceGenerator3) {
            this.macCalculator = macCalculator;
            this.digestCalculator = digestCalculator;
            this.contentType = aSN1ObjectIdentifier;
            this.dataStream = outputStream;
            this.cGen = bERSequenceGenerator;
            this.envGen = bERSequenceGenerator2;
            this.eiGen = bERSequenceGenerator3;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Map map;
            this.dataStream.close();
            this.eiGen.close();
            DigestCalculator digestCalculator = this.digestCalculator;
            if (digestCalculator != null) {
                map = Collections.unmodifiableMap(CMSAuthenticatedDataStreamGenerator.this.getBaseParameters(this.contentType, digestCalculator.getAlgorithmIdentifier(), this.macCalculator.getAlgorithmIdentifier(), this.digestCalculator.getDigest()));
                CMSAuthenticatedDataStreamGenerator cMSAuthenticatedDataStreamGenerator = CMSAuthenticatedDataStreamGenerator.this;
                if (cMSAuthenticatedDataStreamGenerator.authGen == null) {
                    cMSAuthenticatedDataStreamGenerator.authGen = new DefaultAuthenticatedAttributeTableGenerator();
                }
                DERSet dERSet = new DERSet(CMSAuthenticatedDataStreamGenerator.this.authGen.getAttributes(map).toASN1EncodableVector());
                OutputStream outputStream = this.macCalculator.getOutputStream();
                outputStream.write(dERSet.getEncoded(StubApp.getString2(26791)));
                outputStream.close();
                this.envGen.addObject((ASN1Primitive) new DERTaggedObject(false, 2, (ASN1Encodable) dERSet));
            } else {
                map = Collections.EMPTY_MAP;
            }
            this.envGen.addObject((ASN1Primitive) new DEROctetString(this.macCalculator.getMac()));
            if (CMSAuthenticatedDataStreamGenerator.this.unauthGen != null) {
                this.envGen.addObject((ASN1Primitive) new DERTaggedObject(false, 3, (ASN1Encodable) new BERSet(CMSAuthenticatedDataStreamGenerator.this.unauthGen.getAttributes(map).toASN1EncodableVector())));
            }
            this.envGen.close();
            this.cGen.close();
        }

        @Override // java.io.OutputStream
        public void write(int i3) throws IOException {
            this.dataStream.write(i3);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.dataStream.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i3, int i10) throws IOException {
            this.dataStream.write(bArr, i3, i10);
        }
    }

    public OutputStream open(OutputStream outputStream, MacCalculator macCalculator) throws CMSException {
        return open(CMSObjectIdentifiers.data, outputStream, macCalculator);
    }

    public void setBEREncodeRecipients(boolean z2) {
        this.berEncodeRecipientSet = z2;
    }

    public void setBufferSize(int i3) {
        this.bufferSize = i3;
    }

    public OutputStream open(OutputStream outputStream, MacCalculator macCalculator, DigestCalculator digestCalculator) throws CMSException {
        return open(CMSObjectIdentifiers.data, outputStream, macCalculator, digestCalculator);
    }

    public OutputStream open(ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, MacCalculator macCalculator) throws CMSException {
        return open(aSN1ObjectIdentifier, outputStream, macCalculator, null);
    }

    public OutputStream open(ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, MacCalculator macCalculator, DigestCalculator digestCalculator) throws CMSException {
        this.macCalculator = macCalculator;
        try {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            Iterator it = this.recipientInfoGenerators.iterator();
            while (it.hasNext()) {
                aSN1EncodableVector.add(((RecipientInfoGenerator) it.next()).generate(macCalculator.getKey()));
            }
            BERSequenceGenerator bERSequenceGenerator = new BERSequenceGenerator(outputStream);
            bERSequenceGenerator.addObject((ASN1Primitive) CMSObjectIdentifiers.authenticatedData);
            BERSequenceGenerator bERSequenceGenerator2 = new BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
            bERSequenceGenerator2.addObject((ASN1Primitive) new ASN1Integer(AuthenticatedData.calculateVersion(this.originatorInfo)));
            OriginatorInfo originatorInfo = this.originatorInfo;
            if (originatorInfo != null) {
                bERSequenceGenerator2.addObject((ASN1Primitive) new DERTaggedObject(false, 0, (ASN1Encodable) originatorInfo));
            }
            if (this.berEncodeRecipientSet) {
                bERSequenceGenerator2.getRawOutputStream().write(new BERSet(aSN1EncodableVector).getEncoded());
            } else {
                bERSequenceGenerator2.getRawOutputStream().write(new DERSet(aSN1EncodableVector).getEncoded());
            }
            bERSequenceGenerator2.getRawOutputStream().write(macCalculator.getAlgorithmIdentifier().getEncoded());
            if (digestCalculator != null) {
                bERSequenceGenerator2.addObject((ASN1Primitive) new DERTaggedObject(false, 1, (ASN1Encodable) digestCalculator.getAlgorithmIdentifier()));
            }
            BERSequenceGenerator bERSequenceGenerator3 = new BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
            bERSequenceGenerator3.addObject((ASN1Primitive) aSN1ObjectIdentifier);
            OutputStream createBEROctetOutputStream = CMSUtils.createBEROctetOutputStream(bERSequenceGenerator3.getRawOutputStream(), 0, true, this.bufferSize);
            return new CmsAuthenticatedDataOutputStream(macCalculator, digestCalculator, aSN1ObjectIdentifier, digestCalculator != null ? new TeeOutputStream(createBEROctetOutputStream, digestCalculator.getOutputStream()) : new TeeOutputStream(createBEROctetOutputStream, macCalculator.getOutputStream()), bERSequenceGenerator, bERSequenceGenerator2, bERSequenceGenerator3);
        } catch (IOException e10) {
            throw new CMSException(StubApp.getString2(28141), e10);
        }
    }
}
