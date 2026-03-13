package org.bouncycastle.cms;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequenceGenerator;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.SignerInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSSignedDataStreamGenerator extends CMSSignedGenerator {
    private int _bufferSize;

    public class CmsSignedDataOutputStream extends OutputStream {
        private ASN1ObjectIdentifier _contentOID;
        private BERSequenceGenerator _eiGen;
        private OutputStream _out;
        private BERSequenceGenerator _sGen;
        private BERSequenceGenerator _sigGen;

        public CmsSignedDataOutputStream(OutputStream outputStream, ASN1ObjectIdentifier aSN1ObjectIdentifier, BERSequenceGenerator bERSequenceGenerator, BERSequenceGenerator bERSequenceGenerator2, BERSequenceGenerator bERSequenceGenerator3) {
            this._out = outputStream;
            this._contentOID = aSN1ObjectIdentifier;
            this._sGen = bERSequenceGenerator;
            this._sigGen = bERSequenceGenerator2;
            this._eiGen = bERSequenceGenerator3;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this._out.close();
            this._eiGen.close();
            CMSSignedDataStreamGenerator.this.digests.clear();
            if (CMSSignedDataStreamGenerator.this.certs.size() != 0) {
                this._sigGen.getRawOutputStream().write(new BERTaggedObject(false, 0, (ASN1Encodable) CMSUtils.createBerSetFromList(CMSSignedDataStreamGenerator.this.certs)).getEncoded());
            }
            if (CMSSignedDataStreamGenerator.this.crls.size() != 0) {
                this._sigGen.getRawOutputStream().write(new BERTaggedObject(false, 1, (ASN1Encodable) CMSUtils.createBerSetFromList(CMSSignedDataStreamGenerator.this.crls)).getEncoded());
            }
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            for (SignerInfoGenerator signerInfoGenerator : CMSSignedDataStreamGenerator.this.signerGens) {
                try {
                    aSN1EncodableVector.add(signerInfoGenerator.generate(this._contentOID));
                    CMSSignedDataStreamGenerator.this.digests.put(signerInfoGenerator.getDigestAlgorithm().getAlgorithm().getId(), signerInfoGenerator.getCalculatedDigest());
                } catch (CMSException e10) {
                    throw new CMSStreamException(StubApp.getString2(28162) + e10.getMessage(), e10);
                }
            }
            Iterator it = CMSSignedDataStreamGenerator.this._signers.iterator();
            while (it.hasNext()) {
                aSN1EncodableVector.add(((SignerInformation) it.next()).toASN1Structure());
            }
            this._sigGen.getRawOutputStream().write(new DERSet(aSN1EncodableVector).getEncoded());
            this._sigGen.close();
            this._sGen.close();
        }

        @Override // java.io.OutputStream
        public void write(int i3) throws IOException {
            this._out.write(i3);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this._out.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i3, int i10) throws IOException {
            this._out.write(bArr, i3, i10);
        }
    }

    public CMSSignedDataStreamGenerator() {
    }

    private ASN1Integer calculateVersion(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        boolean z2;
        boolean z10;
        boolean z11;
        List list = this.certs;
        boolean z12 = false;
        if (list != null) {
            z2 = false;
            z10 = false;
            z11 = false;
            for (Object obj : list) {
                if (obj instanceof ASN1TaggedObject) {
                    ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
                    if (aSN1TaggedObject.getTagNo() == 1) {
                        z10 = true;
                    } else if (aSN1TaggedObject.getTagNo() == 2) {
                        z11 = true;
                    } else if (aSN1TaggedObject.getTagNo() == 3) {
                        z2 = true;
                    }
                }
            }
        } else {
            z2 = false;
            z10 = false;
            z11 = false;
        }
        if (z2) {
            return new ASN1Integer(5L);
        }
        List list2 = this.crls;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof ASN1TaggedObject) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            return new ASN1Integer(5L);
        }
        if (z11) {
            return new ASN1Integer(4L);
        }
        if (!z10 && !checkForVersion3(this._signers, this.signerGens) && CMSObjectIdentifiers.data.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return new ASN1Integer(1L);
        }
        return new ASN1Integer(3L);
    }

    private boolean checkForVersion3(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (SignerInfo.getInstance(((SignerInformation) it.next()).toASN1Structure()).getVersion().intValueExact() == 3) {
                return true;
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((SignerInfoGenerator) it2.next()).getGeneratedVersion() == 3) {
                return true;
            }
        }
        return false;
    }

    public List<AlgorithmIdentifier> getDigestAlgorithms() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this._signers.iterator();
        while (it.hasNext()) {
            arrayList.add(CMSSignedHelper.INSTANCE.fixDigestAlgID(((SignerInformation) it.next()).getDigestAlgorithmID(), this.digestAlgIdFinder));
        }
        Iterator it2 = this.signerGens.iterator();
        while (it2.hasNext()) {
            arrayList.add(((SignerInfoGenerator) it2.next()).getDigestAlgorithm());
        }
        return arrayList;
    }

    public OutputStream open(OutputStream outputStream) throws IOException {
        return open(outputStream, false);
    }

    public void setBufferSize(int i3) {
        this._bufferSize = i3;
    }

    public CMSSignedDataStreamGenerator(DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        super(digestAlgorithmIdentifierFinder);
    }

    public OutputStream open(OutputStream outputStream, boolean z2) throws IOException {
        return open(CMSObjectIdentifiers.data, outputStream, z2);
    }

    public OutputStream open(OutputStream outputStream, boolean z2, OutputStream outputStream2) throws IOException {
        return open(CMSObjectIdentifiers.data, outputStream, z2, outputStream2);
    }

    public OutputStream open(ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, boolean z2) throws IOException {
        return open(aSN1ObjectIdentifier, outputStream, z2, null);
    }

    public OutputStream open(ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, boolean z2, OutputStream outputStream2) throws IOException {
        BERSequenceGenerator bERSequenceGenerator = new BERSequenceGenerator(outputStream);
        bERSequenceGenerator.addObject((ASN1Primitive) CMSObjectIdentifiers.signedData);
        BERSequenceGenerator bERSequenceGenerator2 = new BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
        bERSequenceGenerator2.addObject((ASN1Primitive) calculateVersion(aSN1ObjectIdentifier));
        HashSet hashSet = new HashSet();
        Iterator it = this._signers.iterator();
        while (it.hasNext()) {
            CMSUtils.addDigestAlgs(hashSet, (SignerInformation) it.next(), this.digestAlgIdFinder);
        }
        Iterator it2 = this.signerGens.iterator();
        while (it2.hasNext()) {
            hashSet.add(((SignerInfoGenerator) it2.next()).getDigestAlgorithm());
        }
        bERSequenceGenerator2.getRawOutputStream().write(CMSUtils.convertToDlSet(hashSet).getEncoded());
        BERSequenceGenerator bERSequenceGenerator3 = new BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
        bERSequenceGenerator3.addObject((ASN1Primitive) aSN1ObjectIdentifier);
        return new CmsSignedDataOutputStream(CMSUtils.attachSignersToOutputStream(this.signerGens, CMSUtils.getSafeTeeOutputStream(outputStream2, z2 ? CMSUtils.createBEROctetOutputStream(bERSequenceGenerator3.getRawOutputStream(), 0, true, this._bufferSize) : null)), aSN1ObjectIdentifier, bERSequenceGenerator, bERSequenceGenerator2, bERSequenceGenerator3);
    }
}
