package org.bouncycastle.crypto.signers;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.DSAKeyParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.GOST3410KeyParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Utils {
    public static CryptoServiceProperties getDefaultProperties(String str, int i3, CipherParameters cipherParameters, boolean z2) {
        return new DefaultServiceProperties(str, i3, cipherParameters, getPurpose(z2));
    }

    public static CryptoServicePurpose getPurpose(boolean z2) {
        return z2 ? CryptoServicePurpose.SIGNING : CryptoServicePurpose.VERIFYING;
    }

    public static CryptoServiceProperties getDefaultProperties(String str, DSAKeyParameters dSAKeyParameters, boolean z2) {
        return new DefaultServiceProperties(str, ConstraintUtils.bitsOfSecurityFor(dSAKeyParameters.getParameters().getP()), dSAKeyParameters, getPurpose(z2));
    }

    public static CryptoServiceProperties getDefaultProperties(String str, ECKeyParameters eCKeyParameters, boolean z2) {
        return new DefaultServiceProperties(str, ConstraintUtils.bitsOfSecurityFor(eCKeyParameters.getParameters().getCurve()), eCKeyParameters, getPurpose(z2));
    }

    public static CryptoServiceProperties getDefaultProperties(String str, GOST3410KeyParameters gOST3410KeyParameters, boolean z2) {
        return new DefaultServiceProperties(str, ConstraintUtils.bitsOfSecurityFor(gOST3410KeyParameters.getParameters().getP()), gOST3410KeyParameters, getPurpose(z2));
    }
}
