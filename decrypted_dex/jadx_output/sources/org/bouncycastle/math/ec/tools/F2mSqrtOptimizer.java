package org.bouncycastle.math.ec.tools;

import com.stub.StubApp;
import java.math.BigInteger;
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

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class F2mSqrtOptimizer {
    private static ArrayList enumToList(Enumeration enumeration) {
        ArrayList arrayList = new ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList;
    }

    private static void implPrintRootZ(ECCurve eCCurve) {
        ECFieldElement fromBigInteger = eCCurve.fromBigInteger(BigInteger.valueOf(2L));
        ECFieldElement sqrt = fromBigInteger.sqrt();
        System.out.println(sqrt.toBigInteger().toString(16).toUpperCase());
        if (!sqrt.square().equals(fromBigInteger)) {
            throw new IllegalStateException(StubApp.getString2(33011));
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
                    implPrintRootZ(curve);
                }
            }
        }
    }

    public static void printRootZ(ECCurve eCCurve) {
        if (!ECAlgorithms.isF2mCurve(eCCurve)) {
            throw new IllegalArgumentException(StubApp.getString2(33012));
        }
        implPrintRootZ(eCCurve);
    }
}
