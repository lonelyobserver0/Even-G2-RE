package org.bouncycastle.pqc.crypto.lms;

import Xa.h;
import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HSSPublicKeyParameters extends LMSKeyParameters implements LMSContextBasedVerifier {

    /* renamed from: l, reason: collision with root package name */
    private final int f19425l;
    private final LMSPublicKeyParameters lmsPublicKey;

    public HSSPublicKeyParameters(int i3, LMSPublicKeyParameters lMSPublicKeyParameters) {
        super(false);
        this.f19425l = i3;
        this.lmsPublicKey = lMSPublicKeyParameters;
    }

    public static HSSPublicKeyParameters getInstance(Object obj) throws IOException {
        if (obj instanceof HSSPublicKeyParameters) {
            return (HSSPublicKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            return new HSSPublicKeyParameters(((DataInputStream) obj).readInt(), LMSPublicKeyParameters.getInstance(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException(h.m(obj, StubApp.getString2(34032)));
        }
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                HSSPublicKeyParameters hSSPublicKeyParameters = getInstance(dataInputStream2);
                dataInputStream2.close();
                return hSSPublicKeyParameters;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HSSPublicKeyParameters hSSPublicKeyParameters = (HSSPublicKeyParameters) obj;
        if (this.f19425l != hSSPublicKeyParameters.f19425l) {
            return false;
        }
        return this.lmsPublicKey.equals(hSSPublicKeyParameters.lmsPublicKey);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier
    public LMSContext generateLMSContext(byte[] bArr) {
        try {
            HSSSignature hSSSignature = HSSSignature.getInstance(bArr, getL());
            LMSSignedPubKey[] signedPubKey = hSSSignature.getSignedPubKey();
            return signedPubKey[signedPubKey.length - 1].getPublicKey().generateOtsContext(hSSSignature.getSignature()).withSignedPublicKeys(signedPubKey);
        } catch (IOException e10) {
            throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(34034))));
        }
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return Composer.compose().u32str(this.f19425l).bytes(this.lmsPublicKey.getEncoded()).build();
    }

    public int getL() {
        return this.f19425l;
    }

    public LMSPublicKeyParameters getLMSPublicKey() {
        return this.lmsPublicKey;
    }

    public int hashCode() {
        return this.lmsPublicKey.hashCode() + (this.f19425l * 31);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier
    public boolean verify(LMSContext lMSContext) {
        LMSSignedPubKey[] signedPubKeys = lMSContext.getSignedPubKeys();
        if (signedPubKeys.length != getL() - 1) {
            return false;
        }
        LMSPublicKeyParameters lMSPublicKey = getLMSPublicKey();
        boolean z2 = false;
        for (int i3 = 0; i3 < signedPubKeys.length; i3++) {
            if (!LMS.verifySignature(lMSPublicKey, signedPubKeys[i3].getSignature(), signedPubKeys[i3].getPublicKey().toByteArray())) {
                z2 = true;
            }
            lMSPublicKey = signedPubKeys[i3].getPublicKey();
        }
        return lMSPublicKey.verify(lMSContext) & (!z2);
    }
}
