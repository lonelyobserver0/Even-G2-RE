package org.bouncycastle.pqc.crypto.lms;

import com.stub.StubApp;
import org.bouncycastle.crypto.Digest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class SeedDerive {

    /* renamed from: I, reason: collision with root package name */
    private final byte[] f19446I;
    private final Digest digest;
    private int j;
    private final byte[] masterSeed;

    /* renamed from: q, reason: collision with root package name */
    private int f19447q;

    public SeedDerive(byte[] bArr, byte[] bArr2, Digest digest) {
        this.f19446I = bArr;
        this.masterSeed = bArr2;
        this.digest = digest;
    }

    public void deriveSeed(byte[] bArr, boolean z2) {
        deriveSeed(bArr, z2, 0);
    }

    public byte[] getI() {
        return this.f19446I;
    }

    public int getJ() {
        return this.j;
    }

    public byte[] getMasterSeed() {
        return this.masterSeed;
    }

    public int getQ() {
        return this.f19447q;
    }

    public void setJ(int i3) {
        this.j = i3;
    }

    public void setQ(int i3) {
        this.f19447q = i3;
    }

    public void deriveSeed(byte[] bArr, boolean z2, int i3) {
        deriveSeed(bArr, i3);
        if (z2) {
            this.j++;
        }
    }

    public byte[] deriveSeed(byte[] bArr, int i3) {
        if (bArr.length < this.digest.getDigestSize()) {
            throw new IllegalArgumentException(StubApp.getString2(34047));
        }
        Digest digest = this.digest;
        byte[] bArr2 = this.f19446I;
        digest.update(bArr2, 0, bArr2.length);
        this.digest.update((byte) (this.f19447q >>> 24));
        this.digest.update((byte) (this.f19447q >>> 16));
        this.digest.update((byte) (this.f19447q >>> 8));
        this.digest.update((byte) this.f19447q);
        this.digest.update((byte) (this.j >>> 8));
        this.digest.update((byte) this.j);
        this.digest.update((byte) -1);
        Digest digest2 = this.digest;
        byte[] bArr3 = this.masterSeed;
        digest2.update(bArr3, 0, bArr3.length);
        this.digest.doFinal(bArr, i3);
        return bArr;
    }
}
