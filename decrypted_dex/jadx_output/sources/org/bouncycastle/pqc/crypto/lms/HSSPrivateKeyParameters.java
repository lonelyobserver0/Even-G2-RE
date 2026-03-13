package org.bouncycastle.pqc.crypto.lms;

import Xa.h;
import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HSSPrivateKeyParameters extends LMSKeyParameters implements LMSContextBasedSigner {
    private long index;
    private final long indexLimit;
    private final boolean isShard;
    private List<LMSPrivateKeyParameters> keys;

    /* renamed from: l, reason: collision with root package name */
    private final int f19424l;
    private HSSPublicKeyParameters publicKey;
    private List<LMSSignature> sig;

    public HSSPrivateKeyParameters(int i3, List<LMSPrivateKeyParameters> list, List<LMSSignature> list2, long j, long j3) {
        super(true);
        this.index = 0L;
        this.f19424l = i3;
        this.keys = Collections.unmodifiableList(list);
        this.sig = Collections.unmodifiableList(list2);
        this.index = j;
        this.indexLimit = j3;
        this.isShard = false;
        resetKeyToIndex();
    }

    public static HSSPrivateKeyParameters getInstance(Object obj) throws IOException {
        Throwable th;
        if (obj instanceof HSSPrivateKeyParameters) {
            return (HSSPrivateKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException(StubApp.getString2(34031));
            }
            int readInt = dataInputStream.readInt();
            long readLong = dataInputStream.readLong();
            long readLong2 = dataInputStream.readLong();
            boolean readBoolean = dataInputStream.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < readInt; i3++) {
                arrayList.add(LMSPrivateKeyParameters.getInstance(obj));
            }
            for (int i10 = 0; i10 < readInt - 1; i10++) {
                arrayList2.add(LMSSignature.getInstance(obj));
            }
            return new HSSPrivateKeyParameters(readInt, arrayList, arrayList2, readLong, readLong2, readBoolean);
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
                HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(dataInputStream3);
                dataInputStream3.close();
                return hSSPrivateKeyParameters;
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

    private static HSSPrivateKeyParameters makeCopy(HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        try {
            return getInstance(hSSPrivateKeyParameters.getEncoded());
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return makeCopy(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HSSPrivateKeyParameters hSSPrivateKeyParameters = (HSSPrivateKeyParameters) obj;
        if (this.f19424l == hSSPrivateKeyParameters.f19424l && this.isShard == hSSPrivateKeyParameters.isShard && this.indexLimit == hSSPrivateKeyParameters.indexLimit && this.index == hSSPrivateKeyParameters.index && this.keys.equals(hSSPrivateKeyParameters.keys)) {
            return this.sig.equals(hSSPrivateKeyParameters.sig);
        }
        return false;
    }

    public HSSPrivateKeyParameters extractKeyShard(int i3) {
        HSSPrivateKeyParameters makeCopy;
        synchronized (this) {
            try {
                long j = i3;
                if (getUsagesRemaining() < j) {
                    throw new IllegalArgumentException(StubApp.getString2("34033"));
                }
                long j3 = this.index;
                this.index = j + j3;
                makeCopy = makeCopy(new HSSPrivateKeyParameters(this.f19424l, new ArrayList(getKeys()), new ArrayList(getSig()), j3, j3 + j, true));
                resetKeyToIndex();
            } catch (Throwable th) {
                throw th;
            }
        }
        return makeCopy;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public LMSContext generateLMSContext() {
        LMSPrivateKeyParameters lMSPrivateKeyParameters;
        LMSSignedPubKey[] lMSSignedPubKeyArr;
        int l9 = getL();
        synchronized (this) {
            try {
                HSS.rangeTestKeys(this);
                List<LMSPrivateKeyParameters> keys = getKeys();
                List<LMSSignature> sig = getSig();
                int i3 = l9 - 1;
                lMSPrivateKeyParameters = getKeys().get(i3);
                lMSSignedPubKeyArr = new LMSSignedPubKey[i3];
                int i10 = 0;
                while (i10 < i3) {
                    int i11 = i10 + 1;
                    lMSSignedPubKeyArr[i10] = new LMSSignedPubKey(sig.get(i10), keys.get(i11).getPublicKey());
                    i10 = i11;
                }
                incIndex();
            } catch (Throwable th) {
                throw th;
            }
        }
        return lMSPrivateKeyParameters.generateLMSContext().withSignedPublicKeys(lMSSignedPubKeyArr);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public byte[] generateSignature(LMSContext lMSContext) {
        try {
            return HSS.generateSignature(getL(), lMSContext).getEncoded();
        } catch (IOException e10) {
            throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(29327))), e10);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public synchronized byte[] getEncoded() throws IOException {
        Composer bool;
        try {
            bool = Composer.compose().u32str(0).u32str(this.f19424l).u64str(this.index).u64str(this.indexLimit).bool(this.isShard);
            Iterator<LMSPrivateKeyParameters> it = this.keys.iterator();
            while (it.hasNext()) {
                bool.bytes(it.next());
            }
            Iterator<LMSSignature> it2 = this.sig.iterator();
            while (it2.hasNext()) {
                bool.bytes(it2.next());
            }
        } catch (Throwable th) {
            throw th;
        }
        return bool.build();
    }

    public synchronized long getIndex() {
        return this.index;
    }

    public long getIndexLimit() {
        return this.indexLimit;
    }

    public synchronized List<LMSPrivateKeyParameters> getKeys() {
        return this.keys;
    }

    public int getL() {
        return this.f19424l;
    }

    public synchronized LMSParameters[] getLMSParameters() {
        LMSParameters[] lMSParametersArr;
        int size = this.keys.size();
        lMSParametersArr = new LMSParameters[size];
        for (int i3 = 0; i3 < size; i3++) {
            LMSPrivateKeyParameters lMSPrivateKeyParameters = this.keys.get(i3);
            lMSParametersArr[i3] = new LMSParameters(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters());
        }
        return lMSParametersArr;
    }

    public synchronized HSSPublicKeyParameters getPublicKey() {
        return new HSSPublicKeyParameters(this.f19424l, getRootKey().getPublicKey());
    }

    public LMSPrivateKeyParameters getRootKey() {
        return this.keys.get(0);
    }

    public synchronized List<LMSSignature> getSig() {
        return this.sig;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public long getUsagesRemaining() {
        return this.indexLimit - this.index;
    }

    public int hashCode() {
        int hashCode = (this.sig.hashCode() + ((this.keys.hashCode() + (((this.f19424l * 31) + (this.isShard ? 1 : 0)) * 31)) * 31)) * 31;
        long j = this.indexLimit;
        int i3 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.index;
        return i3 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public synchronized void incIndex() {
        this.index++;
    }

    public boolean isShard() {
        return this.isShard;
    }

    public void replaceConsumedKey(int i3) {
        int i10 = i3 - 1;
        SeedDerive derivationFunction = this.keys.get(i10).getCurrentOTSKey().getDerivationFunction();
        derivationFunction.setJ(-2);
        byte[] bArr = new byte[32];
        derivationFunction.deriveSeed(bArr, true);
        byte[] bArr2 = new byte[32];
        derivationFunction.deriveSeed(bArr2, false);
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr2, 0, bArr3, 0, 16);
        ArrayList arrayList = new ArrayList(this.keys);
        LMSPrivateKeyParameters lMSPrivateKeyParameters = this.keys.get(i3);
        arrayList.set(i3, LMS.generateKeys(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters(), 0, bArr3, bArr));
        ArrayList arrayList2 = new ArrayList(this.sig);
        arrayList2.set(i10, LMS.generateSign((LMSPrivateKeyParameters) arrayList.get(i10), ((LMSPrivateKeyParameters) arrayList.get(i3)).getPublicKey().toByteArray()));
        this.keys = Collections.unmodifiableList(arrayList);
        this.sig = Collections.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d3, code lost:
    
        if (r3[r9] == (r4[r9].getIndex() - 1)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void resetKeyToIndex() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters.resetKeyToIndex():void");
    }

    public void updateHierarchy(LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr, LMSSignature[] lMSSignatureArr) {
        synchronized (this) {
            this.keys = Collections.unmodifiableList(Arrays.asList(lMSPrivateKeyParametersArr));
            this.sig = Collections.unmodifiableList(Arrays.asList(lMSSignatureArr));
        }
    }

    private HSSPrivateKeyParameters(int i3, List<LMSPrivateKeyParameters> list, List<LMSSignature> list2, long j, long j3, boolean z2) {
        super(true);
        this.index = 0L;
        this.f19424l = i3;
        this.keys = Collections.unmodifiableList(list);
        this.sig = Collections.unmodifiableList(list2);
        this.index = j;
        this.indexLimit = j3;
        this.isShard = z2;
    }

    public static HSSPrivateKeyParameters getInstance(byte[] bArr, byte[] bArr2) throws IOException {
        HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(bArr);
        hSSPrivateKeyParameters.publicKey = HSSPublicKeyParameters.getInstance(bArr2);
        return hSSPrivateKeyParameters;
    }
}
