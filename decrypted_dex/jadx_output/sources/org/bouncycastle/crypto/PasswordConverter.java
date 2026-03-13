package org.bouncycastle.crypto;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public enum PasswordConverter implements CharToByteConverter {
    ASCII { // from class: org.bouncycastle.crypto.PasswordConverter.1
        @Override // org.bouncycastle.crypto.CharToByteConverter
        public byte[] convert(char[] cArr) {
            return PBEParametersGenerator.PKCS5PasswordToBytes(cArr);
        }

        @Override // org.bouncycastle.crypto.CharToByteConverter
        public String getType() {
            return StubApp.getString2(6207);
        }
    },
    UTF8 { // from class: org.bouncycastle.crypto.PasswordConverter.2
        @Override // org.bouncycastle.crypto.CharToByteConverter
        public byte[] convert(char[] cArr) {
            return PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(cArr);
        }

        @Override // org.bouncycastle.crypto.CharToByteConverter
        public String getType() {
            return StubApp.getString2(6206);
        }
    },
    PKCS12 { // from class: org.bouncycastle.crypto.PasswordConverter.3
        @Override // org.bouncycastle.crypto.CharToByteConverter
        public byte[] convert(char[] cArr) {
            return PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
        }

        @Override // org.bouncycastle.crypto.CharToByteConverter
        public String getType() {
            return StubApp.getString2(28343);
        }
    }
}
