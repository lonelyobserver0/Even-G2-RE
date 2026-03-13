package va;

import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i extends e {

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f21906k = {40, -65, 78, 94, 78, 117, -118, 65, 100, 0, 78, 86, -1, -6, 1, 8, 46, 46, 0, -74, -48, 104, 62, ByteCompanionObject.MIN_VALUE, 47, 12, -87, -2, 100, 83, 105, 122};

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f21907l = {StubApp.getString2(1488), StubApp.getString2(23704), StubApp.getString2(23705)};

    public i() {
    }

    public static byte[] i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i3, byte[] bArr6, int i10, int i11, boolean z2, boolean z10) {
        byte[] k3;
        byte[] bArr7;
        if (i10 == 6 || i10 == 5) {
            if (z10) {
                if (bArr4 == null) {
                    throw new IOException(StubApp.getString2(23706));
                }
                byte[] bArr8 = new byte[8];
                System.arraycopy(bArr2, 40, bArr8, 0, 8);
                k3 = i10 == 5 ? k(bArr, bArr8, bArr3) : j(bArr, bArr8, bArr3);
                bArr7 = bArr4;
            } else {
                if (bArr5 == null) {
                    throw new IOException(StubApp.getString2(23708));
                }
                byte[] bArr9 = new byte[8];
                System.arraycopy(bArr3, 40, bArr9, 0, 8);
                k3 = i10 == 5 ? k(bArr, bArr9, null) : j(bArr, bArr9, null);
                bArr7 = bArr5;
            }
            try {
                Cipher cipher = Cipher.getInstance(StubApp.getString2("23707"));
                cipher.init(2, new SecretKeySpec(k3, StubApp.getString2("461")), new IvParameterSpec(new byte[16]));
                return cipher.doFinal(bArr7);
            } catch (GeneralSecurityException e10) {
                n();
                throw new IOException(e10);
            }
        }
        byte[] bArr10 = new byte[32];
        int min = Math.min(bArr.length, 32);
        System.arraycopy(bArr, 0, bArr10, 0, min);
        System.arraycopy(f21906k, 0, bArr10, min, 32 - min);
        MessageDigest j = AbstractC0624h2.j();
        j.update(bArr10);
        j.update(bArr2);
        j.update((byte) i3);
        j.update((byte) (i3 >>> 8));
        j.update((byte) (i3 >>> 16));
        j.update((byte) (i3 >>> 24));
        j.update(bArr6);
        if (i10 == 4 && !z2) {
            j.update(new byte[]{-1, -1, -1, -1});
        }
        byte[] digest = j.digest();
        if (i10 == 3 || i10 == 4) {
            for (int i12 = 0; i12 < 50; i12++) {
                j.update(digest, 0, i11);
                digest = j.digest();
            }
        }
        byte[] bArr11 = new byte[i11];
        System.arraycopy(digest, 0, bArr11, 0, i11);
        return bArr11;
    }

    public static byte[] j(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 == null) {
            bArr3 = new byte[0];
        } else {
            if (bArr3.length < 48) {
                throw new IOException(StubApp.getString2(23709));
            }
            if (bArr3.length > 48) {
                byte[] bArr4 = new byte[48];
                System.arraycopy(bArr3, 0, bArr4, 0, 48);
                bArr3 = bArr4;
            }
        }
        if (bArr.length > 127) {
            byte[] bArr5 = new byte[CertificateBody.profileType];
            System.arraycopy(bArr, 0, bArr5, 0, CertificateBody.profileType);
            bArr = bArr5;
        }
        byte[] bArr6 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr6, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr6, bArr.length + bArr2.length, bArr3.length);
        try {
            try {
                byte[] digest = MessageDigest.getInstance(StubApp.getString2("1488")).digest(bArr6);
                byte[] bArr7 = null;
                int i3 = 0;
                while (true) {
                    if (i3 >= 64 && (bArr7[bArr7.length - 1] & UByte.MAX_VALUE) <= i3 - 32) {
                        break;
                    }
                    byte[] bArr8 = bArr3.length >= 48 ? new byte[(bArr.length + digest.length + 48) * 64] : new byte[(bArr.length + digest.length) * 64];
                    int i10 = 0;
                    for (int i11 = 0; i11 < 64; i11++) {
                        System.arraycopy(bArr, 0, bArr8, i10, bArr.length);
                        int length = i10 + bArr.length;
                        System.arraycopy(digest, 0, bArr8, length, digest.length);
                        i10 = length + digest.length;
                        if (bArr3.length >= 48) {
                            System.arraycopy(bArr3, 0, bArr8, i10, 48);
                            i10 += 48;
                        }
                    }
                    byte[] bArr9 = new byte[16];
                    byte[] bArr10 = new byte[16];
                    System.arraycopy(digest, 0, bArr9, 0, 16);
                    System.arraycopy(digest, 16, bArr10, 0, 16);
                    Cipher cipher = Cipher.getInstance(StubApp.getString2("23707"));
                    cipher.init(1, new SecretKeySpec(bArr9, StubApp.getString2("461")), new IvParameterSpec(bArr10));
                    bArr7 = cipher.doFinal(bArr8);
                    byte[] bArr11 = new byte[16];
                    System.arraycopy(bArr7, 0, bArr11, 0, 16);
                    digest = MessageDigest.getInstance(f21907l[new BigInteger(1, bArr11).mod(new BigInteger(StubApp.getString2("4968"))).intValue()]).digest(bArr7);
                    i3++;
                }
                if (digest.length <= 32) {
                    return digest;
                }
                byte[] bArr12 = new byte[32];
                System.arraycopy(digest, 0, bArr12, 0, 32);
                return bArr12;
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        } catch (GeneralSecurityException e11) {
            n();
            throw new IOException(e11);
        }
    }

    public static byte[] k(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(StubApp.getString2("1488"));
            messageDigest.update(bArr);
            messageDigest.update(bArr2);
            return bArr3 == null ? messageDigest.digest() : messageDigest.digest(bArr3);
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void n() {
        try {
            if (Cipher.getMaxAllowedKeyLength(StubApp.getString2("461")) != Integer.MAX_VALUE) {
                Log.w(StubApp.getString2("948"), StubApp.getString2("23710"));
            }
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:318:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0584 A[Catch: GeneralSecurityException -> 0x05a2, TryCatch #0 {GeneralSecurityException -> 0x05a2, blocks: (B:434:0x0560, B:436:0x0584, B:437:0x0588, B:439:0x0592, B:441:0x0598, B:445:0x05ae, B:447:0x05c9, B:449:0x0607, B:451:0x0615, B:455:0x060f, B:459:0x05a4), top: B:433:0x0560 }] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0592 A[Catch: GeneralSecurityException -> 0x05a2, TryCatch #0 {GeneralSecurityException -> 0x05a2, blocks: (B:434:0x0560, B:436:0x0584, B:437:0x0588, B:439:0x0592, B:441:0x0598, B:445:0x05ae, B:447:0x05c9, B:449:0x0607, B:451:0x0615, B:455:0x060f, B:459:0x05a4), top: B:433:0x0560 }] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x05c9 A[Catch: GeneralSecurityException -> 0x05a2, TryCatch #0 {GeneralSecurityException -> 0x05a2, blocks: (B:434:0x0560, B:436:0x0584, B:437:0x0588, B:439:0x0592, B:441:0x0598, B:445:0x05ae, B:447:0x05c9, B:449:0x0607, B:451:0x0615, B:455:0x060f, B:459:0x05a4), top: B:433:0x0560 }] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0607 A[Catch: GeneralSecurityException -> 0x05a2, TryCatch #0 {GeneralSecurityException -> 0x05a2, blocks: (B:434:0x0560, B:436:0x0584, B:437:0x0588, B:439:0x0592, B:441:0x0598, B:445:0x05ae, B:447:0x05c9, B:449:0x0607, B:451:0x0615, B:455:0x060f, B:459:0x05a4), top: B:433:0x0560 }] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0131  */
    @Override // va.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(sa.C1610c r32, oa.C1468a r33, com.google.android.gms.internal.measurement.L1 r34) {
        /*
            Method dump skipped, instructions count: 1615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: va.i.h(sa.c, oa.a, com.google.android.gms.internal.measurement.L1):void");
    }

    public final byte[] l(byte[] bArr, byte[] bArr2, int i3, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MessageDigest j = AbstractC0624h2.j();
        byte[] bArr3 = new byte[32];
        int min = Math.min(bArr.length, 32);
        System.arraycopy(bArr, 0, bArr3, 0, min);
        System.arraycopy(f21906k, 0, bArr3, min, 32 - min);
        byte[] digest = j.digest(bArr3);
        if (i3 == 3 || i3 == 4) {
            for (int i11 = 0; i11 < 50; i11++) {
                j.update(digest, 0, i10);
                digest = j.digest();
            }
        }
        byte[] bArr4 = new byte[i10];
        System.arraycopy(digest, 0, bArr4, 0, i10);
        if (i3 == 2) {
            f(bArr4, bArr2, byteArrayOutputStream);
        } else if (i3 == 3 || i3 == 4) {
            byte[] bArr5 = new byte[i10];
            byte[] bArr6 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
            for (int i12 = 19; i12 >= 0; i12--) {
                System.arraycopy(bArr4, 0, bArr5, 0, i10);
                for (int i13 = 0; i13 < i10; i13++) {
                    bArr5[i13] = (byte) (bArr5[i13] ^ ((byte) i12));
                }
                byteArrayOutputStream.reset();
                f(bArr5, bArr6, byteArrayOutputStream);
                bArr6 = byteArrayOutputStream.toByteArray();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean m(byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, byte[] bArr4, int i10, int i11, boolean z2) {
        byte[] bArr5 = bArr;
        if (i10 != 2 && i10 != 3 && i10 != 4) {
            if (i10 != 5 && i10 != 6) {
                throw new IOException(u.p(i10, StubApp.getString2(23727)));
            }
            if (bArr5.length > 127) {
                byte[] bArr6 = new byte[CertificateBody.profileType];
                System.arraycopy(bArr5, 0, bArr6, 0, CertificateBody.profileType);
                bArr5 = bArr6;
            }
            byte[] bArr7 = new byte[32];
            byte[] bArr8 = new byte[8];
            System.arraycopy(bArr2, 0, bArr7, 0, 32);
            System.arraycopy(bArr2, 32, bArr8, 0, 8);
            return Arrays.equals(i10 == 5 ? k(bArr5, bArr8, null) : j(bArr5, bArr8, null), bArr7);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] i12 = i(bArr5, bArr3, null, null, null, i3, bArr4, i10, i11, z2, true);
        byte[] bArr9 = f21906k;
        if (i10 == 2) {
            f(i12, bArr9, byteArrayOutputStream);
        } else if (i10 == 3 || i10 == 4) {
            MessageDigest j = AbstractC0624h2.j();
            j.update(bArr9);
            j.update(bArr4);
            byteArrayOutputStream.write(j.digest());
            int length = i12.length;
            byte[] bArr10 = new byte[length];
            for (int i13 = 0; i13 < 20; i13++) {
                System.arraycopy(i12, 0, bArr10, 0, length);
                for (int i14 = 0; i14 < length; i14++) {
                    bArr10[i14] = (byte) (bArr10[i14] ^ i13);
                }
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.reset();
                e(bArr10, byteArrayInputStream, byteArrayOutputStream);
            }
            byte[] bArr11 = new byte[32];
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr11, 0, 16);
            System.arraycopy(bArr9, 0, bArr11, 16, 16);
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(bArr11);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return i10 == 2 ? Arrays.equals(bArr2, byteArray) : Arrays.equals(Arrays.copyOf(bArr2, 16), Arrays.copyOf(byteArray, 16));
    }

    public i(h hVar) {
        throw null;
    }
}
