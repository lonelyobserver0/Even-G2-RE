package org.bouncycastle.pqc.crypto.lms;

import Xa.h;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HSSSignature implements Encodable {
    private final int lMinus1;
    private final LMSSignature signature;
    private final LMSSignedPubKey[] signedPubKey;

    public HSSSignature(int i3, LMSSignedPubKey[] lMSSignedPubKeyArr, LMSSignature lMSSignature) {
        this.lMinus1 = i3;
        this.signedPubKey = lMSSignedPubKeyArr;
        this.signature = lMSSignature;
    }

    public static HSSSignature getInstance(Object obj, int i3) throws IOException {
        DataInputStream dataInputStream;
        if (obj instanceof HSSSignature) {
            return (HSSSignature) obj;
        }
        if (obj instanceof DataInputStream) {
            int readInt = ((DataInputStream) obj).readInt();
            if (readInt != i3 - 1) {
                throw new IllegalStateException(StubApp.getString2(34035));
            }
            LMSSignedPubKey[] lMSSignedPubKeyArr = new LMSSignedPubKey[readInt];
            if (readInt != 0) {
                for (int i10 = 0; i10 < readInt; i10++) {
                    lMSSignedPubKeyArr[i10] = new LMSSignedPubKey(LMSSignature.getInstance(obj), LMSPublicKeyParameters.getInstance(obj));
                }
            }
            return new HSSSignature(readInt, lMSSignedPubKeyArr, LMSSignature.getInstance(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj), i3);
            }
            throw new IllegalArgumentException(h.m(obj, StubApp.getString2(34032)));
        }
        DataInputStream dataInputStream2 = null;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
        } catch (Throwable th) {
            th = th;
        }
        try {
            HSSSignature hSSSignature = getInstance(dataInputStream, i3);
            dataInputStream.close();
            return hSSSignature;
        } catch (Throwable th2) {
            th = th2;
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 != null) {
                dataInputStream2.close();
            }
            throw th;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HSSSignature hSSSignature = (HSSSignature) obj;
            if (this.lMinus1 != hSSSignature.lMinus1 || this.signedPubKey.length != hSSSignature.signedPubKey.length) {
                return false;
            }
            int i3 = 0;
            while (true) {
                LMSSignedPubKey[] lMSSignedPubKeyArr = this.signedPubKey;
                if (i3 >= lMSSignedPubKeyArr.length) {
                    LMSSignature lMSSignature = this.signature;
                    LMSSignature lMSSignature2 = hSSSignature.signature;
                    if (lMSSignature != null) {
                        return lMSSignature.equals(lMSSignature2);
                    }
                    if (lMSSignature2 == null) {
                        return true;
                    }
                } else {
                    if (!lMSSignedPubKeyArr[i3].equals(hSSSignature.signedPubKey[i3])) {
                        return false;
                    }
                    i3++;
                }
            }
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        Composer compose = Composer.compose();
        compose.u32str(this.lMinus1);
        LMSSignedPubKey[] lMSSignedPubKeyArr = this.signedPubKey;
        if (lMSSignedPubKeyArr != null) {
            for (LMSSignedPubKey lMSSignedPubKey : lMSSignedPubKeyArr) {
                compose.bytes(lMSSignedPubKey);
            }
        }
        compose.bytes(this.signature);
        return compose.build();
    }

    public LMSSignature getSignature() {
        return this.signature;
    }

    public LMSSignedPubKey[] getSignedPubKey() {
        return this.signedPubKey;
    }

    public int getlMinus1() {
        return this.lMinus1;
    }

    public int hashCode() {
        int hashCode = ((this.lMinus1 * 31) + Arrays.hashCode(this.signedPubKey)) * 31;
        LMSSignature lMSSignature = this.signature;
        return hashCode + (lMSSignature != null ? lMSSignature.hashCode() : 0);
    }
}
