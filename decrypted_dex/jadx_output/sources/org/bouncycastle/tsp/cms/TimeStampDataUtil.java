package org.bouncycastle.tsp.cms;

import Xa.h;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.TimeStampAndCRL;
import org.bouncycastle.asn1.cms.TimeStampedData;
import org.bouncycastle.asn1.cms.TimeStampedDataParser;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TimeStampToken;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class TimeStampDataUtil {
    private final MetaDataUtil metaDataUtil;
    private final TimeStampAndCRL[] timeStamps;

    public TimeStampDataUtil(TimeStampedData timeStampedData) {
        this.metaDataUtil = new MetaDataUtil(timeStampedData.getMetaData());
        this.timeStamps = timeStampedData.getTemporalEvidence().getTstEvidence().toTimeStampAndCRLArray();
    }

    private void compareDigest(TimeStampToken timeStampToken, byte[] bArr) throws ImprintDigestInvalidException {
        if (!Arrays.areEqual(bArr, timeStampToken.getTimeStampInfo().getMessageImprintDigest())) {
            throw new ImprintDigestInvalidException(StubApp.getString2(34939), timeStampToken);
        }
    }

    public byte[] calculateNextHash(DigestCalculator digestCalculator) throws CMSException {
        TimeStampAndCRL timeStampAndCRL = this.timeStamps[r0.length - 1];
        OutputStream outputStream = digestCalculator.getOutputStream();
        try {
            outputStream.write(timeStampAndCRL.getEncoded(StubApp.getString2("26791")));
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (IOException e10) {
            throw new CMSException(u.q(e10, new StringBuilder(StubApp.getString2(34940))), e10);
        }
    }

    public String getFileName() {
        return this.metaDataUtil.getFileName();
    }

    public String getMediaType() {
        return this.metaDataUtil.getMediaType();
    }

    public DigestCalculator getMessageImprintDigestCalculator(DigestCalculatorProvider digestCalculatorProvider) throws OperatorCreationException {
        try {
            DigestCalculator digestCalculator = digestCalculatorProvider.get(new AlgorithmIdentifier(getTimeStampToken(this.timeStamps[0]).getTimeStampInfo().getMessageImprintAlgOID()));
            initialiseMessageImprintDigestCalculator(digestCalculator);
            return digestCalculator;
        } catch (CMSException e10) {
            throw new OperatorCreationException(StubApp.getString2(34937) + e10.getMessage(), e10);
        }
    }

    public AttributeTable getOtherMetaData() {
        return new AttributeTable(this.metaDataUtil.getOtherMetaData());
    }

    public TimeStampToken getTimeStampToken(TimeStampAndCRL timeStampAndCRL) throws CMSException {
        String string2 = StubApp.getString2(34941);
        try {
            return new TimeStampToken(timeStampAndCRL.getTimeStampToken());
        } catch (IOException e10) {
            throw new CMSException(u.q(e10, new StringBuilder(StubApp.getString2(34942))), e10);
        } catch (IllegalArgumentException e11) {
            throw new CMSException(h.l(e11, new StringBuilder(string2)), e11);
        } catch (TSPException e12) {
            if (e12.getCause() instanceof CMSException) {
                throw ((CMSException) e12.getCause());
            }
            throw new CMSException(string2 + e12.getMessage(), e12);
        }
    }

    public TimeStampToken[] getTimeStampTokens() throws CMSException {
        TimeStampToken[] timeStampTokenArr = new TimeStampToken[this.timeStamps.length];
        int i3 = 0;
        while (true) {
            TimeStampAndCRL[] timeStampAndCRLArr = this.timeStamps;
            if (i3 >= timeStampAndCRLArr.length) {
                return timeStampTokenArr;
            }
            timeStampTokenArr[i3] = getTimeStampToken(timeStampAndCRLArr[i3]);
            i3++;
        }
    }

    public TimeStampAndCRL[] getTimeStamps() {
        return this.timeStamps;
    }

    public void initialiseMessageImprintDigestCalculator(DigestCalculator digestCalculator) throws CMSException {
        this.metaDataUtil.initialiseMessageImprintDigestCalculator(digestCalculator);
    }

    public void validate(DigestCalculatorProvider digestCalculatorProvider, byte[] bArr) throws ImprintDigestInvalidException, CMSException {
        int i3 = 0;
        while (true) {
            TimeStampAndCRL[] timeStampAndCRLArr = this.timeStamps;
            if (i3 >= timeStampAndCRLArr.length) {
                return;
            }
            try {
                TimeStampToken timeStampToken = getTimeStampToken(timeStampAndCRLArr[i3]);
                if (i3 > 0) {
                    DigestCalculator digestCalculator = digestCalculatorProvider.get(timeStampToken.getTimeStampInfo().getHashAlgorithm());
                    digestCalculator.getOutputStream().write(this.timeStamps[i3 - 1].getEncoded(StubApp.getString2("26791")));
                    bArr = digestCalculator.getDigest();
                }
                compareDigest(timeStampToken, bArr);
                i3++;
            } catch (IOException e10) {
                throw new CMSException(u.q(e10, new StringBuilder(StubApp.getString2(34940))), e10);
            } catch (OperatorCreationException e11) {
                throw new CMSException(StubApp.getString2(34943) + e11.getMessage(), e11);
            }
        }
    }

    public TimeStampDataUtil(TimeStampedDataParser timeStampedDataParser) throws IOException {
        this.metaDataUtil = new MetaDataUtil(timeStampedDataParser.getMetaData());
        this.timeStamps = timeStampedDataParser.getTemporalEvidence().getTstEvidence().toTimeStampAndCRLArray();
    }

    public void validate(DigestCalculatorProvider digestCalculatorProvider, byte[] bArr, TimeStampToken timeStampToken) throws ImprintDigestInvalidException, CMSException {
        try {
            byte[] encoded = timeStampToken.getEncoded();
            int i3 = 0;
            while (true) {
                TimeStampAndCRL[] timeStampAndCRLArr = this.timeStamps;
                if (i3 >= timeStampAndCRLArr.length) {
                    throw new ImprintDigestInvalidException(StubApp.getString2(34944), timeStampToken);
                }
                try {
                    TimeStampToken timeStampToken2 = getTimeStampToken(timeStampAndCRLArr[i3]);
                    if (i3 > 0) {
                        DigestCalculator digestCalculator = digestCalculatorProvider.get(timeStampToken2.getTimeStampInfo().getHashAlgorithm());
                        digestCalculator.getOutputStream().write(this.timeStamps[i3 - 1].getEncoded(StubApp.getString2("26791")));
                        bArr = digestCalculator.getDigest();
                    }
                    compareDigest(timeStampToken2, bArr);
                    if (Arrays.areEqual(timeStampToken2.getEncoded(), encoded)) {
                        return;
                    } else {
                        i3++;
                    }
                } catch (IOException e10) {
                    throw new CMSException(u.q(e10, new StringBuilder(StubApp.getString2(34940))), e10);
                } catch (OperatorCreationException e11) {
                    throw new CMSException(StubApp.getString2(34943) + e11.getMessage(), e11);
                }
            }
        } catch (IOException e12) {
            throw new CMSException(u.q(e12, new StringBuilder(StubApp.getString2(34945))), e12);
        }
    }
}
