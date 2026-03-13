package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.Digest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Utils {

    public static class DefaultProperties implements CryptoServiceProperties {
        private final String algorithmName;
        private final int bitsOfSecurity;
        private final CryptoServicePurpose purpose;

        public DefaultProperties(int i3, String str, CryptoServicePurpose cryptoServicePurpose) {
            this.bitsOfSecurity = i3;
            this.algorithmName = str;
            this.purpose = cryptoServicePurpose;
        }

        @Override // org.bouncycastle.crypto.CryptoServiceProperties
        public int bitsOfSecurity() {
            return this.bitsOfSecurity;
        }

        @Override // org.bouncycastle.crypto.CryptoServiceProperties
        public Object getParams() {
            return null;
        }

        @Override // org.bouncycastle.crypto.CryptoServiceProperties
        public CryptoServicePurpose getPurpose() {
            return this.purpose;
        }

        @Override // org.bouncycastle.crypto.CryptoServiceProperties
        public String getServiceName() {
            return this.algorithmName;
        }
    }

    public static class DefaultPropertiesWithPRF implements CryptoServiceProperties {
        private final String algorithmName;
        private final int bitsOfSecurity;
        private final int prfBitsOfSecurity;
        private final CryptoServicePurpose purpose;

        public DefaultPropertiesWithPRF(int i3, int i10, String str, CryptoServicePurpose cryptoServicePurpose) {
            this.bitsOfSecurity = i3;
            this.prfBitsOfSecurity = i10;
            this.algorithmName = str;
            this.purpose = cryptoServicePurpose;
        }

        @Override // org.bouncycastle.crypto.CryptoServiceProperties
        public int bitsOfSecurity() {
            return this.purpose == CryptoServicePurpose.PRF ? this.prfBitsOfSecurity : this.bitsOfSecurity;
        }

        @Override // org.bouncycastle.crypto.CryptoServiceProperties
        public Object getParams() {
            return null;
        }

        @Override // org.bouncycastle.crypto.CryptoServiceProperties
        public CryptoServicePurpose getPurpose() {
            return this.purpose;
        }

        @Override // org.bouncycastle.crypto.CryptoServiceProperties
        public String getServiceName() {
            return this.algorithmName;
        }
    }

    public static CryptoServiceProperties getDefaultProperties(Digest digest, int i3, CryptoServicePurpose cryptoServicePurpose) {
        return new DefaultPropertiesWithPRF(digest.getDigestSize() * 4, i3, digest.getAlgorithmName(), cryptoServicePurpose);
    }

    public static CryptoServiceProperties getDefaultProperties(Digest digest, CryptoServicePurpose cryptoServicePurpose) {
        return new DefaultProperties(digest.getDigestSize() * 4, digest.getAlgorithmName(), cryptoServicePurpose);
    }
}
