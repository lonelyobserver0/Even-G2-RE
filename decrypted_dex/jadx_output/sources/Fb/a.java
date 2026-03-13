package Fb;

import R3.n;
import S3.D;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.system.Os;
import com.google.android.gms.common.d;
import com.stub.StubApp;
import i2.u;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import v6.InterfaceC1836b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements InterfaceC1836b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2345a;

    /* renamed from: b, reason: collision with root package name */
    public int f2346b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2347c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2348d;

    public static a b() {
        a aVar = new a();
        aVar.f2345a = true;
        aVar.f2346b = 0;
        return aVar;
    }

    public static a c(int i3, byte[] bArr, boolean z2) {
        b bVar;
        int i10;
        ArrayList arrayList = new ArrayList();
        if (z2) {
            i10 = bArr.length;
            bVar = null;
        } else {
            if (bArr.length - i3 < 4) {
                throw new Db.c(StubApp.getString2(2219) + bArr.length + StubApp.getString2(2220) + i3 + StubApp.getString2(2221));
            }
            bVar = new b();
            bVar.f2349a = (short) Y3.a.c(i3, 1, bArr, 2);
            short c10 = (short) Y3.a.c(i3 + 2, 1, bArr, 2);
            bVar.f2350b = c10;
            short s10 = bVar.f2349a;
            if (s10 != 26887 && s10 != 26888) {
                throw new Db.c(StubApp.getString2(2217) + ((int) bVar.f2349a));
            }
            i3 += 4;
            i10 = c10 + i3;
        }
        while (true) {
            int i11 = i3 + 4;
            if (i11 >= i10) {
                if (z2) {
                    a aVar = new a();
                    aVar.f2345a = true;
                    aVar.f2347c = null;
                    aVar.f2348d = arrayList;
                    aVar.f2346b = i3 - i10;
                    return aVar;
                }
                a aVar2 = new a();
                aVar2.f2345a = false;
                aVar2.f2347c = bVar;
                aVar2.f2348d = arrayList;
                aVar2.f2346b = bVar.f2350b;
                return aVar2;
            }
            if (i11 > bArr.length) {
                throw new Db.c(StubApp.getString2(2218));
            }
            byte b2 = bArr[i3];
            short c11 = (short) Y3.a.c(i3 + 2, 1, bArr, 2);
            arrayList.add(new c(b2, c11, Arrays.copyOfRange(bArr, i11, i11 + c11)));
            i3 += c11 + 4;
        }
    }

    public a a() {
        D.a(StubApp.getString2(2222), ((n) this.f2347c) != null);
        d[] dVarArr = (d[]) this.f2348d;
        boolean z2 = this.f2345a;
        int i3 = this.f2346b;
        a aVar = new a();
        aVar.f2348d = this;
        aVar.f2347c = dVarArr;
        boolean z10 = false;
        if (dVarArr != null && z2) {
            z10 = true;
        }
        aVar.f2345a = z10;
        aVar.f2346b = i3;
        return aVar;
    }

    @Override // v6.InterfaceC1836b
    public boolean d() {
        return ((String) this.f2347c) == null;
    }

    @Override // v6.InterfaceC1836b
    public void i(int i3, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        if (!this.f2345a) {
            throw new IllegalStateException(StubApp.getString2(2225));
        }
        int i10 = this.f2346b;
        if (i10 < 0) {
            throw new IllegalStateException(StubApp.getString2(2224));
        }
        if (i10 != i3) {
            throw new IllegalStateException(u.p(i3, StubApp.getString2(2223)));
        }
        RandomAccessFile randomAccessFile = (RandomAccessFile) this.f2348d;
        if (randomAccessFile != null) {
            Intrinsics.checkNotNull(randomAccessFile);
            Os.write(randomAccessFile.getFD(), byteBuffer);
        }
    }

    @Override // v6.InterfaceC1836b
    public int m(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        if (this.f2345a) {
            throw new IllegalStateException(StubApp.getString2(2227));
        }
        if (this.f2346b >= 0) {
            throw new IllegalStateException(StubApp.getString2(2226));
        }
        this.f2346b = 0;
        return 0;
    }

    @Override // v6.InterfaceC1836b
    public byte[] p(int i3, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        int i10 = bufferInfo.size;
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr, bufferInfo.offset, i10);
        return bArr;
    }

    @Override // v6.InterfaceC1836b
    public void release() {
        if (this.f2345a) {
            stop();
        }
    }

    @Override // v6.InterfaceC1836b
    public boolean s() {
        return false;
    }

    @Override // v6.InterfaceC1836b
    public void start() {
        if (this.f2345a) {
            throw new IllegalStateException(StubApp.getString2(2227));
        }
        this.f2345a = true;
    }

    @Override // v6.InterfaceC1836b
    public void stop() {
        if (!this.f2345a) {
            throw new IllegalStateException(StubApp.getString2(2225));
        }
        this.f2345a = false;
        RandomAccessFile randomAccessFile = (RandomAccessFile) this.f2348d;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }
}
