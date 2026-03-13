package org.bouncycastle.math.ec.tools;

import com.stub.StubApp;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TraceOptimizer {
    private static final BigInteger ONE = BigInteger.valueOf(1);

    /* renamed from: R, reason: collision with root package name */
    private static final SecureRandom f19305R = new SecureRandom();

    private static int calculateTrace(ECFieldElement eCFieldElement) {
        int fieldSize = eCFieldElement.getFieldSize();
        int numberOfLeadingZeros = 31 - Integers.numberOfLeadingZeros(fieldSize);
        ECFieldElement eCFieldElement2 = eCFieldElement;
        int i3 = 1;
        while (numberOfLeadingZeros > 0) {
            eCFieldElement2 = eCFieldElement2.squarePow(i3).add(eCFieldElement2);
            numberOfLeadingZeros--;
            i3 = fieldSize >>> numberOfLeadingZeros;
            if ((i3 & 1) != 0) {
                eCFieldElement2 = eCFieldElement2.square().add(eCFieldElement);
            }
        }
        if (eCFieldElement2.isZero()) {
            return 0;
        }
        if (eCFieldElement2.isOne()) {
            return 1;
        }
        throw new IllegalStateException(StubApp.getString2(32915));
    }

    private static ArrayList enumToList(Enumeration enumeration) {
        ArrayList arrayList = new ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList;
    }

    public static void implPrintNonZeroTraceBits(ECCurve eCCurve) {
        PrintStream printStream;
        StringBuilder sb2;
        int fieldSize = eCCurve.getFieldSize();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < fieldSize; i3++) {
            int i10 = i3 & 1;
            String string2 = StubApp.getString2(397);
            if (i10 != 0 || i3 == 0) {
                if (calculateTrace(eCCurve.fromBigInteger(ONE.shiftLeft(i3))) != 0) {
                    arrayList.add(Integers.valueOf(i3));
                    printStream = System.out;
                    sb2 = new StringBuilder(string2);
                    sb2.append(i3);
                    printStream.print(sb2.toString());
                }
            } else if (arrayList.contains(Integers.valueOf(i3 >>> 1))) {
                arrayList.add(Integers.valueOf(i3));
                printStream = System.out;
                sb2 = new StringBuilder(string2);
                sb2.append(i3);
                printStream.print(sb2.toString());
            }
        }
        System.out.println();
        for (int i11 = 0; i11 < 1000; i11++) {
            BigInteger bigInteger = new BigInteger(fieldSize, f19305R);
            int calculateTrace = calculateTrace(eCCurve.fromBigInteger(bigInteger));
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                if (bigInteger.testBit(((Integer) arrayList.get(i13)).intValue())) {
                    i12 ^= 1;
                }
            }
            if (calculateTrace != i12) {
                throw new IllegalStateException(StubApp.getString2(33013));
            }
        }
    }

    public static void main(String[] strArr) {
        TreeSet treeSet = new TreeSet(enumToList(ECNamedCurveTable.getNames()));
        treeSet.addAll(enumToList(CustomNamedCurves.getNames()));
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            X9ECParametersHolder byNameLazy = CustomNamedCurves.getByNameLazy(str);
            if (byNameLazy == null) {
                byNameLazy = ECNamedCurveTable.getByNameLazy(str);
            }
            if (byNameLazy != null) {
                ECCurve curve = byNameLazy.getCurve();
                if (ECAlgorithms.isF2mCurve(curve)) {
                    System.out.print(str + StubApp.getString2(478));
                    implPrintNonZeroTraceBits(curve);
                }
            }
        }
    }

    public static void printNonZeroTraceBits(ECCurve eCCurve) {
        if (!ECAlgorithms.isF2mCurve(eCCurve)) {
            throw new IllegalArgumentException(StubApp.getString2(33014));
        }
        implPrintNonZeroTraceBits(eCCurve);
    }
}
