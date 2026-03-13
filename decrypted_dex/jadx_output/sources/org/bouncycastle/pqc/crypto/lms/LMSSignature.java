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
class LMSSignature implements Encodable {
    private final LMOtsSignature otsSignature;
    private final LMSigParameters parameter;

    /* renamed from: q, reason: collision with root package name */
    private final int f19442q;

    /* renamed from: y, reason: collision with root package name */
    private final byte[][] f19443y;

    public LMSSignature(int i3, LMOtsSignature lMOtsSignature, LMSigParameters lMSigParameters, byte[][] bArr) {
        this.f19442q = i3;
        this.otsSignature = lMOtsSignature;
        this.parameter = lMSigParameters;
        this.f19443y = bArr;
    }

    public static LMSSignature getInstance(Object obj) throws IOException {
        if (obj instanceof LMSSignature) {
            return (LMSSignature) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int readInt = dataInputStream.readInt();
            LMOtsSignature lMOtsSignature = LMOtsSignature.getInstance(obj);
            LMSigParameters parametersForType = LMSigParameters.getParametersForType(dataInputStream.readInt());
            int h2 = parametersForType.getH();
            byte[][] bArr = new byte[h2][];
            for (int i3 = 0; i3 < h2; i3++) {
                byte[] bArr2 = new byte[parametersForType.getM()];
                bArr[i3] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new LMSSignature(readInt, lMOtsSignature, parametersForType, bArr);
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
                LMSSignature lMSSignature = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMSSignature;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LMSSignature lMSSignature = (LMSSignature) obj;
        if (this.f19442q != lMSSignature.f19442q) {
            return false;
        }
        LMOtsSignature lMOtsSignature = this.otsSignature;
        if (lMOtsSignature == null ? lMSSignature.otsSignature != null : !lMOtsSignature.equals(lMSSignature.otsSignature)) {
            return false;
        }
        LMSigParameters lMSigParameters = this.parameter;
        if (lMSigParameters == null ? lMSSignature.parameter == null : lMSigParameters.equals(lMSSignature.parameter)) {
            return Arrays.deepEquals(this.f19443y, lMSSignature.f19443y);
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return Composer.compose().u32str(this.f19442q).bytes(this.otsSignature.getEncoded()).u32str(this.parameter.getType()).bytes(this.f19443y).build();
    }

    public LMOtsSignature getOtsSignature() {
        return this.otsSignature;
    }

    public LMSigParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.f19442q;
    }

    public byte[][] getY() {
        return this.f19443y;
    }

    public int hashCode() {
        int i3 = this.f19442q * 31;
        LMOtsSignature lMOtsSignature = this.otsSignature;
        int hashCode = (i3 + (lMOtsSignature != null ? lMOtsSignature.hashCode() : 0)) * 31;
        LMSigParameters lMSigParameters = this.parameter;
        return Arrays.deepHashCode(this.f19443y) + ((hashCode + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31);
    }
}
