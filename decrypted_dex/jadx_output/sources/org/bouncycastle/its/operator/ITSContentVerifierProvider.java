package org.bouncycastle.its.operator;

import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.OperatorCreationException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ITSContentVerifierProvider {
    ContentVerifier get(int i3) throws OperatorCreationException;

    ITSCertificate getAssociatedCertificate();

    boolean hasAssociatedCertificate();
}
