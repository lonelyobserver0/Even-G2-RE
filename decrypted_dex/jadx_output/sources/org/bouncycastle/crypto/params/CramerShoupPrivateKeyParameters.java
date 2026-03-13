package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {
    private CramerShoupPublicKeyParameters pk;

    /* renamed from: x1, reason: collision with root package name */
    private BigInteger f19060x1;

    /* renamed from: x2, reason: collision with root package name */
    private BigInteger f19061x2;

    /* renamed from: y1, reason: collision with root package name */
    private BigInteger f19062y1;

    /* renamed from: y2, reason: collision with root package name */
    private BigInteger f19063y2;

    /* renamed from: z, reason: collision with root package name */
    private BigInteger f19064z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f19060x1 = bigInteger;
        this.f19061x2 = bigInteger2;
        this.f19062y1 = bigInteger3;
        this.f19063y2 = bigInteger4;
        this.f19064z = bigInteger5;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f19060x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f19061x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f19062y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f19063y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f19064z) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.pk;
    }

    public BigInteger getX1() {
        return this.f19060x1;
    }

    public BigInteger getX2() {
        return this.f19061x2;
    }

    public BigInteger getY1() {
        return this.f19062y1;
    }

    public BigInteger getY2() {
        return this.f19063y2;
    }

    public BigInteger getZ() {
        return this.f19064z;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((((this.f19060x1.hashCode() ^ this.f19061x2.hashCode()) ^ this.f19062y1.hashCode()) ^ this.f19063y2.hashCode()) ^ this.f19064z.hashCode()) ^ super.hashCode();
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.pk = cramerShoupPublicKeyParameters;
    }
}
