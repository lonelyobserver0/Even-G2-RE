package org.bouncycastle.pqc.crypto.hqc;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HQCParameters implements CipherParameters {
    static final int GF_MUL_ORDER = 255;
    static final int PARAM_M = 8;
    public static final HQCParameters hqc128 = new HQCParameters(StubApp.getString2(34020), 17669, 46, KyberEngine.KyberPolyBytes, 16, 31, 15, 66, 75, 75, 16767881, 4, new int[]{89, 69, 153, 116, 176, 117, 111, 75, 73, 233, 242, 233, 65, 210, 21, 139, 103, 173, 67, 118, 105, 210, 174, 110, 74, 69, 228, 82, 255, 181, 1});
    public static final HQCParameters hqc192 = new HQCParameters(StubApp.getString2(34021), 35851, 56, 640, 24, 33, 16, 100, 114, 114, 16742417, 5, new int[]{45, 216, 239, 24, 253, 104, 27, 40, 107, 50, 163, 210, 227, 134, BERTags.FLAGS, 158, 119, 13, 158, 1, 238, 164, 82, 43, 15, 232, 246, 142, 50, 189, 29, 232, 1});
    public static final HQCParameters hqc256 = new HQCParameters(StubApp.getString2(34022), 57637, 90, 640, 32, 59, 29, 131, 149, 149, 16772367, 5, new int[]{49, 167, 49, 39, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 121, 124, 91, 240, 63, 148, 71, 150, 123, 87, 101, 32, 215, 159, 71, 201, 115, 97, 210, 186, 183, 141, 217, 123, 12, 31, 243, 180, 219, ModuleDescriptor.MODULE_VERSION, 239, 99, 141, 4, 246, 191, 144, 8, 232, 47, 27, 141, 178, 130, 64, 124, 47, 39, 188, 216, 48, 199, 187, 1});
    private int delta;
    private int fft;

    /* renamed from: g, reason: collision with root package name */
    private int f19418g;
    private int[] generatorPoly;
    private HQCEngine hqcEngine;

    /* renamed from: k, reason: collision with root package name */
    private int f19419k;

    /* renamed from: n, reason: collision with root package name */
    private int f19420n;

    /* renamed from: n1, reason: collision with root package name */
    private int f19421n1;

    /* renamed from: n2, reason: collision with root package name */
    private int f19422n2;
    private final String name;
    private int utilRejectionThreshold;

    /* renamed from: w, reason: collision with root package name */
    private int f19423w;
    private int we;
    private int wr;

    private HQCParameters(String str, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int[] iArr) {
        this.name = str;
        this.f19420n = i3;
        this.f19421n1 = i10;
        this.f19422n2 = i11;
        this.f19419k = i12;
        this.delta = i14;
        this.f19423w = i15;
        this.wr = i16;
        this.we = i17;
        this.generatorPoly = iArr;
        this.f19418g = i13;
        this.utilRejectionThreshold = i18;
        this.fft = i19;
        this.hqcEngine = new HQCEngine(i3, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, iArr);
    }

    public int getDelta() {
        return this.delta;
    }

    public HQCEngine getEngine() {
        return this.hqcEngine;
    }

    public int getK() {
        return this.f19419k;
    }

    public int getN() {
        return this.f19420n;
    }

    public int getN1() {
        return this.f19421n1;
    }

    public int getN1N2_BYTES() {
        return ((this.f19421n1 * this.f19422n2) + 7) / 8;
    }

    public int getN2() {
        return this.f19422n2;
    }

    public int getN_BYTES() {
        return (this.f19420n + 7) / 8;
    }

    public String getName() {
        return this.name;
    }

    public int getSHA512_BYTES() {
        return 64;
    }

    public int getSessionKeySize() {
        return this.f19419k * 8;
    }

    public int getW() {
        return this.f19423w;
    }

    public int getWe() {
        return this.we;
    }

    public int getWr() {
        return this.wr;
    }
}
