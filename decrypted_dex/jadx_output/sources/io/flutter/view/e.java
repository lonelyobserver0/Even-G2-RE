package io.flutter.view;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum e {
    f15104b(1),
    f15105c(2),
    f15106d(4),
    f15107e(8),
    f15108f(16),
    f15109g(32),
    f15110h(64),
    j(128),
    f15111k(256),
    f15112l(512),
    f15113m(1024),
    f15114n(2048),
    f15115p(4096),
    f15116q(8192),
    f15117r(16384),
    f15118s(32768),
    f15119t(PKIFailureInfo.notAuthorized),
    f15120v(PKIFailureInfo.unsupportedVersion),
    f15121w(PKIFailureInfo.transactionIdInUse),
    f15122x(PKIFailureInfo.signerNotTrusted),
    f15123y(PKIFailureInfo.badCertTemplate),
    f15124z(PKIFailureInfo.badSenderNonce),
    /* JADX INFO: Fake field, exist only in values array */
    EF416(4194304),
    /* JADX INFO: Fake field, exist only in values array */
    EF434(8388608);


    /* renamed from: a, reason: collision with root package name */
    public final int f15125a;

    e(int i3) {
        this.f15125a = i3;
    }
}
