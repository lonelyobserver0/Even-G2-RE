package org.bouncycastle.asn1.ua;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSTU4145NamedCurves {
    private static final BigInteger ONE;
    private static final BigInteger ZERO;
    static final String oidBase;
    static final ASN1ObjectIdentifier[] oids;
    static final ECDomainParameters[] params;

    static {
        BigInteger valueOf = BigInteger.valueOf(0L);
        ZERO = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(1L);
        ONE = valueOf2;
        params = new ECDomainParameters[10];
        oids = new ASN1ObjectIdentifier[10];
        oidBase = UAObjectIdentifiers.dstu4145le.getId() + StubApp.getString2(27472);
        BigInteger[] bigIntegerArr = {new BigInteger(StubApp.getString2(27473), 16), new BigInteger(StubApp.getString2(27474), 16), new BigInteger(StubApp.getString2(27475), 16), new BigInteger(StubApp.getString2(27476), 16), new BigInteger(StubApp.getString2(27477), 16), new BigInteger(StubApp.getString2(27478), 16), new BigInteger(StubApp.getString2(27479), 16), new BigInteger(StubApp.getString2(27480), 16), new BigInteger(StubApp.getString2(27481), 16), new BigInteger(StubApp.getString2(27482), 16)};
        BigInteger[] bigIntegerArr2 = {BigInteger.valueOf(2L), BigInteger.valueOf(2L), BigInteger.valueOf(4L), BigInteger.valueOf(2L), BigInteger.valueOf(2L), BigInteger.valueOf(2L), BigInteger.valueOf(4L), BigInteger.valueOf(2L), BigInteger.valueOf(2L), BigInteger.valueOf(2L)};
        ECCurve.F2m[] f2mArr = {new ECCurve.F2m(163, 3, 6, 7, valueOf2, new BigInteger(StubApp.getString2(27483), 16), bigIntegerArr[0], bigIntegerArr2[0]), new ECCurve.F2m(167, 6, valueOf2, new BigInteger(StubApp.getString2(27484), 16), bigIntegerArr[1], bigIntegerArr2[1]), new ECCurve.F2m(173, 1, 2, 10, valueOf, new BigInteger(StubApp.getString2(27485), 16), bigIntegerArr[2], bigIntegerArr2[2]), new ECCurve.F2m(179, 1, 2, 4, valueOf2, new BigInteger(StubApp.getString2(27486), 16), bigIntegerArr[3], bigIntegerArr2[3]), new ECCurve.F2m(191, 9, valueOf2, new BigInteger(StubApp.getString2(27487), 16), bigIntegerArr[4], bigIntegerArr2[4]), new ECCurve.F2m(233, 1, 4, 9, valueOf2, new BigInteger(StubApp.getString2(27488), 16), bigIntegerArr[5], bigIntegerArr2[5]), new ECCurve.F2m(257, 12, valueOf, new BigInteger(StubApp.getString2(27489), 16), bigIntegerArr[6], bigIntegerArr2[6]), new ECCurve.F2m(307, 2, 4, 8, valueOf2, new BigInteger(StubApp.getString2(27490), 16), bigIntegerArr[7], bigIntegerArr2[7]), new ECCurve.F2m(367, 21, valueOf2, new BigInteger(StubApp.getString2(27491), 16), bigIntegerArr[8], bigIntegerArr2[8]), new ECCurve.F2m(431, 1, 3, 5, valueOf2, new BigInteger(StubApp.getString2(27492), 16), bigIntegerArr[9], bigIntegerArr2[9])};
        ECPoint[] eCPointArr = {f2mArr[0].createPoint(new BigInteger(StubApp.getString2(27493), 16), new BigInteger(StubApp.getString2(27494), 16)), f2mArr[1].createPoint(new BigInteger(StubApp.getString2(27495), 16), new BigInteger(StubApp.getString2(27496), 16)), f2mArr[2].createPoint(new BigInteger(StubApp.getString2(27497), 16), new BigInteger(StubApp.getString2(27498), 16)), f2mArr[3].createPoint(new BigInteger(StubApp.getString2(27499), 16), new BigInteger(StubApp.getString2(27500), 16)), f2mArr[4].createPoint(new BigInteger(StubApp.getString2(27501), 16), new BigInteger(StubApp.getString2(27502), 16)), f2mArr[5].createPoint(new BigInteger(StubApp.getString2(27503), 16), new BigInteger(StubApp.getString2(27504), 16)), f2mArr[6].createPoint(new BigInteger(StubApp.getString2(27505), 16), new BigInteger(StubApp.getString2(27506), 16)), f2mArr[7].createPoint(new BigInteger(StubApp.getString2(27507), 16), new BigInteger(StubApp.getString2(27508), 16)), f2mArr[8].createPoint(new BigInteger(StubApp.getString2(27509), 16), new BigInteger(StubApp.getString2(27510), 16)), f2mArr[9].createPoint(new BigInteger(StubApp.getString2(27511), 16), new BigInteger(StubApp.getString2(27512), 16))};
        int i3 = 0;
        while (true) {
            ECDomainParameters[] eCDomainParametersArr = params;
            if (i3 >= eCDomainParametersArr.length) {
                break;
            }
            eCDomainParametersArr[i3] = new ECDomainParameters(f2mArr[i3], eCPointArr[i3], bigIntegerArr[i3], bigIntegerArr2[i3]);
            i3++;
        }
        int i10 = 0;
        while (true) {
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = oids;
            if (i10 >= aSN1ObjectIdentifierArr.length) {
                return;
            }
            aSN1ObjectIdentifierArr[i10] = new ASN1ObjectIdentifier(oidBase + i10);
            i10++;
        }
    }

    public static ECDomainParameters getByOID(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int parseInt;
        String id = aSN1ObjectIdentifier.getId();
        if (id.startsWith(oidBase) && (parseInt = Integer.parseInt(id.substring(id.lastIndexOf(46) + 1))) >= 0) {
            ECDomainParameters[] eCDomainParametersArr = params;
            if (parseInt < eCDomainParametersArr.length) {
                return eCDomainParametersArr[parseInt];
            }
        }
        return null;
    }

    public static ASN1ObjectIdentifier[] getOIDs() {
        return oids;
    }
}
