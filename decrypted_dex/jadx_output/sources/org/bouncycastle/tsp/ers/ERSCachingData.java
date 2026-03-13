package org.bouncycastle.tsp.ers;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ERSCachingData implements ERSData {
    private Map<CacheIndex, byte[]> preCalcs = new HashMap();

    /* renamed from: org.bouncycastle.tsp.ers.ERSCachingData$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class CacheIndex {
        final AlgorithmIdentifier algId;
        final byte[] chainHash;

        private CacheIndex(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
            this.algId = algorithmIdentifier;
            this.chainHash = bArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CacheIndex)) {
                return false;
            }
            CacheIndex cacheIndex = (CacheIndex) obj;
            return this.algId.equals(cacheIndex.algId) && Arrays.areEqual(this.chainHash, cacheIndex.chainHash);
        }

        public int hashCode() {
            return Arrays.hashCode(this.chainHash) + (this.algId.hashCode() * 31);
        }

        public /* synthetic */ CacheIndex(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, AnonymousClass1 anonymousClass1) {
            this(algorithmIdentifier, bArr);
        }
    }

    public abstract byte[] calculateHash(DigestCalculator digestCalculator, byte[] bArr);

    @Override // org.bouncycastle.tsp.ers.ERSData
    public byte[] getHash(DigestCalculator digestCalculator, byte[] bArr) {
        CacheIndex cacheIndex = new CacheIndex(digestCalculator.getAlgorithmIdentifier(), bArr, null);
        if (this.preCalcs.containsKey(cacheIndex)) {
            return this.preCalcs.get(cacheIndex);
        }
        byte[] calculateHash = calculateHash(digestCalculator, bArr);
        this.preCalcs.put(cacheIndex, calculateHash);
        return calculateHash;
    }
}
