package org.bouncycastle.its;

import com.stub.StubApp;
import org.bouncycastle.its.operator.ETSIDataDecryptor;
import org.bouncycastle.oer.its.ieee1609dot2.AesCcmCiphertext;
import org.bouncycastle.oer.its.ieee1609dot2.EncryptedData;
import org.bouncycastle.oer.its.ieee1609dot2.PKRecipientInfo;
import org.bouncycastle.oer.its.ieee1609dot2.RecipientInfo;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP256CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EciesP256EncryptedKey;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ETSIRecipientInfo {
    private final EncryptedData encryptedData;
    private final RecipientInfo recipientInfo;

    public ETSIRecipientInfo(EncryptedData encryptedData, RecipientInfo recipientInfo) {
        this.recipientInfo = recipientInfo;
        this.encryptedData = encryptedData;
    }

    public byte[] getContent(ETSIDataDecryptor eTSIDataDecryptor) {
        if (this.encryptedData.getCiphertext().getChoice() != 0) {
            throw new IllegalArgumentException(StubApp.getString2(29598));
        }
        AesCcmCiphertext aesCcmCiphertext = AesCcmCiphertext.getInstance(this.encryptedData.getCiphertext().getSymmetricCiphertext());
        EciesP256EncryptedKey eciesP256EncryptedKey = EciesP256EncryptedKey.getInstance(PKRecipientInfo.getInstance(this.recipientInfo.getRecipientInfo()).getEncKey().getEncryptedDataEncryptionKey());
        return eTSIDataDecryptor.decrypt(Arrays.concatenate(EccP256CurvePoint.getInstance(eciesP256EncryptedKey.getV()).getEncodedPoint(), eciesP256EncryptedKey.getC().getOctets(), eciesP256EncryptedKey.getT().getOctets()), aesCcmCiphertext.getCcmCiphertext().getContent(), aesCcmCiphertext.getNonce().getOctets());
    }

    public EncryptedData getEncryptedData() {
        return this.encryptedData;
    }

    public RecipientInfo getRecipientInfo() {
        return this.recipientInfo;
    }

    public ETSIRecipientInfo(RecipientInfo recipientInfo) {
        this.recipientInfo = recipientInfo;
        this.encryptedData = null;
    }
}
