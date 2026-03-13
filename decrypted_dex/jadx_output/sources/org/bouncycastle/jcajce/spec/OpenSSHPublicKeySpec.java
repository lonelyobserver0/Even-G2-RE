package org.bouncycastle.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.EncodedKeySpec;
import kotlin.UByte;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OpenSSHPublicKeySpec extends EncodedKeySpec {
    private static final String[] allowedTypes = {StubApp.getString2(29361), StubApp.getString2(29353), StubApp.getString2(29371)};
    private final String type;

    public OpenSSHPublicKeySpec(byte[] bArr) {
        super(bArr);
        int i3 = 0;
        int i10 = (((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) + 4;
        if (i10 >= bArr.length) {
            throw new IllegalArgumentException(StubApp.getString2(32447));
        }
        String fromByteArray = Strings.fromByteArray(Arrays.copyOfRange(bArr, 4, i10));
        this.type = fromByteArray;
        if (fromByteArray.startsWith(StubApp.getString2(29358))) {
            return;
        }
        while (true) {
            String[] strArr = allowedTypes;
            if (i3 >= strArr.length) {
                throw new IllegalArgumentException(StubApp.getString2(32446) + this.type);
            }
            if (strArr[i3].equals(this.type)) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return StubApp.getString2(32444);
    }

    public String getType() {
        return this.type;
    }
}
