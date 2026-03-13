package org.bouncycastle.util.test;

import com.stub.StubApp;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class SimpleTest implements Test {
    public static void runTest(Test test) {
        runTest(test, System.out);
    }

    public static void runTests(Test[] testArr) {
        runTests(testArr, System.out);
    }

    private TestResult success() {
        return SimpleTestResult.successful(this, StubApp.getString2(35021));
    }

    public boolean areEqual(byte[] bArr, int i3, int i10, byte[] bArr2, int i11, int i12) {
        return Arrays.areEqual(bArr, i3, i10, bArr2, i11, i12);
    }

    public void fail(String str) {
        throw new TestFailedException(SimpleTestResult.failed(this, str));
    }

    @Override // org.bouncycastle.util.test.Test
    public abstract String getName();

    public void isEquals(int i3, int i10) {
        if (i3 != i10) {
            throw new TestFailedException(SimpleTestResult.failed(this, StubApp.getString2(35022)));
        }
    }

    public void isTrue(String str, boolean z2) {
        if (!z2) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
    }

    @Override // org.bouncycastle.util.test.Test
    public TestResult perform() {
        try {
            performTest();
            return success();
        } catch (TestFailedException e10) {
            return e10.getResult();
        } catch (Exception e11) {
            return SimpleTestResult.failed(this, StubApp.getString2(3465) + e11, e11);
        }
    }

    public abstract void performTest() throws Exception;

    public static void runTest(Test test, PrintStream printStream) {
        TestResult perform = test.perform();
        if (perform.getException() != null) {
            perform.getException().printStackTrace(printStream);
        }
        printStream.println(perform);
    }

    public static void runTests(Test[] testArr, PrintStream printStream) {
        Vector vector = new Vector();
        for (int i3 = 0; i3 != testArr.length; i3++) {
            TestResult perform = testArr[i3].perform();
            if (!perform.isSuccessful()) {
                vector.addElement(perform);
            }
            if (perform.getException() != null) {
                perform.getException().printStackTrace(printStream);
            }
            printStream.println(perform);
        }
        printStream.println(StubApp.getString2(30873));
        if (vector.isEmpty()) {
            printStream.println(StubApp.getString2(35017));
            return;
        }
        printStream.println(StubApp.getString2(35018) + vector.size() + StubApp.getString2(35019));
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            System.out.println(StubApp.getString2(35020) + ((TestResult) elements.nextElement()));
        }
    }

    public boolean areEqual(byte[] bArr, byte[] bArr2) {
        return Arrays.areEqual(bArr, bArr2);
    }

    public void fail(String str, Object obj, Object obj2) {
        throw new TestFailedException(SimpleTestResult.failed(this, str, obj, obj2));
    }

    public void isEquals(long j, long j3) {
        if (j != j3) {
            throw new TestFailedException(SimpleTestResult.failed(this, StubApp.getString2(35022)));
        }
    }

    public void isTrue(boolean z2) {
        if (!z2) {
            throw new TestFailedException(SimpleTestResult.failed(this, StubApp.getString2(35022)));
        }
    }

    public boolean areEqual(byte[][] bArr, byte[][] bArr2) {
        if (bArr == null && bArr2 == null) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if (!areEqual(bArr[i3], bArr2[i3])) {
                return false;
            }
        }
        return true;
    }

    public void fail(String str, Throwable th) {
        throw new TestFailedException(SimpleTestResult.failed(this, str, th));
    }

    public void isEquals(Object obj, Object obj2) {
        if (!obj.equals(obj2)) {
            throw new TestFailedException(SimpleTestResult.failed(this, StubApp.getString2(35022)));
        }
    }

    public void isEquals(String str, long j, long j3) {
        if (j != j3) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
    }

    public void isEquals(String str, Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
        if (obj2 == null) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
        if (!obj.equals(obj2)) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
    }

    public void isEquals(String str, boolean z2, boolean z10) {
        if (z2 != z10) {
            throw new TestFailedException(SimpleTestResult.failed(this, str));
        }
    }

    public void isEquals(boolean z2, boolean z10) {
        if (z2 != z10) {
            throw new TestFailedException(SimpleTestResult.failed(this, StubApp.getString2(35022)));
        }
    }
}
