package org.bouncycastle.jce.interfaces;

import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface GOST3410Params {
    String getDigestParamSetOID();

    String getEncryptionParamSetOID();

    String getPublicKeyParamSetOID();

    GOST3410PublicKeyParameterSetSpec getPublicKeyParameters();
}
