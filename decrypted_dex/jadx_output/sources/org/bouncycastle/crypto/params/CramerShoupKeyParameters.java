package org.bouncycastle.crypto.params;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CramerShoupKeyParameters extends AsymmetricKeyParameter {
    private CramerShoupParameters params;

    public CramerShoupKeyParameters(boolean z2, CramerShoupParameters cramerShoupParameters) {
        super(z2);
        this.params = cramerShoupParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupKeyParameters)) {
            return false;
        }
        CramerShoupParameters cramerShoupParameters = this.params;
        CramerShoupParameters parameters = ((CramerShoupKeyParameters) obj).getParameters();
        return cramerShoupParameters == null ? parameters == null : cramerShoupParameters.equals(parameters);
    }

    public CramerShoupParameters getParameters() {
        return this.params;
    }

    public int hashCode() {
        int i3 = !isPrivate() ? 1 : 0;
        CramerShoupParameters cramerShoupParameters = this.params;
        return cramerShoupParameters != null ? i3 ^ cramerShoupParameters.hashCode() : i3;
    }
}
