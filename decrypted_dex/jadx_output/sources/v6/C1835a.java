package v6;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.system.Os;
import android.system.OsConstants;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import i2.u;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: v6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1835a implements InterfaceC1836b {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f21874e = {102, 76, 97, 67};

    /* renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f21875a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21876b;

    /* renamed from: c, reason: collision with root package name */
    public long f21877c;

    /* renamed from: d, reason: collision with root package name */
    public int f21878d;

    public C1835a(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f21875a = F1.k(path);
        this.f21877c = -1L;
        this.f21878d = -1;
    }

    @Override // v6.InterfaceC1836b
    public final boolean d() {
        return false;
    }

    @Override // v6.InterfaceC1836b
    public final void i(int i3, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        if (!this.f21876b) {
            throw new Exception(StubApp.getString2(2225));
        }
        int i10 = this.f21878d;
        if (i10 < 0) {
            throw new Exception(StubApp.getString2(2224));
        }
        if (i10 != i3) {
            throw new Exception(u.p(i3, StubApp.getString2(2223)));
        }
        Os.write(this.f21875a.getFD(), byteBuffer);
        if ((bufferInfo.flags & 4) != 0) {
            this.f21877c = bufferInfo.presentationTimeUs;
        }
    }

    @Override // v6.InterfaceC1836b
    public final int m(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        if (this.f21876b) {
            throw new Exception(StubApp.getString2(2227));
        }
        if (this.f21878d >= 0) {
            throw new Exception(StubApp.getString2(2226));
        }
        this.f21878d = 0;
        return 0;
    }

    @Override // v6.InterfaceC1836b
    public final byte[] p(int i3, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        F1.B(byteBuffer, bufferInfo);
        throw null;
    }

    @Override // v6.InterfaceC1836b
    public final void release() {
        if (this.f21876b) {
            stop();
        }
    }

    @Override // v6.InterfaceC1836b
    public final boolean s() {
        return false;
    }

    @Override // v6.InterfaceC1836b
    public final void start() {
        if (this.f21876b) {
            throw new Exception(StubApp.getString2(2227));
        }
        RandomAccessFile randomAccessFile = this.f21875a;
        Os.lseek(randomAccessFile.getFD(), 0L, OsConstants.SEEK_SET);
        Os.ftruncate(randomAccessFile.getFD(), 0L);
        this.f21876b = true;
    }

    @Override // v6.InterfaceC1836b
    public final void stop() {
        if (!this.f21876b) {
            throw new Exception(StubApp.getString2(2225));
        }
        this.f21876b = false;
        long j = this.f21877c;
        RandomAccessFile randomAccessFile = this.f21875a;
        if (j >= 0) {
            FileDescriptor fd = randomAccessFile.getFD();
            int i3 = OsConstants.SEEK_SET;
            Os.lseek(fd, 0L, i3);
            byte[] m110constructorimpl = UByteArray.m110constructorimpl(42);
            if (Os.read(randomAccessFile.getFD(), m110constructorimpl, 0, UByteArray.m117getSizeimpl(m110constructorimpl)) != UByteArray.m117getSizeimpl(m110constructorimpl)) {
                throw new IOException(StubApp.getString2(23677));
            }
            if (!Intrinsics.areEqual(ByteBuffer.wrap(m110constructorimpl, 0, 4), ByteBuffer.wrap(f21874e))) {
                throw new IOException(StubApp.getString2(23676));
            }
            if (UByte.m58constructorimpl((byte) (UByteArray.m116getw2LRezQ(m110constructorimpl, 4) & ByteCompanionObject.MAX_VALUE)) != UByte.m58constructorimpl((byte) 0)) {
                throw new IOException(StubApp.getString2(23675));
            }
            if (Integer.compareUnsigned(UInt.m135constructorimpl(UInt.m135constructorimpl(UInt.m135constructorimpl(UInt.m135constructorimpl(UByteArray.m116getw2LRezQ(m110constructorimpl, 5) & UByte.MAX_VALUE) << 16) | UInt.m135constructorimpl(UInt.m135constructorimpl(UByteArray.m116getw2LRezQ(m110constructorimpl, 6) & UByte.MAX_VALUE) << 8)) | UInt.m135constructorimpl(UByteArray.m116getw2LRezQ(m110constructorimpl, 7) & UByte.MAX_VALUE)), 34) < 0) {
                throw new IOException(StubApp.getString2(23674));
            }
            long divideUnsigned = Long.divideUnsigned(ULong.m214constructorimpl(ULong.m214constructorimpl(UInt.m135constructorimpl(UInt.m135constructorimpl(UInt.m135constructorimpl(UByteArray.m116getw2LRezQ(m110constructorimpl, 20) & UByte.MAX_VALUE) >>> 4) | UInt.m135constructorimpl(UInt.m135constructorimpl(UInt.m135constructorimpl(UByteArray.m116getw2LRezQ(m110constructorimpl, 18) & UByte.MAX_VALUE) << 12) | UInt.m135constructorimpl(UInt.m135constructorimpl(UByteArray.m116getw2LRezQ(m110constructorimpl, 19) & UByte.MAX_VALUE) << 4))) & BodyPartID.bodyIdMax) * ULong.m214constructorimpl(this.f21877c)), 1000000L);
            if (Long.compareUnsigned(divideUnsigned, ULong.m214constructorimpl(137438953472L)) >= 0) {
                throw new IOException(E1.a.j(StubApp.getString2(23673), ULong.m260toStringimpl(divideUnsigned)));
            }
            UByteArray.m121setVurrAj0(m110constructorimpl, 21, UByte.m58constructorimpl((byte) (UByte.m58constructorimpl((byte) (UByteArray.m116getw2LRezQ(m110constructorimpl, 21) & (-16))) | UByte.m58constructorimpl((byte) ULong.m214constructorimpl(ULong.m214constructorimpl(divideUnsigned >>> 32) & 15)))));
            UByteArray.m121setVurrAj0(m110constructorimpl, 22, UByte.m58constructorimpl((byte) ULong.m214constructorimpl(ULong.m214constructorimpl(divideUnsigned >>> 24) & 255)));
            UByteArray.m121setVurrAj0(m110constructorimpl, 23, UByte.m58constructorimpl((byte) ULong.m214constructorimpl(ULong.m214constructorimpl(divideUnsigned >>> 16) & 255)));
            UByteArray.m121setVurrAj0(m110constructorimpl, 24, UByte.m58constructorimpl((byte) ULong.m214constructorimpl(ULong.m214constructorimpl(divideUnsigned >>> 8) & 255)));
            UByteArray.m121setVurrAj0(m110constructorimpl, 25, UByte.m58constructorimpl((byte) ULong.m214constructorimpl(divideUnsigned & 255)));
            Os.lseek(randomAccessFile.getFD(), 21L, i3);
            if (Os.write(randomAccessFile.getFD(), m110constructorimpl, 21, 5) != 5) {
                throw new IOException(StubApp.getString2(23672));
            }
        }
        randomAccessFile.close();
    }
}
