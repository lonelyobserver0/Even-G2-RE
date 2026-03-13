package org.bouncycastle.pqc.legacy.crypto.gmss;

import com.stub.StubApp;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GMSSLeaf {
    private byte[] concHashs;
    private GMSSRandom gmssRandom;

    /* renamed from: i, reason: collision with root package name */
    private int f19506i;
    private int j;
    private int keysize;
    private byte[] leaf;
    private int mdsize;
    private Digest messDigestOTS;
    byte[] privateKeyOTS;
    private byte[] seed;
    private int steps;
    private int two_power_w;

    /* renamed from: w, reason: collision with root package name */
    private int f19507w;

    public GMSSLeaf(Digest digest, int i3, int i10) {
        this.f19507w = i3;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        double d8 = i3;
        this.keysize = ((int) Math.ceil((r7 << 3) / d8)) + ((int) Math.ceil(getLog((r7 << i3) + 1) / d8));
        this.two_power_w = 1 << i3;
        this.steps = (int) Math.ceil(((((r8 - 1) * r7) + 1) + r7) / i10);
        int i11 = this.mdsize;
        this.seed = new byte[i11];
        this.leaf = new byte[i11];
        this.privateKeyOTS = new byte[i11];
        this.concHashs = new byte[i11 * this.keysize];
    }

    private int getLog(int i3) {
        int i10 = 1;
        int i11 = 2;
        while (i11 < i3) {
            i11 <<= 1;
            i10++;
        }
        return i10;
    }

    private void updateLeafCalc() {
        byte[] bArr = new byte[this.messDigestOTS.getDigestSize()];
        for (int i3 = 0; i3 < this.steps + 10000; i3++) {
            int i10 = this.f19506i;
            if (i10 == this.keysize && this.j == this.two_power_w - 1) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.concHashs;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.leaf = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                return;
            }
            if (i10 == 0 || this.j == this.two_power_w - 1) {
                this.f19506i = i10 + 1;
                this.j = 0;
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr4 = this.privateKeyOTS;
                digest2.update(bArr4, 0, bArr4.length);
                this.privateKeyOTS = bArr;
                this.messDigestOTS.doFinal(bArr, 0);
                int i11 = this.j + 1;
                this.j = i11;
                if (i11 == this.two_power_w - 1) {
                    byte[] bArr5 = this.privateKeyOTS;
                    byte[] bArr6 = this.concHashs;
                    int i12 = this.mdsize;
                    System.arraycopy(bArr5, 0, bArr6, (this.f19506i - 1) * i12, i12);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(34756));
        sb2.append(this.steps);
        String string2 = StubApp.getString2(397);
        sb2.append(string2);
        sb2.append(this.f19506i);
        sb2.append(string2);
        sb2.append(this.j);
        throw new IllegalStateException(sb2.toString());
    }

    public byte[] getLeaf() {
        return Arrays.clone(this.leaf);
    }

    public byte[][] getStatByte() {
        return new byte[][]{this.privateKeyOTS, this.seed, this.concHashs, this.leaf};
    }

    public int[] getStatInt() {
        return new int[]{this.f19506i, this.j, this.steps, this.f19507w};
    }

    public void initLeafCalc(byte[] bArr) {
        this.f19506i = 0;
        this.j = 0;
        byte[] bArr2 = new byte[this.mdsize];
        System.arraycopy(bArr, 0, bArr2, 0, this.seed.length);
        this.seed = this.gmssRandom.nextSeed(bArr2);
    }

    public GMSSLeaf nextLeaf() {
        GMSSLeaf gMSSLeaf = new GMSSLeaf(this);
        gMSSLeaf.updateLeafCalc();
        return gMSSLeaf;
    }

    public String toString() {
        String string2;
        String str = "";
        int i3 = 0;
        while (true) {
            string2 = StubApp.getString2(397);
            if (i3 >= 4) {
                break;
            }
            str = AbstractC1482f.f(getStatInt()[i3], string2, AbstractC1856e.b(str));
            i3++;
        }
        StringBuilder n10 = AbstractC1482f.n(str, string2);
        n10.append(this.mdsize);
        n10.append(string2);
        n10.append(this.keysize);
        n10.append(string2);
        String f10 = AbstractC1482f.f(this.two_power_w, string2, n10);
        byte[][] statByte = getStatByte();
        for (int i10 = 0; i10 < 4; i10++) {
            f10 = statByte[i10] != null ? AbstractC1482f.k(AbstractC1856e.b(f10), new String(Hex.encode(statByte[i10])), string2) : AbstractC1482f.g(f10, StubApp.getString2(34757));
        }
        return f10;
    }

    public GMSSLeaf(Digest digest, int i3, int i10, byte[] bArr) {
        this.f19507w = i3;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        double d8 = i3;
        this.keysize = ((int) Math.ceil((r7 << 3) / d8)) + ((int) Math.ceil(getLog((r7 << i3) + 1) / d8));
        this.two_power_w = 1 << i3;
        this.steps = (int) Math.ceil(((((r8 - 1) * r7) + 1) + r7) / i10);
        int i11 = this.mdsize;
        this.seed = new byte[i11];
        this.leaf = new byte[i11];
        this.privateKeyOTS = new byte[i11];
        this.concHashs = new byte[i11 * this.keysize];
        initLeafCalc(bArr);
    }

    public GMSSLeaf(Digest digest, byte[][] bArr, int[] iArr) {
        this.f19506i = iArr[0];
        this.j = iArr[1];
        this.steps = iArr[2];
        this.f19507w = iArr[3];
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        this.keysize = ((int) Math.ceil((r9 << 3) / this.f19507w)) + ((int) Math.ceil(getLog((r9 << this.f19507w) + 1) / this.f19507w));
        this.two_power_w = 1 << this.f19507w;
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.concHashs = bArr[2];
        this.leaf = bArr[3];
    }

    private GMSSLeaf(GMSSLeaf gMSSLeaf) {
        this.messDigestOTS = gMSSLeaf.messDigestOTS;
        this.mdsize = gMSSLeaf.mdsize;
        this.keysize = gMSSLeaf.keysize;
        this.gmssRandom = gMSSLeaf.gmssRandom;
        this.leaf = Arrays.clone(gMSSLeaf.leaf);
        this.concHashs = Arrays.clone(gMSSLeaf.concHashs);
        this.f19506i = gMSSLeaf.f19506i;
        this.j = gMSSLeaf.j;
        this.two_power_w = gMSSLeaf.two_power_w;
        this.f19507w = gMSSLeaf.f19507w;
        this.steps = gMSSLeaf.steps;
        this.seed = Arrays.clone(gMSSLeaf.seed);
        this.privateKeyOTS = Arrays.clone(gMSSLeaf.privateKeyOTS);
    }
}
