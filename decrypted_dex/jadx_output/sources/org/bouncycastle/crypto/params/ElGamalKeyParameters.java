package org.bouncycastle.crypto.params;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ElGamalKeyParameters extends AsymmetricKeyParameter {
    private ElGamalParameters params;

    public ElGamalKeyParameters(boolean z2, ElGamalParameters elGamalParameters) {
        super(z2);
        this.params = elGamalParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalKeyParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = this.params;
        ElGamalParameters parameters = ((ElGamalKeyParameters) obj).getParameters();
        return elGamalParameters == null ? parameters == null : elGamalParameters.equals(parameters);
    }

    public ElGamalParameters getParameters() {
        return this.params;
    }

    public int hashCode() {
        ElGamalParameters elGamalParameters = this.params;
        if (elGamalParameters != null) {
            return elGamalParameters.hashCode();
        }
        return 0;
    }
}
