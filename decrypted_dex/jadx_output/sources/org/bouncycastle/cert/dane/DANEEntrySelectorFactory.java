package org.bouncycastle.cert.dane;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DANEEntrySelectorFactory {
    private final DigestCalculator digestCalculator;

    public DANEEntrySelectorFactory(DigestCalculator digestCalculator) {
        this.digestCalculator = digestCalculator;
    }

    public DANEEntrySelector createSelector(String str) throws DANEException {
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray(str.substring(0, str.indexOf(64)));
        try {
            OutputStream outputStream = this.digestCalculator.getOutputStream();
            outputStream.write(uTF8ByteArray);
            outputStream.close();
            return new DANEEntrySelector(Strings.fromByteArray(Hex.encode(this.digestCalculator.getDigest())) + StubApp.getString2(28079) + str.substring(str.indexOf(64) + 1));
        } catch (IOException e10) {
            throw new DANEException(u.q(e10, new StringBuilder(StubApp.getString2(28080))), e10);
        }
    }
}
