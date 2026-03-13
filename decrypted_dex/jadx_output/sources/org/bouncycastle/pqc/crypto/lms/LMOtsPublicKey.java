package org.bouncycastle.pqc.crypto.lms;

import Xa.h;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class LMOtsPublicKey implements Encodable {

    /* renamed from: I, reason: collision with root package name */
    private final byte[] f19431I;

    /* renamed from: K, reason: collision with root package name */
    private final byte[] f19432K;
    private final LMOtsParameters parameter;

    /* renamed from: q, reason: collision with root package name */
    private final int f19433q;

    public LMOtsPublicKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i3, byte[] bArr2) {
        this.parameter = lMOtsParameters;
        this.f19431I = bArr;
        this.f19433q = i3;
        this.f19432K = bArr2;
    }

    public static LMOtsPublicKey getInstance(Object obj) throws Exception {
        if (obj instanceof LMOtsPublicKey) {
            return (LMOtsPublicKey) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            LMOtsParameters parametersForType = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            int readInt = dataInputStream.readInt();
            byte[] bArr2 = new byte[parametersForType.getN()];
            dataInputStream.readFully(bArr2);
            return new LMOtsPublicKey(parametersForType, bArr, readInt, bArr2);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException(h.m(obj, StubApp.getString2(34032)));
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                LMOtsPublicKey lMOtsPublicKey = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMOtsPublicKey;
            } catch (Throwable th) {
                th = th;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public LMSContext createOtsContext(LMOtsSignature lMOtsSignature) {
        Digest digest = DigestUtil.getDigest(this.parameter.getDigestOID());
        LmsUtils.byteArray(this.f19431I, digest);
        LmsUtils.u32str(this.f19433q, digest);
        LmsUtils.u16str((short) -32383, digest);
        LmsUtils.byteArray(lMOtsSignature.getC(), digest);
        return new LMSContext(this, lMOtsSignature, digest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LMOtsPublicKey lMOtsPublicKey = (LMOtsPublicKey) obj;
        if (this.f19433q != lMOtsPublicKey.f19433q) {
            return false;
        }
        LMOtsParameters lMOtsParameters = this.parameter;
        if (lMOtsParameters == null ? lMOtsPublicKey.parameter != null : !lMOtsParameters.equals(lMOtsPublicKey.parameter)) {
            return false;
        }
        if (Arrays.equals(this.f19431I, lMOtsPublicKey.f19431I)) {
            return Arrays.equals(this.f19432K, lMOtsPublicKey.f19432K);
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return Composer.compose().u32str(this.parameter.getType()).bytes(this.f19431I).u32str(this.f19433q).bytes(this.f19432K).build();
    }

    public byte[] getI() {
        return this.f19431I;
    }

    public byte[] getK() {
        return this.f19432K;
    }

    public LMOtsParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.f19433q;
    }

    public int hashCode() {
        LMOtsParameters lMOtsParameters = this.parameter;
        return Arrays.hashCode(this.f19432K) + ((((Arrays.hashCode(this.f19431I) + ((lMOtsParameters != null ? lMOtsParameters.hashCode() : 0) * 31)) * 31) + this.f19433q) * 31);
    }

    public LMSContext createOtsContext(LMSSignature lMSSignature) {
        Digest digest = DigestUtil.getDigest(this.parameter.getDigestOID());
        LmsUtils.byteArray(this.f19431I, digest);
        LmsUtils.u32str(this.f19433q, digest);
        LmsUtils.u16str((short) -32383, digest);
        LmsUtils.byteArray(lMSSignature.getOtsSignature().getC(), digest);
        return new LMSContext(this, lMSSignature, digest);
    }
}
