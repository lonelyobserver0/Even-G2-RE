package org.bouncycastle.crypto.params;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST3410ValidationParameters {

    /* renamed from: c, reason: collision with root package name */
    private int f19097c;
    private long cL;

    /* renamed from: x0, reason: collision with root package name */
    private int f19098x0;
    private long x0L;

    public GOST3410ValidationParameters(int i3, int i10) {
        this.f19098x0 = i3;
        this.f19097c = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ValidationParameters)) {
            return false;
        }
        GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.f19097c == this.f19097c && gOST3410ValidationParameters.f19098x0 == this.f19098x0 && gOST3410ValidationParameters.cL == this.cL && gOST3410ValidationParameters.x0L == this.x0L;
    }

    public int getC() {
        return this.f19097c;
    }

    public long getCL() {
        return this.cL;
    }

    public int getX0() {
        return this.f19098x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i3 = this.f19098x0 ^ this.f19097c;
        long j = this.x0L;
        int i10 = (i3 ^ ((int) j)) ^ ((int) (j >> 32));
        long j3 = this.cL;
        return (i10 ^ ((int) j3)) ^ ((int) (j3 >> 32));
    }

    public GOST3410ValidationParameters(long j, long j3) {
        this.x0L = j;
        this.cL = j3;
    }
}
