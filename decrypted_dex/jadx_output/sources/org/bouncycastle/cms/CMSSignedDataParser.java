package org.bouncycastle.cms;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Generator;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1StreamParser;
import org.bouncycastle.asn1.BERSequenceGenerator;
import org.bouncycastle.asn1.BERSetParser;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfoParser;
import org.bouncycastle.asn1.cms.SignedDataParser;
import org.bouncycastle.asn1.cms.SignerInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSSignedDataParser extends CMSContentInfoParser {
    private static final CMSSignedHelper HELPER = CMSSignedHelper.INSTANCE;
    private static final DefaultDigestAlgorithmIdentifierFinder dgstAlgFinder = new DefaultDigestAlgorithmIdentifierFinder();
    private ASN1Set _certSet;
    private ASN1Set _crlSet;
    private boolean _isCertCrlParsed;
    private CMSTypedStream _signedContent;
    private ASN1ObjectIdentifier _signedContentType;
    private SignedDataParser _signedData;
    private SignerInformationStore _signerInfoStore;
    private Set<AlgorithmIdentifier> digestAlgorithms;
    private Map digests;

    public CMSSignedDataParser(DigestCalculatorProvider digestCalculatorProvider, InputStream inputStream) throws CMSException {
        this(digestCalculatorProvider, (CMSTypedStream) null, inputStream);
    }

    private static ASN1Set getASN1Set(ASN1SetParser aSN1SetParser) {
        if (aSN1SetParser == null) {
            return null;
        }
        return ASN1Set.getInstance(aSN1SetParser.toASN1Primitive());
    }

    private static void pipeEncapsulatedOctetString(ContentInfoParser contentInfoParser, OutputStream outputStream) throws IOException {
        ASN1OctetStringParser aSN1OctetStringParser = (ASN1OctetStringParser) contentInfoParser.getContent(4);
        if (aSN1OctetStringParser != null) {
            pipeOctetString(aSN1OctetStringParser, outputStream);
        }
    }

    private static void pipeOctetString(ASN1OctetStringParser aSN1OctetStringParser, OutputStream outputStream) throws IOException {
        OutputStream createBEROctetOutputStream = CMSUtils.createBEROctetOutputStream(outputStream, 0, true, 0);
        Streams.pipeAll(aSN1OctetStringParser.getOctetStream(), createBEROctetOutputStream);
        createBEROctetOutputStream.close();
    }

    private void populateCertCrlSets() throws CMSException {
        if (this._isCertCrlParsed) {
            return;
        }
        this._isCertCrlParsed = true;
        try {
            this._certSet = getASN1Set(this._signedData.getCertificates());
            this._crlSet = getASN1Set(this._signedData.getCrls());
        } catch (IOException e10) {
            throw new CMSException(StubApp.getString2(28161), e10);
        }
    }

    public static OutputStream replaceCertificatesAndCRLs(InputStream inputStream, Store store, Store store2, Store store3, OutputStream outputStream) throws CMSException, IOException {
        SignedDataParser signedDataParser = SignedDataParser.getInstance(new ContentInfoParser((ASN1SequenceParser) new ASN1StreamParser(inputStream).readObject()).getContent(16));
        BERSequenceGenerator bERSequenceGenerator = new BERSequenceGenerator(outputStream);
        bERSequenceGenerator.addObject((ASN1Primitive) CMSObjectIdentifiers.signedData);
        BERSequenceGenerator bERSequenceGenerator2 = new BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
        bERSequenceGenerator2.addObject((ASN1Primitive) signedDataParser.getVersion());
        bERSequenceGenerator2.getRawOutputStream().write(signedDataParser.getDigestAlgorithms().toASN1Primitive().getEncoded());
        ContentInfoParser encapContentInfo = signedDataParser.getEncapContentInfo();
        BERSequenceGenerator bERSequenceGenerator3 = new BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
        bERSequenceGenerator3.addObject((ASN1Primitive) encapContentInfo.getContentType());
        pipeEncapsulatedOctetString(encapContentInfo, bERSequenceGenerator3.getRawOutputStream());
        bERSequenceGenerator3.close();
        getASN1Set(signedDataParser.getCertificates());
        getASN1Set(signedDataParser.getCrls());
        if (store != null || store3 != null) {
            ArrayList arrayList = new ArrayList();
            if (store != null) {
                arrayList.addAll(CMSUtils.getCertificatesFromStore(store));
            }
            if (store3 != null) {
                arrayList.addAll(CMSUtils.getAttributeCertificatesFromStore(store3));
            }
            ASN1Set createBerSetFromList = CMSUtils.createBerSetFromList(arrayList);
            if (createBerSetFromList.size() > 0) {
                bERSequenceGenerator2.getRawOutputStream().write(new DERTaggedObject(false, 0, (ASN1Encodable) createBerSetFromList).getEncoded());
            }
        }
        if (store2 != null) {
            ASN1Set createBerSetFromList2 = CMSUtils.createBerSetFromList(CMSUtils.getCRLsFromStore(store2));
            if (createBerSetFromList2.size() > 0) {
                bERSequenceGenerator2.getRawOutputStream().write(new DERTaggedObject(false, 1, (ASN1Encodable) createBerSetFromList2).getEncoded());
            }
        }
        bERSequenceGenerator2.getRawOutputStream().write(signedDataParser.getSignerInfos().toASN1Primitive().getEncoded());
        bERSequenceGenerator2.close();
        bERSequenceGenerator.close();
        return outputStream;
    }

    public static OutputStream replaceSigners(InputStream inputStream, SignerInformationStore signerInformationStore, OutputStream outputStream) throws CMSException, IOException {
        SignedDataParser signedDataParser = SignedDataParser.getInstance(new ContentInfoParser((ASN1SequenceParser) new ASN1StreamParser(inputStream).readObject()).getContent(16));
        BERSequenceGenerator bERSequenceGenerator = new BERSequenceGenerator(outputStream);
        bERSequenceGenerator.addObject((ASN1Primitive) CMSObjectIdentifiers.signedData);
        BERSequenceGenerator bERSequenceGenerator2 = new BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
        bERSequenceGenerator2.addObject((ASN1Primitive) signedDataParser.getVersion());
        signedDataParser.getDigestAlgorithms().toASN1Primitive();
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        Iterator<SignerInformation> it = signerInformationStore.getSigners().iterator();
        while (it.hasNext()) {
            aSN1EncodableVector.add(CMSSignedHelper.INSTANCE.fixDigestAlgID(it.next().getDigestAlgorithmID(), dgstAlgFinder));
        }
        bERSequenceGenerator2.getRawOutputStream().write(new DERSet(aSN1EncodableVector).getEncoded());
        ContentInfoParser encapContentInfo = signedDataParser.getEncapContentInfo();
        BERSequenceGenerator bERSequenceGenerator3 = new BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
        bERSequenceGenerator3.addObject((ASN1Primitive) encapContentInfo.getContentType());
        pipeEncapsulatedOctetString(encapContentInfo, bERSequenceGenerator3.getRawOutputStream());
        bERSequenceGenerator3.close();
        writeSetToGeneratorTagged(bERSequenceGenerator2, signedDataParser.getCertificates(), 0);
        writeSetToGeneratorTagged(bERSequenceGenerator2, signedDataParser.getCrls(), 1);
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        Iterator<SignerInformation> it2 = signerInformationStore.getSigners().iterator();
        while (it2.hasNext()) {
            aSN1EncodableVector2.add(it2.next().toASN1Structure());
        }
        bERSequenceGenerator2.getRawOutputStream().write(new DERSet(aSN1EncodableVector2).getEncoded());
        bERSequenceGenerator2.close();
        bERSequenceGenerator.close();
        return outputStream;
    }

    private static void writeSetToGeneratorTagged(ASN1Generator aSN1Generator, ASN1SetParser aSN1SetParser, int i3) throws IOException {
        ASN1Set aSN1Set = getASN1Set(aSN1SetParser);
        if (aSN1Set != null) {
            boolean z2 = aSN1SetParser instanceof BERSetParser;
            OutputStream rawOutputStream = aSN1Generator.getRawOutputStream();
            if (z2) {
                rawOutputStream.write(new BERTaggedObject(false, i3, (ASN1Encodable) aSN1Set).getEncoded());
            } else {
                rawOutputStream.write(new DERTaggedObject(false, i3, (ASN1Encodable) aSN1Set).getEncoded());
            }
        }
    }

    public Store getAttributeCertificates() throws CMSException {
        populateCertCrlSets();
        return HELPER.getAttributeCertificates(this._certSet);
    }

    public Store getCRLs() throws CMSException {
        populateCertCrlSets();
        return HELPER.getCRLs(this._crlSet);
    }

    public Store getCertificates() throws CMSException {
        populateCertCrlSets();
        return HELPER.getCertificates(this._certSet);
    }

    public Set<AlgorithmIdentifier> getDigestAlgorithmIDs() {
        return this.digestAlgorithms;
    }

    public Store getOtherRevocationInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        populateCertCrlSets();
        return HELPER.getOtherRevocationInfo(aSN1ObjectIdentifier, this._crlSet);
    }

    public CMSTypedStream getSignedContent() {
        if (this._signedContent == null) {
            return null;
        }
        return new CMSTypedStream(this._signedContent.getContentType(), CMSUtils.attachDigestsToInputStream(this.digests.values(), this._signedContent.getContentStream()));
    }

    public String getSignedContentTypeOID() {
        return this._signedContentType.getId();
    }

    public SignerInformationStore getSignerInfos() throws CMSException {
        if (this._signerInfoStore == null) {
            populateCertCrlSets();
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            for (Object obj : this.digests.keySet()) {
                hashMap.put(obj, ((DigestCalculator) this.digests.get(obj)).getDigest());
            }
            try {
                ASN1SetParser signerInfos = this._signedData.getSignerInfos();
                while (true) {
                    ASN1Encodable readObject = signerInfos.readObject();
                    if (readObject == null) {
                        break;
                    }
                    SignerInfo signerInfo = SignerInfo.getInstance(readObject.toASN1Primitive());
                    arrayList.add(new SignerInformation(signerInfo, this._signedContentType, null, (byte[]) hashMap.get(signerInfo.getDigestAlgorithm().getAlgorithm())));
                }
                this._signerInfoStore = new SignerInformationStore(arrayList);
            } catch (IOException e10) {
                throw new CMSException(u.q(e10, new StringBuilder(StubApp.getString2(28160))), e10);
            }
        }
        return this._signerInfoStore;
    }

    public int getVersion() {
        return this._signedData.getVersion().intValueExact();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[Catch: IOException -> 0x0042, TryCatch #1 {IOException -> 0x0042, blocks: (B:3:0x0003, B:4:0x0025, B:6:0x002b, B:8:0x0032, B:13:0x0038, B:19:0x0044, B:21:0x0059, B:23:0x006c, B:25:0x0088, B:26:0x008c, B:30:0x008f, B:31:0x006f, B:33:0x0075, B:36:0x0083), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f A[Catch: IOException -> 0x0042, TRY_LEAVE, TryCatch #1 {IOException -> 0x0042, blocks: (B:3:0x0003, B:4:0x0025, B:6:0x002b, B:8:0x0032, B:13:0x0038, B:19:0x0044, B:21:0x0059, B:23:0x006c, B:25:0x0088, B:26:0x008c, B:30:0x008f, B:31:0x006f, B:33:0x0075, B:36:0x0083), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CMSSignedDataParser(org.bouncycastle.operator.DigestCalculatorProvider r5, org.bouncycastle.cms.CMSTypedStream r6, java.io.InputStream r7) throws org.bouncycastle.cms.CMSException {
        /*
            r4 = this;
            r4.<init>(r7)
            r4._signedContent = r6     // Catch: java.io.IOException -> L42
            org.bouncycastle.asn1.cms.ContentInfoParser r7 = r4._contentInfo     // Catch: java.io.IOException -> L42
            r0 = 16
            org.bouncycastle.asn1.ASN1Encodable r7 = r7.getContent(r0)     // Catch: java.io.IOException -> L42
            org.bouncycastle.asn1.cms.SignedDataParser r7 = org.bouncycastle.asn1.cms.SignedDataParser.getInstance(r7)     // Catch: java.io.IOException -> L42
            r4._signedData = r7     // Catch: java.io.IOException -> L42
            java.util.HashMap r7 = new java.util.HashMap     // Catch: java.io.IOException -> L42
            r7.<init>()     // Catch: java.io.IOException -> L42
            r4.digests = r7     // Catch: java.io.IOException -> L42
            org.bouncycastle.asn1.cms.SignedDataParser r7 = r4._signedData     // Catch: java.io.IOException -> L42
            org.bouncycastle.asn1.ASN1SetParser r7 = r7.getDigestAlgorithms()     // Catch: java.io.IOException -> L42
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.io.IOException -> L42
            r0.<init>()     // Catch: java.io.IOException -> L42
        L25:
            org.bouncycastle.asn1.ASN1Encodable r1 = r7.readObject()     // Catch: java.io.IOException -> L42
            if (r1 == 0) goto L44
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r1 = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(r1)     // Catch: java.io.IOException -> L42
            r0.add(r1)     // Catch: java.io.IOException -> L42
            org.bouncycastle.operator.DigestCalculator r2 = r5.get(r1)     // Catch: org.bouncycastle.operator.OperatorCreationException -> L25 java.io.IOException -> L42
            if (r2 == 0) goto L25
            java.util.Map r3 = r4.digests     // Catch: org.bouncycastle.operator.OperatorCreationException -> L25 java.io.IOException -> L42
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r1.getAlgorithm()     // Catch: org.bouncycastle.operator.OperatorCreationException -> L25 java.io.IOException -> L42
            r3.put(r1, r2)     // Catch: org.bouncycastle.operator.OperatorCreationException -> L25 java.io.IOException -> L42
            goto L25
        L42:
            r5 = move-exception
            goto L97
        L44:
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r0)     // Catch: java.io.IOException -> L42
            r4.digestAlgorithms = r5     // Catch: java.io.IOException -> L42
            org.bouncycastle.asn1.cms.SignedDataParser r5 = r4._signedData     // Catch: java.io.IOException -> L42
            org.bouncycastle.asn1.cms.ContentInfoParser r5 = r5.getEncapContentInfo()     // Catch: java.io.IOException -> L42
            r7 = 4
            org.bouncycastle.asn1.ASN1Encodable r7 = r5.getContent(r7)     // Catch: java.io.IOException -> L42
            boolean r0 = r7 instanceof org.bouncycastle.asn1.ASN1OctetStringParser     // Catch: java.io.IOException -> L42
            if (r0 == 0) goto L73
            org.bouncycastle.asn1.ASN1OctetStringParser r7 = (org.bouncycastle.asn1.ASN1OctetStringParser) r7     // Catch: java.io.IOException -> L42
            org.bouncycastle.cms.CMSTypedStream r0 = new org.bouncycastle.cms.CMSTypedStream     // Catch: java.io.IOException -> L42
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r5.getContentType()     // Catch: java.io.IOException -> L42
            java.io.InputStream r7 = r7.getOctetStream()     // Catch: java.io.IOException -> L42
            r0.<init>(r1, r7)     // Catch: java.io.IOException -> L42
            org.bouncycastle.cms.CMSTypedStream r7 = r4._signedContent     // Catch: java.io.IOException -> L42
            if (r7 != 0) goto L6f
        L6c:
            r4._signedContent = r0     // Catch: java.io.IOException -> L42
            goto L86
        L6f:
            r0.drain()     // Catch: java.io.IOException -> L42
            goto L86
        L73:
            if (r7 == 0) goto L86
            org.bouncycastle.cms.PKCS7TypedStream r0 = new org.bouncycastle.cms.PKCS7TypedStream     // Catch: java.io.IOException -> L42
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r5.getContentType()     // Catch: java.io.IOException -> L42
            r0.<init>(r1, r7)     // Catch: java.io.IOException -> L42
            org.bouncycastle.cms.CMSTypedStream r7 = r4._signedContent     // Catch: java.io.IOException -> L42
            if (r7 != 0) goto L83
            goto L6c
        L83:
            r0.drain()     // Catch: java.io.IOException -> L42
        L86:
            if (r6 != 0) goto L8f
            org.bouncycastle.asn1.ASN1ObjectIdentifier r5 = r5.getContentType()     // Catch: java.io.IOException -> L42
        L8c:
            r4._signedContentType = r5     // Catch: java.io.IOException -> L42
            goto L96
        L8f:
            org.bouncycastle.cms.CMSTypedStream r5 = r4._signedContent     // Catch: java.io.IOException -> L42
            org.bouncycastle.asn1.ASN1ObjectIdentifier r5 = r5.getContentType()     // Catch: java.io.IOException -> L42
            goto L8c
        L96:
            return
        L97:
            org.bouncycastle.cms.CMSException r6 = new org.bouncycastle.cms.CMSException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r0 = 28160(0x6e00, float:3.946E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r7.<init>(r0)
            java.lang.String r7 = i2.u.q(r5, r7)
            r6.<init>(r7, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.cms.CMSSignedDataParser.<init>(org.bouncycastle.operator.DigestCalculatorProvider, org.bouncycastle.cms.CMSTypedStream, java.io.InputStream):void");
    }

    public CMSSignedDataParser(DigestCalculatorProvider digestCalculatorProvider, CMSTypedStream cMSTypedStream, byte[] bArr) throws CMSException {
        this(digestCalculatorProvider, cMSTypedStream, new ByteArrayInputStream(bArr));
    }

    public CMSSignedDataParser(DigestCalculatorProvider digestCalculatorProvider, byte[] bArr) throws CMSException {
        this(digestCalculatorProvider, new ByteArrayInputStream(bArr));
    }
}
