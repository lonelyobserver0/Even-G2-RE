package org.bouncycastle.pqc.crypto.picnic;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.util.Exceptions;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class LowmcConstants {
    private static final KMatrices KMatrix_L1;
    private static final KMatrices KMatrix_L1_full;
    private static final KMatrices KMatrix_L1_inv;
    private static final KMatrices KMatrix_L3;
    private static final KMatrices KMatrix_L3_full;
    private static final KMatrices KMatrix_L3_inv;
    private static final KMatrices KMatrix_L5;
    private static final KMatrices KMatrix_L5_full;
    private static final KMatrices KMatrix_L5_inv;
    private static final KMatrices LMatrix_L1;
    private static final KMatrices LMatrix_L1_full;
    private static final KMatrices LMatrix_L1_inv;
    private static final KMatrices LMatrix_L3;
    private static final KMatrices LMatrix_L3_full;
    private static final KMatrices LMatrix_L3_inv;
    private static final KMatrices LMatrix_L5;
    private static final KMatrices LMatrix_L5_full;
    private static final KMatrices LMatrix_L5_inv;
    private static final KMatrices RConstants_L1;
    private static final KMatrices RConstants_L1_full;
    private static final KMatrices RConstants_L3;
    private static final KMatrices RConstants_L3_full;
    private static final KMatrices RConstants_L5;
    private static final KMatrices RConstants_L5_full;
    private static final int[] keyMatrices_L1;
    private static final int[] keyMatrices_L1_full;
    private static final int[] keyMatrices_L1_inv;
    private static final int[] keyMatrices_L3;
    private static final int[] keyMatrices_L3_full;
    private static final int[] keyMatrices_L3_inv;
    private static final int[] keyMatrices_L5;
    private static final int[] keyMatrices_L5_full;
    private static final int[] keyMatrices_L5_inv;
    private static final int[] linearMatrices_L1;
    private static final int[] linearMatrices_L1_full;
    private static final int[] linearMatrices_L1_inv;
    private static final int[] linearMatrices_L3;
    private static final int[] linearMatrices_L3_full;
    private static final int[] linearMatrices_L3_inv;
    private static final int[] linearMatrices_L5;
    private static final int[] linearMatrices_L5_full;
    private static final int[] linearMatrices_L5_inv;
    private static final int[] roundConstants_L1;
    private static final int[] roundConstants_L1_full;
    private static final int[] roundConstants_L3;
    private static final int[] roundConstants_L3_full;
    private static final int[] roundConstants_L5;
    private static final int[] roundConstants_L5_full;

    static {
        InputStream resourceAsStream = LowmcConstants.class.getResourceAsStream(StubApp.getString2(34067));
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
            int[] ReadFromProperty = ReadFromProperty(properties, "linearMatrices_L1", 40960);
            linearMatrices_L1 = ReadFromProperty;
            int[] ReadFromProperty2 = ReadFromProperty(properties, StubApp.getString2(34068), DilithiumEngine.DilithiumPolyT1PackedBytes);
            roundConstants_L1 = ReadFromProperty2;
            int[] ReadFromProperty3 = ReadFromProperty(properties, StubApp.getString2(34069), 43008);
            keyMatrices_L1 = ReadFromProperty3;
            LMatrix_L1 = new KMatrices(20, 128, 4, ReadFromProperty);
            KMatrix_L1 = new KMatrices(21, 128, 4, ReadFromProperty3);
            RConstants_L1 = new KMatrices(0, 1, 4, ReadFromProperty2);
            int[] ReadFromProperty4 = ReadFromProperty(properties, StubApp.getString2(34070), 12800);
            linearMatrices_L1_full = ReadFromProperty4;
            int[] ReadFromProperty5 = ReadFromProperty(properties, StubApp.getString2(34071), 12900);
            keyMatrices_L1_full = ReadFromProperty5;
            int[] ReadFromProperty6 = ReadFromProperty(properties, StubApp.getString2(34072), 2850);
            keyMatrices_L1_inv = ReadFromProperty6;
            int[] ReadFromProperty7 = ReadFromProperty(properties, StubApp.getString2(34073), 12800);
            linearMatrices_L1_inv = ReadFromProperty7;
            int[] ReadFromProperty8 = ReadFromProperty(properties, StubApp.getString2(34074), 80);
            roundConstants_L1_full = ReadFromProperty8;
            LMatrix_L1_full = new KMatrices(4, 129, 5, ReadFromProperty4);
            LMatrix_L1_inv = new KMatrices(4, 129, 5, ReadFromProperty7);
            KMatrix_L1_full = new KMatrices(5, 129, 5, ReadFromProperty5);
            KMatrix_L1_inv = new KMatrices(1, 129, 5, ReadFromProperty6);
            RConstants_L1_full = new KMatrices(4, 1, 5, ReadFromProperty8);
            int[] ReadFromProperty9 = ReadFromProperty(properties, StubApp.getString2(34075), 138240);
            linearMatrices_L3 = ReadFromProperty9;
            int[] ReadFromProperty10 = ReadFromProperty(properties, StubApp.getString2(34076), 720);
            roundConstants_L3 = ReadFromProperty10;
            int[] ReadFromProperty11 = ReadFromProperty(properties, StubApp.getString2(34077), 142848);
            keyMatrices_L3 = ReadFromProperty11;
            LMatrix_L3 = new KMatrices(30, 192, 6, ReadFromProperty9);
            KMatrix_L3 = new KMatrices(31, 192, 6, ReadFromProperty11);
            RConstants_L3 = new KMatrices(30, 1, 6, ReadFromProperty10);
            int[] ReadFromProperty12 = ReadFromProperty(properties, StubApp.getString2(34078), 18432);
            linearMatrices_L3_full = ReadFromProperty12;
            int[] ReadFromProperty13 = ReadFromProperty(properties, StubApp.getString2(34079), 18432);
            linearMatrices_L3_inv = ReadFromProperty13;
            int[] ReadFromProperty14 = ReadFromProperty(properties, StubApp.getString2(34080), 96);
            roundConstants_L3_full = ReadFromProperty14;
            int[] ReadFromProperty15 = ReadFromProperty(properties, StubApp.getString2(34081), 23040);
            keyMatrices_L3_full = ReadFromProperty15;
            int[] ReadFromProperty16 = ReadFromProperty(properties, StubApp.getString2(34082), 4608);
            keyMatrices_L3_inv = ReadFromProperty16;
            LMatrix_L3_full = new KMatrices(4, 192, 6, ReadFromProperty12);
            LMatrix_L3_inv = new KMatrices(4, 192, 6, ReadFromProperty13);
            KMatrix_L3_full = new KMatrices(5, 192, 6, ReadFromProperty15);
            KMatrix_L3_inv = new KMatrices(1, 192, 6, ReadFromProperty16);
            RConstants_L3_full = new KMatrices(4, 1, 6, ReadFromProperty14);
            int[] ReadFromProperty17 = ReadFromProperty(properties, StubApp.getString2(34083), 311296);
            linearMatrices_L5 = ReadFromProperty17;
            int[] ReadFromProperty18 = ReadFromProperty(properties, StubApp.getString2(34084), 1216);
            roundConstants_L5 = ReadFromProperty18;
            int[] ReadFromProperty19 = ReadFromProperty(properties, StubApp.getString2(34085), 319488);
            keyMatrices_L5 = ReadFromProperty19;
            LMatrix_L5 = new KMatrices(38, 256, 8, ReadFromProperty17);
            KMatrix_L5 = new KMatrices(39, 256, 8, ReadFromProperty19);
            RConstants_L5 = new KMatrices(38, 1, 8, ReadFromProperty18);
            int[] ReadFromProperty20 = ReadFromProperty(properties, StubApp.getString2(34086), 32768);
            linearMatrices_L5_full = ReadFromProperty20;
            int[] ReadFromProperty21 = ReadFromProperty(properties, StubApp.getString2(34087), 32768);
            linearMatrices_L5_inv = ReadFromProperty21;
            int[] ReadFromProperty22 = ReadFromProperty(properties, StubApp.getString2(34088), 128);
            roundConstants_L5_full = ReadFromProperty22;
            int[] ReadFromProperty23 = ReadFromProperty(properties, StubApp.getString2(34089), 40960);
            keyMatrices_L5_full = ReadFromProperty23;
            int[] ReadFromProperty24 = ReadFromProperty(properties, StubApp.getString2(34090), 8160);
            keyMatrices_L5_inv = ReadFromProperty24;
            LMatrix_L5_full = new KMatrices(4, 255, 8, ReadFromProperty20);
            LMatrix_L5_inv = new KMatrices(4, 255, 8, ReadFromProperty21);
            KMatrix_L5_full = new KMatrices(5, 255, 8, ReadFromProperty23);
            KMatrix_L5_inv = new KMatrices(1, 255, 8, ReadFromProperty24);
            RConstants_L5_full = new KMatrices(4, 1, 8, ReadFromProperty22);
        } catch (IOException e10) {
            throw Exceptions.illegalStateException(StubApp.getString2(34091) + e10.getMessage(), e10);
        }
    }

    private static KMatricesWithPointer GET_MAT(KMatrices kMatrices, int i3) {
        KMatricesWithPointer kMatricesWithPointer = new KMatricesWithPointer(kMatrices);
        kMatricesWithPointer.setMatrixPointer(i3 * kMatricesWithPointer.getSize());
        return kMatricesWithPointer;
    }

    public static KMatricesWithPointer KMatrix(PicnicEngine picnicEngine, int i3) {
        KMatrices kMatrices;
        int i10 = picnicEngine.stateSizeBits;
        if (i10 == 128) {
            kMatrices = KMatrix_L1;
        } else if (i10 == 129) {
            kMatrices = KMatrix_L1_full;
        } else if (i10 == 192) {
            kMatrices = picnicEngine.numRounds == 4 ? KMatrix_L3_full : KMatrix_L3;
        } else if (i10 == 255) {
            kMatrices = KMatrix_L5_full;
        } else {
            if (i10 != 256) {
                return null;
            }
            kMatrices = KMatrix_L5;
        }
        return GET_MAT(kMatrices, i3);
    }

    public static KMatricesWithPointer KMatrixInv(PicnicEngine picnicEngine) {
        KMatrices kMatrices;
        int i3 = picnicEngine.stateSizeBits;
        if (i3 == 129) {
            kMatrices = KMatrix_L1_inv;
        } else if (i3 == 192 && picnicEngine.numRounds == 4) {
            kMatrices = KMatrix_L3_inv;
        } else {
            if (i3 != 255) {
                return null;
            }
            kMatrices = KMatrix_L5_inv;
        }
        return GET_MAT(kMatrices, 0);
    }

    public static KMatricesWithPointer LMatrix(PicnicEngine picnicEngine, int i3) {
        KMatrices kMatrices;
        int i10 = picnicEngine.stateSizeBits;
        if (i10 == 128) {
            kMatrices = LMatrix_L1;
        } else if (i10 == 129) {
            kMatrices = LMatrix_L1_full;
        } else if (i10 == 192) {
            kMatrices = picnicEngine.numRounds == 4 ? LMatrix_L3_full : LMatrix_L3;
        } else if (i10 == 255) {
            kMatrices = LMatrix_L5_full;
        } else {
            if (i10 != 256) {
                return null;
            }
            kMatrices = LMatrix_L5;
        }
        return GET_MAT(kMatrices, i3);
    }

    public static KMatricesWithPointer LMatrixInv(PicnicEngine picnicEngine, int i3) {
        KMatrices kMatrices;
        int i10 = picnicEngine.stateSizeBits;
        if (i10 == 129) {
            kMatrices = LMatrix_L1_inv;
        } else if (i10 == 192 && picnicEngine.numRounds == 4) {
            kMatrices = LMatrix_L3_inv;
        } else {
            if (i10 != 255) {
                return null;
            }
            kMatrices = LMatrix_L5_inv;
        }
        return GET_MAT(kMatrices, i3);
    }

    public static KMatricesWithPointer RConstant(PicnicEngine picnicEngine, int i3) {
        KMatrices kMatrices;
        int i10 = picnicEngine.stateSizeBits;
        if (i10 == 128) {
            kMatrices = RConstants_L1;
        } else if (i10 == 129) {
            kMatrices = RConstants_L1_full;
        } else if (i10 == 192) {
            kMatrices = picnicEngine.numRounds == 4 ? RConstants_L3_full : RConstants_L3;
        } else if (i10 == 255) {
            kMatrices = RConstants_L5_full;
        } else {
            if (i10 != 256) {
                return null;
            }
            kMatrices = RConstants_L5;
        }
        return GET_MAT(kMatrices, i3);
    }

    private static int[] ReadFromProperty(Properties properties, String str, int i3) {
        byte[] decode = Hex.decode(removeCommas(properties.getProperty(str)));
        int[] iArr = new int[i3];
        for (int i10 = 0; i10 < decode.length / 4; i10++) {
            iArr[i10] = Pack.littleEndianToInt(decode, i10 * 4);
        }
        return iArr;
    }

    private static byte[] removeCommas(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i3 = 0; i3 != str.length(); i3++) {
            if (str.charAt(i3) != ',') {
                byteArrayOutputStream.write(str.charAt(i3));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
