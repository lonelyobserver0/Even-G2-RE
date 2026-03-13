package org.bouncycastle.math.ec;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class ValidityPrecompInfo implements PreCompInfo {
    static final String PRECOMP_NAME = StubApp.getString2(32922);
    private boolean failed = false;
    private boolean curveEquationPassed = false;
    private boolean orderPassed = false;

    public boolean hasCurveEquationPassed() {
        return this.curveEquationPassed;
    }

    public boolean hasFailed() {
        return this.failed;
    }

    public boolean hasOrderPassed() {
        return this.orderPassed;
    }

    public void reportCurveEquationPassed() {
        this.curveEquationPassed = true;
    }

    public void reportFailed() {
        this.failed = true;
    }

    public void reportOrderPassed() {
        this.orderPassed = true;
    }
}
