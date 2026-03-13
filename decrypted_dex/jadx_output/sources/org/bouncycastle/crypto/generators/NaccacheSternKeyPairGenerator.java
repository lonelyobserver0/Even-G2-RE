package org.bouncycastle.crypto.generators;

import Xa.h;
import com.stub.StubApp;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import kotlin.jvm.internal.IntCompanionObject;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NaccacheSternKeyGenerationParameters param;
    private static int[] smallPrimes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, CertificateBody.profileType, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, Primes.SMALL_FACTOR_LIMIT, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, DfuBaseService.NOTIFICATION_ID, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557};
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private static Vector findFirstPrimes(int i3) {
        Vector vector = new Vector(i3);
        for (int i10 = 0; i10 != i3; i10++) {
            vector.addElement(BigInteger.valueOf(smallPrimes[i10]));
        }
        return vector;
    }

    private static BigInteger generatePrime(int i3, int i10, SecureRandom secureRandom) {
        BigInteger createRandomPrime;
        do {
            createRandomPrime = BigIntegers.createRandomPrime(i3, i10, secureRandom);
        } while (createRandomPrime.bitLength() != i3);
        return createRandomPrime;
    }

    private static int getInt(SecureRandom secureRandom, int i3) {
        int nextInt;
        int i10;
        if (((-i3) & i3) == i3) {
            return (int) ((i3 * (secureRandom.nextInt() & IntCompanionObject.MAX_VALUE)) >> 31);
        }
        do {
            nextInt = secureRandom.nextInt() & IntCompanionObject.MAX_VALUE;
            i10 = nextInt % i3;
        } while ((i3 - 1) + (nextInt - i10) < 0);
        return i10;
    }

    private static Vector permuteList(Vector vector, SecureRandom secureRandom) {
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i3 = 0; i3 < vector.size(); i3++) {
            vector3.addElement(vector.elementAt(i3));
        }
        vector2.addElement(vector3.elementAt(0));
        while (true) {
            vector3.removeElementAt(0);
            if (vector3.size() == 0) {
                return vector2;
            }
            vector2.insertElementAt(vector3.elementAt(0), getInt(secureRandom, vector2.size() + 1));
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        long j;
        BigInteger generatePrime;
        BigInteger add;
        BigInteger generatePrime2;
        boolean z2;
        BigInteger bigInteger;
        BigInteger add2;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        BigInteger bigInteger5;
        BigInteger bigInteger6;
        BigInteger bigInteger7;
        PrintStream printStream;
        StringBuilder sb2;
        int i3;
        BigInteger createRandomPrime;
        int i10;
        SecureRandom secureRandom;
        int strength = this.param.getStrength();
        SecureRandom random = this.param.getRandom();
        int certainty = this.param.getCertainty();
        boolean isDebug = this.param.isDebug();
        if (isDebug) {
            System.out.println(StubApp.getString2(28924) + this.param.getCntSmallPrimes() + StubApp.getString2(28925));
        }
        Vector permuteList = permuteList(findFirstPrimes(this.param.getCntSmallPrimes()), random);
        BigInteger bigInteger8 = ONE;
        BigInteger bigInteger9 = bigInteger8;
        for (int i11 = 0; i11 < permuteList.size() / 2; i11++) {
            bigInteger9 = bigInteger9.multiply((BigInteger) permuteList.elementAt(i11));
        }
        for (int size = permuteList.size() / 2; size < permuteList.size(); size++) {
            bigInteger8 = bigInteger8.multiply((BigInteger) permuteList.elementAt(size));
        }
        BigInteger multiply = bigInteger9.multiply(bigInteger8);
        int bitLength = (((strength - multiply.bitLength()) - 48) / 2) + 1;
        BigInteger generatePrime3 = generatePrime(bitLength, certainty, random);
        BigInteger generatePrime4 = generatePrime(bitLength, certainty, random);
        if (isDebug) {
            System.out.println(StubApp.getString2(28926));
        }
        BigInteger shiftLeft = generatePrime3.multiply(bigInteger9).shiftLeft(1);
        BigInteger shiftLeft2 = generatePrime4.multiply(bigInteger8).shiftLeft(1);
        long j3 = 0;
        while (true) {
            j = j3 + 1;
            generatePrime = generatePrime(24, certainty, random);
            add = generatePrime.multiply(shiftLeft).add(ONE);
            if (add.isProbablePrime(certainty)) {
                while (true) {
                    do {
                        generatePrime2 = generatePrime(24, certainty, random);
                    } while (generatePrime.equals(generatePrime2));
                    BigInteger multiply2 = generatePrime2.multiply(shiftLeft2);
                    z2 = isDebug;
                    bigInteger = ONE;
                    add2 = multiply2.add(bigInteger);
                    if (add2.isProbablePrime(certainty)) {
                        break;
                    }
                    isDebug = z2;
                }
                bigInteger2 = shiftLeft2;
                if (!multiply.gcd(generatePrime.multiply(generatePrime2)).equals(bigInteger)) {
                    continue;
                } else {
                    if (add.multiply(add2).bitLength() >= strength) {
                        break;
                    }
                    if (z2) {
                        PrintStream printStream2 = System.out;
                        StringBuilder u2 = h.u(strength, StubApp.getString2(28927), StubApp.getString2(28928));
                        u2.append(add.multiply(add2).bitLength());
                        printStream2.println(u2.toString());
                    }
                }
            } else {
                z2 = isDebug;
                bigInteger2 = shiftLeft2;
            }
            j3 = j;
            isDebug = z2;
            shiftLeft2 = bigInteger2;
        }
        String string2 = StubApp.getString2(28929);
        if (z2) {
            bigInteger3 = generatePrime4;
            System.out.println(string2 + j + StubApp.getString2(28930));
        } else {
            bigInteger3 = generatePrime4;
        }
        BigInteger multiply3 = add.multiply(add2);
        BigInteger multiply4 = add.subtract(bigInteger).multiply(add2.subtract(bigInteger));
        if (z2) {
            System.out.println(StubApp.getString2(28931));
        }
        long j10 = 0;
        while (true) {
            Vector vector = new Vector();
            bigInteger4 = add;
            bigInteger5 = add2;
            int i12 = 0;
            while (i12 != permuteList.size()) {
                BigInteger divide = multiply4.divide((BigInteger) permuteList.elementAt(i12));
                while (true) {
                    j10++;
                    i3 = i12;
                    createRandomPrime = BigIntegers.createRandomPrime(strength, certainty, random);
                    i10 = strength;
                    secureRandom = random;
                    if (createRandomPrime.modPow(divide, multiply3).equals(ONE)) {
                        i12 = i3;
                        strength = i10;
                        random = secureRandom;
                    }
                }
                vector.addElement(createRandomPrime);
                i12 = i3 + 1;
                strength = i10;
                random = secureRandom;
            }
            int i13 = strength;
            SecureRandom secureRandom2 = random;
            bigInteger6 = ONE;
            for (int i14 = 0; i14 < permuteList.size(); i14++) {
                bigInteger6 = bigInteger6.multiply(((BigInteger) vector.elementAt(i14)).modPow(multiply.divide((BigInteger) permuteList.elementAt(i14)), multiply3)).mod(multiply3);
            }
            int i15 = 0;
            while (true) {
                if (i15 >= permuteList.size()) {
                    BigInteger modPow = bigInteger6.modPow(multiply4.divide(BigInteger.valueOf(4L)), multiply3);
                    BigInteger bigInteger10 = ONE;
                    if (!modPow.equals(bigInteger10)) {
                        if (!bigInteger6.modPow(multiply4.divide(generatePrime), multiply3).equals(bigInteger10)) {
                            if (!bigInteger6.modPow(multiply4.divide(generatePrime2), multiply3).equals(bigInteger10)) {
                                if (!bigInteger6.modPow(multiply4.divide(generatePrime3), multiply3).equals(bigInteger10)) {
                                    bigInteger7 = bigInteger3;
                                    if (!bigInteger6.modPow(multiply4.divide(bigInteger7), multiply3).equals(bigInteger10)) {
                                        break;
                                    }
                                    if (z2) {
                                        System.out.println(StubApp.getString2(28938) + bigInteger6);
                                    }
                                } else if (z2) {
                                    printStream = System.out;
                                    sb2 = new StringBuilder(StubApp.getString2(28937));
                                    sb2.append(bigInteger6);
                                    printStream.println(sb2.toString());
                                }
                            } else if (z2) {
                                printStream = System.out;
                                sb2 = new StringBuilder(StubApp.getString2(28936));
                                sb2.append(bigInteger6);
                                printStream.println(sb2.toString());
                            }
                        } else if (z2) {
                            printStream = System.out;
                            sb2 = new StringBuilder(StubApp.getString2(28935));
                            sb2.append(bigInteger6);
                            printStream.println(sb2.toString());
                        }
                    } else if (z2) {
                        printStream = System.out;
                        sb2 = new StringBuilder(StubApp.getString2(28934));
                        sb2.append(bigInteger6);
                        printStream.println(sb2.toString());
                    }
                } else if (!bigInteger6.modPow(multiply4.divide((BigInteger) permuteList.elementAt(i15)), multiply3).equals(ONE)) {
                    i15++;
                } else if (z2) {
                    System.out.println(StubApp.getString2(28932) + permuteList.elementAt(i15) + StubApp.getString2(28933) + bigInteger6);
                }
            }
            bigInteger7 = bigInteger3;
            bigInteger3 = bigInteger7;
            add2 = bigInteger5;
            add = bigInteger4;
            strength = i13;
            random = secureRandom2;
        }
        if (z2) {
            System.out.println(string2 + j10 + StubApp.getString2(28939));
            System.out.println();
            System.out.println(StubApp.getString2(28940));
            System.out.println(StubApp.getString2(28941) + permuteList);
            System.out.println(StubApp.getString2(28942) + multiply + StubApp.getString2(1561) + multiply.bitLength() + StubApp.getString2(28943));
            PrintStream printStream3 = System.out;
            StringBuilder sb3 = new StringBuilder(StubApp.getString2(28944));
            sb3.append(generatePrime3);
            printStream3.println(sb3.toString());
            System.out.println(StubApp.getString2(28945) + bigInteger7);
            System.out.println(StubApp.getString2(28946) + generatePrime);
            System.out.println(StubApp.getString2(28947) + generatePrime2);
            System.out.println(StubApp.getString2(28948) + bigInteger4);
            System.out.println(StubApp.getString2(28949) + bigInteger5);
            System.out.println(StubApp.getString2(28950) + multiply3);
            System.out.println(StubApp.getString2(28951) + multiply4);
            System.out.println(StubApp.getString2(28952) + bigInteger6);
            System.out.println();
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NaccacheSternKeyParameters(false, bigInteger6, multiply3, multiply.bitLength()), (AsymmetricKeyParameter) new NaccacheSternPrivateKeyParameters(bigInteger6, multiply3, multiply.bitLength(), permuteList, multiply4));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
    }
}
