package v6;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import i2.u;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v6.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1837c implements InterfaceC1836b {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f21879h = {82, 73, 70, 70};
    public static final byte[] j = {87, 65, 86, 69};

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f21880k = {102, 109, 116, 32};

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f21881l = {100, 97, 116, 97};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21882a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21883b;

    /* renamed from: c, reason: collision with root package name */
    public int f21884c;

    /* renamed from: d, reason: collision with root package name */
    public int f21885d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21886e;

    /* renamed from: f, reason: collision with root package name */
    public int f21887f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f21888g;

    public C1837c(int i3, int i10, int i11) {
        this.f21882a = 1;
        this.f21883b = i3;
        this.f21884c = i10;
        this.f21885d = i11;
        this.f21888g = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000};
        this.f21887f = -1;
    }

    public static byte[] a(long j3) {
        return new byte[]{(byte) (j3 & 255), (byte) ((j3 >> 8) & 255), (byte) ((j3 >> 16) & 255), (byte) ((j3 >> 24) & 255)};
    }

    @Override // v6.InterfaceC1836b
    public final boolean d() {
        switch (this.f21882a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // v6.InterfaceC1836b
    public final void i(int i3, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        switch (this.f21882a) {
            case 0:
                Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
                Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
                if (!this.f21886e) {
                    throw new IllegalStateException(StubApp.getString2(2225));
                }
                int i10 = this.f21884c;
                if (i10 < 0) {
                    throw new IllegalStateException(StubApp.getString2(2224));
                }
                if (i10 != i3) {
                    throw new IllegalStateException(u.p(i3, StubApp.getString2(2223)));
                }
                Os.write(((RandomAccessFile) this.f21888g).getFD(), byteBuffer);
                return;
            default:
                Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
                Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
                if (!this.f21886e) {
                    throw new IllegalStateException(StubApp.getString2(2225));
                }
                int i11 = this.f21887f;
                if (i11 < 0) {
                    throw new IllegalStateException(StubApp.getString2(2224));
                }
                if (i11 != i3) {
                    throw new IllegalStateException(u.p(i3, StubApp.getString2(2223)));
                }
                return;
        }
    }

    @Override // v6.InterfaceC1836b
    public final int m(MediaFormat mediaFormat) {
        switch (this.f21882a) {
            case 0:
                Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
                if (this.f21886e) {
                    throw new IllegalStateException(StubApp.getString2(2227));
                }
                if (this.f21884c >= 0) {
                    throw new IllegalStateException(StubApp.getString2(2226));
                }
                this.f21884c = 0;
                this.f21885d = mediaFormat.getInteger(StubApp.getString2(23467));
                this.f21887f = mediaFormat.getInteger(StubApp.getString2(23466));
                return this.f21884c;
            default:
                Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
                if (this.f21886e) {
                    throw new IllegalStateException(StubApp.getString2(2227));
                }
                if (this.f21887f >= 0) {
                    throw new IllegalStateException(StubApp.getString2(2226));
                }
                this.f21887f = 0;
                return 0;
        }
    }

    @Override // v6.InterfaceC1836b
    public final byte[] p(int i3, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        switch (this.f21882a) {
            case 0:
                F1.B(byteBuffer, bufferInfo);
                throw null;
            default:
                Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
                Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
                int remaining = byteBuffer.remaining();
                int i10 = remaining + 7;
                int indexOf = ((this.f21885d - 1) << 6) + (ArraysKt.indexOf((int[]) this.f21888g, this.f21883b) << 2);
                int i11 = this.f21884c;
                byte[] bArr = {-1, -7, (byte) (indexOf + (i11 >> 2)), (byte) (((i11 & 3) << 6) + (i10 >> 11)), (byte) ((i10 & 2047) >> 3), (byte) (((i10 & 7) << 5) + 31), -4};
                byte[] bArr2 = new byte[remaining];
                byteBuffer.get(bArr2, 0, remaining);
                return ArraysKt.plus(bArr, bArr2);
        }
    }

    @Override // v6.InterfaceC1836b
    public final void release() {
        switch (this.f21882a) {
            case 0:
                if (this.f21886e) {
                    stop();
                    break;
                }
                break;
            default:
                if (this.f21886e) {
                    stop();
                    break;
                }
                break;
        }
    }

    @Override // v6.InterfaceC1836b
    public final boolean s() {
        switch (this.f21882a) {
        }
        return false;
    }

    @Override // v6.InterfaceC1836b
    public final void start() {
        switch (this.f21882a) {
            case 0:
                if (this.f21886e) {
                    throw new IllegalStateException(StubApp.getString2(2227));
                }
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f21888g;
                Os.ftruncate(randomAccessFile.getFD(), 0L);
                Os.lseek(randomAccessFile.getFD(), 44L, OsConstants.SEEK_SET);
                this.f21886e = true;
                return;
            default:
                if (this.f21886e) {
                    throw new IllegalStateException(StubApp.getString2(2227));
                }
                this.f21886e = true;
                return;
        }
    }

    @Override // v6.InterfaceC1836b
    public final void stop() {
        Pair pair;
        String string2 = StubApp.getString2(2225);
        switch (this.f21882a) {
            case 0:
                if (!this.f21886e) {
                    throw new IllegalStateException(string2);
                }
                this.f21886e = false;
                int i3 = this.f21884c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f21888g;
                if (i3 >= 0) {
                    long lseek = Os.lseek(randomAccessFile.getFD(), 0L, OsConstants.SEEK_CUR);
                    ByteBuffer allocate = ByteBuffer.allocate(44);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    if (lseek > 4294967251L) {
                        Log.w(StubApp.getString2(2376), StubApp.getString2(23678));
                        pair = new Pair(4294967287L, 4294967251L);
                    } else {
                        pair = new Pair(Long.valueOf(lseek - 8), Long.valueOf(lseek - 44));
                    }
                    long longValue = ((Number) pair.component1()).longValue();
                    long longValue2 = ((Number) pair.component2()).longValue();
                    allocate.put(f21879h);
                    allocate.put(a(longValue));
                    allocate.put(j);
                    allocate.put(f21880k);
                    allocate.putInt(16);
                    allocate.putShort((short) 1);
                    allocate.putShort((short) this.f21885d);
                    allocate.putInt(this.f21887f);
                    int i10 = this.f21887f;
                    int i11 = this.f21883b;
                    allocate.putInt(i10 * i11);
                    allocate.putShort((short) i11);
                    allocate.putShort((short) ((i11 / this.f21885d) * 8));
                    allocate.put(f21881l);
                    allocate.put(a(longValue2));
                    allocate.flip();
                    Intrinsics.checkNotNullExpressionValue(allocate, "apply(...)");
                    Os.lseek(randomAccessFile.getFD(), 0L, OsConstants.SEEK_SET);
                    Os.write(randomAccessFile.getFD(), allocate);
                }
                randomAccessFile.close();
                return;
            default:
                if (!this.f21886e) {
                    throw new IllegalStateException(string2);
                }
                this.f21886e = false;
                return;
        }
    }

    public C1837c(String path, int i3) {
        this.f21882a = 0;
        Intrinsics.checkNotNullParameter(path, "path");
        this.f21883b = i3;
        this.f21888g = F1.k(path);
        this.f21884c = -1;
    }
}
