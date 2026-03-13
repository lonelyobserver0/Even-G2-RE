package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: c, reason: collision with root package name */
    private BigInteger f19065c;

    /* renamed from: d, reason: collision with root package name */
    private BigInteger f19066d;

    /* renamed from: h, reason: collision with root package name */
    private BigInteger f19067h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f19065c = bigInteger;
        this.f19066d = bigInteger2;
        this.f19067h = bigInteger3;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f19065c) && cramerShoupPublicKeyParameters.getD().equals(this.f19066d) && cramerShoupPublicKeyParameters.getH().equals(this.f19067h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f19065c;
    }

    public BigInteger getD() {
        return this.f19066d;
    }

    public BigInteger getH() {
        return this.f19067h;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f19065c.hashCode() ^ this.f19066d.hashCode()) ^ this.f19067h.hashCode()) ^ super.hashCode();
    }
}
