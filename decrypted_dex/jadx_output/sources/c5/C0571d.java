package c5;

import android.os.Process;
import com.stub.StubApp;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: c5.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0571d {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10868b = f.h(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLong f10869c = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f10870a;

    public C0571d() {
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte b2 = array[0];
        byte b10 = array[1];
        byte b11 = array[2];
        byte b12 = array[3];
        byte[] a3 = a(time % 1000);
        byte b13 = a3[0];
        byte b14 = a3[1];
        byte[] a9 = a(f10869c.incrementAndGet());
        byte b15 = a9[0];
        byte b16 = a9[1];
        byte[] a10 = a(Integer.valueOf(Process.myPid()).shortValue());
        String e10 = f.e(new byte[]{b2, b10, b11, b12, b13, b14, b15, b16, a10[0], a10[1]});
        Locale locale = Locale.US;
        this.f10870a = String.format(locale, StubApp.getString2(9446), e10.substring(0, 12), e10.substring(12, 16), e10.subSequence(16, 20), f10868b.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return this.f10870a;
    }
}
