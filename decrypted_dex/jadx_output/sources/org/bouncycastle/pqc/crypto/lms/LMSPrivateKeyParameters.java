package org.bouncycastle.pqc.crypto.lms;

import Xa.h;
import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class LMSPrivateKeyParameters extends LMSKeyParameters implements LMSContextBasedSigner {

    /* renamed from: T1, reason: collision with root package name */
    private static CacheKey f19437T1;
    private static CacheKey[] internedKeys;

    /* renamed from: I, reason: collision with root package name */
    private final byte[] f19438I;
    private final byte[] masterSecret;
    private final int maxCacheR;
    private final int maxQ;
    private final LMOtsParameters otsParameters;
    private final LMSigParameters parameters;
    private LMSPublicKeyParameters publicKey;

    /* renamed from: q, reason: collision with root package name */
    private int f19439q;
    private final Map<CacheKey, byte[]> tCache;
    private final Digest tDigest;

    public static class CacheKey {
        private final int index;

        public CacheKey(int i3) {
            this.index = i3;
        }

        public boolean equals(Object obj) {
            return (obj instanceof CacheKey) && ((CacheKey) obj).index == this.index;
        }

        public int hashCode() {
            return this.index;
        }
    }

    static {
        CacheKey cacheKey = new CacheKey(1);
        f19437T1 = cacheKey;
        CacheKey[] cacheKeyArr = new CacheKey[129];
        internedKeys = cacheKeyArr;
        cacheKeyArr[1] = cacheKey;
        int i3 = 2;
        while (true) {
            CacheKey[] cacheKeyArr2 = internedKeys;
            if (i3 >= cacheKeyArr2.length) {
                return;
            }
            cacheKeyArr2[i3] = new CacheKey(i3);
            i3++;
        }
    }

    private LMSPrivateKeyParameters(LMSPrivateKeyParameters lMSPrivateKeyParameters, int i3, int i10) {
        super(true);
        LMSigParameters lMSigParameters = lMSPrivateKeyParameters.parameters;
        this.parameters = lMSigParameters;
        this.otsParameters = lMSPrivateKeyParameters.otsParameters;
        this.f19439q = i3;
        this.f19438I = lMSPrivateKeyParameters.f19438I;
        this.maxQ = i10;
        this.masterSecret = lMSPrivateKeyParameters.masterSecret;
        this.maxCacheR = 1 << lMSigParameters.getH();
        this.tCache = lMSPrivateKeyParameters.tCache;
        this.tDigest = DigestUtil.getDigest(lMSigParameters.getDigestOID());
        this.publicKey = lMSPrivateKeyParameters.publicKey;
    }

    private byte[] calcT(int i3) {
        int h2 = 1 << getSigParameters().getH();
        if (i3 >= h2) {
            LmsUtils.byteArray(getI(), this.tDigest);
            LmsUtils.u32str(i3, this.tDigest);
            LmsUtils.u16str((short) -32126, this.tDigest);
            LmsUtils.byteArray(LM_OTS.lms_ots_generatePublicKey(getOtsParameters(), getI(), i3 - h2, getMasterSecret()), this.tDigest);
            byte[] bArr = new byte[this.tDigest.getDigestSize()];
            this.tDigest.doFinal(bArr, 0);
            return bArr;
        }
        int i10 = i3 * 2;
        byte[] findT = findT(i10);
        byte[] findT2 = findT(i10 + 1);
        LmsUtils.byteArray(getI(), this.tDigest);
        LmsUtils.u32str(i3, this.tDigest);
        LmsUtils.u16str((short) -31869, this.tDigest);
        LmsUtils.byteArray(findT, this.tDigest);
        LmsUtils.byteArray(findT2, this.tDigest);
        byte[] bArr2 = new byte[this.tDigest.getDigestSize()];
        this.tDigest.doFinal(bArr2, 0);
        return bArr2;
    }

    public static LMSPrivateKeyParameters getInstance(Object obj) throws IOException {
        Throwable th;
        if (obj instanceof LMSPrivateKeyParameters) {
            return (LMSPrivateKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException(StubApp.getString2(34040));
            }
            LMSigParameters parametersForType = LMSigParameters.getParametersForType(dataInputStream.readInt());
            LMOtsParameters parametersForType2 = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            int readInt = dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            int readInt3 = dataInputStream.readInt();
            if (readInt3 < 0) {
                throw new IllegalStateException(StubApp.getString2(34039));
            }
            if (readInt3 <= dataInputStream.available()) {
                byte[] bArr2 = new byte[readInt3];
                dataInputStream.readFully(bArr2);
                return new LMSPrivateKeyParameters(parametersForType, parametersForType2, readInt, bArr, readInt2, bArr2);
            }
            throw new IOException(StubApp.getString2(34038) + dataInputStream.available());
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
                LMSPrivateKeyParameters lMSPrivateKeyParameters = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMSPrivateKeyParameters;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 == null) {
                    throw th;
                }
                dataInputStream2.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean equals(Object obj) {
        LMSPublicKeyParameters lMSPublicKeyParameters;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LMSPrivateKeyParameters lMSPrivateKeyParameters = (LMSPrivateKeyParameters) obj;
        if (this.f19439q != lMSPrivateKeyParameters.f19439q || this.maxQ != lMSPrivateKeyParameters.maxQ || !Arrays.areEqual(this.f19438I, lMSPrivateKeyParameters.f19438I)) {
            return false;
        }
        LMSigParameters lMSigParameters = this.parameters;
        if (lMSigParameters == null ? lMSPrivateKeyParameters.parameters != null : !lMSigParameters.equals(lMSPrivateKeyParameters.parameters)) {
            return false;
        }
        LMOtsParameters lMOtsParameters = this.otsParameters;
        if (lMOtsParameters == null ? lMSPrivateKeyParameters.otsParameters != null : !lMOtsParameters.equals(lMSPrivateKeyParameters.otsParameters)) {
            return false;
        }
        if (!Arrays.areEqual(this.masterSecret, lMSPrivateKeyParameters.masterSecret)) {
            return false;
        }
        LMSPublicKeyParameters lMSPublicKeyParameters2 = this.publicKey;
        if (lMSPublicKeyParameters2 == null || (lMSPublicKeyParameters = lMSPrivateKeyParameters.publicKey) == null) {
            return true;
        }
        return lMSPublicKeyParameters2.equals(lMSPublicKeyParameters);
    }

    public LMSPrivateKeyParameters extractKeyShard(int i3) {
        LMSPrivateKeyParameters lMSPrivateKeyParameters;
        synchronized (this) {
            try {
                int i10 = this.f19439q;
                if (i10 + i3 >= this.maxQ) {
                    throw new IllegalArgumentException(StubApp.getString2("34041"));
                }
                lMSPrivateKeyParameters = new LMSPrivateKeyParameters(this, i10, i10 + i3);
                this.f19439q += i3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lMSPrivateKeyParameters;
    }

    public byte[] findT(int i3) {
        if (i3 >= this.maxCacheR) {
            return calcT(i3);
        }
        CacheKey[] cacheKeyArr = internedKeys;
        return findT(i3 < cacheKeyArr.length ? cacheKeyArr[i3] : new CacheKey(i3));
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public LMSContext generateLMSContext() {
        int h2 = getSigParameters().getH();
        int index = getIndex();
        LMOtsPrivateKey nextOtsPrivateKey = getNextOtsPrivateKey();
        int i3 = (1 << h2) + index;
        byte[][] bArr = new byte[h2][];
        for (int i10 = 0; i10 < h2; i10++) {
            bArr[i10] = findT((i3 / (1 << i10)) ^ 1);
        }
        return nextOtsPrivateKey.getSignatureContext(getSigParameters(), bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public byte[] generateSignature(LMSContext lMSContext) {
        try {
            return LMS.generateSign(lMSContext).getEncoded();
        } catch (IOException e10) {
            throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(29327))), e10);
        }
    }

    public LMOtsPrivateKey getCurrentOTSKey() {
        LMOtsPrivateKey lMOtsPrivateKey;
        synchronized (this) {
            try {
                int i3 = this.f19439q;
                if (i3 >= this.maxQ) {
                    throw new ExhaustedPrivateKeyException(StubApp.getString2("34042"));
                }
                lMOtsPrivateKey = new LMOtsPrivateKey(this.otsParameters, this.f19438I, i3, this.masterSecret);
            } catch (Throwable th) {
                throw th;
            }
        }
        return lMOtsPrivateKey;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return Composer.compose().u32str(0).u32str(this.parameters.getType()).u32str(this.otsParameters.getType()).bytes(this.f19438I).u32str(this.f19439q).u32str(this.maxQ).u32str(this.masterSecret.length).bytes(this.masterSecret).build();
    }

    public byte[] getI() {
        return Arrays.clone(this.f19438I);
    }

    public synchronized int getIndex() {
        return this.f19439q;
    }

    public byte[] getMasterSecret() {
        return Arrays.clone(this.masterSecret);
    }

    public LMOtsPrivateKey getNextOtsPrivateKey() {
        LMOtsPrivateKey lMOtsPrivateKey;
        synchronized (this) {
            try {
                int i3 = this.f19439q;
                if (i3 >= this.maxQ) {
                    throw new ExhaustedPrivateKeyException(StubApp.getString2("34043"));
                }
                lMOtsPrivateKey = new LMOtsPrivateKey(this.otsParameters, this.f19438I, i3, this.masterSecret);
                incIndex();
            } catch (Throwable th) {
                throw th;
            }
        }
        return lMOtsPrivateKey;
    }

    public LMOtsParameters getOtsParameters() {
        return this.otsParameters;
    }

    public LMSPublicKeyParameters getPublicKey() {
        LMSPublicKeyParameters lMSPublicKeyParameters;
        synchronized (this) {
            try {
                if (this.publicKey == null) {
                    this.publicKey = new LMSPublicKeyParameters(this.parameters, this.otsParameters, findT(f19437T1), this.f19438I);
                }
                lMSPublicKeyParameters = this.publicKey;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lMSPublicKeyParameters;
    }

    public LMSigParameters getSigParameters() {
        return this.parameters;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public long getUsagesRemaining() {
        return this.maxQ - this.f19439q;
    }

    public int hashCode() {
        int hashCode = (Arrays.hashCode(this.f19438I) + (this.f19439q * 31)) * 31;
        LMSigParameters lMSigParameters = this.parameters;
        int hashCode2 = (hashCode + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31;
        LMOtsParameters lMOtsParameters = this.otsParameters;
        int hashCode3 = (Arrays.hashCode(this.masterSecret) + ((((hashCode2 + (lMOtsParameters != null ? lMOtsParameters.hashCode() : 0)) * 31) + this.maxQ) * 31)) * 31;
        LMSPublicKeyParameters lMSPublicKeyParameters = this.publicKey;
        return hashCode3 + (lMSPublicKeyParameters != null ? lMSPublicKeyParameters.hashCode() : 0);
    }

    public synchronized void incIndex() {
        this.f19439q++;
    }

    public LMSPrivateKeyParameters(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i3, byte[] bArr, int i10, byte[] bArr2) {
        super(true);
        this.parameters = lMSigParameters;
        this.otsParameters = lMOtsParameters;
        this.f19439q = i3;
        this.f19438I = Arrays.clone(bArr);
        this.maxQ = i10;
        this.masterSecret = Arrays.clone(bArr2);
        this.maxCacheR = 1 << (lMSigParameters.getH() + 1);
        this.tCache = new WeakHashMap();
        this.tDigest = DigestUtil.getDigest(lMSigParameters.getDigestOID());
    }

    private byte[] findT(CacheKey cacheKey) {
        byte[] bArr;
        synchronized (this.tCache) {
            try {
                bArr = this.tCache.get(cacheKey);
                if (bArr == null) {
                    bArr = calcT(cacheKey.index);
                    this.tCache.put(cacheKey, bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    public static LMSPrivateKeyParameters getInstance(byte[] bArr, byte[] bArr2) throws IOException {
        LMSPrivateKeyParameters lMSPrivateKeyParameters = getInstance(bArr);
        lMSPrivateKeyParameters.publicKey = LMSPublicKeyParameters.getInstance(bArr2);
        return lMSPrivateKeyParameters;
    }
}
