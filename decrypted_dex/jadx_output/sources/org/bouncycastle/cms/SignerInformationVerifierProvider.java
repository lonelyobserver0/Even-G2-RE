package org.bouncycastle.cms;

import org.bouncycastle.operator.OperatorCreationException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface SignerInformationVerifierProvider {
    SignerInformationVerifier get(SignerId signerId) throws OperatorCreationException;
}
