package org.bouncycastle.util.test;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TestFailedException extends RuntimeException {
    private TestResult _result;

    public TestFailedException(TestResult testResult) {
        this._result = testResult;
    }

    public TestResult getResult() {
        return this._result;
    }
}
