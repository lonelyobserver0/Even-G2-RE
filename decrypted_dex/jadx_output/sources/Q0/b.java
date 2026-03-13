package Q0;

import android.os.SystemClock;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import kotlin.UByte;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5689a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5690b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f5691c;

    /* renamed from: d, reason: collision with root package name */
    public static long f5692d;

    public static long a() {
        byte b2;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = f5690b;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b10 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i3 = 0;
            int i10 = 0;
            while (i3 < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i3], 123);
                bArr2[b10] = 27;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (currentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b10);
                    b2 = b10;
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                } else {
                    long j = currentTimeMillis / 1000;
                    long j3 = currentTimeMillis - (j * 1000);
                    b2 = b10;
                    socketTimeoutException = socketTimeoutException2;
                    long j10 = j + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j10 >> 24);
                    bArr[41] = (byte) (j10 >> 16);
                    bArr[42] = (byte) (j10 >> 8);
                    bArr[43] = (byte) j10;
                    long j11 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j11 >> 24);
                    bArr[45] = (byte) (j11 >> 16);
                    bArr[46] = (byte) (j11 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j12 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
                    byte b11 = bArr3[b2];
                    int i11 = bArr3[1] & UByte.MAX_VALUE;
                    long d8 = d(24, bArr3);
                    long d10 = d(32, bArr3);
                    long d11 = d(40, bArr3);
                    b((byte) ((b11 >> 6) & 3), (byte) (b11 & 7), i11, d11);
                    long j13 = (j12 + (((d11 - j12) + (d10 - d8)) / 2)) - elapsedRealtime2;
                    datagramSocket.close();
                    return j13;
                } catch (SocketTimeoutException e10) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e10;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e10);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i12 = i10 + 1;
                    if (i10 >= 10) {
                        break;
                    }
                    i3++;
                    i10 = i12;
                    b10 = b2;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    public static void b(byte b2, byte b10, int i3, long j) {
        if (b2 == 3) {
            throw new IOException(StubApp.getString2(5051));
        }
        if (b10 != 4 && b10 != 5) {
            throw new IOException(u.p(b10, StubApp.getString2(5048)));
        }
        if (i3 == 0 || i3 > 15) {
            throw new IOException(u.p(i3, StubApp.getString2(5050)));
        }
        if (j == 0) {
            throw new IOException(StubApp.getString2(5049));
        }
    }

    public static long c(int i3, byte[] bArr) {
        int i10 = bArr[i3];
        int i11 = bArr[i3 + 1];
        int i12 = bArr[i3 + 2];
        int i13 = bArr[i3 + 3];
        if ((i10 & 128) == 128) {
            i10 = (i10 & CertificateBody.profileType) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & CertificateBody.profileType) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & CertificateBody.profileType) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & CertificateBody.profileType) + 128;
        }
        return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
    }

    public static long d(int i3, byte[] bArr) {
        long c10 = c(i3, bArr);
        long c11 = c(i3 + 4, bArr);
        if (c10 == 0 && c11 == 0) {
            return 0L;
        }
        return ((c11 * 1000) / 4294967296L) + ((c10 - 2208988800L) * 1000);
    }
}
