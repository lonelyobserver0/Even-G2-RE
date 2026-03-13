package org.bouncycastle.crypto.agreement.jpake;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JPAKERound2Payload {

    /* renamed from: a, reason: collision with root package name */
    private final BigInteger f18746a;
    private final BigInteger[] knowledgeProofForX2s;
    private final String participantId;

    public JPAKERound2Payload(String str, BigInteger bigInteger, BigInteger[] bigIntegerArr) {
        JPAKEUtil.validateNotNull(str, StubApp.getString2(28392));
        JPAKEUtil.validateNotNull(bigInteger, StubApp.getString2(2378));
        JPAKEUtil.validateNotNull(bigIntegerArr, StubApp.getString2(28421));
        this.participantId = str;
        this.f18746a = bigInteger;
        this.knowledgeProofForX2s = Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
    }

    public BigInteger getA() {
        return this.f18746a;
    }

    public BigInteger[] getKnowledgeProofForX2s() {
        BigInteger[] bigIntegerArr = this.knowledgeProofForX2s;
        return Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
    }

    public String getParticipantId() {
        return this.participantId;
    }
}
