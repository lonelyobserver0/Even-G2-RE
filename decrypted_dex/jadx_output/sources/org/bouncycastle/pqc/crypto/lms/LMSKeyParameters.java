package org.bouncycastle.pqc.crypto.lms;

import java.io.IOException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Encodable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class LMSKeyParameters extends AsymmetricKeyParameter implements Encodable {
    public LMSKeyParameters(boolean z2) {
        super(z2);
    }

    public abstract byte[] getEncoded() throws IOException;
}
