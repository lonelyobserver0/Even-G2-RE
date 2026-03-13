package org.bouncycastle.tsp.ers;

import com.stub.StubApp;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import org.bouncycastle.asn1.tsp.ArchiveTimeStamp;
import org.bouncycastle.asn1.tsp.PartialHashtree;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.SignerInformationVerifier;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TimeStampToken;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Store;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ERSArchiveTimeStamp {
    private final ArchiveTimeStamp archiveTimeStamp;
    private final DigestCalculator digCalc;
    private final byte[] previousChainsDigest;
    private ERSRootNodeCalculator rootNodeCalculator;
    private final TimeStampToken timeStampToken;

    public ERSArchiveTimeStamp(ArchiveTimeStamp archiveTimeStamp, DigestCalculator digestCalculator) throws TSPException, ERSException {
        this.rootNodeCalculator = new BinaryTreeRootCalculator();
        this.previousChainsDigest = null;
        try {
            this.archiveTimeStamp = archiveTimeStamp;
            this.timeStampToken = new TimeStampToken(archiveTimeStamp.getTimeStamp());
            this.digCalc = digestCalculator;
        } catch (IOException e10) {
            throw new ERSException(e10.getMessage(), e10);
        }
    }

    public void checkContainsHashValue(boolean z2, byte[] bArr, DigestCalculator digestCalculator) throws ArchiveTimeStampValidationException {
        PartialHashtree[] reducedHashTree = this.archiveTimeStamp.getReducedHashTree();
        if (reducedHashTree == null) {
            if (!Arrays.areEqual(bArr, this.timeStampToken.getTimeStampInfo().getMessageImprintDigest())) {
                throw new ArchiveTimeStampValidationException(StubApp.getString2(34947));
            }
            return;
        }
        PartialHashtree partialHashtree = reducedHashTree[0];
        if (z2 || !partialHashtree.containsHash(bArr)) {
            if (partialHashtree.getValueCount() <= 1 || !Arrays.areEqual(bArr, ERSUtil.calculateBranchHash(digestCalculator, partialHashtree.getValues()))) {
                throw new ArchiveTimeStampValidationException(StubApp.getString2(34946));
            }
        }
    }

    public void checkTimeStampValid(TimeStampToken timeStampToken, byte[] bArr) throws ArchiveTimeStampValidationException {
        if (bArr != null && !Arrays.areEqual(bArr, timeStampToken.getTimeStampInfo().getMessageImprintDigest())) {
            throw new ArchiveTimeStampValidationException(StubApp.getString2(34948));
        }
    }

    public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        return this.archiveTimeStamp.getDigestAlgorithmIdentifier();
    }

    public byte[] getEncoded() throws IOException {
        return this.archiveTimeStamp.getEncoded();
    }

    public Date getExpiryTime() {
        X509CertificateHolder signingCertificate = getSigningCertificate();
        if (signingCertificate != null) {
            return signingCertificate.getNotAfter();
        }
        return null;
    }

    public Date getGenTime() {
        return this.timeStampToken.getTimeStampInfo().getGenTime();
    }

    public X509CertificateHolder getSigningCertificate() {
        Store<X509CertificateHolder> certificates = this.timeStampToken.getCertificates();
        if (certificates == null) {
            return null;
        }
        Collection<X509CertificateHolder> matches = certificates.getMatches(this.timeStampToken.getSID());
        if (matches.isEmpty()) {
            return null;
        }
        return matches.iterator().next();
    }

    public TimeStampToken getTimeStampToken() {
        return this.timeStampToken;
    }

    public boolean isContaining(ERSData eRSData, Date date) throws ERSException {
        if (this.timeStampToken.getTimeStampInfo().getGenTime().after(date)) {
            throw new ArchiveTimeStampValidationException(StubApp.getString2(34949));
        }
        try {
            validatePresent(eRSData, date);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public ArchiveTimeStamp toASN1Structure() {
        return this.archiveTimeStamp;
    }

    public void validate(SignerInformationVerifier signerInformationVerifier) throws TSPException {
        this.timeStampToken.validate(signerInformationVerifier);
    }

    public void validatePresent(ERSData eRSData, Date date) throws ERSException {
        validatePresent(eRSData instanceof ERSDataGroup, eRSData.getHash(this.digCalc, this.previousChainsDigest), date);
    }

    public ERSArchiveTimeStamp(ArchiveTimeStamp archiveTimeStamp, DigestCalculatorProvider digestCalculatorProvider) throws TSPException, ERSException {
        this.rootNodeCalculator = new BinaryTreeRootCalculator();
        this.previousChainsDigest = null;
        try {
            this.archiveTimeStamp = archiveTimeStamp;
            this.timeStampToken = new TimeStampToken(archiveTimeStamp.getTimeStamp());
            this.digCalc = digestCalculatorProvider.get(archiveTimeStamp.getDigestAlgorithmIdentifier());
        } catch (IOException e10) {
            throw new ERSException(e10.getMessage(), e10);
        } catch (OperatorCreationException e11) {
            throw new ERSException(e11.getMessage(), e11);
        }
    }

    public void validatePresent(boolean z2, byte[] bArr, Date date) throws ERSException {
        if (this.timeStampToken.getTimeStampInfo().getGenTime().after(date)) {
            throw new ArchiveTimeStampValidationException(StubApp.getString2(34949));
        }
        checkContainsHashValue(z2, bArr, this.digCalc);
        if (this.archiveTimeStamp.getReducedHashTree() != null) {
            bArr = this.rootNodeCalculator.recoverRootHash(this.digCalc, this.archiveTimeStamp.getReducedHashTree());
        }
        checkTimeStampValid(this.timeStampToken, bArr);
    }

    public ERSArchiveTimeStamp(byte[] bArr, ArchiveTimeStamp archiveTimeStamp, DigestCalculatorProvider digestCalculatorProvider) throws TSPException, ERSException {
        this.rootNodeCalculator = new BinaryTreeRootCalculator();
        this.previousChainsDigest = bArr;
        try {
            this.archiveTimeStamp = archiveTimeStamp;
            this.timeStampToken = new TimeStampToken(archiveTimeStamp.getTimeStamp());
            this.digCalc = digestCalculatorProvider.get(archiveTimeStamp.getDigestAlgorithmIdentifier());
        } catch (IOException e10) {
            throw new ERSException(e10.getMessage(), e10);
        } catch (OperatorCreationException e11) {
            throw new ERSException(e11.getMessage(), e11);
        }
    }

    public ERSArchiveTimeStamp(byte[] bArr, DigestCalculatorProvider digestCalculatorProvider) throws TSPException, ERSException {
        this(ArchiveTimeStamp.getInstance(bArr), digestCalculatorProvider);
    }
}
