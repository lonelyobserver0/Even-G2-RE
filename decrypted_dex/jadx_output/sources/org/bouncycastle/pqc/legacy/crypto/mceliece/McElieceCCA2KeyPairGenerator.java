package org.bouncycastle.pqc.legacy.crypto.mceliece;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialGF2mSmallM;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McElieceCCA2KeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public static final String OID = StubApp.getString2(34680);
    private int fieldPoly;
    private boolean initialized = false;

    /* renamed from: m, reason: collision with root package name */
    private int f19516m;
    private McElieceCCA2KeyGenerationParameters mcElieceCCA2Params;

    /* renamed from: n, reason: collision with root package name */
    private int f19517n;
    private SecureRandom random;

    /* renamed from: t, reason: collision with root package name */
    private int f19518t;

    private void initializeDefault() {
        init(new McElieceCCA2KeyGenerationParameters(null, new McElieceCCA2Parameters()));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        if (!this.initialized) {
            initializeDefault();
        }
        GF2mField gF2mField = new GF2mField(this.f19516m, this.fieldPoly);
        PolynomialGF2mSmallM polynomialGF2mSmallM = new PolynomialGF2mSmallM(gF2mField, this.f19518t, 'I', this.random);
        GoppaCode.MaMaPe computeSystematicForm = GoppaCode.computeSystematicForm(GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM), this.random);
        GF2Matrix secondMatrix = computeSystematicForm.getSecondMatrix();
        Permutation permutation = computeSystematicForm.getPermutation();
        GF2Matrix gF2Matrix = (GF2Matrix) secondMatrix.computeTranspose();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new McElieceCCA2PublicKeyParameters(this.f19517n, this.f19518t, gF2Matrix, this.mcElieceCCA2Params.getParameters().getDigest()), (AsymmetricKeyParameter) new McElieceCCA2PrivateKeyParameters(this.f19517n, gF2Matrix.getNumRows(), gF2mField, polynomialGF2mSmallM, permutation, this.mcElieceCCA2Params.getParameters().getDigest()));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.mcElieceCCA2Params = (McElieceCCA2KeyGenerationParameters) keyGenerationParameters;
        this.random = keyGenerationParameters.getRandom();
        this.f19516m = this.mcElieceCCA2Params.getParameters().getM();
        this.f19517n = this.mcElieceCCA2Params.getParameters().getN();
        this.f19518t = this.mcElieceCCA2Params.getParameters().getT();
        this.fieldPoly = this.mcElieceCCA2Params.getParameters().getFieldPoly();
        this.initialized = true;
    }
}
