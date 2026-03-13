package org.bouncycastle.cms;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.BERSequenceGenerator;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLSet;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.EnvelopedData;
import org.bouncycastle.asn1.cms.OriginatorInfo;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OutputAEADEncryptor;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.util.Encodable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSEnvelopedDataStreamGenerator extends CMSEnvelopedGenerator {
    private boolean _berEncodeRecipientSet;
    private int _bufferSize;

    public class CmsEnvelopedDataOutputStream extends OutputStream {
        private BERSequenceGenerator _cGen;
        private final OutputStream _cOut;
        private BERSequenceGenerator _eiGen;
        private final OutputEncryptor _encryptor;
        private BERSequenceGenerator _envGen;
        private OutputStream _octetStream;

        public CmsEnvelopedDataOutputStream(OutputEncryptor outputEncryptor, OutputStream outputStream, BERSequenceGenerator bERSequenceGenerator, BERSequenceGenerator bERSequenceGenerator2, BERSequenceGenerator bERSequenceGenerator3) {
            this._encryptor = outputEncryptor;
            this._octetStream = outputStream;
            this._cOut = outputEncryptor.getOutputStream(outputStream);
            this._cGen = bERSequenceGenerator;
            this._envGen = bERSequenceGenerator2;
            this._eiGen = bERSequenceGenerator3;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this._cOut.close();
            OutputEncryptor outputEncryptor = this._encryptor;
            if (outputEncryptor instanceof OutputAEADEncryptor) {
                this._octetStream.write(((OutputAEADEncryptor) outputEncryptor).getMAC());
                this._octetStream.close();
            }
            this._eiGen.close();
            CMSAttributeTableGenerator cMSAttributeTableGenerator = CMSEnvelopedDataStreamGenerator.this.unprotectedAttributeGenerator;
            if (cMSAttributeTableGenerator != null) {
                this._envGen.addObject((ASN1Primitive) new DERTaggedObject(false, 1, (ASN1Encodable) new BERSet(cMSAttributeTableGenerator.getAttributes(Collections.EMPTY_MAP).toASN1EncodableVector())));
            }
            this._envGen.close();
            this._cGen.close();
        }

        @Override // java.io.OutputStream
        public void write(int i3) throws IOException {
            this._cOut.write(i3);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this._cOut.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i3, int i10) throws IOException {
            this._cOut.write(bArr, i3, i10);
        }
    }

    private OutputStream doOpen(ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, OutputEncryptor outputEncryptor) throws IOException, CMSException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        GenericKey key = outputEncryptor.getKey();
        Iterator it = this.recipientInfoGenerators.iterator();
        while (it.hasNext()) {
            aSN1EncodableVector.add(((RecipientInfoGenerator) it.next()).generate(key));
        }
        return open(aSN1ObjectIdentifier, outputStream, aSN1EncodableVector, outputEncryptor);
    }

    private ASN1Integer getVersion(ASN1EncodableVector aSN1EncodableVector) {
        return this.unprotectedAttributeGenerator != null ? new ASN1Integer(EnvelopedData.calculateVersion(this.originatorInfo, new DLSet(aSN1EncodableVector), new DLSet())) : new ASN1Integer(EnvelopedData.calculateVersion(this.originatorInfo, new DLSet(aSN1EncodableVector), null));
    }

    public OutputStream open(OutputStream outputStream, ASN1EncodableVector aSN1EncodableVector, OutputEncryptor outputEncryptor) throws CMSException {
        try {
            BERSequenceGenerator bERSequenceGenerator = new BERSequenceGenerator(outputStream);
            bERSequenceGenerator.addObject((ASN1Primitive) CMSObjectIdentifiers.envelopedData);
            BERSequenceGenerator bERSequenceGenerator2 = new BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
            Encodable bERSet = this._berEncodeRecipientSet ? new BERSet(aSN1EncodableVector) : new DERSet(aSN1EncodableVector);
            bERSequenceGenerator2.addObject((ASN1Primitive) getVersion(aSN1EncodableVector));
            OriginatorInfo originatorInfo = this.originatorInfo;
            if (originatorInfo != null) {
                bERSequenceGenerator2.addObject((ASN1Primitive) new DERTaggedObject(false, 0, (ASN1Encodable) originatorInfo));
            }
            bERSequenceGenerator2.getRawOutputStream().write(bERSet.getEncoded());
            BERSequenceGenerator bERSequenceGenerator3 = new BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
            bERSequenceGenerator3.addObject((ASN1Primitive) CMSObjectIdentifiers.data);
            bERSequenceGenerator3.getRawOutputStream().write(outputEncryptor.getAlgorithmIdentifier().getEncoded());
            return new CmsEnvelopedDataOutputStream(outputEncryptor, CMSUtils.createBEROctetOutputStream(bERSequenceGenerator3.getRawOutputStream(), 0, false, this._bufferSize), bERSequenceGenerator, bERSequenceGenerator2, bERSequenceGenerator3);
        } catch (IOException e10) {
            throw new CMSException(StubApp.getString2(28141), e10);
        }
    }

    public void setBEREncodeRecipients(boolean z2) {
        this._berEncodeRecipientSet = z2;
    }

    public void setBufferSize(int i3) {
        this._bufferSize = i3;
    }

    public OutputStream open(OutputStream outputStream, OutputEncryptor outputEncryptor) throws CMSException, IOException {
        return doOpen(new ASN1ObjectIdentifier(CMSObjectIdentifiers.data.getId()), outputStream, outputEncryptor);
    }

    public OutputStream open(ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, ASN1EncodableVector aSN1EncodableVector, OutputEncryptor outputEncryptor) throws IOException {
        BERSequenceGenerator bERSequenceGenerator = new BERSequenceGenerator(outputStream);
        bERSequenceGenerator.addObject((ASN1Primitive) CMSObjectIdentifiers.envelopedData);
        BERSequenceGenerator bERSequenceGenerator2 = new BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
        bERSequenceGenerator2.addObject((ASN1Primitive) getVersion(aSN1EncodableVector));
        OriginatorInfo originatorInfo = this.originatorInfo;
        if (originatorInfo != null) {
            bERSequenceGenerator2.addObject((ASN1Primitive) new DERTaggedObject(false, 0, (ASN1Encodable) originatorInfo));
        }
        if (this._berEncodeRecipientSet) {
            bERSequenceGenerator2.getRawOutputStream().write(new BERSet(aSN1EncodableVector).getEncoded());
        } else {
            bERSequenceGenerator2.getRawOutputStream().write(new DERSet(aSN1EncodableVector).getEncoded());
        }
        BERSequenceGenerator bERSequenceGenerator3 = new BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
        bERSequenceGenerator3.addObject((ASN1Primitive) aSN1ObjectIdentifier);
        bERSequenceGenerator3.getRawOutputStream().write(outputEncryptor.getAlgorithmIdentifier().getEncoded());
        return new CmsEnvelopedDataOutputStream(outputEncryptor, CMSUtils.createBEROctetOutputStream(bERSequenceGenerator3.getRawOutputStream(), 0, false, this._bufferSize), bERSequenceGenerator, bERSequenceGenerator2, bERSequenceGenerator3);
    }

    public OutputStream open(ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, OutputEncryptor outputEncryptor) throws CMSException, IOException {
        return doOpen(aSN1ObjectIdentifier, outputStream, outputEncryptor);
    }
}
