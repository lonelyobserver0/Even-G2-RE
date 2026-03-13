package x0;

import com.stub.StubApp;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f22806d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, ByteCompanionObject.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f22807e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, Tnaf.POW_2_WIDTH, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f22808a;

    /* renamed from: b, reason: collision with root package name */
    public int f22809b;

    /* renamed from: c, reason: collision with root package name */
    public int f22810c;

    public static void a(ByteBuffer byteBuffer, long j, int i3, int i10, boolean z2) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z2 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i3);
        byteBuffer.putInt(0);
        long j3 = i10;
        hc.b.g(j3, StubApp.getString2(1649), (j3 >> 8) == 0);
        byteBuffer.put((byte) j3);
    }
}
