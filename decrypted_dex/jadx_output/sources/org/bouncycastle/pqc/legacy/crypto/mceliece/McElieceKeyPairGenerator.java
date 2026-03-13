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
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialRingGF2m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McElieceKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private static final String OID = StubApp.getString2(34685);
    private int fieldPoly;
    private boolean initialized = false;

    /* renamed from: m, reason: collision with root package name */
    private int f19531m;
    private McElieceKeyGenerationParameters mcElieceParams;

    /* renamed from: n, reason: collision with root package name */
    private int f19532n;
    private SecureRandom random;

    /* renamed from: t, reason: collision with root package name */
    private int f19533t;

    private AsymmetricCipherKeyPair genKeyPair() {
        if (!this.initialized) {
            initializeDefault();
        }
        GF2mField gF2mField = new GF2mField(this.f19531m, this.fieldPoly);
        PolynomialGF2mSmallM polynomialGF2mSmallM = new PolynomialGF2mSmallM(gF2mField, this.f19533t, 'I', this.random);
        new PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
        GoppaCode.MaMaPe computeSystematicForm = GoppaCode.computeSystematicForm(GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM), this.random);
        GF2Matrix secondMatrix = computeSystematicForm.getSecondMatrix();
        Permutation permutation = computeSystematicForm.getPermutation();
        GF2Matrix gF2Matrix = (GF2Matrix) secondMatrix.computeTranspose();
        GF2Matrix extendLeftCompactForm = gF2Matrix.extendLeftCompactForm();
        int numRows = gF2Matrix.getNumRows();
        GF2Matrix[] createRandomRegularMatrixAndItsInverse = GF2Matrix.createRandomRegularMatrixAndItsInverse(numRows, this.random);
        Permutation permutation2 = new Permutation(this.f19532n, this.random);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new McEliecePublicKeyParameters(this.f19532n, this.f19533t, (GF2Matrix) ((GF2Matrix) createRandomRegularMatrixAndItsInverse[0].rightMultiply(extendLeftCompactForm)).rightMultiply(permutation2)), (AsymmetricKeyParameter) new McEliecePrivateKeyParameters(this.f19532n, numRows, gF2mField, polynomialGF2mSmallM, permutation, permutation2, createRandomRegularMatrixAndItsInverse[1]));
    }

    private void initialize(KeyGenerationParameters keyGenerationParameters) {
        this.mcElieceParams = (McElieceKeyGenerationParameters) keyGenerationParameters;
        this.random = keyGenerationParameters.getRandom();
        this.f19531m = this.mcElieceParams.getParameters().getM();
        this.f19532n = this.mcElieceParams.getParameters().getN();
        this.f19533t = this.mcElieceParams.getParameters().getT();
        this.fieldPoly = this.mcElieceParams.getParameters().getFieldPoly();
        this.initialized = true;
    }

    private void initializeDefault() {
        initialize(new McElieceKeyGenerationParameters(null, new McElieceParameters()));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }
}
