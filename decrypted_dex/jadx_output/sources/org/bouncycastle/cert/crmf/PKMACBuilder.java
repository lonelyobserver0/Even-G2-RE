package org.bouncycastle.cert.crmf;

import Xa.h;
import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cmp.CMPObjectIdentifiers;
import org.bouncycastle.asn1.cmp.PBMParameter;
import org.bouncycastle.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.PBEMacCalculatorProvider;
import org.bouncycastle.operator.RuntimeOperatorException;
import org.bouncycastle.util.Strings;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKMACBuilder implements PBEMacCalculatorProvider {
    private PKMACValuesCalculator calculator;
    private int iterationCount;
    private AlgorithmIdentifier mac;
    private int maxIterations;
    private AlgorithmIdentifier owf;
    private PBMParameter parameters;
    private SecureRandom random;
    private int saltLength;

    private PKMACBuilder(AlgorithmIdentifier algorithmIdentifier, int i3, AlgorithmIdentifier algorithmIdentifier2, PKMACValuesCalculator pKMACValuesCalculator) {
        this.saltLength = 20;
        this.owf = algorithmIdentifier;
        this.iterationCount = i3;
        this.mac = algorithmIdentifier2;
        this.calculator = pKMACValuesCalculator;
    }

    private void checkIterationCountCeiling(int i3) {
        int i10 = this.maxIterations;
        if (i10 <= 0 || i3 <= i10) {
            return;
        }
        throw new IllegalArgumentException(AbstractC1482f.f(this.maxIterations, StubApp.getString2(74), h.u(i3, StubApp.getString2(28043), StubApp.getString2(21089))));
    }

    private MacCalculator genCalculator(final PBMParameter pBMParameter, char[] cArr) throws CRMFException {
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray(cArr);
        byte[] octets = pBMParameter.getSalt().getOctets();
        final byte[] bArr = new byte[uTF8ByteArray.length + octets.length];
        System.arraycopy(uTF8ByteArray, 0, bArr, 0, uTF8ByteArray.length);
        System.arraycopy(octets, 0, bArr, uTF8ByteArray.length, octets.length);
        this.calculator.setup(pBMParameter.getOwf(), pBMParameter.getMac());
        int intValueExact = pBMParameter.getIterationCount().intValueExact();
        do {
            bArr = this.calculator.calculateDigest(bArr);
            intValueExact--;
        } while (intValueExact > 0);
        return new MacCalculator() { // from class: org.bouncycastle.cert.crmf.PKMACBuilder.1
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();

            @Override // org.bouncycastle.operator.MacCalculator
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return new AlgorithmIdentifier(CMPObjectIdentifiers.passwordBasedMac, pBMParameter);
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public GenericKey getKey() {
                return new GenericKey(getAlgorithmIdentifier(), bArr);
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public byte[] getMac() {
                try {
                    return PKMACBuilder.this.calculator.calculateMac(bArr, this.bOut.toByteArray());
                } catch (CRMFException e10) {
                    throw new RuntimeOperatorException(StubApp.getString2(28042) + e10.getMessage(), e10);
                }
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public OutputStream getOutputStream() {
                return this.bOut;
            }
        };
    }

    public MacCalculator build(char[] cArr) throws CRMFException {
        PBMParameter pBMParameter = this.parameters;
        if (pBMParameter != null) {
            return genCalculator(pBMParameter, cArr);
        }
        byte[] bArr = new byte[this.saltLength];
        if (this.random == null) {
            this.random = new SecureRandom();
        }
        this.random.nextBytes(bArr);
        return genCalculator(new PBMParameter(bArr, this.owf, this.iterationCount, this.mac), cArr);
    }

    @Override // org.bouncycastle.operator.PBEMacCalculatorProvider
    public MacCalculator get(AlgorithmIdentifier algorithmIdentifier, char[] cArr) throws OperatorCreationException {
        if (!CMPObjectIdentifiers.passwordBasedMac.equals((ASN1Primitive) algorithmIdentifier.getAlgorithm())) {
            throw new OperatorCreationException(StubApp.getString2(28044));
        }
        setParameters(PBMParameter.getInstance(algorithmIdentifier.getParameters()));
        try {
            return build(cArr);
        } catch (CRMFException e10) {
            throw new OperatorCreationException(e10.getMessage(), e10.getCause());
        }
    }

    public PKMACBuilder setIterationCount(int i3) {
        if (i3 < 100) {
            throw new IllegalArgumentException(StubApp.getString2(28045));
        }
        checkIterationCountCeiling(i3);
        this.iterationCount = i3;
        return this;
    }

    public PKMACBuilder setParameters(PBMParameter pBMParameter) {
        checkIterationCountCeiling(pBMParameter.getIterationCount().intValueExact());
        this.parameters = pBMParameter;
        return this;
    }

    public PKMACBuilder setSaltLength(int i3) {
        if (i3 < 8) {
            throw new IllegalArgumentException(StubApp.getString2(28046));
        }
        this.saltLength = i3;
        return this;
    }

    public PKMACBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public PKMACBuilder(PKMACValuesCalculator pKMACValuesCalculator) {
        this(new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1), 1000, new AlgorithmIdentifier(IANAObjectIdentifiers.hmacSHA1, DERNull.INSTANCE), pKMACValuesCalculator);
    }

    public PKMACBuilder(PKMACValuesCalculator pKMACValuesCalculator, int i3) {
        this.saltLength = 20;
        this.maxIterations = i3;
        this.calculator = pKMACValuesCalculator;
    }
}
