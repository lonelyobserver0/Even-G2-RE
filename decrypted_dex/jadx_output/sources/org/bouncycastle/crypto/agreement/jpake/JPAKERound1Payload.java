package org.bouncycastle.crypto.agreement.jpake;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JPAKERound1Payload {
    private final BigInteger gx1;
    private final BigInteger gx2;
    private final BigInteger[] knowledgeProofForX1;
    private final BigInteger[] knowledgeProofForX2;
    private final String participantId;

    public JPAKERound1Payload(String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        JPAKEUtil.validateNotNull(str, StubApp.getString2(28392));
        JPAKEUtil.validateNotNull(bigInteger, StubApp.getString2(28417));
        JPAKEUtil.validateNotNull(bigInteger2, StubApp.getString2(28418));
        JPAKEUtil.validateNotNull(bigIntegerArr, StubApp.getString2(28419));
        JPAKEUtil.validateNotNull(bigIntegerArr2, StubApp.getString2(28420));
        this.participantId = str;
        this.gx1 = bigInteger;
        this.gx2 = bigInteger2;
        this.knowledgeProofForX1 = Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
        this.knowledgeProofForX2 = Arrays.copyOf(bigIntegerArr2, bigIntegerArr2.length);
    }

    public BigInteger getGx1() {
        return this.gx1;
    }

    public BigInteger getGx2() {
        return this.gx2;
    }

    public BigInteger[] getKnowledgeProofForX1() {
        BigInteger[] bigIntegerArr = this.knowledgeProofForX1;
        return Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
    }

    public BigInteger[] getKnowledgeProofForX2() {
        BigInteger[] bigIntegerArr = this.knowledgeProofForX2;
        return Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
    }

    public String getParticipantId() {
        return this.participantId;
    }
}
