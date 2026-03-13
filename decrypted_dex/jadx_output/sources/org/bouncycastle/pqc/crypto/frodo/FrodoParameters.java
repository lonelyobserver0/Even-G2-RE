package org.bouncycastle.pqc.crypto.frodo;

import com.stub.StubApp;
import kotlin.jvm.internal.ShortCompanionObject;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.frodo.FrodoMatrixGenerator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FrodoParameters implements CipherParameters {
    private static final short[] cdf_table1344;
    private static final short[] cdf_table640;
    private static final short[] cdf_table976;
    public static final FrodoParameters frodokem1344aes;
    public static final FrodoParameters frodokem1344shake;
    public static final FrodoParameters frodokem640aes;
    public static final FrodoParameters frodokem640shake;
    public static final FrodoParameters frodokem976aes;
    public static final FrodoParameters frodokem976shake;

    /* renamed from: B, reason: collision with root package name */
    private final int f19406B;

    /* renamed from: D, reason: collision with root package name */
    private final int f19407D;
    private final int defaultKeySize;
    private final FrodoEngine engine;

    /* renamed from: n, reason: collision with root package name */
    private final int f19408n;
    private final String name;

    static {
        short[] sArr = {4643, 13363, 20579, 25843, 29227, 31145, 32103, 32525, 32689, 32745, 32762, 32766, ShortCompanionObject.MAX_VALUE};
        cdf_table640 = sArr;
        short[] sArr2 = {5638, 15915, 23689, 28571, 31116, 32217, 32613, 32731, 32760, 32766, ShortCompanionObject.MAX_VALUE};
        cdf_table976 = sArr2;
        short[] sArr3 = {9142, 23462, 30338, 32361, 32725, 32765, ShortCompanionObject.MAX_VALUE};
        cdf_table1344 = sArr3;
        frodokem640aes = new FrodoParameters(StubApp.getString2(34014), 640, 15, 2, sArr, new SHAKEDigest(128), new FrodoMatrixGenerator.Aes128MatrixGenerator(640, 32768));
        frodokem640shake = new FrodoParameters(StubApp.getString2(34015), 640, 15, 2, sArr, new SHAKEDigest(128), new FrodoMatrixGenerator.Shake128MatrixGenerator(640, 32768));
        frodokem976aes = new FrodoParameters(StubApp.getString2(34016), 976, 16, 3, sArr2, new SHAKEDigest(256), new FrodoMatrixGenerator.Aes128MatrixGenerator(976, PKIFailureInfo.notAuthorized));
        frodokem976shake = new FrodoParameters(StubApp.getString2(34017), 976, 16, 3, sArr2, new SHAKEDigest(256), new FrodoMatrixGenerator.Shake128MatrixGenerator(976, PKIFailureInfo.notAuthorized));
        frodokem1344aes = new FrodoParameters(StubApp.getString2(34018), 1344, 16, 4, sArr3, new SHAKEDigest(256), new FrodoMatrixGenerator.Aes128MatrixGenerator(1344, PKIFailureInfo.notAuthorized));
        frodokem1344shake = new FrodoParameters(StubApp.getString2(34019), 1344, 16, 4, sArr3, new SHAKEDigest(256), new FrodoMatrixGenerator.Shake128MatrixGenerator(1344, PKIFailureInfo.notAuthorized));
    }

    private FrodoParameters(String str, int i3, int i10, int i11, short[] sArr, Xof xof, FrodoMatrixGenerator frodoMatrixGenerator) {
        this.name = str;
        this.f19408n = i3;
        this.f19407D = i10;
        this.f19406B = i11;
        this.defaultKeySize = i11 * 64;
        this.engine = new FrodoEngine(i3, i10, i11, sArr, xof, frodoMatrixGenerator);
    }

    public int getB() {
        return this.f19406B;
    }

    public int getD() {
        return this.f19407D;
    }

    public FrodoEngine getEngine() {
        return this.engine;
    }

    public int getN() {
        return this.f19408n;
    }

    public String getName() {
        return this.name;
    }

    public int getSessionKeySize() {
        return this.defaultKeySize;
    }
}
